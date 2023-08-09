// 使用该方法需要提前引入web3模块
// 使用基于promise的API和默认的以太坊节点URL(BY Alexie)定义函数
async function convertToBytecode(abiJson, functionName, params, ethereumNodeUrl = 'https://mainnet.infura.io/v3/c54ce58f61594eda9aa01399b66fc018') {
  return new Promise(async (resolve, reject) => {
    try {
      const abi = JSON.parse(abiJson);
      const web3 = new Web3(ethereumNodeUrl);
      const contract = new web3.eth.Contract(abi);
      const encodedData = contract.methods[functionName](...params).encodeABI();
      const paddingLength = 64 - encodedData.length;
      const paddedData = encodedData + '0'.repeat(paddingLength);
      resolve(paddedData);
    } catch (error) {
      reject(error);
    }
  });
}

// 将函数附加到窗口对象以使其在浏览器上下文中可访问
window.convertToBytecode = convertToBytecode;