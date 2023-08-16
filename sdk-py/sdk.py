
from rich.console import Console
from pprint import pprint
from datetime import datetime
import hashlib
import requests
import sys
import os
import json
from eth_abi import encode, decode
from sha3 import keccak_256
from hexbytes import HexBytes

from rich import print
from rich import pretty
pretty.install()
console = Console(style="white on black", stderr=True)

apiKey = os.getenv("ISOTOP_APPKEY")
apiSecret = os.getenv("ISOTOP_SECRET")
chainIDs = {
    "conflux_core_test": "1",  # Conflux Core 测试链
    "conflux_core_main": "1029",  # Conflux Core 正式链
    "wuhan": "5555",  # 武汉链正式链
    "wenchang_test": "12231",  # 文昌链测试链
    "wenchang_main": "1224",  # 文昌链正式链
    "conflux_espace_test": "71",  # Conflux eSpace 测试链
    "conflux_espace_main": "1030",  # Conflux eSpace 正式链
    "caotian": "27",  # 草田链正式链
    "arbitrum_main": "42161",  # Arbione正式链
    "atbitrum_test": "421613",  # Arbitrum测试链
    "polygon_test": "80001", 	# Polygon Mumbai测试链
    "polygon_main": "137",  # Polygon正式链
    "goerli": "5",  # Goerli 以太坊测试链
    "ethrum": "1"  # 以太坊正式链
}

admin = '0x7B0dc23E87febF1D053E7Df9aF4cce30F21fAe9C'


def hhex(x):
    if len(hex(x)[2:]) == 1:
        return '0'+hex(x)[2:]
    return hex(x)[2:]


def b2s(data):
    return ''.join(list(map(lambda x: hhex(x), data)))
    # return str(HexBytes(data))


def s2b(data):
    return bytes(HexBytes(data))


class IsotopContract:
    def __init__(self, user_id, chain_id, contract_add, contract_name):
        self.contract_add = contract_add
        self.chain_id = chainIDs[chain_id]
        self.user_id = user_id
        self.functions = {}
        self.loadABI(contract_name)

    def isAddr(self, addr):
        if self.chain_id == 1:
            return addr[:8] == 'cfxtest:' and len(addr) == 50
        if self.chain_id == 1029:
            return addr[:8] == 'cfx:' and len(addr) == 46
        return addr[:2] == '0x' and len(addr) == 42

    def loadABI(self, contract):
        try:
            with open('abi/' + contract+'.json') as f:
                metadata = json.load(f)

            for item in metadata['abi']:
                if item['type'] != 'function':
                    continue

                if item['name'] not in self.functions:
                    self.functions[item['name']] = []
                args_in = ""
                for input in item['inputs']:
                    args_in += input['type']+","
                if len(args_in) > 0:
                    args_in = args_in[:-1]  # remove the #

                args_out = ""
                for output in item['outputs']:
                    args_out += output['type'] + ","
                if len(args_out) > 0:
                    args_out = args_out[:-1]  # remove the #

                self.functions[item['name']].append((args_in, args_out))

        except IOError:
            self.metadata = {}

    def pack(self, func, *args):
        args_type = ''
        selector = ''

        if '(' in func and ')' in func:
            # func(string,string)
            args_type = func.split('(')[1].split(')')[0]
            selector = "0x" + keccak_256(func).hexdigest()[:8]
            func = func.split('(')[0]

        if func not in self.functions:
            raise Exception(func + " is not found")

        if len(self.functions[func]) == 1:
            if len(args_type) > 0 and args_type != self.functions[func][0][0]:
                raise Exception("arg type not match")
            selector = "0x" + \
                keccak_256(
                    (func+'('+self.functions[func][0][0]+')').encode('utf-8')).hexdigest()[:8]
            if self.functions[func][0][0] == '':
                return selector
            else:
                return selector+b2s(encode(self.functions[func][0][0].split(','), list(args)))

        if args_type == '':
            raise Exception("No specific args type")

        for arg in self.functions[func]:
            selector = "0x" + \
                keccak_256(
                    (func+'('+arg[0]+')').encode('utf-8')).hexdigest()[:8]
            if args_type == arg[0]:
                if args_type == '':
                    return selector
                else:
                    return selector+b2s(encode(arg[0].split(','), list(args)))

        raise Exception("No arg type match")

    def makeHeader(self, body):
        sortArgs = {}
        header = {}
        hash = hashlib.md5()

        # 当前日期和时间
        now = datetime.timestamp(datetime.now())
        header['timestamp'] = str(int(now))
        header['nonce'] = str(int(now*1000000))
        header['apiKey'] = apiKey
        sortArgs.update(header)
        sortArgs.update(body)
        # print(f"{sortArgs=}")

        content = ''
        for item in sorted(sortArgs):
            content += item+sortArgs[item]

        content += apiSecret
        # print("-----------------------------"+content)

        hash.update(content.encode(encoding='utf-8'))

        # print(hash.hexdigest())

        # print(response.json())

        header["content-type"] = "application/x-www-form-urlencoded"
        header['sign'] = hash.hexdigest()

        # print(header)
        # print(body)
        # print(hash.hexdigest())
        # print(header)
        # console.print(Panel(header))
        return header

    def importAccount(self, private_key):
        body = {}
        body['chainid'] = self.chain_id
        body['privateKey'] = private_key
        # body['id'] = ''
        body['id'] = self.user_id

        api_url = "https://www.isotop.top/chain-api/api/v1/chain/importAddress"

        header = self.makeHeader(body)
        response = requests.post(api_url, params=body, headers=header)

        json = response.json()
        if json['success'] == True:
            return json['data']
        else:
            print(json)

    def exportAccount(self, address):
        body = {}
        body['chainid'] = self.chain_id
        body['address'] = address
        body['id'] = self.user_id

        api_url = "https://www.isotop.top/chain-api/api/v1/chain/exportAddress"

        header = self.makeHeader(body)
        response = requests.get(api_url, params=body, headers=header)

        json = response.json()
        if json['success'] == True:
            return json['data']
        else:
            print(json)

    def getTransactionByHash(self, hash):
        body = {}
        body['chainid'] = self.chain_id
        body['hash'] = hash
        body['id'] = self.user_id

        api_url = "https://www.isotop.top/chain-api/api/v1/chain/getTransactionByHash"

        header = self.makeHeader(body)
        response = requests.get(api_url, params=body, headers=header)

        json = response.json()
        if json['success'] == True:
            return json['data']
        else:
            print(json)

    def writeCall(self, _from, func, *args):
        if not self.isAddr(_from):
            raise Exception(_from + " is not address")
        body = {}
        body['chainid'] = self.chain_id
        body['data'] = self.pack(func, *args)
        body['fromAddress'] = _from
        body['contract'] = self.contract_add
        body['id'] = self.user_id

        api_url = "https://www.isotop.top/chain-api/api/v1/chain/writeCall"

        header = self.makeHeader(body)
        # console.print(body, style="bold yellow")
        console.print(
            f"chain:[{self.chain_id}]\ncontract:{self.contract_add}\nfrom:{_from}\n{func}{args}", style="bold yellow")

        response = requests.post(api_url, params=body, headers=header)

        json = response.json()
        if json['success'] == True:
            return json['data']
        else:
            console.print(json, style="bold red")

    def readCall(self, func, *args):
        body = {}
        body['chainid'] = self.chain_id
        body['data'] = self.pack(func, *args)
        body['contract'] = self.contract_add
        body['id'] = self.user_id

        api_url = "https://www.isotop.top/chain-api/api/v1/chain/readCall"

        header = self.makeHeader(body)
        # print(body)
        console.print(
            f"chain:[{self.chain_id}]\ncontract:{self.contract_add}\n{func}{args}", style="bold yellow")

        response = requests.get(api_url, params=body, headers=header)

        json = response.json()
        if json['success'] == True:
            # return decode(self.functions[func][0][1], self.unpack(json['data']))
            # print(json['data'])
            # print(bytes(HexBytes(json['data'])))
            return decode([self.functions[func][0][1]], s2b(json['data']))
        else:
            console.print(json, style="bold red")

    def supportsInterface(self, erc):
        body = {}
        body['chainid'] = self.chain_id
        body['interfaceID'] = erc
        body['contract'] = self.contract_add

        api_url = "https://www.isotop.top/chain-api/api/v1/chain/supportsInterface"

        header = self.makeHeader(body)
        response = requests.get(api_url, params=body, headers=header)

        json = response.json()
        if json['success'] == True:
            return json['data']
        else:
            console.print(json, style="bold red")

    def queryAsset(self, tokenId):
        body = {}
        body['chainid'] = self.chain_id
        body['tokenId'] = tokenId
        body['contract'] = self.contract_add

        api_url = "https://www.isotop.top/chain-api/api/v1/chain/queryAsset"

        header = self.makeHeader(body)
        response = requests.get(api_url, params=body, headers=header)

        json = response.json()
        if json['success'] == True:
            return json['data']
        else:
            console.print(json, style="bold red")

    def queryUser(self):
        body = {}
        body['chainid'] = self.chain_id
        body['id'] = self.user_id

        header = self.makeHeader(body)
        api_url = "https://www.isotop.top/chain-api/api/v1/chain/queryUser"
        response = requests.get(api_url, params=body, headers=header)

        json = response.json()
        if json['success'] == True:
            return json['data']
        else:
            console.print(json, style="bold red")

    def createUser(self):
        body = {}
        body['chainid'] = self.chain_id
        body['id'] = self.user_id

        header = self.self.makeHeader(body)
        api_url = "https://www.isotop.top/chain-api/api/v1/chain/create"
        # print(f"{header} {body} {api_url}")
        response = requests.post(api_url, params=body, headers=header)

        # print(response)
        json = response.json()
        if json['success'] == True:
            return json['data']
        else:
            console.print(json, style="bold red")

    def cmd(self):
        while True:
            choice = input(
                "1) createUser\n2) queryUser\n3) queryAsset [tokenId]\n4) supportsInterface [selector]\n5) readCall [func, *rargs]\n6) writeCall [from, func, *rargs]\n7) getTransactionReceiptByHash [hash]\n8) importAccount [private-key]\n9) exportAccount [account]\nq) to exit:\n\n")

            commands = choice.split()
            if len(commands) == 0 or commands[0] == "q":
                break
            if commands[0] == '1':
                ret = self.createUser()
            if commands[0] == '2':
                ret = self.queryUser()
            if commands[0] == '3':
                ret = self.queryAsset(commands[1])
            if commands[0] == '4':
                ret = self.supportsInterface(commands[1])
            if commands[0] == '5':
                ret = self.readCall(commands[1], commands[1:])
            if commands[0] == '6':
                ret = self.writeCall(commands[1], commands[1:])
            if commands[0] == '7':
                ret = self.getTransactionByHash(commands[1])
            if commands[0] == '8':
                ret = self.importAccount(commands[1])
            if commands[0] == '9':
                ret = self.exportAccount(commands[1])
            console.print(ret, style="white on black")


if __name__ == "__main__":
    i = IsotopContract('13911024683', 'wenchang_test',
                       '0x83098C9b48357F31A134A5e50299b8b2315Ac922', 'IsotopTest')
    i.queryUser()
    i.writeCall(admin, 'test1', '五点并一点')
    i.writeCall(admin, 'test6', '青海长云暗雪山', '孤城遥望玉门关', '黄沙百战穿金 甲', ['不破楼兰终不还'])
    i.readCall('check')
