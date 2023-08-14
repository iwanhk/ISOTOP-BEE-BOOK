const axios = require("axios");
const crypto = require("crypto");
const { ethers } = require("ethers");
var fs = require("fs");

var data = fs.readFileSync("IsotopTest.json");
let ABI = data.toString();
let iface = new ethers.Interface(ABI);

const apiKey = process.env.API_KEY;
const apiSecret = process.env.API_SECRET;
//示例
const contract_add = "cfxtest:acaktjrdthgszgjbd0btn1c5stcyeuf3t6kp582wyd";

function makeHeader(body) {
  const sortArgs = {};
  const header = {};

  const now = Date.now();
  header["timestamp"] = Math.floor(now / 1000).toString();
  header["nonce"] = now.toString().padEnd(16, "0");
  header["apiKey"] = apiKey;

  Object.assign(sortArgs, header);
  Object.assign(sortArgs, body);

  let content = "";
  for (const item of Object.keys(sortArgs).sort()) {
    content += item + sortArgs[item];
  }
  content += apiSecret;
  const hash = crypto.createHash("md5").update(content, "utf-8").digest("hex");
  header["content-type"] = "application/x-www-form-urlencoded";
  header["sign"] = hash;
  return header;
}

async function getTransactionByHash() {
  const body = {
    chainid: "1",
    hash: "0x203e723bce1559b321b0680e89a9dff0e185ae9c0b950f85e8842e4bdacc59cc",
    id: "18518517787",
  };

  const api_url =
    "https://www.isotop.top/chain-api/api/v1/chain/getTransactionByHash";

  const header = makeHeader(body);
  try {
    const response = await axios.get(api_url, {
      params: body,
      headers: header,
    });
    const json = response.data;
    if (json.success) {
      return json.data;
    } else {
      console.error(json);
    }
  } catch (error) {
    console.error(error);
  }
}

async function writeCall(_from, data) {
  const body = {
    chainid: "1",
    data: data,
    fromAddress: _from,
    contract: contract_add,
    id: "13911024683",
  };
  const api_url = "https://www.isotop.top/chain-api/api/v1/chain/writeCall";
  const header = makeHeader(body);
  try {
    const response = await axios.post(api_url, body, { headers: header });
    const json = response.data;
    if (json.success) {
      json.data;
      return json.data;
    } else {
      console.error(json);
    }
  } catch (error) {
    console.error(error);
  }
}

async function readCall() {
  const body = {
    chainid: "1",
    data: "0x4717a93e",
    contract: "cfxtest:acaktjrdthgszgjbd0btn1c5stcyeuf3t6kp582wyd",
    id: "13911024683",
  };

  const api_url = "https://www.isotop.top/chain-api/api/v1/chain/readCall";
  const header = makeHeader(body);

  try {
    const response = await axios.get(api_url, {
      params: body,
      headers: header,
    });
    const json = response.data;
    if (json.success) {
      const resultData = json.data;
      result = iface.decodeFunctionResult("testReadCall", resultData);
      return result;
    } else {
      console.error(json);
    }
  } catch (error) {
    console.error(error);
  }
}

//createUser
async function createUser() {
  const body = {
    chainid: "1",
    id: "13911024683",
  };

  const api_url = "https://www.isotop.top/chain-api/api/v1/chain/create";
  const header = makeHeader(body);

  try {
    const response = await axios.post(api_url, body, { headers: header });
    const json = response.data;
    if (json.success) {
      return json.data;
    } else {
      console.error(json);
    }
  } catch (error) {
    console.error(error);
  }
}

//queryUser
async function queryUser() {
  const body = {
    chainid: "1",
    id: "13911024683",
  };

  const api_url = "https://www.isotop.top/chain-api/api/v1/chain/queryUser";
  const header = makeHeader(body);

  try {
    const response = await axios.get(api_url, {
      params: body,
      headers: header,
    });
    const json = response.data;
    if (json.success) {
      return json.data;
    } else {
      console.error(json);
    }
  } catch (error) {
    console.error(error);
  }
}

// 主循环，交互式命令行界面
const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

async function main() {
  // 静态地定义参数的值
  const _from = "cfxtest:aata6s2ryr25y15kg8v4wfnjvk9ep0cx16h51ne0uj";
  const data = "0x4717a93e";
  
  rl.question(
    "1) createUser\n2) queryUser\n3) readCall\n4) writeCall\n5) getTransactionByHash\nq) to exit:\n\n",
    async (choice) => {
      if (choice === "q") {
        rl.close();
        return;
      }
      const commands = choice.split(" ");
      let ret = null;
      switch (commands[0]) {
        case "1":
          ret = await createUser();
          break;
        case "2":
          ret = await queryUser();
          break;
        case "3":
          ret = await readCall(commands[1]);
          break;
        case "4":
          ret = await writeCall(_from, data);
          break;
        case "5":
          ret = await getTransactionByHash(commands[1]);
          break;
        default:
          console.log("Invalid choice");
          break;
      }

      if (ret) {
        console.log(ret);
      }

      main();
    }
  );
}

main();
