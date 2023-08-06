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
                                                                                  |
## 合约部署地址：

|     合约                |     部署链地址                                          |
|-------------------------|---------------------------------------------------------|
|     Factory 合约工厂    |     全链：0xCE0Fcafb4da817636F118c77a7CFcee3d1adF000    |
|                         |     Conflux Core:                                       |
|     DDS 配置数据库      |     全链：0x1E68f6Aee73e3A8e4Cb09B035b9736Ad193c1001    |
|                         |     Conflux Core:                                       |
|     DID 身份            |     全链：0x02E9c23e26FCc2489F9f64EAdfd6E2288B06D002    |
|                         |     Conflux Core:                                       |
|     ISOTOP1010          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1011          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1012          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1013          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1014          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1015          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1016          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1017          |     全链                                                |
|     ISOTOP1018          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1019          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP101A          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1052          |     文昌链测试，Conflux Core Test                       |
|     ISOTOP1053          |     Conflux Core Test                                   |
|                         |                                                         |

## 使用方式
参考文档《同位素智能合约对接开发文档.pdf》

last updated: 2023.8.5

