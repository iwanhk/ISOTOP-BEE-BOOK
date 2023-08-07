# ISOTOP Plan-Bee repo
## 《THE BEE BOOK》 

本目录存储ISOTOP发布的智能合约接口，设计理念，和使用场景  
1. ISOTOP1010: 低GAS费ERC721A合约  
2. ISOTOP1011: 可销毁  
3. ISOTOP1012: 可租借 
4. ISOTOP1013: 可租借可销毁  
5. ISOTOP1014: 跨链资产转移合约  
6. ISOTOP1015: 单一图像徽章NFT合约，兼容ISOTOP1010   
7. ISOTOP1016: 动态NFT   
8. ISOTOP1017: NFT藏品，支持顺序铸造和按照编号铸造 
9. ISOTOP1018：单一图片ERC721 POAP徽章合约
10. ISOTOP1019：兼容ERC1155的数藏品合约
11. ISOTOP101A: 单一图片ERC1155 POAP徽章合约
12. ISOTOP1030: 预言机调用合约，使用chainlink 预言机，无需LINK，直接使用TGAS费用  
13. ISOTOP1052：票务NFT合约，支持打卡，兼容ERC721
14. DID: 域名解析和身份合约
15. SBT: soulBondToken 灵魂绑定合约，可定制化自己的token metadata
16. SBTII: soulBondToken 灵魂绑定合约，可发行自定义图片的SBT

工具合约：  
1. Deployer : 合约部署器  
2. DDS :  一个通用的域名数据库存储系统  
3. TGas : GAS费用的充账及分配系统  
4. Factory : 合约工厂，可以通过deployContract输入合约名称生产需要的合约, 合约名称见上面列表  
5. DateTime : 一个时间和日期转换工具合约  


## 链支持：

|     chianid    |     链                       |
|----------------|------------------------------|
|     1          |     Conflux Core 测试链      |
|     1029       |     Conflux Core 正式链      |
|     5555       |     武汉链正式链             |
|     12231      |     文昌链测试链             |
|     1224       |     文昌链正式链             |
|     71         |     Conflux eSpace 测试链    |
|     1030       |     Conflux eSpace 正式链    |
|     27         |     草田链正式链             |
|     42161      |     Arbione -正式链          |
|     421613     |     Arbitrum测试链           |
|     97         |     币安测试链               |
|     56         |     币安正式链               |
|     80001      |     Polygon Mumbai测试链     |
|     137        |     Polygon正式链            |
|     5          |     Goerli 以太坊测试链      |
|     1          |     以太坊正式链             |

***
## 合约部署地址：

|     合约                |     部署链地址                                          |
|-------------------------|-------------------------------------------------------|
|     Factory 合约工厂     |     主要链：0xCE0Fcafb4da817636F118c77a7CFcee3d1adF000   |
|     DDS 配置数据库       |     主要链：0x1E68f6Aee73e3A8e4Cb09B035b9736Ad193c1001   |
|     DID 身份            |     主要链：0x02E9c23e26FCc2489F9f64EAdfd6E2288B06D002  |
| Forwarder 代付合约 | 主要链：0x76Fd98C9EDc5dA98D8B0dF5fE303Ca0d765D9003 | 
|     ISOTOP1010          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1011          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1012          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1013          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1014          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1015          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1016          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1017          |     主要链                                             |
|     ISOTOP1018          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1019          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP101A          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1052          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1053          |     Conflux Core Test                                 |

*) 主要链为列表中除了以太坊，币安的所有    
***
*) Conflux Core测试链地址（自作聪明的特殊化）：   

| 合约 | 部署地址 |
|-------------------------|-------------------------------------------------------|
| Factory Conflux  Testnet | cfxtest:acfnywnk65cey1hjf71pa312sspn353uz2u48491sb |
|| 0x856f6fF92fD7b0dbC7B615F0eE33e9cF281268ea|
| Factory Conflux Mainnet | cfx:acaxr0c0zswsczave10j37w21kr3mr1ah6u7pehppk |
| | 0x8136d856aBa4e1541125Ec8cf658ba5b9536e03f |
| DDS Conflux Testnet | cfxtest:acc08593f9n5b08h02m9b5vx7hhwuexj7j892dzxuf |
| | 0x8AbA4969E6C44a5cE82F6EC066f87398bcEF30ae |
| DDS Conflux Mainnet | cfx:acgbcn8k6cd7eayp9s59st3bnst6ue1grjjcmp5tzp|
| |0x8C112fc9e087D2028CFbb7f73F215B9Fc812e66a|
| DID Conflux Testnet  | cfxtest:achp96s6g32fmfgt7j2fupy8r59thbnydehd5hnh7n |
| | 0x8ecfF1DC36705514cFeA3058329e6eFEf3857419 |
| Fowarder Conflux Mainnet | cfx:aca8pfe6rcuvu2h2bjsx08eafd0td4ukh6u9mnges4 |
| | 0x81E6149C68a11860F80A1D3B788028ECF1eA093F |
| Forwarder Conflux Testnet | cfxtest:acf2ef54m6vuvsw1n05cex5xt04n8x5tcjgtv3bxct |
| | 0x8b82177a572308bA575dB6224F737DB4bf4f6F12 |

*) 其中，Factory已经注册ISOTOP1017-101A, 1052, 1053     

***
## 使用方式
参考文档《同位素智能合约对接开发文档.pdf》

last updated: 2023.8.6

