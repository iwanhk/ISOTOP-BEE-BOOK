<template>
  <div>
    <!-- 上半部分：输入框与查询按钮 -->
    <div>
      <input v-model="contract" placeholder="输入合约地址" />
      <button @click="searchNFT">查询</button>
    </div>

    <!-- 下半部分：显示查询结果和 NFT 卡片 -->
    <div>
      <p>已铸造 {{ numNFTs }} 个 NFT</p>

      <div class="nft-cards">
        <div
          v-for="n in this.numNFTs"
          :key="n"
          class="nft-card"
          @click="goToDetailPage(n)"
        >
          <img :src="getImageUrl(n)" :alt="getNFTName(n)" />
          <p>{{ getNFTName(n) }}</p>
        </div>
      </div>
    </div>
  </div>
  <DetailsPage :params="n" />
</template>

<script>
import { ethers } from "ethers";
import axios from "axios";
import { readCall } from "isotop_web_contract_sdk/src/index";
import DetailPage from "./DetailPage.vue";
import loadingImg from "../assets/img/loading.png"

export default {
  components: {
    DetailPage,
  },
  data() {
    return {
      contract: "cfx:accm4vkvec1y96jajw0gw6k6k39gbm5bha9b8knzt5", // 合约地址
      numNFTs: 0,
      nftList: [],
      apiKey: "7956ca03fe44238ef1d254799de1b556",
      apiSecret:
        "bd09139024cdd3136a4f6cf60038c1194e6641063e413c47f517a579fbb158ba",
      // apiKey: import.meta.env.VITE_API_KEY,
      // apiSecret: import.meta.env.VITE_API_SECRET,
      chainId: "1029",
      id: "13911024683",
      placeholderImage: "",
      baseImageUrl: loadingImg, // 将 baseImageUrl 定义在 data 中
      baseName: "", // 将 baseName 定义在 data 中
      api_url: "https://www.isotop.top/chain-api/api/v1/chain/readCall",
      ABI: [
        {
          inputs: [
            {
              internalType: "string",
              name: "_base",
              type: "string",
            },
            {
              internalType: "string",
              name: "_details",
              type: "string",
            },
          ],
          stateMutability: "nonpayable",
          type: "constructor",
          name: "constructor",
        },
        {
          anonymous: false,
          inputs: [
            {
              indexed: true,
              internalType: "address",
              name: "owner",
              type: "address",
            },
            {
              indexed: true,
              internalType: "address",
              name: "approved",
              type: "address",
            },
            {
              indexed: true,
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
          ],
          name: "Approval",
          type: "event",
        },
        {
          anonymous: false,
          inputs: [
            {
              indexed: true,
              internalType: "address",
              name: "owner",
              type: "address",
            },
            {
              indexed: true,
              internalType: "address",
              name: "operator",
              type: "address",
            },
            {
              indexed: false,
              internalType: "bool",
              name: "approved",
              type: "bool",
            },
          ],
          name: "ApprovalForAll",
          type: "event",
        },
        {
          anonymous: false,
          inputs: [
            {
              indexed: true,
              internalType: "address",
              name: "previousOwner",
              type: "address",
            },
            {
              indexed: true,
              internalType: "address",
              name: "newOwner",
              type: "address",
            },
          ],
          name: "OwnershipTransferred",
          type: "event",
        },
        {
          anonymous: false,
          inputs: [
            {
              indexed: true,
              internalType: "address",
              name: "from",
              type: "address",
            },
            {
              indexed: true,
              internalType: "address",
              name: "to",
              type: "address",
            },
            {
              indexed: true,
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
          ],
          name: "Transfer",
          type: "event",
        },
        {
          anonymous: false,
          inputs: [
            {
              indexed: true,
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
            {
              indexed: true,
              internalType: "address",
              name: "user",
              type: "address",
            },
            {
              indexed: false,
              internalType: "uint64",
              name: "expires",
              type: "uint64",
            },
          ],
          name: "UpdateUser",
          type: "event",
        },
        {
          anonymous: false,
          inputs: [
            {
              indexed: false,
              internalType: "string",
              name: "uri",
              type: "string",
            },
          ],
          name: "baseUIRChanged",
          type: "event",
        },
        {
          anonymous: false,
          inputs: [
            {
              indexed: false,
              internalType: "string",
              name: "_details",
              type: "string",
            },
          ],
          name: "detailsURLChanged",
          type: "event",
        },
        {
          anonymous: false,
          inputs: [
            {
              indexed: false,
              internalType: "address",
              name: "_to",
              type: "address",
            },
            {
              indexed: false,
              internalType: "uint256",
              name: "tokenID",
              type: "uint256",
            },
          ],
          name: "tokenMinted",
          type: "event",
        },
        {
          inputs: [],
          name: "Details",
          outputs: [
            {
              internalType: "string",
              name: "",
              type: "string",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "address",
              name: "to",
              type: "address",
            },
            {
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
          ],
          name: "approve",
          outputs: [],
          stateMutability: "nonpayable",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "address",
              name: "owner",
              type: "address",
            },
          ],
          name: "balanceOf",
          outputs: [
            {
              internalType: "uint256",
              name: "",
              type: "uint256",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [],
          name: "baseUIR",
          outputs: [
            {
              internalType: "string",
              name: "",
              type: "string",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
          ],
          name: "getApproved",
          outputs: [
            {
              internalType: "address",
              name: "",
              type: "address",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "address",
              name: "owner",
              type: "address",
            },
            {
              internalType: "address",
              name: "operator",
              type: "address",
            },
          ],
          name: "isApprovedForAll",
          outputs: [
            {
              internalType: "bool",
              name: "",
              type: "bool",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "address",
              name: "_to",
              type: "address",
            },
            {
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
          ],
          name: "mint",
          outputs: [],
          stateMutability: "nonpayable",
          type: "function",
        },
        {
          inputs: [],
          name: "name",
          outputs: [
            {
              internalType: "string",
              name: "",
              type: "string",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [],
          name: "owner",
          outputs: [
            {
              internalType: "address",
              name: "",
              type: "address",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
          ],
          name: "ownerOf",
          outputs: [
            {
              internalType: "address",
              name: "",
              type: "address",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [],
          name: "renounceOwnership",
          outputs: [],
          stateMutability: "nonpayable",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "address",
              name: "from",
              type: "address",
            },
            {
              internalType: "address",
              name: "to",
              type: "address",
            },
            {
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
          ],
          name: "safeTransferFrom",
          outputs: [],
          stateMutability: "nonpayable",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "address",
              name: "from",
              type: "address",
            },
            {
              internalType: "address",
              name: "to",
              type: "address",
            },
            {
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
            {
              internalType: "bytes",
              name: "data",
              type: "bytes",
            },
          ],
          name: "safeTransferFrom",
          outputs: [],
          stateMutability: "nonpayable",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "address",
              name: "operator",
              type: "address",
            },
            {
              internalType: "bool",
              name: "approved",
              type: "bool",
            },
          ],
          name: "setApprovalForAll",
          outputs: [],
          stateMutability: "nonpayable",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "string",
              name: "_details",
              type: "string",
            },
          ],
          name: "setDetailsnew",
          outputs: [
            {
              internalType: "string",
              name: "",
              type: "string",
            },
          ],
          stateMutability: "nonpayable",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "string",
              name: "uri",
              type: "string",
            },
          ],
          name: "setURInew",
          outputs: [
            {
              internalType: "string",
              name: "",
              type: "string",
            },
          ],
          stateMutability: "nonpayable",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
            {
              internalType: "address",
              name: "user",
              type: "address",
            },
            {
              internalType: "uint64",
              name: "expires",
              type: "uint64",
            },
          ],
          name: "setUser",
          outputs: [],
          stateMutability: "nonpayable",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "bytes4",
              name: "interfaceId",
              type: "bytes4",
            },
          ],
          name: "supportsInterface",
          outputs: [
            {
              internalType: "bool",
              name: "",
              type: "bool",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [],
          name: "symbol",
          outputs: [
            {
              internalType: "string",
              name: "",
              type: "string",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "uint256",
              name: "index",
              type: "uint256",
            },
          ],
          name: "tokenByIndex",
          outputs: [
            {
              internalType: "uint256",
              name: "",
              type: "uint256",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "address",
              name: "owner",
              type: "address",
            },
            {
              internalType: "uint256",
              name: "index",
              type: "uint256",
            },
          ],
          name: "tokenOfOwnerByIndex",
          outputs: [
            {
              internalType: "uint256",
              name: "",
              type: "uint256",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
          ],
          name: "tokenURI",
          outputs: [
            {
              internalType: "string",
              name: "",
              type: "string",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [],
          name: "totalSupply",
          outputs: [
            {
              internalType: "uint256",
              name: "",
              type: "uint256",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "address",
              name: "from",
              type: "address",
            },
            {
              internalType: "address",
              name: "to",
              type: "address",
            },
            {
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
          ],
          name: "transferFrom",
          outputs: [],
          stateMutability: "nonpayable",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "address",
              name: "newOwner",
              type: "address",
            },
          ],
          name: "transferOwnership",
          outputs: [],
          stateMutability: "nonpayable",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
          ],
          name: "userExpires",
          outputs: [
            {
              internalType: "uint256",
              name: "",
              type: "uint256",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
        {
          inputs: [
            {
              internalType: "uint256",
              name: "tokenId",
              type: "uint256",
            },
          ],
          name: "userOf",
          outputs: [
            {
              internalType: "address",
              name: "",
              type: "address",
            },
          ],
          stateMutability: "view",
          type: "function",
        },
      ],
    };
  },
  methods: {
    async searchNFT() {
      try {
        const totalSupplyData = "0x18160ddd";
        const totalSupplyResult = await readCall(
          this.apiKey,
          this.apiSecret,
          this.chainId,
          totalSupplyData,
          this.contract, // 使用输入框中的合约地址
          this.id,
          this.api_url
        );

        this.iface = new ethers.Interface(this.ABI);
        const decodedResult = this.iface.decodeFunctionResult(
          "totalSupply",
          totalSupplyResult
        );

        this.numNFTs = parseInt(decodedResult[0]);
        this.nftList = parseInt(decodedResult[0]);

        const tokenURLData =
          "0xc87b56dd0000000000000000000000000000000000000000000000000000000000000015";
        const tokenURLResult = await readCall(
          this.apiKey,
          this.apiSecret,
          this.chainId,
          tokenURLData,
          this.contract, // 使用输入框中的合约地址
          this.id,
          this.api_url
        );
      
        const URLdecodedResult = this.iface.decodeFunctionResult(
          "tokenURI",
          tokenURLResult
        );

        const URL = URLdecodedResult[0];
        const response = await axios.get(URL);
        const jsonData = response.data;

        //用于图片展示动态调用
        this.baseImageUrl = jsonData.image;
        this.baseName = jsonData.name;
      } catch (error) {
        console.error("Error searching NFT:", error);
      }
    },

    // 获取 NFT 名称
    getNFTName(n) {
      if (this.baseName) {
        const showName = this.baseName; 
        return showName.replace("21#42", `${n}`);
      } else {
        return "加载中..."; 
      }
    },

    getImageUrl(n) {
      if (this.baseImageUrl) {
        const imageUrl = this.baseImageUrl; 
        return imageUrl.replace("/21.png", `/${n}.png`);
      } else {
        return placeholderImage; // 或者返回一个默认的链接或占位图
      }
    },

    async goToDetailPage(n) {
      try {
        // 使用 Vue Router 的编程式导航来跳转到详情页，并传递参数 n
        await this.$router.push({ name: "DetailsPage", params: { n } });
      } catch (error) {
        console.error("Error navigating to detail page:", error);
      }
    },
  },
};
</script>

<style>
/* 样式可以根据需要自行定义 */
.nft-cards {
  display: grid;
  grid-template-columns: repeat(
    auto-fill,
    minmax(300px, 1fr)
  ); /* 每行最少300px宽，等比缩放 */
  gap: 20px;
  justify-items: center; /* 居中对齐 */
}

.nft-card {
  text-align: center;
  border: 1px solid #ccc;
  padding: 10px;
}

.nft-card img {
  max-width: 100%;
  height: auto;
}
</style>
