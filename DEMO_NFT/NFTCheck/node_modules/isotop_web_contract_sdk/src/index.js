const axios = require("axios");
const CryptoJS = require('crypto-js')



function makeHeader(apiKey, apiSecret, body) {
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
  const hash = CryptoJS.MD5(content).toString(CryptoJS.enc.Hex)
  header["content-type"] = "application/x-www-form-urlencoded";
  header["sign"] = hash;
  return header;
}

async function getTransactionByHash(apiKey, apiSecret, chainId, hash, id, api_url) {
  const body = {
    chainid: chainId,
    hash: hash,
    id: id,
  };

  const header = makeHeader(apiKey, apiSecret, body);
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

async function writeCall(
  apiKey,
  apiSecret,
  chainId,
  fromAddress,
  data,
  contract,
  id,
  api_url
) {
  const body = {
    chainid: chainId,
    data: data,
    fromAddress: fromAddress,
    contract: contract,
    id: id,
  };
  const header = makeHeader(apiKey, apiSecret, body);
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

async function readCall(
  apiKey,
  apiSecret,
  chainId,
  data,
  contract,
  id,
  api_url
) {
  const body = {
    chainid: chainId,
    data: data,
    contract: contract,
    id: id,
  };

  const header = makeHeader(apiKey, apiSecret, body);

  try {
    const response = await axios.get(api_url, {
      params: body,
      headers: header,
    });
    const json = response.data;
    if (json.success) {
      // const resultData = json.data;
      // result = iface.decodeFunctionResult("testReadCall", resultData);
      return json.data;
    } else {
      console.error(json);
    }
  } catch (error) {
    console.error(error);
  }
}

async function createUser(apiKey, apiSecret, chainId, id, api_url) {
    const body = {
      chainid: chainId,
      id: id,
    };
  
    const header = makeHeader(apiKey, apiSecret, body);
  
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
  
async function queryUser(apiKey, apiSecret, chainId, id, api_url) {
    const body = {
      chainid: chainId,
      id: id,
    };
  
    const header = makeHeader(apiKey, apiSecret, body);
  
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
  
  module.exports = {
    createUser, 
    queryUser,
    readCall,
    getTransactionByHash,
    writeCall
  };