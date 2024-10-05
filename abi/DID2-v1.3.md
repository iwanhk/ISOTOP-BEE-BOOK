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
| 1️⃣1️⃣ [addOperator(address)🇼](#addOperator(address)🇼)| 添加合约操作的管理员地址 | ✅ |  |
| 1️⃣2️⃣ [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 如果不为0，则限制某个operator的创建did数量，0表示无限制 | ✅ |  |
| 1️⃣3️⃣ [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| 1️⃣4️⃣ [balanceOf(address)🇷](#balanceOf(address)🇷)|  |  |  |
| 1️⃣5️⃣ [burn(uint256)🇼](#burn(uint256)🇼)| 销毁 | ✅ |  |
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
| 3️⃣3️⃣ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)| 查询编号为tokenId的DID的拥有者地址 | ✅ |  |
| 3️⃣4️⃣ [query(string)🇷](#query(string)🇷)| 查询DID的拥有人 | ✅ |  |
| 3️⃣5️⃣ [query(uint256)🇷](#query(uint256)🇷)| 查询编号的DID名称 | ✅ |  |
| 3️⃣6️⃣ [query(address)🇷](#query(address)🇷)| 查询某个地址拥有的DID清单 | ✅ |  |
| 3️⃣7️⃣ [removeAddress(string,address)🇼](#removeAddress(string,address)🇼)|  |  |  |
| 3️⃣8️⃣ [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| 3️⃣9️⃣ [renew(uint256,uint256)🇼](#renew(uint256,uint256)🇼)| 续约 | ✅ |  |
| 4️⃣0️⃣ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| 4️⃣1️⃣ [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)| 转增 | ✅ |  |
| 4️⃣2️⃣ [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| 4️⃣3️⃣ [sell(address,address,uint256,uint256)🇼](#sell(address,address,uint256,uint256)🇼)| 售卖 | ✅ |  |
| 4️⃣4️⃣ [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| 4️⃣5️⃣ [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| 4️⃣6️⃣ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| 4️⃣7️⃣ [symbol()🇷](#symbol()🇷)|  |  |  |
| 4️⃣8️⃣ [tokenBoundRegistry()🇷](#tokenBoundRegistry()🇷)|  |  |  |
| 4️⃣9️⃣ [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| 5️⃣0️⃣ [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| 5️⃣1️⃣ [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)| DID的元数据 | ✅ |  |
| 5️⃣2️⃣ [totalSupply()🇷](#totalSupply()🇷)| 总发行量 | ✅ |  |
| 5️⃣3️⃣ [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)|  |  |  |
| 5️⃣4️⃣ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |
| 5️⃣5️⃣ [validateAddress(string,address)🇷](#validateAddress(string,address)🇷)| 核验某个地址是否是某个DID的管理员 | ✅ |  |
| 5️⃣6️⃣ [create(string,address,uint256)🇼](#create(string,address,uint256)🇼)| 创建DID | ✅ |  |
| 5️⃣7️⃣ [name(uint256)🇷](#name(uint256)🇷)|  |  |  |
| 5️⃣8️⃣ [ownerOfID(string)🇷](#ownerOfID(string)🇷)| 查询某个DID的拥有人地址 | ✅ |  |
| 5️⃣9️⃣ [setContent(uint256,string,string,string)🇼](#setContent(uint256,string,string,string)🇼)| 添加DID的内容 | ✅ |  |
| 6️⃣0️⃣ [sign(string,address,uint256)🇼](#sign(string,address,uint256)🇼)| 签名 | ✅ |  |
| 6️⃣1️⃣ [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| 6️⃣2️⃣ [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)| 查询某个用户有多少个DID | ✅ |  |
| 6️⃣3️⃣ [verify(string,address,uint256)🇷](#verify(string,address,uint256)🇷)| 核验某个资产是否被签名 | ✅ |  |

- **合约及版本**: DID2-v1.3

- **获取方法**: 0x067eA3ebD341ac7E4F363865805d75409e748004

- **描述**: DID身份合约(实现2，全链资产内容)

- **ABI📝**: DID2-v1.3.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## 0️⃣ <b id="Account(uint256)🇷">Account(uint256)🇷</b> [🔙](#home)
- **描述**: 查询某个ID的账户地址

- selector: 0xc496a4e1

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣ <b id="Account(string)🇷">Account(string)🇷</b> [🔙](#home)
- **描述**: 查询某个DID的账户地址

- selector: 0xc4b6395c

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address] : 

- 备注: 

## 2️⃣ <b id="addAddress(string,address)🇼">addAddress(string,address)🇼</b> [🔙](#home)
- **描述**: 添加某个DID的管理员地址

- selector: 0xceb35b0f

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

- 备注: 

## 3️⃣ <b id="addOperator(address)🇼">addOperator(address)🇼</b> [🔙](#home)
- **描述**: 添加合约操作的管理员地址

- selector: 0x9870d7fe

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## 4️⃣ <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b> [🔙](#home)
- **描述**: 如果不为0，则限制某个operator的创建did数量，0表示无限制

- selector: 0xf045000d

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## 5️⃣ <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x095ea7b3

- 版本更新: 

### 参数

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 6️⃣ <b id="balanceOf(address)🇷">balanceOf(address)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x70a08231

- 版本更新: 

### 参数

- [address] owner: 

### 返回值

- [uint256] : 

- 备注: 

## 7️⃣ <b id="burn(uint256)🇼">burn(uint256)🇼</b> [🔙](#home)
- **描述**: 销毁

- selector: 0x42966c68

- 版本更新: 

### 参数

- [uint256] _tokenId: 

- 备注: 

## 8️⃣ <b id="contractInfo()🇷">contractInfo()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 9️⃣ <b id="create(string,address,uint256)🇼">create(string,address,uint256)🇼</b> [🔙](#home)
- **描述**: 创建DID

- selector: 0xb5917336

- 版本更新: 

### 参数

- **[string] _Identity**: 名称（必须唯一）

- **[address] _owner**: 拥有人

- **[uint256] _expired**: 过期时间

- 备注: 

## 1️⃣0️⃣ <b id="data(string)🇷">data(string)🇷</b> [🔙](#home)
- **描述**: 返回DID详细信息

- selector: 0x04f6748c

- 版本更新: 

### 参数

- **[string] _Identity**: 返回一个结构structure，分别是DID的tokenID，content, owner, expire

### 返回值

- [tuple] : 

- 备注: 

## 1️⃣1️⃣ <b id="dump()🇷">dump()🇷</b> [🔙](#home)
- **描述**: 导出全部发行的DID名称清单

- selector: 0xe4330545

- 版本更新: 

### 返回值

- [string[]] nameList: 

- 备注: 

## 1️⃣2️⃣ <b id="erc6551ImplementationAddress()🇷">erc6551ImplementationAddress()🇷</b> [🔙](#home)
- 描述: 

- selector: 0xee845881

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣3️⃣ <b id="expire(string)🇷">expire(string)🇷</b> [🔙](#home)
- **描述**: 到期日

- selector: 0x1cae3bee

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [uint256] : 

- 备注: 

## 1️⃣4️⃣ <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x081812fc

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣5️⃣ <b id="getManagersAddress(string)🇷">getManagersAddress(string)🇷</b> [🔙](#home)
- **描述**: 返回DID全部管理员地址列表

- selector: 0xaa1266d1

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address[]] : 

- 备注: 

## 1️⃣6️⃣ <b id="getOperators()🇷">getOperators()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x27a099d8

- 版本更新: 

### 返回值

- [address[]] : 

- 备注: 

## 1️⃣7️⃣ <b id="getQuota(address)🇷">getQuota(address)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x43a2a302

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [uint256] : 

- 备注: 

## 1️⃣8️⃣ <b id="index(string)🇷">index(string)🇷</b> [🔙](#home)
- **描述**: 根据DID名称查询tokenID

- selector: 0xf5db08d9

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [uint256] : 

- 备注: 

## 1️⃣9️⃣ <b id="init(address,address)🇼">init(address,address)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xf09a4016

- 版本更新: 

### 参数

- [address] tokenBoundRegistry_: 

- [address] erc6551ImplementationAddress_: 

- 备注: 

## 2️⃣0️⃣ <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b> [🔙](#home)
- 描述: 

- selector: 0xe985e9c5

- 版本更新: 

### 参数

- [address] owner: 

- [address] operator: 

### 返回值

- [bool] : 

- 备注: 

## 2️⃣1️⃣ <b id="isOperator(address)🇷">isOperator(address)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x6d70f7ae

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [bool] : 

- 备注: 

## 2️⃣2️⃣ <b id="name(uint256)🇷">name(uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x00ad800c

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [string] : 

- 备注: 

## 2️⃣3️⃣ <b id="name()🇷">name()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x06fdde03

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 2️⃣4️⃣ <b id="owner()🇷">owner()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x8da5cb5b

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## 2️⃣5️⃣ <b id="ownerOf(uint256)🇷">ownerOf(uint256)🇷</b> [🔙](#home)
- **描述**: 查询编号为tokenId的DID的拥有者地址

- selector: 0x6352211e

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 2️⃣6️⃣ <b id="ownerOfID(string)🇷">ownerOfID(string)🇷</b> [🔙](#home)
- **描述**: 查询某个DID的拥有人地址

- selector: 0xd4945594

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address] : 

- 备注: 

## 2️⃣7️⃣ <b id="removeAddress(string,address)🇼">removeAddress(string,address)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xb166493b

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

- 备注: 

## 2️⃣8️⃣ <b id="removeOperator(address)🇼">removeOperator(address)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xac8a584a

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## 2️⃣9️⃣ <b id="renew(uint256,uint256)🇼">renew(uint256,uint256)🇼</b> [🔙](#home)
- **描述**: 续约

- selector: 0xc475abff

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [uint256] period: 

- 备注: 

## 3️⃣0️⃣ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b> [🔙](#home)
- 描述: 

- selector: 0x715018a6

- 版本更新: 

- 备注: 

## 3️⃣1️⃣ <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b> [🔙](#home)
- **描述**: 转增

- selector: 0x42842e0e

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 3️⃣2️⃣ <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xb88d4fde

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [bytes] data: 

- 备注: 

## 3️⃣3️⃣ <b id="sell(address,address,uint256,uint256)🇼">sell(address,address,uint256,uint256)🇼</b> [🔙](#home)
- **描述**: 售卖

- selector: 0x31de7d15

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [uint256] _expired: 

- **备注**: 再次售卖给新的用户

## 3️⃣4️⃣ <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xa22cb465

- 版本更新: 

### 参数

- [address] operator: 

- [bool] approved: 

- 备注: 

## 3️⃣5️⃣ <b id="setContent(uint256,string,string,string)🇼">setContent(uint256,string,string,string)🇼</b> [🔙](#home)
- **描述**: 添加DID的内容

- selector: 0xcde9cdb5

- 版本更新: 

### 参数

- **[uint256] tokenId**: 编号

- [string] _key: 

- [string] _value: 

- **[string] _mime**: MIME类型

- 备注: 

## 3️⃣6️⃣ <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x03ce3355

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## 3️⃣7️⃣ <b id="sign(string,address,uint256)🇼">sign(string,address,uint256)🇼</b> [🔙](#home)
- **描述**: 签名

- selector: 0xcd540b6b

- 版本更新: 

### 参数

- [string] _did: 

- [address] _asset: 

- [uint256] _id: 

- **备注**: 签名一个资产会登记在DID上

## 3️⃣8️⃣ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x01ffc9a7

- 版本更新: 

### 参数

- [bytes4] interfaceId: 

### 返回值

- [bool] : 

- 备注: 

## 3️⃣9️⃣ <b id="symbol()🇷">symbol()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x95d89b41

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 4️⃣0️⃣ <b id="tokenBoundRegistry()🇷">tokenBoundRegistry()🇷</b> [🔙](#home)
- 描述: 

- selector: 0xfdf250df

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## 4️⃣1️⃣ <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x4f6ccce7

- 版本更新: 

### 参数

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣2️⃣ <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x2f745c59

- 版本更新: 

### 参数

- [address] owner: 

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣3️⃣ <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b> [🔙](#home)
- **描述**: DID的元数据

- selector: 0xc87b56dd

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- **[string] **: json格式的元数据

- 备注: 

## 4️⃣4️⃣ <b id="tokens(uint256,uint256)🇷">tokens(uint256,uint256)🇷</b> [🔙](#home)
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

## 4️⃣5️⃣ <b id="tokensOf(address,uint256,uint256)🇷">tokensOf(address,uint256,uint256)🇷</b> [🔙](#home)
- **描述**: 查询某个用户有多少个DID

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

## 4️⃣6️⃣ <b id="totalSupply()🇷">totalSupply()🇷</b> [🔙](#home)
- **描述**: 总发行量

- selector: 0x18160ddd

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣7️⃣ <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x23b872dd

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 4️⃣8️⃣ <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xf2fde38b

- 版本更新: 

### 参数

- [address] newOwner: 

- 备注: 

## 4️⃣9️⃣ <b id="validateAddress(string,address)🇷">validateAddress(string,address)🇷</b> [🔙](#home)
- **描述**: 核验某个地址是否是某个DID的管理员

- selector: 0x5f1c0fbd

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

### 返回值

- [bool] : 

- 备注: 

## 5️⃣0️⃣ <b id="verify(string,address,uint256)🇷">verify(string,address,uint256)🇷</b> [🔙](#home)
- **描述**: 核验某个资产是否被签名

- selector: 0x97ebb60d

- 版本更新: 

### 参数

- [string] _did: 

- [address] _asset: 

- [uint256] _id: 

### 返回值

- [bool] : 

- 备注: 

___

*[🔙](#home) updated: 2024-10-05 18:31:13    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

