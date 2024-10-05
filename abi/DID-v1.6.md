| <b id="home">方法</b>   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| 0️⃣ [Account(uint256)🇷](#Account(uint256)🇷)| 通过编号获得对应的DID名称 | ✅ |  |
| 1️⃣ [Account(string)🇷](#Account(string)🇷)| 通过DID名字取得链账户地址 | ✅ |  |
| 2️⃣ [addAddress(string,address)🇼](#addAddress(string,address)🇼)| 添加DID的共享人地址 | ✅ |  |
| 3️⃣ [addAsset(string,address)🇼](#addAsset(string,address)🇼)| 添加DID资产 | ✅ |  |
| 4️⃣ [addOperator(address)🇼](#addOperator(address)🇼)| 添加管理员地址 | ✅ |  |
| 5️⃣ [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 限制管理员能够操作的次数 | ✅ |  |
| 6️⃣ [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| 7️⃣ [balanceOf(address)🇷](#balanceOf(address)🇷)| 查询某个地址拥有的DID数量 | ✅ |  |
| 8️⃣ [burn(uint256)🇼](#burn(uint256)🇼)| 销毁DID | ✅ |  |
| 9️⃣ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| 1️⃣0️⃣ [create(string,string,address,uint256)🇼](#create(string,string,address,uint256)🇼)| 创建DID | ✅ |  |
| 1️⃣1️⃣ [createAccount(string)🇼](#createAccount(string)🇼)|  |  |  |
| 1️⃣2️⃣ [data(string)🇷](#data(string)🇷)|  |  |  |
| 1️⃣3️⃣ [dump()🇷](#dump()🇷)| 导出所有创建的DID清单 | ✅ |  |
| 1️⃣4️⃣ [erc6551ImplementationAddress()🇷](#erc6551ImplementationAddress()🇷)|  |  |  |
| 1️⃣5️⃣ [expire(string)🇷](#expire(string)🇷)|  |  |  |
| 1️⃣6️⃣ [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| 1️⃣7️⃣ [getManagersAddress(string)🇷](#getManagersAddress(string)🇷)|  |  |  |
| 1️⃣8️⃣ [getOperators()🇷](#getOperators()🇷)|  |  |  |
| 1️⃣9️⃣ [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| 2️⃣0️⃣ [hasAsset(string,address)🇷](#hasAsset(string,address)🇷)| 是否拥有一个资产 | ✅ |  |
| 2️⃣1️⃣ [index(string)🇷](#index(string)🇷)| 查询DID的编号 | ✅ |  |
| 2️⃣2️⃣ [init(address,address)🇼](#init(address,address)🇼)| 初始化合约 | ✅ |  |
| 2️⃣3️⃣ [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| 2️⃣4️⃣ [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| 2️⃣5️⃣ [name()🇷](#name()🇷)|  |  |  |
| 2️⃣6️⃣ [owner()🇷](#owner()🇷)|  |  |  |
| 2️⃣7️⃣ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)|  |  |  |
| 2️⃣8️⃣ [query(string)🇷](#query(string)🇷)| 查询DID的拥有人 | ✅ |  |
| 2️⃣9️⃣ [query(uint256)🇷](#query(uint256)🇷)| 查询编号的DID名称 | ✅ |  |
| 3️⃣0️⃣ [query(address)🇷](#query(address)🇷)| 查询某个地址拥有的DID清单 | ✅ |  |
| 3️⃣1️⃣ [removeAddress(string,address)🇼](#removeAddress(string,address)🇼)|  |  |  |
| 3️⃣2️⃣ [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| 3️⃣3️⃣ [renew(uint256,uint256)🇼](#renew(uint256,uint256)🇼)| 续约 | ✅ |  |
| 3️⃣4️⃣ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| 3️⃣5️⃣ [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)|  |  |  |
| 3️⃣6️⃣ [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| 3️⃣7️⃣ [sell(address,address,uint256,uint256)🇼](#sell(address,address,uint256,uint256)🇼)| 售卖 | ✅ |  |
| 3️⃣8️⃣ [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| 3️⃣9️⃣ [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| 4️⃣0️⃣ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| 4️⃣1️⃣ [symbol()🇷](#symbol()🇷)|  |  |  |
| 4️⃣2️⃣ [tokenBoundRegistry()🇷](#tokenBoundRegistry()🇷)|  |  |  |
| 4️⃣3️⃣ [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| 4️⃣4️⃣ [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| 4️⃣5️⃣ [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)| DID的元数据 | ✅ |  |
| 4️⃣6️⃣ [totalSupply()🇷](#totalSupply()🇷)|  |  |  |
| 4️⃣7️⃣ [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)| 转增 | ✅ |  |
| 4️⃣8️⃣ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |
| 4️⃣9️⃣ [validateAddress(string,address)🇷](#validateAddress(string,address)🇷)| 验证某个地址是否是DID的共享人 | ✅ |  |

- **合约及版本**: DID-v1.6

- **获取方法**: 0x7D5D9e9033dF0939c0fc2CD5CE42667Bc2B31002

- **描述**: 增加了operator的quota限制，完成简单的计费对账功能。

- **ABI📝**: DID-v1.6.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## 0️⃣ <b id="Account(uint256)🇷">Account(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 通过编号获得对应的DID名称

- selector: 0xc496a4e1

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣ <b id="Account(string)🇷">Account(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 通过DID名字取得链账户地址

- selector: 0xc4b6395c

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address] : 

- 备注: 

## 2️⃣ <b id="addAddress(string,address)🇼">addAddress(string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 添加DID的共享人地址

- selector: 0xceb35b0f

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

- 备注: 

## 3️⃣ <b id="addAsset(string,address)🇼">addAsset(string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 添加DID资产

- selector: 0xadc02a64

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _asset: 

- 备注: 

## 4️⃣ <b id="addOperator(address)🇼">addOperator(address)🇼</b>[^2]  [🔙](#home)
- **描述**: 添加管理员地址

- selector: 0x9870d7fe

- 版本更新: 

### 参数

- [address] _operator: 

- **备注**: 管理员可以创建DID等操作

## 5️⃣ <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 限制管理员能够操作的次数

- selector: 0xf045000d

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## 6️⃣ <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x095ea7b3

- 版本更新: 

### 参数

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 7️⃣ <b id="balanceOf(address)🇷">balanceOf(address)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询某个地址拥有的DID数量

- selector: 0x70a08231

- 版本更新: 

### 参数

- [address] owner: 

### 返回值

- [uint256] : 

- 备注: 

## 8️⃣ <b id="burn(uint256)🇼">burn(uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 销毁DID

- selector: 0x42966c68

- 版本更新: 

### 参数

- [uint256] _tokenId: 

- 备注: 

## 9️⃣ <b id="contractInfo()🇷">contractInfo()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 1️⃣0️⃣ <b id="create(string,string,address,uint256)🇼">create(string,string,address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 创建DID

- selector: 0xd069c371

- 版本更新: 

### 参数

- **[string] _Identity**: DID名称

- **[string] _ar_file**: arweave的json地址

- **[address] _owner**: DID名称归属人

- **[uint256] _expired**: 有效期（UINIX时间）

- 备注: 

## 1️⃣1️⃣ <b id="createAccount(string)🇼">createAccount(string)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x298daf5b

- 版本更新: 

### 参数

- [string] _Identity: 

- 备注: 

## 1️⃣2️⃣ <b id="data(string)🇷">data(string)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x04f6748c

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- **[tuple] **: 返回一个结构structure，分别是DID的tokenID，content, owner, expire

- 备注: 

## 1️⃣3️⃣ <b id="dump()🇷">dump()🇷</b>[^1]  [🔙](#home)
- **描述**: 导出所有创建的DID清单

- selector: 0xe4330545

- 版本更新: 

### 返回值

- [string[]] nameList: 

- 备注: 

## 1️⃣4️⃣ <b id="erc6551ImplementationAddress()🇷">erc6551ImplementationAddress()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xee845881

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣5️⃣ <b id="expire(string)🇷">expire(string)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x1cae3bee

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- **[uint256] **: 过期时间

- 备注: 

## 1️⃣6️⃣ <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x081812fc

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣7️⃣ <b id="getManagersAddress(string)🇷">getManagersAddress(string)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xaa1266d1

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address[]] : 

- 备注: 

## 1️⃣8️⃣ <b id="getOperators()🇷">getOperators()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x27a099d8

- 版本更新: 

### 返回值

- [address[]] : 

- 备注: 

## 1️⃣9️⃣ <b id="getQuota(address)🇷">getQuota(address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x43a2a302

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [uint256] : 

- 备注: 

## 2️⃣0️⃣ <b id="hasAsset(string,address)🇷">hasAsset(string,address)🇷</b>[^1]  [🔙](#home)
- **描述**: 是否拥有一个资产

- selector: 0xfecdd62f

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _asset: 

### 返回值

- [bool] : 

- 备注: 

## 2️⃣1️⃣ <b id="index(string)🇷">index(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询DID的编号

- selector: 0xf5db08d9

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [uint256] : 

- 备注: 

## 2️⃣2️⃣ <b id="init(address,address)🇼">init(address,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 初始化合约

- selector: 0xf09a4016

- 版本更新: 

### 参数

- [address] tokenBoundRegistry_: 

- [address] erc6551ImplementationAddress_: 

- **备注**: 需要超级管理员一次操作即可

## 2️⃣3️⃣ <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xe985e9c5

- 版本更新: 

### 参数

- [address] owner: 

- [address] operator: 

### 返回值

- [bool] : 

- 备注: 

## 2️⃣4️⃣ <b id="isOperator(address)🇷">isOperator(address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x6d70f7ae

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [bool] : 

- 备注: 

## 2️⃣5️⃣ <b id="name()🇷">name()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x06fdde03

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 2️⃣6️⃣ <b id="owner()🇷">owner()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x8da5cb5b

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## 2️⃣7️⃣ <b id="ownerOf(uint256)🇷">ownerOf(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x6352211e

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 2️⃣8️⃣ <b id="query(string)🇷">query(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询DID的拥有人

- selector: 0x7c261929

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address] : 

- 备注: 

## 2️⃣9️⃣ <b id="query(uint256)🇷">query(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询编号的DID名称

- selector: 0xafdac68d

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [string] : 

- 备注: 

## 3️⃣0️⃣ <b id="query(address)🇷">query(address)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询某个地址拥有的DID清单

- selector: 0xd4fc9fc6

- 版本更新: 

### 参数

- [address] _owner: 

### 返回值

- [string[]] : 

- 备注: 

## 3️⃣1️⃣ <b id="removeAddress(string,address)🇼">removeAddress(string,address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xb166493b

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

- 备注: 

## 3️⃣2️⃣ <b id="removeOperator(address)🇼">removeOperator(address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xac8a584a

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## 3️⃣3️⃣ <b id="renew(uint256,uint256)🇼">renew(uint256,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 续约

- selector: 0xc475abff

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [uint256] period: 

- 备注: 

## 3️⃣4️⃣ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x715018a6

- 版本更新: 

- 备注: 

## 3️⃣5️⃣ <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x42842e0e

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 3️⃣6️⃣ <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xb88d4fde

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [bytes] data: 

- 备注: 

## 3️⃣7️⃣ <b id="sell(address,address,uint256,uint256)🇼">sell(address,address,uint256,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 售卖

- selector: 0x31de7d15

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [uint256] _expired: 

- 备注: 

## 3️⃣8️⃣ <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xa22cb465

- 版本更新: 

### 参数

- [address] operator: 

- [bool] approved: 

- 备注: 

## 3️⃣9️⃣ <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x03ce3355

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## 4️⃣0️⃣ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x01ffc9a7

- 版本更新: 

### 参数

- [bytes4] interfaceId: 

### 返回值

- [bool] : 

- 备注: 

## 4️⃣1️⃣ <b id="symbol()🇷">symbol()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x95d89b41

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 4️⃣2️⃣ <b id="tokenBoundRegistry()🇷">tokenBoundRegistry()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xfdf250df

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## 4️⃣3️⃣ <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x4f6ccce7

- 版本更新: 

### 参数

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣4️⃣ <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x2f745c59

- 版本更新: 

### 参数

- [address] owner: 

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣5️⃣ <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: DID的元数据

- selector: 0xc87b56dd

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- **[string] **: json格式的metadata

- **备注**: 此地址固定在ARWEAVE上，可以通过arweave读取内容

## 4️⃣6️⃣ <b id="totalSupply()🇷">totalSupply()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x18160ddd

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣7️⃣ <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 转增

- selector: 0x23b872dd

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 4️⃣8️⃣ <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xf2fde38b

- 版本更新: 

### 参数

- [address] newOwner: 

- 备注: 

## 4️⃣9️⃣ <b id="validateAddress(string,address)🇷">validateAddress(string,address)🇷</b>[^1]  [🔙](#home)
- **描述**: 验证某个地址是否是DID的共享人

- selector: 0x5f1c0fbd

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

### 返回值

- [bool] : 

- 备注: 

___

*[🔙](#home) updated: 2024-10-05 19:30:42    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

___

[^1]: 🇷读方法是同步操作，可以直接得到返回值，不消耗GAS费用。
[^2]: 🇼写方法是异步操作，需要消耗GAS费用，无法取得返回值，需要通过交易hash查询链上是否成功。
