# npm包: isotop_contract_sdk

## 功能

**isotop_contract_sdk** 是一个提供了接口：createUser, queryUser, writeCall, readCall, getTransactionByHash的 npm 包，用于创建账户，查询用户在链上账户地址，写入合约方法，读取合约方法以及根据交易查询交易信息等功能。

## 安装

要使用 **isotop_contract_sdk**，安装该sdk会自动安装三方库的依赖。

通过 npm 命令进行安装：
```bash
npm install isotop_contract_sdk
```

如若未安装三方库依赖，您需要手动安装，在 Node.js 环境中安装ethers.js。可以通过 npm 命令进行安装：
```bash
npm install ethers
```
还需要安装axios用于请求。可以通过 npm 命令进行安装：
```bash
npm install axios
```
还需要安装dotenv用于管理环境变量。可以通过 npm 命令进行安装：
```bash
npm install dotenv
```


## 用法
首先，在您的项目中引入 先引入ethers模块；

按照下面示例代码引入dotenv模块；

然后，在您的项目中引入 isotop_contract_sdk 模块的方法(该路径为默认路径，如有错误根据您实际项目引入)：
```bash
const {createUser,queryUser,writeCall,readCall,getTransactionByHash} = require("./node_modules/isotop_contract_sdk/src/index");
```

自定义引入apiKey与apiSecret(本示例作为环境变量引入，可在.env文件中自定义修改);

根据以下示例代码自定义修改静态参数；

以下为示例js文件：
index.js
```bash
const { ethers } = require("ethers");
var fs = require("fs");
require("dotenv").config();
const readline = require("readline");

//引入abi文件json格式
var AbiData = fs.readFileSync("IsotopTest.json");
let ABI = AbiData.toString();
let iface = new ethers.Interface(ABI);

//引入sdk的方法,该路径为默认路径，如有偏差需要您根据您项目路径手动修改
const {
  createUser,
  queryUser,
  writeCall,
  readCall,
  getTransactionByHash,
} = require("./node_modules/isotop_contract_sdk/src/index");

//根据您调用的方法输入您的静态参数，以下为例子
const apiKey = process.env.API_KEY; //环境变量中填写您的api_Key
const apiSecret = process.env.API_SECRET; //环境变量中填写您的api_secret
const chainId = "1";
const id = "13911024683";
const contract = "cfxtest:acaktjrdthgszgjbd0btn1c5stcyeuf3t6kp582wyd";
const data = "0x4717a93e";
const fromAddress = "cfxtest:aata6s2ryr25y15kg8v4wfnjvk9ep0cx16h51ne0uj";
const hash =
  "0x203e723bce1559b321b0680e89a9dff0e185ae9c0b950f85e8842e4bdacc59cc";

// 创建readline接口
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

// 定义方法名与接口后缀的映射  '替换命名': '实际替换接口字段',
const methodToSuffix = {
  createUser: "/chain/create",
  queryUser: "/chain/queryUser",
  readCall: "/chain/readCall",
  writeCall: "/chain/writeCall",
  getTransactionByHash: "/chain/getTransactionByHash",
};

////以下为各个方法调用的示例代码：

function main() {
  rl.question(
    "请选择要执行的操作:\n1) 创建用户\n2) 查询用户\n3) 读取调用\n4) 写入调用\n5) 查询交易\nq) 退出\n\n",
    async (choice) => {
      if (choice === "q") {
        rl.close();
        return;
      }

      switch (choice) {
        case "1":
          callMethod("createUser");
          break;
        case "2":
          callMethod("queryUser");
          break;
        case "3":
          callMethod("readCall");
          break;
        case "4":
          callMethod("writeCall");
          break;
        case "5":
          callMethod("getTransactionByHash");
          break;
        default:
          console.log("无效的选择");
          break;
      }
    }
  );
}

async function callMethod(methodName) {
  const suffix = methodToSuffix[methodName];
  if (!suffix) {
    console.log("未知的方法名");
    return;
  }
  //根据你的接口修改
  const api_url = "https://www.isotop.top/chain-api/api/v1" + suffix;

  switch (methodName) {
    case "createUser":
      const creatUserResult = await createUser(
        apiKey,
        apiSecret,
        chainId,
        id,
        api_url
      );
      console.log("creatUserResult:", creatUserResult);
      break;
    case "queryUser":
      const queryUserResult = await queryUser(
        apiKey,
        apiSecret,
        chainId,
        id,
        api_url
      );
      console.log("queryUserResult:", queryUserResult);
      break;
    case "readCall":
      const result = await readCall(
        apiKey,
        apiSecret,
        chainId,
        data,
        contract,
        id,
        api_url
      );
      const decodedResult = iface.decodeFunctionResult("testReadCall", result);
      console.log(decodedResult);
      break;
    case "writeCall":
      const writeCallResult = await writeCall(
        apiKey,
        apiSecret,
        chainId,
        fromAddress,
        data,
        contract,
        id,
        api_url
      );
      console.log("writeCallResult:", writeCallResult);
      break;
    case "getTransactionByHash":
      const getTransactionByHashResult = await getTransactionByHash(
        apiKey,
        apiSecret,
        chainId,
        hash,
        id,
        api_url
      );
      console.log("getTransactionByHashResult:", getTransactionByHashResult);
      break;
    default:
      console.log("未知的方法名");
      break;
  }

  main(); // 继续等待用户输入
}

main(); // 启动主循环

```

然后，终端运行
```bash
node index.js
```

根据你的要调用的方法，输入对应的数字，回车后查看结果。



