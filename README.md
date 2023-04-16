# ISOTOP Plan-Bee repo
## 《THE BEE BOOK》 

本目录存储ISOTOP发布的智能合约接口，设计理念，和使用场景  
1. ISOTOP1010: 低GAS费ERC721合约  
2. ISOTOP1011: 可销毁  
3. ISOTOP1012: 可租借 
4. ISOTOP1013: 可租借可销毁  
5. ISOTOP1014: 跨链资产转移合约  
6. ISOTOP1015: 单一图像徽章NFT合约，兼容ISOTOP1010   
7. ISOTOP1016: 动态NFT   
8. ISOTOP1017: conflux 顺序编号NFT  
9. ISOTOP1030: 预言机调用合约，使用chainlink 预言机，无需LINK，直接使用TGAS费用  
10. DID: 域名解析和身份合约
11. SBT: soulBondToken 灵魂绑定合约，可定制化自己的token metadata
12. SBTII: soulBondToken 灵魂绑定合约，可发行自定义图片的SBT

工具合约：  
1. Deployer : 合约部署器  
2. DDS :  一个通用的域名数据库存储系统  
3. TGas : GAS费用的充账及分配系统  
4. Factory : 合约工厂，可以通过deployContract输入合约名称生产需要的合约, 合约名称见上面列表  
5. DateTime : 一个时间和日期转换工具合约  


## 测试链合约部署地址：

文昌链测试链：
***
1. DDS : 0xCFfFDE169Afbd51F081d2e82aCcA0f19cAdCbbeE  
2. Factory:  0x802Ef413CD98edC1DBD839aad2e1C7ee2903a2c4   
3. DID: 0xC9e20C60E4bA04dca7DF1d8Ff05f3a2B8248D97C  
4. SBT: 0x055190564E8924A87d1d9B10e16FA43d34c5891A  
5. SBTII: 0xFb1b71231c09E7F59B02B0545cc13C435D58cdEc  
其中，Factory已经注册ISOTOP1010-1017, DID, SBT, SBTII

树图链测试链：
1. DDS： cfxtest:acewcnssk1zme8vfznzbcuffvhj2z49xpj3tn3edpf   
2. Factory：cfxtest:aceavfyk8bn9fd992as1zf8jyev6tvc192tdk8tgtm   
3. DID: cfxtest:ach9kby3wr5wsbremhy3j034ja7d8ram922gdc1msw   
4. SBT:   cfxtest:acf4w376cv4egvtv7tue061wbwg44uy5wu3bnpx50c   
5. SBTII:   cfxtest:acbreyymehd1vxn6h10nzbxn5ymxvzht36j2zjnfc2   
其中，Factory已经注册ISOTOP1010-1017, DID, SBT, SBTII
***

## 使用方式
参考文档《同位素智能合约对接开发文档.pdf》

last updated: 2023.4.16

