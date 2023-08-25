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
          @click="showModal(n)"
        >
          <img :src="getImageUrl(n)" :alt="getNFTName(n)" />
          <p>{{ getNFTName(n) }}</p>
        </div>
      </div>
    </div>
  </div>

  <model
  v-if="jsonDATAN"
    :title="modalTitle"
    :show="isModalVisible"
    @close="closeModal"
    :jsonData="jsonDATAN"
    :imageUrl="baseImageUrl"
    :name="baseName"
  ></model>
</template>

<script>
import axios from "axios";
// import DetailPage from "./DetailPage.vue";
import loadingImg from "../assets/img/loading.png";
import model from "./model.vue";

export default {
  components: {
    // DetailPage,
    model,
  },
  data() {
    return {
      contract: "cfx:accm4vkvec1y96jajw0gw6k6k39gbm5bha9b8knzt5", // 合约地址
      numNFTs: 0,
      nftList: [],
      chainId: "1029",
      id: "13911024683",
      placeholderImage: "",
      baseImageUrl: loadingImg, // 将 baseImageUrl 定义在 data 中
      baseName: "", // 将 baseName 定义在 data 中
      isModalVisible: false,
      modalTitle: "sss",
  
      jsonDATA: {},
      jsonDATAN: {},
      JsonUrl: {},
    };
  },
  methods: {
    async searchNFT() {
      try {
        const totalSupplyData = "0x18160ddd";
        const totalSupply = await axios.post(
          "http://localhost:3000/api/readCall/totalSupply",
          {
            chainid: this.chainId,
            data: totalSupplyData,
            contract: this.contract, // 使用输入框中的合约地址
            id: this.id,
          }
        );
        //处理服务端返回的数字
        const totalSupplyResult = totalSupply.data;
        this.numNFTs = totalSupplyResult;
        this.nftList = totalSupplyResult;

        const tokenURLData =
          "0xc87b56dd0000000000000000000000000000000000000000000000000000000000000015";
        const tokenURL = await axios.post(
          "http://localhost:3000/api/readCall/tokenURI",
          {
            chainid: this.chainId,
            data: tokenURLData,
            contract: this.contract, // 使用输入框中的合约地址
            id: this.id,
          }
        );
        //处理服务端返回的json地址
        const jsonData = tokenURL.data.jsonData;
        console.log("jsonData:", jsonData);
        this.jsonDATA = jsonData;
        //用于图片展示动态调用
        this.baseImageUrl = jsonData.image;
        console.log("baseImageUrl:", this.baseImageUrl);
        this.baseName = jsonData.name;

        const url = tokenURL.data.URL;
        this.JsonUrl = url;
        console.log("url:", url);
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

    showModal(n) {
      this.isModalVisible = true;
      console.log("modalVisible:", this.isModalVisible);
      console.log("n:", n);
      if (this.JsonUrl) {
        const json = this.JsonUrl;
        const jsonurl = json.replace("/21.json", `/${n}.json`);
        console.log("jsonurl:", jsonurl);
        axios
          .get(jsonurl)
          .then((response) => {
            // 在请求成功后，更新解析后的链接
            const jsonD = response.data; // 假设服务器返回的数据即为链接内容
            console.log("jsonD=:", jsonD);
            this.jsonDATAN = jsonD;
          })
          .catch((error) => {
            console.error("Error fetching data:", error);
          });
      } else {
        return "加载中...";
      }
    },
    closeModal() {
      this.isModalVisible = false;
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
