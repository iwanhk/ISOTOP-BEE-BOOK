| <b id="home">方法</b>   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| 0️⃣ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| 1️⃣ [deployContract(uint256,string)🇼](#deployContract(uint256,string)🇼)| 部署一个合约 | ✅ |  |
| 2️⃣ [getContractDeployed(uint256,address)🇷](#getContractDeployed(uint256,address)🇷)| 获得已经部署的合约地址 | ✅ |  |
| 3️⃣ [getContractInfo(address)🇷](#getContractInfo(address)🇷)| 查询某个工厂部署的合约的信息 | ✅ |  |
| 4️⃣ [getContractRegisted()🇷](#getContractRegisted()🇷)| 查询工厂已经注册的合约模版 | ✅ |  |
| 5️⃣ [getContractTemplate(string)🇷](#getContractTemplate(string)🇷)| 查询某个合约模版的信息 | ✅ |  |
| 6️⃣ [register(string,address)🇼](#register(string,address)🇼)| 注册一个合约模版 | ✅ |  |
| 7️⃣ [Account(uint256)🇷](#Account(uint256)🇷)| 查询某个ID的账户地址 | ✅ |  |
| 8️⃣ [Account(string)🇷](#Account(string)🇷)| 查询某个DID的账户地址 | ✅ |  |
| 9️⃣ [addAddress(string,address)🇼](#addAddress(string,address)🇼)| 添加某个DID的管理员地址 | ✅ |  |
| 1️⃣0️⃣ [addAsset(string,address)🇼](#addAsset(string,address)🇼)| 添加DID资产 | ✅ |  |
| 1️⃣1️⃣ [addOperator(address)🇼](#addOperator(address)🇼)|  |  |  |
| 1️⃣2️⃣ [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 限制渠道发行数量 | ✅ |  |
| 1️⃣3️⃣ [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| 1️⃣4️⃣ [balanceOf(address)🇷](#balanceOf(address)🇷)| 查询某个地址拥有几个资产 | ✅ |  |
| 1️⃣5️⃣ [burn(uint256)🇼](#burn(uint256)🇼)|  |  |  |
| 1️⃣6️⃣ [create(string,string,address,uint256)🇼](#create(string,string,address,uint256)🇼)| 创建DID | ✅ |  |
| 1️⃣7️⃣ [createAccount(string)🇼](#createAccount(string)🇼)|  |  |  |
| 1️⃣8️⃣ [data(string)🇷](#data(string)🇷)| 返回DID详细信息 | ✅ |  |
| 1️⃣9️⃣ [dump()🇷](#dump()🇷)| 导出全部发行的DID名称清单 | ✅ |  |
| 2️⃣0️⃣ [erc6551ImplementationAddress()🇷](#erc6551ImplementationAddress()🇷)|  |  |  |
| 2️⃣1️⃣ [expire(string)🇷](#expire(string)🇷)| 到期日 | ✅ |  |
| 2️⃣2️⃣ [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| 2️⃣3️⃣ [getManagersAddress(string)🇷](#getManagersAddress(string)🇷)| 返回DID全部管理员地址列表 | ✅ |  |
| 2️⃣4️⃣ [getOperators()🇷](#getOperators()🇷)|  |  |  |
| 2️⃣5️⃣ [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| 2️⃣6️⃣ [hasAsset(string,address)🇷](#hasAsset(string,address)🇷)| 是否拥有一个资产 | ✅ |  |
| 2️⃣7️⃣ [index(string)🇷](#index(string)🇷)| 根据DID名称查询tokenID | ✅ |  |
| 2️⃣8️⃣ [init(address,address)🇼](#init(address,address)🇼)|  |  |  |
| 2️⃣9️⃣ [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| 3️⃣0️⃣ [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| 3️⃣1️⃣ [name()🇷](#name()🇷)|  |  |  |
| 3️⃣2️⃣ [owner()🇷](#owner()🇷)|  |  |  |
| 3️⃣3️⃣ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)| 查询某个资产的拥有人 | ✅ |  |
| 3️⃣4️⃣ [query(string)🇷](#query(string)🇷)| 查询DID的拥有人 | ✅ |  |
| 3️⃣5️⃣ [query(uint256)🇷](#query(uint256)🇷)| 查询编号的DID名称 | ✅ |  |
| 3️⃣6️⃣ [query(address)🇷](#query(address)🇷)| 查询某个地址拥有的DID清单 | ✅ |  |
| 3️⃣7️⃣ [removeAddress(string,address)🇼](#removeAddress(string,address)🇼)|  |  |  |
| 3️⃣8️⃣ [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| 3️⃣9️⃣ [renew(uint256,uint256)🇼](#renew(uint256,uint256)🇼)| 续约 | ✅ |  |
| 4️⃣0️⃣ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| 4️⃣1️⃣ [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)|  |  |  |
| 4️⃣2️⃣ [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| 4️⃣3️⃣ [sell(address,address,uint256,uint256)🇼](#sell(address,address,uint256,uint256)🇼)| 售卖 | ✅ |  |
| 4️⃣4️⃣ [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| 4️⃣5️⃣ [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| 4️⃣6️⃣ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| 4️⃣7️⃣ [symbol()🇷](#symbol()🇷)|  |  |  |
| 4️⃣8️⃣ [tokenBoundRegistry()🇷](#tokenBoundRegistry()🇷)|  |  |  |
| 4️⃣9️⃣ [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| 5️⃣0️⃣ [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| 5️⃣1️⃣ [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)| 资产的元数据metadata | ✅ |  |
| 5️⃣2️⃣ [totalSupply()🇷](#totalSupply()🇷)| 资产的总发行量 | ✅ |  |
| 5️⃣3️⃣ [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)| 转移资产 | ✅ |  |
| 5️⃣4️⃣ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |
| 5️⃣5️⃣ [validateAddress(string,address)🇷](#validateAddress(string,address)🇷)| 核验某个地址是否是某个DID的管理员 | ✅ |  |
| 5️⃣6️⃣ [create(string,address,uint256)🇼](#create(string,address,uint256)🇼)| 创建DID | ✅ |  |
| 5️⃣7️⃣ [name(uint256)🇷](#name(uint256)🇷)|  |  |  |
| 5️⃣8️⃣ [ownerOfID(string)🇷](#ownerOfID(string)🇷)| 查询某个DID的拥有人地址 | ✅ |  |
| 5️⃣9️⃣ [setContent(uint256,string,string,string)🇼](#setContent(uint256,string,string,string)🇼)| 添加DID的内容 | ✅ |  |
| 6️⃣0️⃣ [sign(string,address,uint256)🇼](#sign(string,address,uint256)🇼)| 签名 | ✅ |  |
| 6️⃣1️⃣ [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| 6️⃣2️⃣ [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)|  |  |  |
| 6️⃣3️⃣ [verify(string,address,uint256)🇷](#verify(string,address,uint256)🇷)| 核验某个资产是否被签名 | ✅ |  |
| 6️⃣4️⃣ [addBank(uint256)🇼](#addBank(uint256)🇼)| 添加票仓数量 | ✅ |  |
| 6️⃣5️⃣ [check(uint256,string,uint256,string,address)🇼](#check(uint256,string,uint256,string,address)🇼)| 预约 | ✅ |  |
| 6️⃣6️⃣ [check(uint256,string,address)🇼](#check(uint256,string,address)🇼)| 核销 | ✅ |  |
| 6️⃣7️⃣ [claim(address,uint256)🇼](#claim(address,uint256)🇼)| 活动兑换领取卡 | ✅ |  |
| 6️⃣8️⃣ [creator(uint256)🇷](#creator(uint256)🇷)|  |  |  |
| 6️⃣9️⃣ [exists(uint256)🇷](#exists(uint256)🇷)|  |  |  |
| 7️⃣0️⃣ [getBankRest()🇷](#getBankRest()🇷)|  |  |  |
| 7️⃣1️⃣ [getOperator(uint256)🇷](#getOperator(uint256)🇷)|  |  |  |
| 7️⃣2️⃣ [getStatus(uint256,uint8)🇷](#getStatus(uint256,uint8)🇷)|  |  |  |
| 7️⃣3️⃣ [init(string[],string[],bytes1[],uint256,uint256)🇼](#init(string[],string[],bytes1[],uint256,uint256)🇼)| 初始化合约 | ✅ |  |
| 7️⃣4️⃣ [isReservedDay(uint256,uint8)🇷](#isReservedDay(uint256,uint8)🇷)|  |  |  |
| 7️⃣5️⃣ [mint(address,uint256)🇼](#mint(address,uint256)🇼)|  |  |  |
| 7️⃣6️⃣ [refund(uint256)🇼](#refund(uint256)🇼)|  |  |  |
| 7️⃣7️⃣ [removeBank(uint256)🇼](#removeBank(uint256)🇼)|  |  |  |
| 7️⃣8️⃣ [setAttr(uint256,string,string)🇼](#setAttr(uint256,string,string)🇼)|  |  |  |
| 7️⃣9️⃣ [setTreadstone(address)🇼](#setTreadstone(address)🇼)|  |  |  |
| 8️⃣0️⃣ [ticketStatusInfo()🇷](#ticketStatusInfo()🇷)|  |  |  |
| 8️⃣1️⃣ [totalBank()🇷](#totalBank()🇷)|  |  |  |
| 8️⃣2️⃣ [transfer(address,address,uint256)🇼](#transfer(address,address,uint256)🇼)|  |  |  |
| 8️⃣3️⃣ [update(string,string)🇼](#update(string,string)🇼)|  |  |  |
| 8️⃣4️⃣ [check(uint256,address,string,address)🇼](#check(uint256,address,string,address)🇼)| 核销权益卡 | ✅ |  |
| 8️⃣5️⃣ [check(uint256,address,string,uint256,string,address)🇼](#check(uint256,address,string,uint256,string,address)🇼)| 预约核销卡权益 | ✅ |  |
| 8️⃣6️⃣ [getStatus(uint256,address,uint8)🇷](#getStatus(uint256,address,uint8)🇷)|  |  |  |
| 8️⃣7️⃣ [init(string[],address[],uint8,uint256,uint256)🇼](#init(string[],address[],uint8,uint256,uint256)🇼)| 初始化 | ✅ |  |
| 8️⃣8️⃣ [check(uint256,uint16,string,address)🇼](#check(uint256,uint16,string,address)🇼)| 核销卡中的门票 | ✅ |  |
| 8️⃣9️⃣ [check(uint256,uint16,string,uint256,string,address)🇼](#check(uint256,uint16,string,uint256,string,address)🇼)| 预约卡中的门票 | ✅ |  |
| 9️⃣0️⃣ [getStatus(uint256,uint16,uint8)🇷](#getStatus(uint256,uint16,uint8)🇷)|  |  |  |
| 9️⃣1️⃣ [init(string[],address[],uint16[],uint8[],uint16,uint256,uint256)🇼](#init(string[],address[],uint16[],uint8[],uint16,uint256,uint256)🇼)| 初始化卡片 | ✅ |  |
| 9️⃣2️⃣ [redeem(uint256,address,uint8)🇼](#redeem(uint256,address,uint8)🇼)| 兑换门票 | ✅ |  |
| 9️⃣3️⃣ [ticketsPool(uint256,uint256)🇷](#ticketsPool(uint256,uint256)🇷)|  |  |  |
| 9️⃣4️⃣ [beijingTimeMidnight(uint256)🇷](#beijingTimeMidnight(uint256)🇷)| 转化时间为北京时间午夜零点（已废弃 | ✅ |  |
| 9️⃣5️⃣ [blockTimeMidnight()🇷](#blockTimeMidnight()🇷)| 转化当前时间为北京时间午夜零点（已废弃） | ✅ |  |
| 9️⃣6️⃣ [getStatus(uint256)🇷](#getStatus(uint256)🇷)|  |  |  |
| 9️⃣7️⃣ [Details()🇷](#Details()🇷)| 资产介绍页面URL | ✅ |  |
| 9️⃣8️⃣ [init(string,string,string,string)🇼](#init(string,string,string,string)🇼)| 初始化合约 | ✅ |  |
| 9️⃣9️⃣ [mint(address)🇼](#mint(address)🇼)|  铸造NFT | ✅ |  |
| 1️⃣0️⃣0️⃣ [safeMint(address)🇼](#safeMint(address)🇼)|  |  |  |
| 1️⃣0️⃣1️⃣ [safeMint(address,uint256)🇼](#safeMint(address,uint256)🇼)|  |  |  |
| 1️⃣0️⃣2️⃣ [setBaseURI(string)🇼](#setBaseURI(string)🇼)| 更改metadata的目录URL | ✅ |  |
| 1️⃣0️⃣3️⃣ [setDetailsURI(string)🇼](#setDetailsURI(string)🇼)|  |  |  |
| 1️⃣0️⃣4️⃣ [setParty(string[],uint8[])🇼](#setParty(string[],uint8[])🇼)|  |  |  |
| 1️⃣0️⃣5️⃣ [suspend(bool)🇼](#suspend(bool)🇼)|  |  |  |

- **合约及版本**: ISOTOP1017-v1.0

- **获取方法**: 合约工厂clone，名称ISOTOP1017

- **描述**: 数字资产，包含数字藏品，数字纪念品等有独立存证编号的内容，又被称为NFT（非同质化token）。是通过区块链技术确权的数字内容。每个资产有自己独立编号，一旦铸造，即可以链上存证，具有自己的价值。
 支持数字资产的智能合约是ERC721兼容的独立实现，我们还扩展了合约，支持资产扩展信息。

- **ABI📝**: ISOTOP1017-v1.0.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## 0️⃣ <b id="Details()🇷">Details()🇷</b> [🔙](#home)
- **描述**: 资产介绍页面URL

- selector: 0xb47d89ad

- 版本更新: 

### 返回值

- [string] : 

- **备注**: NFT介绍页面是可选参数，可以为空

## 1️⃣ <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x095ea7b3

- 版本更新: 

### 参数

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 2️⃣ <b id="balanceOf(address)🇷">balanceOf(address)🇷</b> [🔙](#home)
- **描述**: 查询某个地址拥有几个资产

- selector: 0x70a08231

- 版本更新: 

### 参数

- [address] owner: 

### 返回值

- [uint256] : 

- 备注: 

## 3️⃣ <b id="burn(uint256)🇼">burn(uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x42966c68

- 版本更新: 

### 参数

- [uint256] tokenId: 

- 备注: 

## 4️⃣ <b id="contractInfo()🇷">contractInfo()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 5️⃣ <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x081812fc

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 6️⃣ <b id="init(string,string,string,string)🇼">init(string,string,string,string)🇼</b> [🔙](#home)
- **描述**: 初始化合约

- selector: 0x8de12845

- 版本更新: 

### 参数

- **[string] name_**: 合约名称

- **[string] symbol_**: 代号

- **[string] base_**: metadata的目录URL

- **[string] details_**: NFT项目介绍页面URL

- **备注**: 如果base_是以/结尾的目录，则顺序读取目录下0.json文件。 否则固定为一个json文件内容。

## 7️⃣ <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b> [🔙](#home)
- 描述: 

- selector: 0xe985e9c5

- 版本更新: 

### 参数

- [address] owner: 

- [address] operator: 

### 返回值

- [bool] : 

- 备注: 

## 8️⃣ <b id="mint(address,uint256)🇼">mint(address,uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x40c10f19

- 版本更新: 

### 参数

- [address] _to: 

- [uint256] tokenId: 

- 备注: 

## 9️⃣ <b id="mint(address)🇼">mint(address)🇼</b> [🔙](#home)
- **描述**:  铸造NFT

- selector: 0x6a627842

- 版本更新: 

### 参数

- [address] _to: 

- **备注**: NFT的编号自动增加

## 1️⃣0️⃣ <b id="name()🇷">name()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x06fdde03

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 1️⃣1️⃣ <b id="owner()🇷">owner()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x8da5cb5b

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣2️⃣ <b id="ownerOf(uint256)🇷">ownerOf(uint256)🇷</b> [🔙](#home)
- **描述**: 查询某个资产的拥有人

- selector: 0x6352211e

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣3️⃣ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b> [🔙](#home)
- 描述: 

- selector: 0x715018a6

- 版本更新: 

- 备注: 

## 1️⃣4️⃣ <b id="safeMint(address)🇼">safeMint(address)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x40d097c3

- 版本更新: 

### 参数

- [address] _to: 

- 备注: 

## 1️⃣5️⃣ <b id="safeMint(address,uint256)🇼">safeMint(address,uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xa1448194

- 版本更新: 

### 参数

- [address] _to: 

- [uint256] tokenId: 

- 备注: 

## 1️⃣6️⃣ <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x42842e0e

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 1️⃣7️⃣ <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xb88d4fde

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [bytes] data: 

- 备注: 

## 1️⃣8️⃣ <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xa22cb465

- 版本更新: 

### 参数

- [address] operator: 

- [bool] approved: 

- 备注: 

## 1️⃣9️⃣ <b id="setBaseURI(string)🇼">setBaseURI(string)🇼</b> [🔙](#home)
- **描述**: 更改metadata的目录URL

- selector: 0x55f804b3

- 版本更新: 

### 参数

- [string] base_: 

- **备注**: 注意，全部资产都会改变，包括已经发行的资产。（慎用）

## 2️⃣0️⃣ <b id="setDetailsURI(string)🇼">setDetailsURI(string)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xa48929d1

- 版本更新: 

### 参数

- [string] uri_: 

- 备注: 

## 2️⃣1️⃣ <b id="setParty(string[],uint8[])🇼">setParty(string[],uint8[])🇼</b> [🔙](#home)
- 描述: 

- selector: 0x251b295e

- 版本更新: 

### 参数

- [string[]] parties_: 

- [uint8[]] shares_: 

- 备注: 

## 2️⃣2️⃣ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x01ffc9a7

- 版本更新: 

### 参数

- [bytes4] interfaceId: 

### 返回值

- [bool] : 

- 备注: 

## 2️⃣3️⃣ <b id="suspend(bool)🇼">suspend(bool)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xbfd812ec

- 版本更新: 

### 参数

- [bool] status: 

- 备注: 

## 2️⃣4️⃣ <b id="symbol()🇷">symbol()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x95d89b41

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 2️⃣5️⃣ <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x4f6ccce7

- 版本更新: 

### 参数

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## 2️⃣6️⃣ <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x2f745c59

- 版本更新: 

### 参数

- [address] owner: 

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## 2️⃣7️⃣ <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b> [🔙](#home)
- **描述**: 资产的元数据metadata

- selector: 0xc87b56dd

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- **[string] **: json格式的资产内容

- 备注: 

## 2️⃣8️⃣ <b id="tokens(uint256,uint256)🇷">tokens(uint256,uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x8b4864d6

- 版本更新: 

### 参数

- [uint256] offset: 

- [uint256] limit: 

### 返回值

- [uint256] total: 

- [uint256[]] tokenIds: 

- 备注: 

## 2️⃣9️⃣ <b id="tokensOf(address,uint256,uint256)🇷">tokensOf(address,uint256,uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x23185dc9

- 版本更新: 

### 参数

- [address] owner: 

- [uint256] offset: 

- [uint256] limit: 

### 返回值

- [uint256] total: 

- [uint256[]] tokenIds: 

- 备注: 

## 3️⃣0️⃣ <b id="totalSupply()🇷">totalSupply()🇷</b> [🔙](#home)
- **描述**: 资产的总发行量

- selector: 0x18160ddd

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## 3️⃣1️⃣ <b id="transfer(address,address,uint256)🇼">transfer(address,address,uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xbeabacc8

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 3️⃣2️⃣ <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b> [🔙](#home)
- **描述**: 转移资产

- selector: 0x23b872dd

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 3️⃣3️⃣ <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xf2fde38b

- 版本更新: 

### 参数

- [address] newOwner: 

- 备注: 

___

*[🔙](#home) updated: 2024-10-05 18:31:14    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

