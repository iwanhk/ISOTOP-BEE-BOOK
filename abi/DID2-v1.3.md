| <b id="home">方法</b>   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| ⁰ [Account(uint256)🇷](#Account(uint256)🇷)| 查询某个ID的账户地址 | ✅ |  |
| ¹ [Account(string)🇷](#Account(string)🇷)| 查询某个DID的账户地址 | ✅ |  |
| ² [addAddress(string,address)🇼](#addAddress(string,address)🇼)| 添加某个DID的管理员地址 | ✅ |  |
| ³ [addOperator(address)🇼](#addOperator(address)🇼)| 添加合约操作的管理员地址 | ✅ |  |
| ⁴ [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 如果不为0，则限制某个operator的创建did数量，0表示无限制 | ✅ |  |
| ⁵ [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| ⁶ [balanceOf(address)🇷](#balanceOf(address)🇷)|  |  |  |
| ⁷ [burn(uint256)🇼](#burn(uint256)🇼)| 销毁 | ✅ |  |
| ⁸ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| ⁹ [create(string,address,uint256)🇼](#create(string,address,uint256)🇼)| 创建DID | ✅ |  |
| ¹⁰ [data(string)🇷](#data(string)🇷)| 返回DID详细信息 | ✅ |  |
| ¹¹ [dump()🇷](#dump()🇷)| 导出全部发行的DID名称清单 | ✅ |  |
| ¹² [erc6551ImplementationAddress()🇷](#erc6551ImplementationAddress()🇷)|  |  |  |
| ¹³ [expire(string)🇷](#expire(string)🇷)| 到期日 | ✅ |  |
| ¹⁴ [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| ¹⁵ [getManagersAddress(string)🇷](#getManagersAddress(string)🇷)| 返回DID全部管理员地址列表 | ✅ |  |
| ¹⁶ [getOperators()🇷](#getOperators()🇷)|  |  |  |
| ¹⁷ [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| ¹⁸ [index(string)🇷](#index(string)🇷)| 根据DID名称查询tokenID | ✅ |  |
| ¹⁹ [init(address,address)🇼](#init(address,address)🇼)|  |  |  |
| ²⁰ [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| ²¹ [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| ²² [name(uint256)🇷](#name(uint256)🇷)|  |  |  |
| ²³ [name()🇷](#name()🇷)|  |  |  |
| ²⁴ [owner()🇷](#owner()🇷)|  |  |  |
| ²⁵ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)| 查询编号为tokenId的DID的拥有者地址 | ✅ |  |
| ²⁶ [ownerOfID(string)🇷](#ownerOfID(string)🇷)| 查询某个DID的拥有人地址 | ✅ |  |
| ²⁷ [removeAddress(string,address)🇼](#removeAddress(string,address)🇼)|  |  |  |
| ²⁸ [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| ²⁹ [renew(uint256,uint256)🇼](#renew(uint256,uint256)🇼)| 续约 | ✅ |  |
| ³⁰ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| ³¹ [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)| 转增 | ✅ |  |
| ³² [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| ³³ [sell(address,address,uint256,uint256)🇼](#sell(address,address,uint256,uint256)🇼)| 售卖 | ✅ |  |
| ³⁴ [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| ³⁵ [setContent(uint256,string,string,string)🇼](#setContent(uint256,string,string,string)🇼)| 添加DID的内容 | ✅ |  |
| ³⁶ [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| ³⁷ [sign(string,address,uint256)🇼](#sign(string,address,uint256)🇼)| 签名 | ✅ |  |
| ³⁸ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| ³⁹ [symbol()🇷](#symbol()🇷)|  |  |  |
| ⁴⁰ [tokenBoundRegistry()🇷](#tokenBoundRegistry()🇷)|  |  |  |
| ⁴¹ [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| ⁴² [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| ⁴³ [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)| DID的元数据 | ✅ |  |
| ⁴⁴ [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| ⁴⁵ [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)| 查询某个用户有多少个DID | ✅ |  |
| ⁴⁶ [totalSupply()🇷](#totalSupply()🇷)| 总发行量 | ✅ |  |
| ⁴⁷ [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)|  |  |  |
| ⁴⁸ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |
| ⁴⁹ [validateAddress(string,address)🇷](#validateAddress(string,address)🇷)| 核验某个地址是否是某个DID的管理员 | ✅ |  |
| ⁵⁰ [verify(string,address,uint256)🇷](#verify(string,address,uint256)🇷)| 核验某个资产是否被签名 | ✅ |  |

- **合约及版本**: DID2-v1.3

- **获取方法**: 0x067eA3ebD341ac7E4F363865805d75409e748004

- **描述**: DID身份合约(实现2，全链资产内容)

- **ABI📝**: DID2-v1.3.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## ⁰ <b id="Account(uint256)🇷">Account(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询某个ID的账户地址

- selector: 0xc496a4e1

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## ¹ <b id="Account(string)🇷">Account(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询某个DID的账户地址

- selector: 0xc4b6395c

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address] : 

- 备注: 

## ² <b id="addAddress(string,address)🇼">addAddress(string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 添加某个DID的管理员地址

- selector: 0xceb35b0f

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

- 备注: 

## ³ <b id="addOperator(address)🇼">addOperator(address)🇼</b>[^2]  [🔙](#home)
- **描述**: 添加合约操作的管理员地址

- selector: 0x9870d7fe

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## ⁴ <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 如果不为0，则限制某个operator的创建did数量，0表示无限制

- selector: 0xf045000d

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## ⁵ <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x095ea7b3

- 版本更新: 

### 参数

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## ⁶ <b id="balanceOf(address)🇷">balanceOf(address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x70a08231

- 版本更新: 

### 参数

- [address] owner: 

### 返回值

- [uint256] : 

- 备注: 

## ⁷ <b id="burn(uint256)🇼">burn(uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 销毁

- selector: 0x42966c68

- 版本更新: 

### 参数

- [uint256] _tokenId: 

- 备注: 

## ⁸ <b id="contractInfo()🇷">contractInfo()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## ⁹ <b id="create(string,address,uint256)🇼">create(string,address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 创建DID

- selector: 0xb5917336

- 版本更新: 

### 参数

- **[string] _Identity**: 名称（必须唯一）

- **[address] _owner**: 拥有人

- **[uint256] _expired**: 过期时间

- 备注: 

## ¹⁰ <b id="data(string)🇷">data(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 返回DID详细信息

- selector: 0x04f6748c

- 版本更新: 

### 参数

- **[string] _Identity**: 返回一个结构structure，分别是DID的tokenID，content, owner, expire

### 返回值

- [tuple] : 

- 备注: 

## ¹¹ <b id="dump()🇷">dump()🇷</b>[^1]  [🔙](#home)
- **描述**: 导出全部发行的DID名称清单

- selector: 0xe4330545

- 版本更新: 

### 返回值

- [string[]] nameList: 

- 备注: 

## ¹² <b id="erc6551ImplementationAddress()🇷">erc6551ImplementationAddress()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xee845881

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## ¹³ <b id="expire(string)🇷">expire(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 到期日

- selector: 0x1cae3bee

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [uint256] : 

- 备注: 

## ¹⁴ <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x081812fc

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## ¹⁵ <b id="getManagersAddress(string)🇷">getManagersAddress(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 返回DID全部管理员地址列表

- selector: 0xaa1266d1

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address[]] : 

- 备注: 

## ¹⁶ <b id="getOperators()🇷">getOperators()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x27a099d8

- 版本更新: 

### 返回值

- [address[]] : 

- 备注: 

## ¹⁷ <b id="getQuota(address)🇷">getQuota(address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x43a2a302

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [uint256] : 

- 备注: 

## ¹⁸ <b id="index(string)🇷">index(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 根据DID名称查询tokenID

- selector: 0xf5db08d9

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [uint256] : 

- 备注: 

## ¹⁹ <b id="init(address,address)🇼">init(address,address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xf09a4016

- 版本更新: 

### 参数

- [address] tokenBoundRegistry_: 

- [address] erc6551ImplementationAddress_: 

- 备注: 

## ²⁰ <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xe985e9c5

- 版本更新: 

### 参数

- [address] owner: 

- [address] operator: 

### 返回值

- [bool] : 

- 备注: 

## ²¹ <b id="isOperator(address)🇷">isOperator(address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x6d70f7ae

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [bool] : 

- 备注: 

## ²² <b id="name(uint256)🇷">name(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x00ad800c

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [string] : 

- 备注: 

## ²³ <b id="name()🇷">name()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x06fdde03

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## ²⁴ <b id="owner()🇷">owner()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x8da5cb5b

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## ²⁵ <b id="ownerOf(uint256)🇷">ownerOf(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询编号为tokenId的DID的拥有者地址

- selector: 0x6352211e

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## ²⁶ <b id="ownerOfID(string)🇷">ownerOfID(string)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询某个DID的拥有人地址

- selector: 0xd4945594

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address] : 

- 备注: 

## ²⁷ <b id="removeAddress(string,address)🇼">removeAddress(string,address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xb166493b

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

- 备注: 

## ²⁸ <b id="removeOperator(address)🇼">removeOperator(address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xac8a584a

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## ²⁹ <b id="renew(uint256,uint256)🇼">renew(uint256,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 续约

- selector: 0xc475abff

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [uint256] period: 

- 备注: 

## ³⁰ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x715018a6

- 版本更新: 

- 备注: 

## ³¹ <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 转增

- selector: 0x42842e0e

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## ³² <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xb88d4fde

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [bytes] data: 

- 备注: 

## ³³ <b id="sell(address,address,uint256,uint256)🇼">sell(address,address,uint256,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 售卖

- selector: 0x31de7d15

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [uint256] _expired: 

- **备注**: 再次售卖给新的用户

## ³⁴ <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xa22cb465

- 版本更新: 

### 参数

- [address] operator: 

- [bool] approved: 

- 备注: 

## ³⁵ <b id="setContent(uint256,string,string,string)🇼">setContent(uint256,string,string,string)🇼</b>[^2]  [🔙](#home)
- **描述**: 添加DID的内容

- selector: 0xcde9cdb5

- 版本更新: 

### 参数

- **[uint256] tokenId**: 编号

- [string] _key: 

- [string] _value: 

- **[string] _mime**: MIME类型

- 备注: 

## ³⁶ <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x03ce3355

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## ³⁷ <b id="sign(string,address,uint256)🇼">sign(string,address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 签名

- selector: 0xcd540b6b

- 版本更新: 

### 参数

- [string] _did: 

- [address] _asset: 

- [uint256] _id: 

- **备注**: 签名一个资产会登记在DID上

## ³⁸ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x01ffc9a7

- 版本更新: 

### 参数

- [bytes4] interfaceId: 

### 返回值

- [bool] : 

- 备注: 

## ³⁹ <b id="symbol()🇷">symbol()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x95d89b41

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## ⁴⁰ <b id="tokenBoundRegistry()🇷">tokenBoundRegistry()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xfdf250df

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## ⁴¹ <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x4f6ccce7

- 版本更新: 

### 参数

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## ⁴² <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x2f745c59

- 版本更新: 

### 参数

- [address] owner: 

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## ⁴³ <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: DID的元数据

- selector: 0xc87b56dd

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- **[string] **: json格式的元数据

- 备注: 

## ⁴⁴ <b id="tokens(uint256,uint256)🇷">tokens(uint256,uint256)🇷</b>[^1]  [🔙](#home)
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

## ⁴⁵ <b id="tokensOf(address,uint256,uint256)🇷">tokensOf(address,uint256,uint256)🇷</b>[^1]  [🔙](#home)
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

## ⁴⁶ <b id="totalSupply()🇷">totalSupply()🇷</b>[^1]  [🔙](#home)
- **描述**: 总发行量

- selector: 0x18160ddd

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## ⁴⁷ <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

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
- **描述**: 核验某个地址是否是某个DID的管理员

- selector: 0x5f1c0fbd

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

### 返回值

- [bool] : 

- 备注: 

## ⁵⁰ <b id="verify(string,address,uint256)🇷">verify(string,address,uint256)🇷</b>[^1]  [🔙](#home)
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

*[🔙](#home) updated: 2024-10-05 19:38:32    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*



[^1]: 🇷读方法是同步操作，可以直接得到返回值，不消耗GAS费用。
[^2]: 🇼写方法是异步操作，需要消耗GAS费用，一般没有返回值，需要通过交易hash查询链上是否成功。
