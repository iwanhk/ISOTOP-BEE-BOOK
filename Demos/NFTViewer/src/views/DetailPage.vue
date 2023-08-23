<template>
  <div class="nft-card-container">
    <div class="nft-image-container">
      <div id="canvas-container" class="nft-image-container-canvas"></div>
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
  <div class="back" @click="back"><a>《返回</a></div>
</template>

<script>
import axios from "axios";
import * as THREE from "three";
import { OrbitControls } from "three/examples/jsm/controls/OrbitControls.js";

export default {
  data() {
    return {
      receivedParam: null,
      receiveQuery: null,
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

        const scene = new THREE.Scene();
        const camera = new THREE.PerspectiveCamera(
          82,
          window.innerWidth / window.innerHeight,
          1,
          500
        );

        const renderer = new THREE.WebGLRenderer();
        renderer.setSize(window.innerWidth, window.innerHeight);
        document
          .getElementById("canvas-container")
          .appendChild(renderer.domElement);

        const materials = [
          new THREE.MeshBasicMaterial({ color: 0x7d7b7c }), // Right
          new THREE.MeshBasicMaterial({ color: 0x7d7b7c }), // Left 
          new THREE.MeshBasicMaterial({ color: 0x7d7b7c }), // Top 
          new THREE.MeshBasicMaterial({ color: 0x7d7b7c }), // Bottom 
          new THREE.MeshStandardMaterial({
            map: new THREE.TextureLoader().load(this.nftData.image), // Front 
            roughness: 0,
            metalness: 0,
          }),
          new THREE.MeshBasicMaterial({
            map: new THREE.TextureLoader().load(this.nftData.image), // Front 
            roughness: 0,
            metalness: 0,
          }), 
        ];

        const geometry = new THREE.BoxGeometry(2, 1, 0.2);

        const cube = new THREE.Mesh(geometry, materials);
        scene.add(cube);

        scene.background = new THREE.Color(0xffffff);
        const ambientLight = new THREE.AmbientLight(0xffffff, 0.5);
        scene.add(ambientLight);
        const directionalLight = new THREE.DirectionalLight(0xffffff, 1);
        directionalLight.position.set(1, 2, 3);
        scene.add(directionalLight);

        camera.position.z = 3;
        const controls = new OrbitControls(camera, renderer.domElement);
        controls.enableDamping = true;
        controls.update();
        // const axesHelper = new THREE.AxesHelper(3);
        // scene.add(axesHelper);
        cube.scale.set(1, 2, 1);

        let rotationCompleted = false;
        let rotationAngle = 0;

        function animate() {
          controls.update();
          requestAnimationFrame(animate);

          // 旋转半圈（180度）
          if (!rotationCompleted) {
            rotationAngle += Math.PI / 180; // 每帧旋转角度增加
            cube.rotation.y = rotationAngle;

            if (rotationAngle >= Math.PI) {
              rotationCompleted = true; // 旋转完成
            }
          }

          renderer.render(scene, camera);
        }

        animate();
      })
      .catch((error) => {
        console.error("Error fetching data:", error);
      });
  },
  methods: {
    // 返回上一页
    back() {
      this.$router.go(-1);
    },
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

.nft-image-container-canvas {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  object-fit: cover;
  margin-left: -50%;
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
  .nft-details {
    margin-left: 2vw;
  }
}
</style>
