| <b id="home">方法</b>   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| 0️⃣ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| 1️⃣ [deployContract(uint256,string)🇼](#deployContract(uint256,string)🇼)| 部署一个合约 | ✅ |  |
| 2️⃣ [getContractDeployed(uint256,address)🇷](#getContractDeployed(uint256,address)🇷)| 获得已经部署的合约地址 | ✅ |  |
| 3️⃣ [getContractInfo(address)🇷](#getContractInfo(address)🇷)| 查询某个工厂部署的合约的信息 | ✅ |  |
| 4️⃣ [getContractRegisted()🇷](#getContractRegisted()🇷)| 查询工厂已经注册的合约模版 | ✅ |  |
| 5️⃣ [getContractTemplate(string)🇷](#getContractTemplate(string)🇷)| 查询某个合约模版的信息 | ✅ |  |
| 6️⃣ [register(string,address)🇼](#register(string,address)🇼)| 注册一个合约模版 | ✅ |  |

- **合约及版本**: Factory-v2.0

- **获取方法**: 0x768e7C8A24e5a7c2fe78f42F3bF2323edA196000

- **描述**: 工厂合约，用于管理合约模板，克隆合约

- **ABI📝**: Factory-v2.0.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## 0️⃣ <b id="contractInfo()🇷">contractInfo()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 1️⃣ <b id="deployContract(uint256,string)🇼">deployContract(uint256,string)🇼</b>[^2]  [🔙](#home)
- **描述**: 部署一个合约

- selector: 0x988c6cfa

- 版本更新: 

### 参数

- **[uint256] _id**: 合约编号（每个管理员可以自己管理编号，唯一）

- **[string] _cname**: 合约名称

### 返回值

- **[address] **: 部署的合约地址（忽略返回，自己通过id查询）

- **备注**: 每个用户部署的合约id自己管理，和他人的独立

## 2️⃣ <b id="getContractDeployed(uint256,address)🇷">getContractDeployed(uint256,address)🇷</b>[^1]  [🔙](#home)
- **描述**: 获得已经部署的合约地址

- selector: 0xcbfb2f08

- 版本更新: 

### 参数

- **[uint256] _id**: 编号

- **[address] deployer**: 部署管理员地址

### 返回值

- **[address] **: 已经部署的合约地址

- 备注: 

## 3️⃣ <b id="getContractInfo(address)🇷">getContractInfo(address)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询某个工厂部署的合约的信息

- selector: 0xcd481e51

- 版本更新: 

### 参数

- **[address] _contract**: 地址

### 返回值

- **[tuple] **: 编号，合约名称，版本信息，部署人，部署时间

- 备注: 

## 4️⃣ <b id="getContractRegisted()🇷">getContractRegisted()🇷</b>[^1]  [🔙](#home)
- **描述**: 查询工厂已经注册的合约模版

- selector: 0x6b94fa39

- 版本更新: 

### 返回值

- **[string[]] **: 模版合约名称的列表

- 备注: 

## 5️⃣ <b id="getContractTemplate(string)🇷">getContractTemplate(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询某个合约模版的信息

- selector: 0xcdc703b0

- 版本更新: 

### 参数

- **[string] _cname**: 查询某个合约模版的信息

### 返回值

- **[tuple] **: 模版地址，版本号，管理员地址

- 备注: 

## 6️⃣ <b id="register(string,address)🇼">register(string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 注册一个合约模版

- selector: 0x1e59c529

- 版本更新: 

### 参数

- **[string] _cname**: 名称

- **[address] _template**: 模版部署的地址

- **备注**: 工厂合约开放注册，任何管理员可以注册自己的模版

___

*[🔙](#home) updated: 2024-10-05 19:34:25    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*



[^1]: 🇷读方法是同步操作，可以直接得到返回值，不消耗GAS费用。
[^2]: 🇼写方法是异步操作，需要消耗GAS费用，一般没有返回值，需要通过交易hash查询链上是否成功。
