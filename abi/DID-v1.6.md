| 方法   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| [Account(uint256)🇷](#Account(uint256)🇷)| 通过编号获得对应的DID名称 | ✅ |  |
| [Account(string)🇷](#Account(string)🇷)| 通过DID名字取得链账户地址 | ✅ |  |
| [addAddress(string,address)🇼](#addAddress(string,address)🇼)| 添加DID的共享人地址 | ✅ |  |
| [addAsset(string,address)🇼](#addAsset(string,address)🇼)| 添加DID资产 | ✅ |  |
| [addOperator(address)🇼](#addOperator(address)🇼)| 添加管理员地址 | ✅ |  |
| [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 限制管理员能够操作的次数 | ✅ |  |
| [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| [balanceOf(address)🇷](#balanceOf(address)🇷)| 查询某个地址拥有的DID数量 | ✅ |  |
| [burn(uint256)🇼](#burn(uint256)🇼)| 销毁DID | ✅ |  |
| [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| [create(string,string,address,uint256)🇼](#create(string,string,address,uint256)🇼)| 创建DID | ✅ |  |
| [createAccount(string)🇼](#createAccount(string)🇼)|  |  |  |
| [data(string)🇷](#data(string)🇷)|  |  |  |
| [dump()🇷](#dump()🇷)| 导出所有创建的DID清单 | ✅ |  |
| [erc6551ImplementationAddress()🇷](#erc6551ImplementationAddress()🇷)|  |  |  |
| [expire(string)🇷](#expire(string)🇷)|  |  |  |
| [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| [getManagersAddress(string)🇷](#getManagersAddress(string)🇷)|  |  |  |
| [getOperators()🇷](#getOperators()🇷)|  |  |  |
| [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| [hasAsset(string,address)🇷](#hasAsset(string,address)🇷)| 是否拥有一个资产 | ✅ |  |
| [index(string)🇷](#index(string)🇷)| 查询DID的编号 | ✅ |  |
| [init(address,address)🇼](#init(address,address)🇼)| 初始化合约 | ✅ |  |
| [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| [name()🇷](#name()🇷)|  |  |  |
| [owner()🇷](#owner()🇷)|  |  |  |
| [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)|  |  |  |
| [query(string)🇷](#query(string)🇷)| 查询DID的拥有人 | ✅ |  |
| [query(uint256)🇷](#query(uint256)🇷)| 查询编号的DID名称 | ✅ |  |
| [query(address)🇷](#query(address)🇷)| 查询某个地址拥有的DID清单 | ✅ |  |
| [removeAddress(string,address)🇼](#removeAddress(string,address)🇼)|  |  |  |
| [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| [renew(uint256,uint256)🇼](#renew(uint256,uint256)🇼)| 续约 | ✅ |  |
| [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)|  |  |  |
| [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| [sell(address,address,uint256,uint256)🇼](#sell(address,address,uint256,uint256)🇼)| 售卖 | ✅ |  |
| [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| [symbol()🇷](#symbol()🇷)|  |  |  |
| [tokenBoundRegistry()🇷](#tokenBoundRegistry()🇷)|  |  |  |
| [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)| DID的元数据 | ✅ |  |
| [totalSupply()🇷](#totalSupply()🇷)|  |  |  |
| [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)| 转增 | ✅ |  |
| [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |
| [validateAddress(string,address)🇷](#validateAddress(string,address)🇷)| 验证某个地址是否是DID的共享人 | ✅ |  |

- **合约及版本**: DID-v1.6

- **获取方法**: 0x7D5D9e9033dF0939c0fc2CD5CE42667Bc2B31002

- **描述**: 增加了operator的quota限制，完成简单的计费对账功能。

- **ABI📝**: DID-v1.6.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## <b id="Account(uint256)🇷">Account(uint256)🇷</b>
- **描述**: 通过编号获得对应的DID名称

- selector: 0xc496a4e1

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## <b id="Account(string)🇷">Account(string)🇷</b>
- **描述**: 通过DID名字取得链账户地址

- selector: 0xc4b6395c

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address] : 

- 备注: 

## <b id="addAddress(string,address)🇼">addAddress(string,address)🇼</b>
- **描述**: 添加DID的共享人地址

- selector: 0xceb35b0f

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

- 备注: 

## <b id="addAsset(string,address)🇼">addAsset(string,address)🇼</b>
- **描述**: 添加DID资产

- selector: 0xadc02a64

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _asset: 

- 备注: 

## <b id="addOperator(address)🇼">addOperator(address)🇼</b>
- **描述**: 添加管理员地址

- selector: 0x9870d7fe

- 版本更新: 

### 参数

- [address] _operator: 

- **备注**: 管理员可以创建DID等操作

## <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b>
- **描述**: 限制管理员能够操作的次数

- selector: 0xf045000d

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b>
- 描述: 

- selector: 0x095ea7b3

- 版本更新: 

### 参数

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## <b id="balanceOf(address)🇷">balanceOf(address)🇷</b>
- **描述**: 查询某个地址拥有的DID数量

- selector: 0x70a08231

- 版本更新: 

### 参数

- [address] owner: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="burn(uint256)🇼">burn(uint256)🇼</b>
- **描述**: 销毁DID

- selector: 0x42966c68

- 版本更新: 

### 参数

- [uint256] _tokenId: 

- 备注: 

## <b id="contractInfo()🇷">contractInfo()🇷</b>
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## <b id="create(string,string,address,uint256)🇼">create(string,string,address,uint256)🇼</b>
- **描述**: 创建DID

- selector: 0xd069c371

- 版本更新: 

### 参数

- **[string] _Identity**: DID名称

- **[string] _ar_file**: arweave的json地址

- **[address] _owner**: DID名称归属人

- **[uint256] _expired**: 有效期（UINIX时间）

- 备注: 

## <b id="createAccount(string)🇼">createAccount(string)🇼</b>
- 描述: 

- selector: 0x298daf5b

- 版本更新: 

### 参数

- [string] _Identity: 

- 备注: 

## <b id="data(string)🇷">data(string)🇷</b>
- 描述: 

- selector: 0x04f6748c

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- **[tuple] **: 返回一个结构structure，分别是DID的tokenID，content, owner, expire

- 备注: 

## <b id="dump()🇷">dump()🇷</b>
- **描述**: 导出所有创建的DID清单

- selector: 0xe4330545

- 版本更新: 

### 返回值

- [string[]] nameList: 

- 备注: 

## <b id="erc6551ImplementationAddress()🇷">erc6551ImplementationAddress()🇷</b>
- 描述: 

- selector: 0xee845881

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## <b id="expire(string)🇷">expire(string)🇷</b>
- 描述: 

- selector: 0x1cae3bee

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- **[uint256] **: 过期时间

- 备注: 

## <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b>
- 描述: 

- selector: 0x081812fc

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## <b id="getManagersAddress(string)🇷">getManagersAddress(string)🇷</b>
- 描述: 

- selector: 0xaa1266d1

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address[]] : 

- 备注: 

## <b id="getOperators()🇷">getOperators()🇷</b>
- 描述: 

- selector: 0x27a099d8

- 版本更新: 

### 返回值

- [address[]] : 

- 备注: 

## <b id="getQuota(address)🇷">getQuota(address)🇷</b>
- 描述: 

- selector: 0x43a2a302

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="hasAsset(string,address)🇷">hasAsset(string,address)🇷</b>
- **描述**: 是否拥有一个资产

- selector: 0xfecdd62f

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _asset: 

### 返回值

- [bool] : 

- 备注: 

## <b id="index(string)🇷">index(string)🇷</b>
- **描述**: 查询DID的编号

- selector: 0xf5db08d9

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="init(address,address)🇼">init(address,address)🇼</b>
- **描述**: 初始化合约

- selector: 0xf09a4016

- 版本更新: 

### 参数

- [address] tokenBoundRegistry_: 

- [address] erc6551ImplementationAddress_: 

- **备注**: 需要超级管理员一次操作即可

## <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b>
- 描述: 

- selector: 0xe985e9c5

- 版本更新: 

### 参数

- [address] owner: 

- [address] operator: 

### 返回值

- [bool] : 

- 备注: 

## <b id="isOperator(address)🇷">isOperator(address)🇷</b>
- 描述: 

- selector: 0x6d70f7ae

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [bool] : 

- 备注: 

## <b id="name()🇷">name()🇷</b>
- 描述: 

- selector: 0x06fdde03

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## <b id="owner()🇷">owner()🇷</b>
- 描述: 

- selector: 0x8da5cb5b

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## <b id="ownerOf(uint256)🇷">ownerOf(uint256)🇷</b>
- 描述: 

- selector: 0x6352211e

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## <b id="query(string)🇷">query(string)🇷</b>
- **描述**: 查询DID的拥有人

- selector: 0x7c261929

- 版本更新: 

### 参数

- [string] _Identity: 

### 返回值

- [address] : 

- 备注: 

## <b id="query(uint256)🇷">query(uint256)🇷</b>
- **描述**: 查询编号的DID名称

- selector: 0xafdac68d

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [string] : 

- 备注: 

## <b id="query(address)🇷">query(address)🇷</b>
- **描述**: 查询某个地址拥有的DID清单

- selector: 0xd4fc9fc6

- 版本更新: 

### 参数

- [address] _owner: 

### 返回值

- [string[]] : 

- 备注: 

## <b id="removeAddress(string,address)🇼">removeAddress(string,address)🇼</b>
- 描述: 

- selector: 0xb166493b

- 版本更新: 

### 参数

- [string] _Identity: 

- [address] _addr: 

- 备注: 

## <b id="removeOperator(address)🇼">removeOperator(address)🇼</b>
- 描述: 

- selector: 0xac8a584a

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## <b id="renew(uint256,uint256)🇼">renew(uint256,uint256)🇼</b>
- **描述**: 续约

- selector: 0xc475abff

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [uint256] period: 

- 备注: 

## <b id="renounceOwnership()🇼">renounceOwnership()🇼</b>
- 描述: 

- selector: 0x715018a6

- 版本更新: 

- 备注: 

## <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b>
- 描述: 

- selector: 0x42842e0e

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b>
- 描述: 

- selector: 0xb88d4fde

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [bytes] data: 

- 备注: 

## <b id="sell(address,address,uint256,uint256)🇼">sell(address,address,uint256,uint256)🇼</b>
- **描述**: 售卖

- selector: 0x31de7d15

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [uint256] _expired: 

- 备注: 

## <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>
- 描述: 

- selector: 0xa22cb465

- 版本更新: 

### 参数

- [address] operator: 

- [bool] approved: 

- 备注: 

## <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b>
- 描述: 

- selector: 0x03ce3355

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>
- 描述: 

- selector: 0x01ffc9a7

- 版本更新: 

### 参数

- [bytes4] interfaceId: 

### 返回值

- [bool] : 

- 备注: 

## <b id="symbol()🇷">symbol()🇷</b>
- 描述: 

- selector: 0x95d89b41

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## <b id="tokenBoundRegistry()🇷">tokenBoundRegistry()🇷</b>
- 描述: 

- selector: 0xfdf250df

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b>
- 描述: 

- selector: 0x4f6ccce7

- 版本更新: 

### 参数

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b>
- 描述: 

- selector: 0x2f745c59

- 版本更新: 

### 参数

- [address] owner: 

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>
- **描述**: DID的元数据

- selector: 0xc87b56dd

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- **[string] **: json格式的metadata

- **备注**: 此地址固定在ARWEAVE上，可以通过arweave读取内容

## <b id="totalSupply()🇷">totalSupply()🇷</b>
- 描述: 

- selector: 0x18160ddd

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>
- **描述**: 转增

- selector: 0x23b872dd

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b>
- 描述: 

- selector: 0xf2fde38b

- 版本更新: 

### 参数

- [address] newOwner: 

- 备注: 

## <b id="validateAddress(string,address)🇷">validateAddress(string,address)🇷</b>
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

*updated: 2024-10-05 17:02:16    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

