| <b id="home">方法</b>   ╰┈➤    [🌰](#sample)  〰   [⬇](#end) | 说明  | 重要  | 更新    |
|:-------|:-------|:-------|:-------|
| ¹ [Details()🇷](#Details()🇷)| 资产介绍页面URL | ✅ |  |
| ² [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| ³ [balanceOf(address)🇷](#balanceOf(address)🇷)| 查询某个地址拥有几个资产 | ✅ |  |
| ⁴ [burn(uint256)🇼](#burn(uint256)🇼)|  |  |  |
| ⁵ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| ⁶ [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| ⁷ [init(string,string,string,string)🇼](#init(string,string,string,string)🇼)| 初始化合约 | ✅ |  |
| ⁸ [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| ⁹ [mint(address,uint256)🇼](#mint(address,uint256)🇼)|  |  |  |
| ¹⁰ [mint(address)🇼](#mint(address)🇼)|  铸造NFT | ✅ |  |
| ¹¹ [name()🇷](#name()🇷)|  |  |  |
| ¹² [owner()🇷](#owner()🇷)|  |  |  |
| ¹³ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)| 查询某个资产的拥有人 | ✅ |  |
| ¹⁴ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| ¹⁵ [safeMint(address)🇼](#safeMint(address)🇼)|  |  |  |
| ¹⁶ [safeMint(address,uint256)🇼](#safeMint(address,uint256)🇼)|  |  |  |
| ¹⁷ [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)|  |  |  |
| ¹⁸ [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| ¹⁹ [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| ²⁰ [setBaseURI(string)🇼](#setBaseURI(string)🇼)| 更改metadata的目录URL | ✅ |  |
| ²¹ [setDetailsURI(string)🇼](#setDetailsURI(string)🇼)|  |  |  |
| ²² [setParty(string[],uint8[])🇼](#setParty(string[],uint8[])🇼)|  |  |  |
| ²³ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| ²⁴ [suspend(bool)🇼](#suspend(bool)🇼)|  |  |  |
| ²⁵ [symbol()🇷](#symbol()🇷)|  |  |  |
| ²⁶ [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| ²⁷ [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| ²⁸ [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)| 资产的元数据metadata | ✅ |  |
| ²⁹ [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| ³⁰ [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)|  |  |  |
| ³¹ [totalSupply()🇷](#totalSupply()🇷)| 资产的总发行量 | ✅ |  |
| ³² [transfer(address,address,uint256)🇼](#transfer(address,address,uint256)🇼)|  |  |  |
| ³³ [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)| 转移资产 | ✅ |  |
| ³⁴ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |

- **合约及版本**: ISOTOP1017-v1.0
- **获取方法**: 合约工厂clone，名称ISOTOP1017
- **描述**: 数字资产，包含数字藏品，数字纪念品等有独立存证编号的内容，又被称为NFT（非同质化token）。是通过区块链技术确权的数字内容。每个资产有自己独立编号，一旦铸造，即可以链上存证，具有自己的价值。
 支持数字资产的智能合约是ERC721兼容的独立实现，我们还扩展了合约，支持资产扩展信息。
- **ABI🔗**: [ISOTOP1017-v1.0.json](https://github.com/iwanhk/ISOTOP-BEE-BOOK/blob/main/abi/ISOTOP1017-v1.0.json)
# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」
## ¹ <b id="Details()🇷">Details()🇷</b>[^1]  [🔙](#home)
- **描述**: 资产介绍页面URL
- selector: 0xb47d89ad
- 版本更新: 
### 返回值
- [string] : 
- **备注**: NFT介绍页面是可选参数，可以为空
## ² <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x095ea7b3
- 版本更新: 
### 参数
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ³ <b id="balanceOf(address)🇷">balanceOf(address)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询某个地址拥有几个资产
- selector: 0x70a08231
- 版本更新: 
### 参数
- [address] owner: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴ <b id="burn(uint256)🇼">burn(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x42966c68
- 版本更新: 
### 参数
- [uint256] tokenId: 
- 备注: 
## ⁵ <b id="contractInfo()🇷">contractInfo()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x15c43aaf
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ⁶ <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x081812fc
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [address] : 
- 备注: 
## ⁷ <b id="init(string,string,string,string)🇼">init(string,string,string,string)🇼</b>[^2]  [🔙](#home)
- **描述**: 初始化合约
- selector: 0x8de12845
- 版本更新: 
### 参数
- **[string] name_**: 合约名称
- **[string] symbol_**: 代号
- **[string] base_**: metadata的目录URL
- **[string] details_**: NFT项目介绍页面URL
- **备注**: 如果base_是以/结尾的目录，则顺序读取目录下0.json文件。 否则固定为一个json文件内容。
## ⁸ <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0xe985e9c5
- 版本更新: 
### 参数
- [address] owner: 
- [address] operator: 
### 返回值
- [bool] : 
- 备注: 
## ⁹ <b id="mint(address,uint256)🇼">mint(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x40c10f19
- 版本更新: 
### 参数
- [address] _to: 
- [uint256] tokenId: 
- 备注: 
## ¹⁰ <b id="mint(address)🇼">mint(address)🇼</b>[^2]  [🔙](#home)
- **描述**:  铸造NFT
- selector: 0x6a627842
- 版本更新: 
### 参数
- [address] _to: 
- **备注**: NFT的编号自动增加
## ¹¹ <b id="name()🇷">name()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x06fdde03
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ¹² <b id="owner()🇷">owner()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x8da5cb5b
- 版本更新: 
### 返回值
- [address] : 
- 备注: 
## ¹³ <b id="ownerOf(uint256)🇷">ownerOf(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 查询某个资产的拥有人
- selector: 0x6352211e
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [address] : 
- 备注: 
## ¹⁴ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x715018a6
- 版本更新: 
- 备注: 
## ¹⁵ <b id="safeMint(address)🇼">safeMint(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x40d097c3
- 版本更新: 
### 参数
- [address] _to: 
- 备注: 
## ¹⁶ <b id="safeMint(address,uint256)🇼">safeMint(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xa1448194
- 版本更新: 
### 参数
- [address] _to: 
- [uint256] tokenId: 
- 备注: 
## ¹⁷ <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x42842e0e
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ¹⁸ <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xb88d4fde
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- [bytes] data: 
- 备注: 
## ¹⁹ <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xa22cb465
- 版本更新: 
### 参数
- [address] operator: 
- [bool] approved: 
- 备注: 
## ²⁰ <b id="setBaseURI(string)🇼">setBaseURI(string)🇼</b>[^2]  [🔙](#home)
- **描述**: 更改metadata的目录URL
- selector: 0x55f804b3
- 版本更新: 
### 参数
- [string] base_: 
- **备注**: 注意，全部资产都会改变，包括已经发行的资产。（慎用）
## ²¹ <b id="setDetailsURI(string)🇼">setDetailsURI(string)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xa48929d1
- 版本更新: 
### 参数
- [string] uri_: 
- 备注: 
## ²² <b id="setParty(string[],uint8[])🇼">setParty(string[],uint8[])🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x251b295e
- 版本更新: 
### 参数
- [string[]] parties_: 
- [uint8[]] shares_: 
- 备注: 
## ²³ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x01ffc9a7
- 版本更新: 
### 参数
- [bytes4] interfaceId: 
### 返回值
- [bool] : 
- 备注: 
## ²⁴ <b id="suspend(bool)🇼">suspend(bool)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xbfd812ec
- 版本更新: 
### 参数
- [bool] status: 
- 备注: 
## ²⁵ <b id="symbol()🇷">symbol()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x95d89b41
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ²⁶ <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x4f6ccce7
- 版本更新: 
### 参数
- [uint256] index: 
### 返回值
- [uint256] : 
- 备注: 
## ²⁷ <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x2f745c59
- 版本更新: 
### 参数
- [address] owner: 
- [uint256] index: 
### 返回值
- [uint256] : 
- 备注: 
## ²⁸ <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 资产的元数据metadata
- selector: 0xc87b56dd
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- **[string] **: json格式的资产内容
- 备注: 
## ²⁹ <b id="tokens(uint256,uint256)🇷">tokens(uint256,uint256)🇷</b>[^1]  [🔙](#home)
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
## ³⁰ <b id="tokensOf(address,uint256,uint256)🇷">tokensOf(address,uint256,uint256)🇷</b>[^1]  [🔙](#home)
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
## ³¹ <b id="totalSupply()🇷">totalSupply()🇷</b>[^1]  [🔙](#home)
- **描述**: 资产的总发行量
- selector: 0x18160ddd
- 版本更新: 
### 返回值
- [uint256] : 
- 备注: 
## ³² <b id="transfer(address,address,uint256)🇼">transfer(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xbeabacc8
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ³³ <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 转移资产
- selector: 0x23b872dd
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ³⁴ <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xf2fde38b
- 版本更新: 
### 参数
- [address] newOwner: 
- 备注: 
___
*[🔙](#home) <b id="end">updated</b>: 2024-10-06 01:46:10    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

[^1]: 🇷读方法是同步操作，可以直接得到返回值，不消耗GAS费用。
[^2]: 🇼写方法是异步操作，需要消耗GAS费用，一般没有返回值，需要通过交易hash查询链上是否成功。
