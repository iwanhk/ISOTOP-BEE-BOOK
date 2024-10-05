| 方法   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| [appendAttr(uint256,string,string)🇼](#appendAttr(uint256,string,string)🇼)| 给已经存在的一个属性添加内容 | ✅ |  |
| [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| [balanceOf(address)🇷](#balanceOf(address)🇷)|  |  |  |
| [burn(uint256)🇼](#burn(uint256)🇼)| 销毁一个NFT | ✅ |  |
| [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| [init(string[],bool,uint256,uint256)🇼](#init(string[],bool,uint256,uint256)🇼)| 初始化 | ✅ |  |
| [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| [mint(uint256,address)🇼](#mint(uint256,address)🇼)| 发行 | ✅ |  |
| [name()🇷](#name()🇷)|  |  |  |
| [owner()🇷](#owner()🇷)|  |  |  |
| [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)|  |  |  |
| [removeAttr(uint256,string)🇼](#removeAttr(uint256,string)🇼)|  |  |  |
| [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)|  |  |  |
| [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| [setAttr(uint256,string,string)🇼](#setAttr(uint256,string,string)🇼)|  |  |  |
| [setTreadstone(address)🇼](#setTreadstone(address)🇼)|  |  |  |
| [sign(uint256,string)🇼](#sign(uint256,string)🇼)| 签名 | ✅ |  |
| [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| [symbol()🇷](#symbol()🇷)|  |  |  |
| [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)| 读取资产元数据 | ✅ |  |
| [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)| 某个用户的所有资产 | ✅ |  |
| [totalSupply()🇷](#totalSupply()🇷)| 已经发行的总量 | ✅ |  |
| [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)|  |  |  |
| [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |
| [update(string,string)🇼](#update(string,string)🇼)| 更新全部nft的图片 | ✅ |  |
| [update(uint256,string)🇼](#update(uint256,string)🇼)| 更新某个资产的图片 | ✅ |  |

- **合约及版本**: DIDAsset721-v1.6

- **获取方法**: 工厂克隆

- **描述**: DID的NFT资产721

- **ABI📝**: DIDAsset721-v1.6.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## <b id="appendAttr(uint256,string,string)🇼">appendAttr(uint256,string,string)🇼</b>
- **描述**: 给已经存在的一个属性添加内容

- selector: 0xeb1ac735

- 版本更新: 

### 参数

- **[uint256] tokenId**: 编号

- **[string] name**: 属性名称（之前用sétAttr创建过）

- **[string] value**: 内容

- **备注**: 属性在token的元数据中会出现

## <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b>
- 描述: 

- selector: 0x095ea7b3

- 版本更新: 

### 参数

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## <b id="balanceOf(address)🇷">balanceOf(address)🇷</b>
- 描述: 

- selector: 0x70a08231

- 版本更新: 

### 参数

- [address] owner: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="burn(uint256)🇼">burn(uint256)🇼</b>
- **描述**: 销毁一个NFT

- selector: 0x42966c68

- 版本更新: 

### 参数

- [uint256] tokenId: 

- 备注: 

## <b id="contractInfo()🇷">contractInfo()🇷</b>
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

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

## <b id="init(string[],bool,uint256,uint256)🇼">init(string[],bool,uint256,uint256)🇼</b>
- **描述**: 初始化

- selector: 0xd93541b4

- 版本更新: 

### 参数

- **[string[]] _info**: 5个字符串参数，分别是NFT名称、NFT简介、NFT图片地址、NFT额外图片3D地址，详情链接（图文信息）

- **[bool] _isSBT**: 是否是SBT（SBT不能转增，终身绑定拥有人）

- **[uint256] _max_supply**: 最大发行量（0不限量）

- **[uint256] _quota**: 单用户最大持有量（0不限量）

- 备注: 

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

## <b id="mint(uint256,address)🇼">mint(uint256,address)🇼</b>
- **描述**: 发行

- selector: 0x94bf804d

- 版本更新: 

### 参数

- **[uint256] tokenId**: 编号

- **[address] toUser**: 用户地址

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

## <b id="removeAttr(uint256,string)🇼">removeAttr(uint256,string)🇼</b>
- 描述: 

- selector: 0x08d9535b

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [string] name: 

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

## <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>
- 描述: 

- selector: 0xa22cb465

- 版本更新: 

### 参数

- [address] operator: 

- [bool] approved: 

- 备注: 

## <b id="setAttr(uint256,string,string)🇼">setAttr(uint256,string,string)🇼</b>
- 描述: 

- selector: 0x3c614562

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [string] name: 

- [string] value: 

- 备注: 

## <b id="setTreadstone(address)🇼">setTreadstone(address)🇼</b>
- 描述: 

- selector: 0xfc780816

- 版本更新: 

### 参数

- [address] _treadstone: 

- 备注: 

## <b id="sign(uint256,string)🇼">sign(uint256,string)🇼</b>
- **描述**: 签名

- selector: 0xa855418f

- 版本更新: 

### 参数

- **[uint256] tokenId**: 编号

- **[string] _did**: DID名称

- **备注**: 要求签名人必须是DID的管理者

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
- **描述**: 读取资产元数据

- selector: 0xc87b56dd

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- **[string] **: json内容格式

- 备注: 

## <b id="tokens(uint256,uint256)🇷">tokens(uint256,uint256)🇷</b>
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

## <b id="tokensOf(address,uint256,uint256)🇷">tokensOf(address,uint256,uint256)🇷</b>
- **描述**: 某个用户的所有资产

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

## <b id="totalSupply()🇷">totalSupply()🇷</b>
- **描述**: 已经发行的总量

- selector: 0x18160ddd

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>
- 描述: 

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

## <b id="update(string,string)🇼">update(string,string)🇼</b>
- **描述**: 更新全部nft的图片

- selector: 0xf4c84d19

- 版本更新: 

### 参数

- **[string] _url**: 图片目录

- **[string] _suffix**: 图片类型名

- 备注: 

## <b id="update(uint256,string)🇼">update(uint256,string)🇼</b>
- **描述**: 更新某个资产的图片

- selector: 0xf745630f

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [string] url: 

- 备注: 

___

*updated: 2024-10-05 10:26:04    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

