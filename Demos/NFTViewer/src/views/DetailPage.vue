<template>
  <div class="nft-card-container">
    <div class="nft-image-container">
      <img :src="nftData.image" alt="NFT Image" />
    </div>
    <div class="nft-details">
      <h2>{{ nftData.name }}</h2>
      <p>Symbol: {{ nftData.symbol }}</p>
      <p>Description: {{ nftData.description }}</p>
      <h3>Attributes:</h3>
      <ul>
        <li v-for="attribute in nftData.attributes" :key="attribute.trait_type">
          <strong>{{ attribute.trait_type }}:</strong> {{ attribute.value }}
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  data() {
    return {
      receivedParam: null,
      nftData: {
        name: "",
        symbol: "",
        description: "",
        image: "",
        attributes: [],
      },
    };
  },
  created() {
    // 在组件创建时，获取路由参数 n
    this.receivedParam = this.$route.params.n;
    // 获取路由参数 n
    const N = this.receivedParam;
    const url = `https://bafybeie2osdt7eiu4xj4zch7gp4b3te7v6ndw7viwqe6gzfpg26rgvtvba.ipfs.nftstorage.link/${N}.json`;
    axios
      .get(url)
      .then((response) => {
        // 在请求成功后，更新解析后的链接
        const jsonDATA = response.data; // 假设服务器返回的数据即为链接内容
        console.log("jsonDATA:", jsonDATA);
        this.nftData = jsonDATA;
      })
      .catch((error) => {
        console.error("Error fetching data:", error);
      });
  },
};
</script>

<style>
.nft-card-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  margin: 20px;
  padding: 20px;
  border: 1px solid #ccc;
  box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.2);
  background-color: #fff;
}

.nft-image-container {
  width: 100%;
  padding-top: 100%; /* 1:1 宽高比 */
  position: relative;
  overflow: hidden;
}

.nft-image-container img {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  object-fit: cover;
}

@media (min-width: 768px) {
  /* PC端样式 */
  .nft-card-container {
    flex-direction: row;
    text-align: left;
    width: 60vw;
  }
  .nft-card-container img {
    margin-right: 20px;
  }
  .nft-details{
    margin-left: 2vw;
  }
}
</style>
