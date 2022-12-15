from conflux_web3 import Web3
from cfx_address import Base32Address
import os
import json
from solcx import install_solc, compile_source

zero = {}
dds = {}

dds['test'] = 'cfxtest:acfkpsbbgwsuvw0mfw1d2uapus6pp1zkf6x7rfpjkg'
dds['main'] = 'cfx:acgbcn8k6cd7eayp9s59st3bnst6ue1grjjcmp5tzp'
zero['test'] = 'cfxtest:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6f0vrcsw'
zero['main'] = 'cfx:aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0sfbnjm2'


def addr_to_bytes(account) -> bytes:
    return bytes.fromhex(account.address[2:])


def int_to_bytes(x: int) -> bytes:
    return x.to_bytes((x.bit_length() + 7) // 8, 'big')


def int_from_bytes(xbytes: bytes) -> int:
    return int.from_bytes(xbytes, 'big')


def str_to_bytes(string: str) -> bytes:
    return string.encode('utf-8')


def str_to_hex(string: str) -> str:
    return "0x"+string.encode('utf-8').hex()


def hex_to_str(x: bytes) -> str:
    return bytes.fromhex(x).decode('utf-8')


class ConfluxWeb3:
    def __init__(self, net):
        self.w3 = Web3(Web3.HTTPProvider(f"https://{net}.confluxrpc.com"))
        self.zero = zero[net]
        self.dds = dds[net]
        with open('abi/DDS.json') as f:
            meta = json.load(f)
            self.dds = self.w3.cfx.contract(address=self.dds, abi=meta["abi"])
        self.admin = self.w3.account.from_key(
            '0x' + os.getenv('ADMIN_PRIVATE_KEY'))
        self.creator = self.w3.account.from_key(
            '0x' + os.getenv('CREATOR_PRIVATE_KEY'))
        self.consumer = self.w3.account.from_key(
            '0x' + os.getenv('CONSUMER_PRIVATE_KEY'))
        self.iwan = self.w3.account.from_key(
            '0x' + os.getenv('IWANCAO_PRIVATE_KEY'))
        self.w3.cfx.default_account = self.admin

    def createAccount(self):
        acct = self.web3.account.create()
        return acct.address, acct.key.hex()

    def loadAccount(self, private_key):
        return self.w3.account.from_key(private_key)

    def setDefaultAccount(self, acct):
        self.w3.cfx.default_account = acct

    def loadContract(self, contract: str, addr: str):
        with open('abi/'+contract+'.json') as f:
            meta = json.load(f)
        cd = self.w3.cfx.contract(address=addr, abi=meta["abi"])
        return cd

    def showDDS(self):
        return self.dds.functions.getKeys('ISOTOP').call()

    def showFactory(self):
        factory = self.loadFromDDS('Factory')
        return factory.functions.getContractRegistered().call()

    def loadDDS(self, contract: str):
        return self.dds.functions.toAddress(self.dds.functions.get(
            'ISOTOP', 'BEE_' + contract.upper()+'_ADDRESS').call()).call()

    def loadFromDDS(self, contract: str):
        with open('abi/'+contract+'.json') as f:
            meta = json.load(f)
        addr = self.loadDDS(contract)
        cd = self.w3.cfx.contract(address=addr, abi=meta["abi"])
        return cd

    def regDDS(self, contract: str, addr: str):
        self.dds.functions.put('ISOTOP', 'BEE_' + contract.upper()+'_ADDRESS',
                               Base32Address(addr).hex_address).transact().executed()

    def writeDDS(self, key: str, value: bytes):
        self.dds.functions.put('ISOTOP', key, value).transact().executed()

    def readDDS(self, key: str):
        return self.dds.functions.get('ISOTOP', key).call()

    def delDDS(self, key: str):
        self.dds.functions.put('ISOTOP', key, bytes()).transact().executed()
        print(f'DDS[{key}] deleted')

    def readDDSAddress(self, key: str):
        ret = self.dds.functions.toAddress(self.readDDS(key)).call()
        return ret, self.w3.address(ret).hex_address

    def regFactory(self, contract: str, addr: str):
        factory = self.loadFromDDS('Factory')
        return factory.functions.register(
            contract.upper(), Base32Address(addr)).transact().executed()

    def delFactory(self, contract: str):
        factory = self.loadFromDDS('Factory')
        factory.functions.register(
            contract.upper(), Base32Address(self.zero)).transact().executed()
        print(f'Factory[{contract}] deleted')

    def deployFromFactory(self, contract: str):
        factory = self.loadFromDDS('Factory')
        factory.functions.deployContract(
            contract.upper()).transact().executed()
        return factory.functions.getLastDeployed(contract.upper()).call()

    def buildDeploy(self, contract: str):
        # print('open file: flat/'+contract+'.sol')
        with open('contract/'+contract+'.sol') as f:
            source_code = f.read()
        metadata = compile_source(
            source_code,
            output_values=['abi', 'bin'],
            solc_version=install_solc(version="0.8.13")
        )['<stdin>:'+contract]
        assert "abi" in metadata and "bin" in metadata

        cd = self.w3.cfx.contract(
            abi=metadata["abi"], bytecode=metadata["bin"])
        tx_receipt = cd.constructor().transact().executed()
        with open('abi/'+contract+'.json', 'w') as f:
            json.dump(metadata["abi"], f, indent=4, ensure_ascii=False)
        # tx_hash = my_contract.constructor(100 * 10**18).transact({'from': w3.eth.accounts[3]})

        contract_address = tx_receipt["contractCreated"]
        assert contract_address is not None
        print(f"contract deployed: {contract_address}")

        # deployed_contract = self.w3.cfx.contract(
        #     address=contract_address, abi=metadata["abi"])

        return contract_address

    def deploy(self, contract: str):
        with open('abi/'+contract+'.json') as f:
            metadata = json.load(f)
        cd = self.w3.cfx.contract(
            abi=metadata["abi"], bytecode=metadata["bin"])
        tx_receipt = cd.constructor().transact().executed()

        contract_address = tx_receipt["contractCreated"]
        assert contract_address is not None
        print(f"contract deployed: {contract_address}")
        return contract_address

    def deploy2Factory(self, contract: str):
        self.regFactory(contract, self.deploy(contract))

    def deploy2DDS(self, contract: str):
        self.regDDS(contract, self.deploy(contract))


if __name__ == "__main__":
    w3 = ConfluxWeb3('test')