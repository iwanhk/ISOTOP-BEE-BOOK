| 方法   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| [appendAttr(uint256,string,string)🇼](#appendAttr(uint256,string,string)🇼)| 给已经存在的一个属性添加内容 | ✅ |  |
| [balanceOf(address,uint256)🇷](#balanceOf(address,uint256)🇷)|  |  |  |
| [balanceOfBatch(address[],uint256[])🇷](#balanceOfBatch(address[],uint256[])🇷)|  |  |  |
| [burn(uint256,uint256)🇼](#burn(uint256,uint256)🇼)| 销毁 | ✅ |  |
| [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| [create(uint256,string,string,string)🇼](#create(uint256,string,string,string)🇼)| 创建一个资产（简约版） | ✅ |  |
| [create(tuple,string)🇼](#create(tuple,string)🇼)| 创建一个资产（DID签名版） | ✅ |  |
| [create(tuple)🇼](#create(tuple)🇼)| 创建一个资产 | ✅ |  |
| [exists(uint256)🇷](#exists(uint256)🇷)|  |  |  |
| [init()🇼](#init()🇼)| 初始化（仅仅适用于工厂克隆的合约需要初始化 | ✅ |  |
| [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| [mint(address,uint256,uint256)🇼](#mint(address,uint256,uint256)🇼)| 发行 | ✅ |  |
| [owner()🇷](#owner()🇷)|  |  |  |
| [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)|  |  |  |
| [removeAttr(uint256,string)🇼](#removeAttr(uint256,string)🇼)|  |  |  |
| [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| [safeBatchTransferFrom(address,address,uint256[],uint256[],bytes)🇼](#safeBatchTransferFrom(address,address,uint256[],uint256[],bytes)🇼)|  |  |  |
| [safeTransferFrom(address,address,uint256,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,uint256,bytes)🇼)|  |  | ✅ |
| [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| [setAttr(uint256,string,string)🇼](#setAttr(uint256,string,string)🇼)| 设置一个属性及其内容 | ✅ |  |
| [setTreadstone(uint256,address)🇼](#setTreadstone(uint256,address)🇼)|  |  |  |
| [sign(uint256,string)🇼](#sign(uint256,string)🇼)| 签名 | ✅ |  |
| [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| [tokenCountOf(address)🇷](#tokenCountOf(address)🇷)|  |  |  |
| [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)| 查询一个用户有多少资产 | ✅ |  |
| [totalSupply()🇷](#totalSupply()🇷)| 已发行资产（类型）总数量 | ✅ |  |
| [totalSupply(uint256)🇷](#totalSupply(uint256)🇷)| 查询某个资产发行的数量 | ✅ |  |
| [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |
| [update(tuple)🇼](#update(tuple)🇼)| 更新某个资产的信息 | ✅ |  |
| [uri(uint256)🇷](#uri(uint256)🇷)| 读取资产元数据 | ✅ |  |

- **合约及版本**: DIDAsset1155-v1.6

- **获取方法**: 工厂克隆部署

- **描述**: 同质化数藏合约

- **ABI📝**: DIDAsset1155-v1.6.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## <b id="appendAttr(uint256,string,string)🇼">appendAttr(uint256,string,string)🇼</b>
- **描述**: 给已经存在的一个属性添加内容

- selector: 0xeb1ac735

- 版本更新: 

### 参数

- **[uint256] tokenId**: 编号

- **[string] name**: 属性名称（之前用sétAttr创建过）

- **[string] value**: 内容

- 备注: 

## <b id="balanceOf(address,uint256)🇷">balanceOf(address,uint256)🇷</b>
- 描述: 

- selector: 0x00fdd58e

- 版本更新: 

### 参数

- [address] account: 

- [uint256] id: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="balanceOfBatch(address[],uint256[])🇷">balanceOfBatch(address[],uint256[])🇷</b>
- 描述: 

- selector: 0x4e1273f4

- 版本更新: 

### 参数

- [address[]] accounts: 

- [uint256[]] ids: 

### 返回值

- [uint256[]] : 

- 备注: 

## <b id="burn(uint256,uint256)🇼">burn(uint256,uint256)🇼</b>
- **描述**: 销毁

- selector: 0xb390c0ab

- 版本更新: 

### 参数

- [uint256] id: 

- [uint256] amount: 

- 备注: 

## <b id="contractInfo()🇷">contractInfo()🇷</b>
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## <b id="create(uint256,string,string,string)🇼">create(uint256,string,string,string)🇼</b>
- **描述**: 创建一个资产（简约版）

- selector: 0x902b2d5c

- 版本更新: 

### 参数

- [uint256] id: 

- [string] name: 

- [string] description: 

- [string] image: 

- 备注: 

## <b id="create(tuple,string)🇼">create(tuple,string)🇼</b>
- **描述**: 创建一个资产（DID签名版）

- selector: 0x32228531

- 版本更新: 

### 参数

- **[tuple] _asset**: 结构(8个参数) 
 uint256 id; 编号 
 string name; 名称 
 string description; 描述 
 string image; 图片 
 string extURI; NFT额外图片3D地址. 
 string detailURL; 详情链接（图文信息） 
 bool isSBT; 是否是SBT(可选)默认为false 
 uint256 total_supply; 总发行量（可选，默认为无限量) 
 uint256 quota;每个用户限额（可选，默认为不限量）

- **[string] _did**: 签名DID

- 备注: 

## <b id="create(tuple)🇼">create(tuple)🇼</b>
- **描述**: 创建一个资产

- selector: 0xab523a84

- 版本更新: 

### 参数

- **[tuple] _asset**: 结构(8个参数) 
 uint256 id; 编号 
 string name; 名称 
 string description; 描述 
 string image; 图片 
 string extURI; NFT额外图片3D地址. 
 string detailURL; 详情链接（图文信息） 
 bool isSBT; 是否是SBT(可选)默认为false 
 uint256 total_supply; 总发行量（可选，默认为无限量) 
 uint256 quota;每个用户限额（可选，默认为不限量）

- 备注: 

## <b id="exists(uint256)🇷">exists(uint256)🇷</b>
- 描述: 

- selector: 0x4f558e79

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [bool] : 

- 备注: 

## <b id="init()🇼">init()🇼</b>
- **描述**: 初始化（仅仅适用于工厂克隆的合约需要初始化

- selector: 0xe1c7392a

- 版本更新: 

- 备注: 

## <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b>
- 描述: 

- selector: 0xe985e9c5

- 版本更新: 

### 参数

- [address] account: 

- [address] operator: 

### 返回值

- [bool] : 

- 备注: 

## <b id="mint(address,uint256,uint256)🇼">mint(address,uint256,uint256)🇼</b>
- **描述**: 发行

- selector: 0x156e29f6

- 版本更新: 

### 参数

- [address] toUser: 

- [uint256] id: 

- [uint256] amount: 

- **备注**: ERC1155发行的NFT是同质化的，除了编号没有区别

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

- [address] owner: 

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

## <b id="safeBatchTransferFrom(address,address,uint256[],uint256[],bytes)🇼">safeBatchTransferFrom(address,address,uint256[],uint256[],bytes)🇼</b>
- 描述: 

- selector: 0x2eb2c2d6

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256[]] ids: 

- [uint256[]] amounts: 

- [bytes] data: 

- 备注: 

## <b id="safeTransferFrom(address,address,uint256,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,uint256,bytes)🇼</b>
- 描述: 

- selector: 0xf242432a

- 版本更新: 转增

### 参数

- [address] from: 

- [address] to: 

- [uint256] id: 

- [uint256] amount: 

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
- **描述**: 设置一个属性及其内容

- selector: 0x3c614562

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [string] name: 

- [string] value: 

- **备注**: 属性在token的元数据中会出现

## <b id="setTreadstone(uint256,address)🇼">setTreadstone(uint256,address)🇼</b>
- 描述: 

- selector: 0xe6085f26

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [address] _treadstone: 

- 备注: 

## <b id="sign(uint256,string)🇼">sign(uint256,string)🇼</b>
- **描述**: 签名

- selector: 0xa855418f

- 版本更新: 

### 参数

- [uint256] _id: 

- [string] _did: 

- **备注**: 调用人必须是DID身份的管理员地址

## <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>
- 描述: 

- selector: 0x01ffc9a7

- 版本更新: 

### 参数

- [bytes4] interfaceId: 

### 返回值

- [bool] : 

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

## <b id="tokenCountOf(address)🇷">tokenCountOf(address)🇷</b>
- 描述: 

- selector: 0xb722938a

- 版本更新: 

### 参数

- [address] owner: 

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
- **描述**: 查询一个用户有多少资产

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
- **描述**: 已发行资产（类型）总数量

- selector: 0x18160ddd

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="totalSupply(uint256)🇷">totalSupply(uint256)🇷</b>
- **描述**: 查询某个资产发行的数量

- selector: 0xbd85b039

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b>
- 描述: 

- selector: 0xf2fde38b

- 版本更新: 

### 参数

- [address] newOwner: 

- 备注: 

## <b id="update(tuple)🇼">update(tuple)🇼</b>
- **描述**: 更新某个资产的信息

- selector: 0x582c119f

- 版本更新: 

### 参数

- **[tuple] _asset**: 同创建的内容

- 备注: 

## <b id="uri(uint256)🇷">uri(uint256)🇷</b>
- **描述**: 读取资产元数据

- selector: 0x0e89341c

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- **[string] **: json字符串，详细编码资产的元数据

- 备注: 

___

*updated: 2024-10-05 10:25:50    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

