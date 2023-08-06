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


## 合约部署地址：


| chianid    | Chain Description       | Contracts Deployed                                  |
| 1          | Conflux Core testnet    | Factory:                                            |
|            |                         | DDS:                                                |
|            |                         | DID:                                                |
|            |                         | :heavy_check_mark:ISOTOP1010                        |
|            |                         | :heavy_check_mark:ISOTOP1011                        |
|            |                         | :heavy_check_mark:ISOTOP1012                        |
|            |                         | :heavy_check_mark:ISOTOP1013                        |
|            |                         | :heavy_check_mark:ISOTOP1014                        |
|            |                         | :heavy_check_mark:ISOTOP1015                        |
|            |                         | :heavy_check_mark:ISOTOP1016                        |
|            |                         | :heavy_check_mark:ISOTOP1017                        |
|            |                         | :heavy_check_mark:ISOTOP1018                        |
|            |                         | :heavy_check_mark:ISOTOP1019                        |
|            |                         | :heavy_check_mark:ISOTOP101A                        |
|            |                         | :heavy_check_mark:ISOTOP1052                        |
|            |                         | :heavy_check_mark:ISOTOP1053                        |
| 1029       | Conflux Core testnet    | Factory: 0xCE0Fcafb4da817636F118c77a7CFcee3d1adF000 |
|            |                         | DDS: 0x1E68f6Aee73e3A8e4Cb09B035b9736Ad193c1001     |
|            |                         | DID: 0x02E9c23e26FCc2489F9f64EAdfd6E2288B06D002     |
|            |                         | :heavy_check_mark:ISOTOP1017                        |
|            |                         | Factory: 0xCE0Fcafb4da817636F118c77a7CFcee3d1adF000 |
| 5555       | Wuhan Mainnnet          | DDS: 0x1E68f6Aee73e3A8e4Cb09B035b9736Ad193c1001     |
|            |                         | DID: 0x02E9c23e26FCc2489F9f64EAdfd6E2288B06D002     |
|            |                         |                                                     |
|            |                         | :heavy_check_mark:ISOTOP1017                        |
|            |                         | Factory: 0xCE0Fcafb4da817636F118c77a7CFcee3d1adF000 |
| 12231      | Wenchang testnet        | DDS: 0x1E68f6Aee73e3A8e4Cb09B035b9736Ad193c1001     |
|            |                         | DID: 0x02E9c23e26FCc2489F9f64EAdfd6E2288B06D002     |
|            |                         | :heavy_check_mark:ISOTOP1010                        |
|            |                         | :heavy_check_mark:ISOTOP1011                        |
|            |                         | :heavy_check_mark:ISOTOP1012                        |
|            |                         | :heavy_check_mark:ISOTOP1013                        |
|            |                         | :heavy_check_mark:ISOTOP1014                        |
|            |                         | :heavy_check_mark:ISOTOP1015                        |
|            |                         | :heavy_check_mark:ISOTOP1016                        |
|            |                         | :heavy_check_mark:ISOTOP1017                        |
|            |                         | :heavy_check_mark:ISOTOP1018                        |
|            |                         | :heavy_check_mark:ISOTOP1019                        |
|            |                         | :heavy_check_mark:ISOTOP101A                        |
|            |                         | :heavy_check_mark:ISOTOP1052                        |
|            |                         | :heavy_check_mark:ISOTOP1053                        |
| 1224       | Wenchang Mainnet        | Factory: 0xCE0Fcafb4da817636F118c77a7CFcee3d1adF000 |
|            |                         | DDS: 0x1E68f6Aee73e3A8e4Cb09B035b9736Ad193c1001     |
|            |                         | DID: 0x02E9c23e26FCc2489F9f64EAdfd6E2288B06D002     |
|            |                         |                                                     |
|            |                         | :heavy_check_mark:ISOTOP1017                        |
| 71         | Conflux eSpace Testnet  | Factory: 0xCE0Fcafb4da817636F118c77a7CFcee3d1adF000 |
|            |                         | DDS: 0x1E68f6Aee73e3A8e4Cb09B035b9736Ad193c1001     |
|            |                         | DID: 0x02E9c23e26FCc2489F9f64EAdfd6E2288B06D002     |
|            |                         | :heavy_check_mark:ISOTOP1010                        |
|            |                         | :heavy_check_mark:ISOTOP1011                        |
|            |                         | :heavy_check_mark:ISOTOP1012                        |
|            |                         | :heavy_check_mark:ISOTOP1013                        |
|            |                         | :heavy_check_mark:ISOTOP1014                        |
|            |                         | :heavy_check_mark:ISOTOP1015                        |
|            |                         | :heavy_check_mark:ISOTOP1016                        |
|            |                         | :heavy_check_mark:ISOTOP1017                        |
|            |                         | :heavy_check_mark:ISOTOP1018                        |
|            |                         | :heavy_check_mark:ISOTOP1019                        |
|            |                         | :heavy_check_mark:ISOTOP101A                        |
|            |                         | :heavy_check_mark:ISOTOP1052                        |
|            |                         | :heavy_check_mark:ISOTOP1053                        |
| 1030       | Conflux eSpace Mainnnet | Factory: 0xCE0Fcafb4da817636F118c77a7CFcee3d1adF000 |
|            |                         | DDS: 0x1E68f6Aee73e3A8e4Cb09B035b9736Ad193c1001     |
|            |                         | DID: 0x02E9c23e26FCc2489F9f64EAdfd6E2288B06D002     |
|            |                         |                                                     |
|            |                         | :heavy_check_mark:ISOTOP1017                        |
| 27         | CaoTian Mainnet         | Factory: 0xCE0Fcafb4da817636F118c77a7CFcee3d1adF000 |
|            |                         | DDS: 0x1E68f6Aee73e3A8e4Cb09B035b9736Ad193c1001     |
|            |                         | DID: 0x02E9c23e26FCc2489F9f64EAdfd6E2288B06D002     |
|            |                         |                                                     |
|            |                         | :heavy_check_mark:ISOTOP1017                        |
|            |                         |                                                     |
| 42161      | Arbione Mainnet         |                                                     |
| 421613     | Arbitrum testnet        |                                                     |
| 97         | Bian testnet            |                                                     |
| 56         | Bian Mainnet            |                                                     |
| 80001      | Polygon Mumbai testnet  |                                                     |
| 137        | Polygon Mainnet         |                                                     |
| 5          | Goerli testnet          |                                                     |
| 1          | Ether Mainnnet          |                                                     |


文昌链测试链：
***
1. DDS : 0xF5F5517E3A4f9985B7c4ea6700A793624f7D0000   
2. Factory:  0x969d47b6973DF7AF6ca28F0F9F67F2A2a0F20000   
3. DID: 0x1cA031A10e28e89f76cEccf32f3f9580db7c0000  
其中，Factory已经注册ISOTOP1010-101A,1052  

树图链测试链：
1. DDS： cfxtest:acc08593f9n5b08h02m9b5vx7hhwuexj7j892dzxuf   
   (eg: 0x856f6fF92fD7b0dbC7B615F0eE33e9cF281268ea)   
2. Factory：cfxtest:acfnywnk65cey1hjf71pa312sspn353uz2u48491sb    
   (eg.: 0x8AbA4969E6C44a5cE82F6EC066f87398bcEF30ae)   
3. DID: cfxtest:achp96s6g32fmfgt7j2fupy8r59thbnydehd5hnh7n   
   (eg.: 0x8ecfF1DC36705514cFeA3058329e6eFEf3857419)   
其中，Factory已经注册ISOTOP1017-101A, 1052
***
树图链正式链：
1. DDS: cfx:acgbcn8k6cd7eayp9s59st3bnst6ue1grjjcmp5tzp
   (e.g. 0x8C112fc9e087D2028CFbb7f73F215B9Fc812e66a)
2. Factory：cfx:acaxr0c0zswsczave10j37w21kr3mr1ah6u7pehppk  
   (eg.: 0x8136d856aBa4e1541125Ec8cf658ba5b9536e03f)   
 
其中，Factory已经注册ISOTOP1017-101A, 1052
## 使用方式
参考文档《同位素智能合约对接开发文档.pdf》

last updated: 2023.8.5

