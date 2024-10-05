| 方法   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| [addBank(uint256)🇼](#addBank(uint256)🇼)| 添加票仓数量 | ✅ |  |
| [addOperator(address)🇼](#addOperator(address)🇼)|  |  |  |
| [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 限制渠道发行数量 | ✅ |  |
| [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| [balanceOf(address)🇷](#balanceOf(address)🇷)|  |  |  |
| [beijingTimeMidnight(uint256)🇷](#beijingTimeMidnight(uint256)🇷)| 转化时间为北京时间午夜零点（已废弃 | ✅ |  |
| [blockTimeMidnight()🇷](#blockTimeMidnight()🇷)| 转化当前时间为北京时间午夜零点（已废弃） | ✅ |  |
| [burn(uint256)🇼](#burn(uint256)🇼)|  |  |  |
| [check(uint256,string,uint256,string,address)🇼](#check(uint256,string,uint256,string,address)🇼)| 预约 | ✅ |  |
| [check(uint256,string,address)🇼](#check(uint256,string,address)🇼)| 核销 | ✅ |  |
| [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| [exists(uint256)🇷](#exists(uint256)🇷)|  |  |  |
| [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| [getBankRest()🇷](#getBankRest()🇷)|  |  |  |
| [getOperator(uint256)🇷](#getOperator(uint256)🇷)|  |  |  |
| [getOperators()🇷](#getOperators()🇷)|  |  |  |
| [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| [getStatus(uint256)🇷](#getStatus(uint256)🇷)|  |  |  |
| [getStatus(uint256,uint8)🇷](#getStatus(uint256,uint8)🇷)|  |  |  |
| [init(string[],string[],bytes1[],uint256,uint256)🇼](#init(string[],string[],bytes1[],uint256,uint256)🇼)| 初始化合约 | ✅ |  |
| [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| [isReservedDay(uint256,uint8)🇷](#isReservedDay(uint256,uint8)🇷)|  |  |  |
| [mint(address,uint256)🇼](#mint(address,uint256)🇼)|  |  |  |
| [name()🇷](#name()🇷)|  |  |  |
| [owner()🇷](#owner()🇷)|  |  |  |
| [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)|  |  |  |
| [refund(uint256)🇼](#refund(uint256)🇼)|  |  |  |
| [removeBank(uint256)🇼](#removeBank(uint256)🇼)|  |  |  |
| [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)|  |  |  |
| [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| [symbol()🇷](#symbol()🇷)|  |  |  |
| [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)| 读取门票的元数据 | ✅ |  |
| [totalBank()🇷](#totalBank()🇷)|  |  |  |
| [totalSupply()🇷](#totalSupply()🇷)|  |  |  |
| [transfer(address,address,uint256)🇼](#transfer(address,address,uint256)🇼)|  |  |  |
| [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)|  |  |  |
| [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |

- **合约及版本**: TaoJingLing-eTicket-v3.7

- **获取方法**: 工厂部署

- **描述**: 原央博eTicket合约，为桃精灵定制渠道为TAOJINGLING

- **ABI📝**: TaoJingLing-eTicket-v3.7.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## <b id="addBank(uint256)🇼">addBank(uint256)🇼</b>
- **描述**: 添加票仓数量

- selector: 0x9e8d004a

- 版本更新: 

### 参数

- [uint256] _amount: 

- **备注**: 默认门票数量为0，不能发行，添加后才能正常发行门票

## <b id="addOperator(address)🇼">addOperator(address)🇼</b>
- 描述: 

- selector: 0x9870d7fe

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b>
- **描述**: 限制渠道发行数量

- selector: 0xf045000d

- 版本更新: 

### 参数

- **[address] _operator**: 渠道

- **[uint256] _quota**: 限量

- **备注**: 默认0为不限量

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

## <b id="beijingTimeMidnight(uint256)🇷">beijingTimeMidnight(uint256)🇷</b>
- **描述**: 转化时间为北京时间午夜零点（已废弃

- selector: 0x9d3c22fb

- 版本更新: 

### 参数

- [uint256] _time: 

### 返回值

- [uint256] : 

- **备注**: 转化包含错误

## <b id="blockTimeMidnight()🇷">blockTimeMidnight()🇷</b>
- **描述**: 转化当前时间为北京时间午夜零点（已废弃）

- selector: 0xdc572a30

- 版本更新: 

### 返回值

- [uint256] : 

- **备注**: 转化包含错误

## <b id="burn(uint256)🇼">burn(uint256)🇼</b>
- 描述: 

- selector: 0x42966c68

- 版本更新: 

### 参数

- [uint256] tokenId: 

- 备注: 

## <b id="check(uint256,string,uint256,string,address)🇼">check(uint256,string,uint256,string,address)🇼</b>
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

## <b id="check(uint256,string,address)🇼">check(uint256,string,address)🇼</b>
- **描述**: 核销

- selector: 0x7ac4e3ee

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [string] _right: 

- [address] _who: 

- 备注: 

## <b id="contractInfo()🇷">contractInfo()🇷</b>
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

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

## <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b>
- 描述: 

- selector: 0x081812fc

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## <b id="getBankRest()🇷">getBankRest()🇷</b>
- 描述: 

- selector: 0x6b796ec0

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="getOperator(uint256)🇷">getOperator(uint256)🇷</b>
- 描述: 

- selector: 0x05f63c8a

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

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

## <b id="getStatus(uint256)🇷">getStatus(uint256)🇷</b>
- 描述: 

- selector: 0x5c622a0e

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [string] : 

- 备注: 

## <b id="getStatus(uint256,uint8)🇷">getStatus(uint256,uint8)🇷</b>
- 描述: 

- selector: 0xbec5c007

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [uint8] rightId: 

### 返回值

- [uint8] : 

- 备注: 

## <b id="init(string[],string[],bytes1[],uint256,uint256)🇼">init(string[],string[],bytes1[],uint256,uint256)🇼</b>
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

## <b id="isReservedDay(uint256,uint8)🇷">isReservedDay(uint256,uint8)🇷</b>
- 描述: 

- selector: 0x24bfeb95

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [uint8] rightId: 

### 返回值

- [bool] : 

- 备注: 

## <b id="mint(address,uint256)🇼">mint(address,uint256)🇼</b>
- 描述: 

- selector: 0x40c10f19

- 版本更新: 

### 参数

- [address] _to: 

- [uint256] tokenId: 

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

## <b id="refund(uint256)🇼">refund(uint256)🇼</b>
- 描述: 

- selector: 0x278ecde1

- 版本更新: 

### 参数

- [uint256] tokenId: 

- 备注: 

## <b id="removeBank(uint256)🇼">removeBank(uint256)🇼</b>
- 描述: 

- selector: 0x3ad3bfa8

- 版本更新: 

### 参数

- [uint256] _amount: 

- 备注: 

## <b id="removeOperator(address)🇼">removeOperator(address)🇼</b>
- 描述: 

- selector: 0xac8a584a

- 版本更新: 

### 参数

- [address] _operator: 

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

## <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>
- **描述**: 读取门票的元数据

- selector: 0xc87b56dd

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- **[string] **: json格式的元数据，以base64编码

- 备注: 

## <b id="totalBank()🇷">totalBank()🇷</b>
- 描述: 

- selector: 0x22457b02

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="totalSupply()🇷">totalSupply()🇷</b>
- 描述: 

- selector: 0x18160ddd

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## <b id="transfer(address,address,uint256)🇼">transfer(address,address,uint256)🇼</b>
- 描述: 

- selector: 0xbeabacc8

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

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

___

*updated: 2024-10-05 10:31:21    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

