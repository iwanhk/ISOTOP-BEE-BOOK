const express = require("express");
const router = express.Router();
const { ethers } = require("ethers");

const axios = require("axios");
// const CryptoJS = require("crypto-js");
var fs = require("fs");
require("dotenv").config();

//引入abi文件json格式
var AbiData = fs.readFileSync("ABI.JSON");

let ABI = AbiData.toString();
let iface = new ethers.Interface(ABI);

const { readCall } = require("isotop_web_contract_sdk/src"); // 替换成你的模块路径

///tokenURI
router.post("/tokenURI", async (req, res) => {
  const apiKey = process.env.API_KEY; // 替换为你的 API Key
  const apiSecret = process.env.API_SECRET; // 替换为你的 API Secret

  const api_url = "https://www.isotop.top/chain-api/api/v1/chain/readCall"; // 替换为你的 API URL

  const { chainid: chainId, data, contract, id } = req.body;

  console.log("req.body:", req.body);
  console.log(
    "apiKey, apiSecret, chainId, data,contracr,id,api_url:",
    apiKey,
    apiSecret,
    chainId,
    data,
    contract,
    id,
    api_url
  );

  try {
    const result = await readCall(
      apiKey,
      apiSecret,
      chainId,
      data,
      contract,
      id,
      api_url
    );
    console.log("result:", result);
    const tokenURIderesult = iface.decodeFunctionResult("tokenURI", result);
    console.log("tokenURIderesult:", tokenURIderesult);
    const URL = tokenURIderesult[0];
    console.log("URL:", URL);
    const response = await axios.get(URL);
    const jsonData = response.data;
    console.log("jsonData:", jsonData);
    const image = jsonData.image;
    console.log("image:", image);

    res.json(jsonData);
  } catch (error) {
    res.status(500).json({ error: "An error occurred" });
  }
});

// ///totalSupply
router.post("/totalSupply", async (req, res) => {
  const apiKey = process.env.API_KEY; // 替换为你的 API Key
  const apiSecret = process.env.API_SECRET; // 替换为你的 API Secret

  const api_url = "https://www.isotop.top/chain-api/api/v1/chain/readCall"; // 替换为你的 API URL

  const { chainid: chainId, data, contract, id } = req.body;

  console.log("req.body:", req.body);
  console.log(
    "apiKey, apiSecret, chainId, data,contracr,id,api_url:",
    apiKey,
    apiSecret,
    chainId,
    data,
    contract,
    id,
    api_url
  );

  try {
    const result = await readCall(
      apiKey,
      apiSecret,
      chainId,
      data,
      contract,
      id,
      api_url
    );
    console.log("totalSupplyresult:", result);
    const totalSupplyderesult = iface.decodeFunctionResult(
      "totalSupply",
      result
    );
    console.log("totalSupplyderesult:", totalSupplyderesult);
    const num = parseInt(totalSupplyderesult[0]);
    console.log("num:", num);

    res.json(num);
  } catch (error) {
    res.status(500).json({ error: "An error occurred" });
  }
});

module.exports = router;
