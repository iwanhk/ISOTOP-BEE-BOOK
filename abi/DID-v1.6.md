| <b id="home">方法</b>   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| ⁰ [Account(uint256)🇷](#Account(uint256)🇷)| 通过编号获得对应的DID名称 | ✅ |  |
| ¹ [Account(string)🇷](#Account(string)🇷)| 通过DID名字取得链账户地址 | ✅ |  |
| ² [addAddress(string,address)🇼](#addAddress(string,address)🇼)| 添加DID的共享人地址 | ✅ |  |
| ³ [addAsset(string,address)🇼](#addAsset(string,address)🇼)| 添加DID资产 | ✅ |  |
| ⁴ [addOperator(address)🇼](#addOperator(address)🇼)| 添加管理员地址 | ✅ |  |
| ⁵ [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 限制管理员能够操作的次数 | ✅ |  |
| ⁶ [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| ⁷ [balanceOf(address)🇷](#balanceOf(address)🇷)| 查询某个地址拥有的DID数量 | ✅ |  |
| ⁸ [burn(uint256)🇼](#burn(uint256)🇼)| 销毁DID | ✅ |  |
| ⁹ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| ¹⁰ [create(string,string,address,uint256)🇼](#create(string,string,address,uint256)🇼)| 创建DID | ✅ |  |
| ¹¹ [createAccount(string)🇼](#createAccount(string)🇼)|  |  |  |
| ¹² [data(string)🇷](#data(string)🇷)|  |  |  |
| ¹³ [dump()🇷](#dump()🇷)| 导出所有创建的DID清单 | ✅ |  |
| ¹⁴ [erc6551ImplementationAddress()🇷](#erc6551ImplementationAddress()🇷)|  |  |  |
| ¹⁵ [expire(string)🇷](#expire(string)🇷)|  |  |  |
| ¹⁶ [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| ¹⁷ [getManagersAddress(string)🇷](#getManagersAddress(string)🇷)|  |  |  |
| ¹⁸ [getOperators()🇷](#getOperators()🇷)|  |  |  |
| ¹⁹ [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| ²⁰ [hasAsset(string,address)🇷](#hasAsset(string,address)🇷)| 是否拥有一个资产 | ✅ |  |
| ²¹ [index(string)🇷](#index(string)🇷)| 查询DID的编号 | ✅ |  |
| ²² [init(address,address)🇼](#init(address,address)🇼)| 初始化合约 | ✅ |  |
| ²³ [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| ²⁴ [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| ²⁵ [name()🇷](#name()🇷)|  |  |  |
| ²⁶ [owner()🇷](#owner()🇷)|  |  |  |
| ²⁷ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)|  |  |  |
| ²⁸ [query(string)🇷](#query(string)🇷)| 查询DID的拥有人 | ✅ |  |
| ²⁹ [query(uint256)🇷](#query(uint256)🇷)| 查询编号的DID名称 | ✅ |  |
| ³⁰ [query(address)🇷](#query(address)🇷)| 查询某个地址拥有的DID清单 | ✅ |  |
| ³¹ [removeAddress(string,address)🇼](#removeAddress(string,address)🇼)|  |  |  |
| ³² [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| ³³ [renew(uint256,uint256)🇼](#renew(uint256,uint256)🇼)| 续约 | ✅ |  |
| ³⁴ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| ³⁵ [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)|  |  |  |
| ³⁶ [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| ³⁷ [sell(address,address,uint256,uint256)🇼](#sell(address,address,uint256,uint256)🇼)| 售卖 | ✅ |  |
| ³⁸ [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| ³⁹ [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| ⁴⁰ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| ⁴¹ [symbol()🇷](#symbol()🇷)|  |  |  |
| ⁴² [tokenBoundRegistry()🇷](#tokenBoundRegistry()🇷)|  |  |  |
| ⁴³ [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| ⁴⁴ [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| ⁴⁵ [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)| DID的元数据 | ✅ |  |
| ⁴⁶ [totalSupply()🇷](#totalSupply()🇷)|  |  |  |
| ⁴⁷ [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)| 转增 | ✅ |  |
| ⁴⁸ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |
| ⁴⁹ [validateAddress(string,address)🇷](#validateAddress(string,address)🇷)| 验证某个地址是否是DID的共享人 | ✅ |  |

- **合约及版本**: DID-v1.6

- **获取方法**: 0x7D5D9e9033dF0939c0fc2CD5CE42667Bc2B31002

- **描述**: 增加了operator的quota限制，完成简单的计费对账功能。

- **ABI📝**: DID-v1.6.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## ⁰ <b id="Account(uint256)🇷">Account(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 通过编号获得对应的DID名称

- selector: 0xc496a4e1

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## ¹ <b id="Account(string)🇷">Account(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 通过DID名字取得链账户地址

- selector: 0xc4b6395c

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address] : 

- 备注: 

## ² <b id="addAddress(string,address)🇼">addAddress(string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 添加DID的共享人地址

- selector: 0xceb35b0f

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

- 备注: 

## ³ <b id="addAsset(string,address)🇼">addAsset(string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 添加DID资产

- selector: 0xadc02a64

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _asset: 

- 备注: 

## ⁴ <b id="addOperator(address)🇼">addOperator(address)🇼</b>[^2]  [🔙](#home)
- **描述**: 添加管理员地址

- selector: 0x9870d7fe

- 版本更新: 

### 参数

- [address] _operator: 

- **备注**: 管理员可以创建DID等操作

## ⁵ <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 限制管理员能够操作的次数

- selector: 0xf045000d

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## ⁶ <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x095ea7b3

- 版本更新: 

### 参数

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## ⁷ <b id="balanceOf(address)🇷">balanceOf(address)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询某个地址拥有的DID数量

- selector: 0x70a08231

- 版本更新: 

### 参数

- [address] owner: 

### 返回值

- [uint256] : 

- 备注: 

## ⁸ <b id="burn(uint256)🇼">burn(uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 销毁DID

- selector: 0x42966c68

- 版本更新: 

### 参数

- [uint256] _tokenId: 

- 备注: 

## ⁹ <b id="contractInfo()🇷">contractInfo()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## ¹⁰ <b id="create(string,string,address,uint256)🇼">create(string,string,address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 创建DID

- selector: 0xd069c371

- 版本更新: 

### 参数

- **[string] _Identity**: DID名称

- **[string] _ar_file**: arweave的json地址

- **[address] _owner**: DID名称归属人

- **[uint256] _expired**: 有效期（UINIX时间）

- 备注: 

## ¹¹ <b id="createAccount(string)🇼">createAccount(string)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x298daf5b

- 版本更新: 

### 参数

- [string] _Identity: 

- 备注: 

## ¹² <b id="data(string)🇷">data(string)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x04f6748c

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- **[tuple] **: 返回一个结构structure，分别是DID的tokenID，content, owner, expire

- 备注: 

## ¹³ <b id="dump()🇷">dump()🇷</b>[^1]  [🔙](#home)
- **描述**: 导出所有创建的DID清单

- selector: 0xe4330545

- 版本更新: 

### 返回值

- [string[]] nameList: 

- 备注: 

## ¹⁴ <b id="erc6551ImplementationAddress()🇷">erc6551ImplementationAddress()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xee845881

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## ¹⁵ <b id="expire(string)🇷">expire(string)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x1cae3bee

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- **[uint256] **: 过期时间

- 备注: 

## ¹⁶ <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x081812fc

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## ¹⁷ <b id="getManagersAddress(string)🇷">getManagersAddress(string)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xaa1266d1

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address[]] : 

- 备注: 

## ¹⁸ <b id="getOperators()🇷">getOperators()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x27a099d8

- 版本更新: 

### 返回值

- [address[]] : 

- 备注: 

## ¹⁹ <b id="getQuota(address)🇷">getQuota(address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x43a2a302

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [uint256] : 

- 备注: 

## ²⁰ <b id="hasAsset(string,address)🇷">hasAsset(string,address)🇷</b>[^1]  [🔙](#home)
- **描述**: 是否拥有一个资产

- selector: 0xfecdd62f

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _asset: 

### 返回值

- [bool] : 

- 备注: 

## ²¹ <b id="index(string)🇷">index(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询DID的编号

- selector: 0xf5db08d9

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [uint256] : 

- 备注: 

## ²² <b id="init(address,address)🇼">init(address,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 初始化合约

- selector: 0xf09a4016

- 版本更新: 

### 参数

- [address] tokenBoundRegistry_: 

- [address] erc6551ImplementationAddress_: 

- **备注**: 需要超级管理员一次操作即可

## ²³ <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xe985e9c5

- 版本更新: 

### 参数

- [address] owner: 

- [address] operator: 

### 返回值

- [bool] : 

- 备注: 

## ²⁴ <b id="isOperator(address)🇷">isOperator(address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x6d70f7ae

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [bool] : 

- 备注: 

## ²⁵ <b id="name()🇷">name()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x06fdde03

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## ²⁶ <b id="owner()🇷">owner()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x8da5cb5b

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## ²⁷ <b id="ownerOf(uint256)🇷">ownerOf(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x6352211e

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## ²⁸ <b id="query(string)🇷">query(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询DID的拥有人

- selector: 0x7c261929

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address] : 

- 备注: 

## ²⁹ <b id="query(uint256)🇷">query(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询编号的DID名称

- selector: 0xafdac68d

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [string] : 

- 备注: 

## ³⁰ <b id="query(address)🇷">query(address)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询某个地址拥有的DID清单

- selector: 0xd4fc9fc6

- 版本更新: 

### 参数

- [address] _owner: 

### 返回值

- [string[]] : 

- 备注: 

## ³¹ <b id="removeAddress(string,address)🇼">removeAddress(string,address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xb166493b

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

- 备注: 

## ³² <b id="removeOperator(address)🇼">removeOperator(address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xac8a584a

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## ³³ <b id="renew(uint256,uint256)🇼">renew(uint256,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 续约

- selector: 0xc475abff

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [uint256] period: 

- 备注: 

## ³⁴ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x715018a6

- 版本更新: 

- 备注: 

## ³⁵ <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x42842e0e

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## ³⁶ <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xb88d4fde

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [bytes] data: 

- 备注: 

## ³⁷ <b id="sell(address,address,uint256,uint256)🇼">sell(address,address,uint256,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 售卖

- selector: 0x31de7d15

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [uint256] _expired: 

- 备注: 

## ³⁸ <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xa22cb465

- 版本更新: 

### 参数

- [address] operator: 

- [bool] approved: 

- 备注: 

## ³⁹ <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x03ce3355

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## ⁴⁰ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x01ffc9a7

- 版本更新: 

### 参数

- [bytes4] interfaceId: 

### 返回值

- [bool] : 

- 备注: 

## ⁴¹ <b id="symbol()🇷">symbol()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x95d89b41

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## ⁴² <b id="tokenBoundRegistry()🇷">tokenBoundRegistry()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xfdf250df

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## ⁴³ <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x4f6ccce7

- 版本更新: 

### 参数

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## ⁴⁴ <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x2f745c59

- 版本更新: 

### 参数

- [address] owner: 

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## ⁴⁵ <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: DID的元数据

- selector: 0xc87b56dd

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- **[string] **: json格式的metadata

- **备注**: 此地址固定在ARWEAVE上，可以通过arweave读取内容

## ⁴⁶ <b id="totalSupply()🇷">totalSupply()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x18160ddd

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## ⁴⁷ <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 转增

- selector: 0x23b872dd

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## ⁴⁸ <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xf2fde38b

- 版本更新: 

### 参数

- [address] newOwner: 

- 备注: 

## ⁴⁹ <b id="validateAddress(string,address)🇷">validateAddress(string,address)🇷</b>[^1]  [🔙](#home)
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

*[🔙](#home) updated: 2024-10-05 19:38:32    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*



[^1]: 🇷读方法是同步操作，可以直接得到返回值，不消耗GAS费用。
[^2]: 🇼写方法是异步操作，需要消耗GAS费用，一般没有返回值，需要通过交易hash查询链上是否成功。
