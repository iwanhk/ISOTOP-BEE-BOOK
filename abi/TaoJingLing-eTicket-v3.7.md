| <b id="home">方法</b>   ╰┈➤    [🌰](#sample)  〰   [⬇](#end) | 说明  | 重要  | 更新    |
|:-------|:-------|:-------|:-------|
| ¹ [addBank(uint256)🇼](#addBank(uint256)🇼)| 添加票仓数量 | ✅ |  |
| ² [addOperator(address)🇼](#addOperator(address)🇼)|  |  |  |
| ³ [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 限制渠道发行数量 | ✅ |  |
| ⁴ [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| ⁵ [balanceOf(address)🇷](#balanceOf(address)🇷)|  |  |  |
| ⁶ [beijingTimeMidnight(uint256)🇷](#beijingTimeMidnight(uint256)🇷)| 转化时间为北京时间午夜零点（已转移到DateTime库中标准功能） | ✅ |  |
| ⁷ [blockTimeMidnight()🇷](#blockTimeMidnight()🇷)| 转化当前时间为北京时间午夜零点（已废弃） | ✅ |  |
| ⁸ [burn(uint256)🇼](#burn(uint256)🇼)| 销毁门票 | ✅ |  |
| ⁹ [check(uint256,string,uint256,string,address)🇼](#check(uint256,string,uint256,string,address)🇼)| 预约 | ✅ |  |
| ¹⁰ [check(uint256,string,address)🇼](#check(uint256,string,address)🇼)| 核销 | ✅ |  |
| ¹¹ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| ¹² [exists(uint256)🇷](#exists(uint256)🇷)|  |  |  |
| ¹³ [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| ¹⁴ [getBankRest()🇷](#getBankRest()🇷)|  |  |  |
| ¹⁵ [getOperator(uint256)🇷](#getOperator(uint256)🇷)|  |  |  |
| ¹⁶ [getOperators()🇷](#getOperators()🇷)|  |  |  |
| ¹⁷ [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| ¹⁸ [getStatus(uint256)🇷](#getStatus(uint256)🇷)|  |  |  |
| ¹⁹ [getStatus(uint256,uint8)🇷](#getStatus(uint256,uint8)🇷)|  |  |  |
| ²⁰ [init(string[],string[],bytes1[],uint256,uint256)🇼](#init(string[],string[],bytes1[],uint256,uint256)🇼)| 初始化合约 | ✅ |  |
| ²¹ [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| ²² [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| ²³ [isReservedDay(uint256,uint8)🇷](#isReservedDay(uint256,uint8)🇷)|  |  |  |
| ²⁴ [mint(address,uint256)🇼](#mint(address,uint256)🇼)| 发行门票 | ✅ |  |
| ²⁵ [name()🇷](#name()🇷)|  |  |  |
| ²⁶ [owner()🇷](#owner()🇷)|  |  |  |
| ²⁷ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)|  |  |  |
| ²⁸ [refund(uint256)🇼](#refund(uint256)🇼)| 退票 | ✅ |  |
| ²⁹ [removeBank(uint256)🇼](#removeBank(uint256)🇼)|  |  |  |
| ³⁰ [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| ³¹ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| ³² [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)|  |  |  |
| ³³ [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| ³⁴ [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| ³⁵ [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| ³⁶ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| ³⁷ [symbol()🇷](#symbol()🇷)|  |  |  |
| ³⁸ [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)| 读取门票的元数据 | ✅ |  |
| ³⁹ [totalBank()🇷](#totalBank()🇷)| 总票仓数量 | ✅ |  |
| ⁴⁰ [totalSupply()🇷](#totalSupply()🇷)| 总发行的门票 | ✅ |  |
| ⁴¹ [transfer(address,address,uint256)🇼](#transfer(address,address,uint256)🇼)|  |  |  |
| ⁴² [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)| 转移资产 | ✅ |  |
| ⁴³ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |

- **合约及版本**: TaoJingLing-eTicket-v3.7
- **获取方法**: 工厂部署
- **描述**: 原央博eTicket合约，为桃精灵定制渠道为TAOJINGLING
- **ABI🔗**: [TaoJingLing-eTicket-v3.7.json](https://github.com/iwanhk/ISOTOP-BEE-BOOK/blob/main/abi/TaoJingLing-eTicket-v3.7.json)
# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」
## ¹ <b id="addBank(uint256)🇼">addBank(uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 添加票仓数量
- selector: 0x9e8d004a
- 版本更新: 
### 参数
- [uint256] _amount: 
- **备注**: 默认门票数量为0，不能发行，添加后才能正常发行门票
## ² <b id="addOperator(address)🇼">addOperator(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x9870d7fe
- 版本更新: 
### 参数
- [address] _operator: 
- 备注: 
## ³ <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 限制渠道发行数量
- selector: 0xf045000d
- 版本更新: 
### 参数
- **[address] _operator**: 渠道
- **[uint256] _quota**: 限量
- **备注**: 默认0为不限量
## ⁴ <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x095ea7b3
- 版本更新: 
### 参数
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ⁵ <b id="balanceOf(address)🇷">balanceOf(address)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x70a08231
- 版本更新: 
### 参数
- [address] owner: 
### 返回值
- [uint256] : 
- 备注: 
## ⁶ <b id="beijingTimeMidnight(uint256)🇷">beijingTimeMidnight(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 转化时间为北京时间午夜零点（已转移到DateTime库中标准功能）
- selector: 0x9d3c22fb
- 版本更新: 
### 参数
- [uint256] _time: 
### 返回值
- [uint256] : 
- **备注**: 转化包含错误
## ⁷ <b id="blockTimeMidnight()🇷">blockTimeMidnight()🇷</b>[^1]  [🔙](#home)
- **描述**: 转化当前时间为北京时间午夜零点（已废弃）
- selector: 0xdc572a30
- 版本更新: 
### 返回值
- [uint256] : 
- **备注**: 转化包含错误
## ⁸ <b id="burn(uint256)🇼">burn(uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 销毁门票
- selector: 0x42966c68
- 版本更新: 
### 参数
- [uint256] tokenId: 
- 备注: 
## ⁹ <b id="check(uint256,string,uint256,string,address)🇼">check(uint256,string,uint256,string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 预约
- selector: 0x43073b91
- 版本更新: 
### 参数
- [uint256] tokenId: 
- [string] _right: 
- [uint256] _time: 
- [string] _code: 
- [address] _who: 
- 备注: 
## ¹⁰ <b id="check(uint256,string,address)🇼">check(uint256,string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 核销
- selector: 0x7ac4e3ee
- 版本更新: 
### 参数
- [uint256] tokenId: 
- [string] _right: 
- [address] _who: 
- 备注: 
## ¹¹ <b id="contractInfo()🇷">contractInfo()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x15c43aaf
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ¹² <b id="exists(uint256)🇷">exists(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x4f558e79
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [bool] : 
- 备注: 
## ¹³ <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x081812fc
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [address] : 
- 备注: 
## ¹⁴ <b id="getBankRest()🇷">getBankRest()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x6b796ec0
- 版本更新: 
### 返回值
- [uint256] : 
- 备注: 
## ¹⁵ <b id="getOperator(uint256)🇷">getOperator(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x05f63c8a
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [address] : 
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
## ¹⁸ <b id="getStatus(uint256)🇷">getStatus(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x5c622a0e
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [string] : 
- 备注: 
## ¹⁹ <b id="getStatus(uint256,uint8)🇷">getStatus(uint256,uint8)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0xbec5c007
- 版本更新: 
### 参数
- [uint256] tokenId: 
- [uint8] rightId: 
### 返回值
- [uint8] : 
- 备注: 
## ²⁰ <b id="init(string[],string[],bytes1[],uint256,uint256)🇼">init(string[],string[],bytes1[],uint256,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 初始化合约
- selector: 0xea0ecdc4
- 版本更新: 
### 参数
- [string[]] _info: 
- [string[]] _rights: 
- [bytes1[]] _types: 
- [uint256] _startTime: 
- [uint256] _validTime: 
- 备注: 
## ²¹ <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0xe985e9c5
- 版本更新: 
### 参数
- [address] owner: 
- [address] operator: 
### 返回值
- [bool] : 
- 备注: 
## ²² <b id="isOperator(address)🇷">isOperator(address)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x6d70f7ae
- 版本更新: 
### 参数
- [address] _operator: 
### 返回值
- [bool] : 
- 备注: 
## ²³ <b id="isReservedDay(uint256,uint8)🇷">isReservedDay(uint256,uint8)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x24bfeb95
- 版本更新: 
### 参数
- [uint256] tokenId: 
- [uint8] rightId: 
### 返回值
- [bool] : 
- 备注: 
## ²⁴ <b id="mint(address,uint256)🇼">mint(address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 发行门票
- selector: 0x40c10f19
- 版本更新: 
### 参数
- [address] _to: 
- [uint256] tokenId: 
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
## ²⁸ <b id="refund(uint256)🇼">refund(uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 退票
- selector: 0x278ecde1
- 版本更新: 
### 参数
- [uint256] tokenId: 
- **备注**: 退票需要门票没有被核销
## ²⁹ <b id="removeBank(uint256)🇼">removeBank(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x3ad3bfa8
- 版本更新: 
### 参数
- [uint256] _amount: 
- 备注: 
## ³⁰ <b id="removeOperator(address)🇼">removeOperator(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xac8a584a
- 版本更新: 
### 参数
- [address] _operator: 
- 备注: 
## ³¹ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x715018a6
- 版本更新: 
- 备注: 
## ³² <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x42842e0e
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ³³ <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xb88d4fde
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- [bytes] data: 
- 备注: 
## ³⁴ <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xa22cb465
- 版本更新: 
### 参数
- [address] operator: 
- [bool] approved: 
- 备注: 
## ³⁵ <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x03ce3355
- 版本更新: 
### 参数
- [address] _operator: 
- [uint256] _quota: 
- 备注: 
## ³⁶ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x01ffc9a7
- 版本更新: 
### 参数
- [bytes4] interfaceId: 
### 返回值
- [bool] : 
- 备注: 
## ³⁷ <b id="symbol()🇷">symbol()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x95d89b41
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ³⁸ <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 读取门票的元数据
- selector: 0xc87b56dd
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- **[string] **: json格式的元数据，以base64编码
- 备注: 
## ³⁹ <b id="totalBank()🇷">totalBank()🇷</b>[^1]  [🔙](#home)
- **描述**: 总票仓数量
- selector: 0x22457b02
- 版本更新: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴⁰ <b id="totalSupply()🇷">totalSupply()🇷</b>[^1]  [🔙](#home)
- **描述**: 总发行的门票
- selector: 0x18160ddd
- 版本更新: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴¹ <b id="transfer(address,address,uint256)🇼">transfer(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xbeabacc8
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ⁴² <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 转移资产
- selector: 0x23b872dd
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ⁴³ <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xf2fde38b
- 版本更新: 
### 参数
- [address] newOwner: 
- 备注: 
___
*[🔙](#home) <b id="end">updated</b>: 2024-10-06 01:54:12          i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

[^1]: 🇷读方法是同步操作，可以直接得到返回值，不消耗GAS费用。
[^2]: 🇼写方法是异步操作，需要消耗GAS费用，一般没有返回值，需要通过交易hash查询链上是否成功。
