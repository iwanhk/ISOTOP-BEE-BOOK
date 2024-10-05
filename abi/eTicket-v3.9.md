| <b id="home">方法</b>   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| 0️⃣ [addBank(uint256)🇼](#addBank(uint256)🇼)| 增加票仓数量 | ✅ |  |
| 1️⃣ [addOperator(address)🇼](#addOperator(address)🇼)| 增加管理员 | ✅ |  |
| 2️⃣ [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 增加管理员操作的额度 | ✅ |  |
| 3️⃣ [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| 4️⃣ [balanceOf(address)🇷](#balanceOf(address)🇷)|  |  |  |
| 5️⃣ [burn(uint256)🇼](#burn(uint256)🇼)|  |  |  |
| 6️⃣ [check(uint256,string,uint256,string,address)🇼](#check(uint256,string,uint256,string,address)🇼)| 预约 | ✅ |  |
| 7️⃣ [check(uint256,string,address)🇼](#check(uint256,string,address)🇼)| 核销 | ✅ |  |
| 8️⃣ [claim(address,uint256)🇼](#claim(address,uint256)🇼)| 活动（免费）领取 | ✅ |  |
| 9️⃣ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| 1️⃣0️⃣ [creator(uint256)🇷](#creator(uint256)🇷)|  |  |  |
| 1️⃣1️⃣ [exists(uint256)🇷](#exists(uint256)🇷)|  |  |  |
| 1️⃣2️⃣ [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| 1️⃣3️⃣ [getBankRest()🇷](#getBankRest()🇷)|  |  |  |
| 1️⃣4️⃣ [getOperator(uint256)🇷](#getOperator(uint256)🇷)|  |  |  |
| 1️⃣5️⃣ [getOperators()🇷](#getOperators()🇷)|  |  |  |
| 1️⃣6️⃣ [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| 1️⃣7️⃣ [getStatus(uint256,uint8)🇷](#getStatus(uint256,uint8)🇷)| 获取门票的状态 | ✅ |  |
| 1️⃣8️⃣ [init(string[],string[],bytes1[],uint256,uint256)🇼](#init(string[],string[],bytes1[],uint256,uint256)🇼)| 初始化门票 | ✅ |  |
| 1️⃣9️⃣ [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| 2️⃣0️⃣ [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| 2️⃣1️⃣ [isReservedDay(uint256,uint8)🇷](#isReservedDay(uint256,uint8)🇷)| 判断是否是预约日期当天 | ✅ |  |
| 2️⃣2️⃣ [mint(address,uint256)🇼](#mint(address,uint256)🇼)| 铸造门票/发票 | ✅ |  |
| 2️⃣3️⃣ [name()🇷](#name()🇷)|  |  |  |
| 2️⃣4️⃣ [owner()🇷](#owner()🇷)|  |  |  |
| 2️⃣5️⃣ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)| 检查某个资产的拥有人 | ✅ |  |
| 2️⃣6️⃣ [refund(uint256)🇼](#refund(uint256)🇼)| 退票 | ✅ |  |
| 2️⃣7️⃣ [removeBank(uint256)🇼](#removeBank(uint256)🇼)|  |  |  |
| 2️⃣8️⃣ [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| 2️⃣9️⃣ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| 3️⃣0️⃣ [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)| 转移资产 | ✅ |  |
| 3️⃣1️⃣ [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| 3️⃣2️⃣ [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| 3️⃣3️⃣ [setAttr(uint256,string,string)🇼](#setAttr(uint256,string,string)🇼)|  |  |  |
| 3️⃣4️⃣ [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| 3️⃣5️⃣ [setTreadstone(address)🇼](#setTreadstone(address)🇼)|  |  |  |
| 3️⃣6️⃣ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| 3️⃣7️⃣ [symbol()🇷](#symbol()🇷)|  |  |  |
| 3️⃣8️⃣ [ticketStatusInfo()🇷](#ticketStatusInfo()🇷)|  |  |  |
| 3️⃣9️⃣ [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| 4️⃣0️⃣ [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| 4️⃣1️⃣ [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)|  |  |  |
| 4️⃣2️⃣ [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| 4️⃣3️⃣ [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)|  |  |  |
| 4️⃣4️⃣ [totalBank()🇷](#totalBank()🇷)|  |  |  |
| 4️⃣5️⃣ [totalSupply()🇷](#totalSupply()🇷)|  |  |  |
| 4️⃣6️⃣ [transfer(address,address,uint256)🇼](#transfer(address,address,uint256)🇼)|  |  |  |
| 4️⃣7️⃣ [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)|  |  |  |
| 4️⃣8️⃣ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |
| 4️⃣9️⃣ [update(string,string)🇼](#update(string,string)🇼)|  |  |  |

- **合约及版本**: eTicket-v3.9

- **获取方法**: 工厂合约clone eTicket

- **描述**: 数字权益门票合约模板,改变了核销方式，需要预约，预约后过期就是核销

- **ABI📝**: eTicket-v3.9.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## 0️⃣ <b id="addBank(uint256)🇼">addBank(uint256)🇼</b> [🔙](#home)
- **描述**: 增加票仓数量

- selector: 0x9e8d004a

- 版本更新: 

### 参数

- [uint256] _amount: 

- 备注: 

## 1️⃣ <b id="addOperator(address)🇼">addOperator(address)🇼</b> [🔙](#home)
- **描述**: 增加管理员

- selector: 0x9870d7fe

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## 2️⃣ <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b> [🔙](#home)
- **描述**: 增加管理员操作的额度

- selector: 0xf045000d

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## 3️⃣ <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x095ea7b3

- 版本更新: 

### 参数

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 4️⃣ <b id="balanceOf(address)🇷">balanceOf(address)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x70a08231

- 版本更新: 

### 参数

- [address] owner: 

### 返回值

- [uint256] : 

- 备注: 

## 5️⃣ <b id="burn(uint256)🇼">burn(uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x42966c68

- 版本更新: 

### 参数

- [uint256] tokenId: 

- 备注: 

## 6️⃣ <b id="check(uint256,string,uint256,string,address)🇼">check(uint256,string,uint256,string,address)🇼</b> [🔙](#home)
- **描述**: 预约

- selector: 0x43073b91

- 版本更新: 

### 参数

- **[uint256] tokenId**: 门票ID

- **[string] _right**: 权益/打卡点（注意是字符串，必须和创建时候的权益一致）

- **[uint256] _time**: 预约时间（到日期）

- **[string] _code**: 预约码（可以是闸机返回的系统预约码，也可以是随机生成的，供自己的小程序来核验）

- **[address] _who**: 预约人的链地址

- **备注**: 预约的时间是日期（没有小时，分钟），如果时间不是整数，合约按照北京时间零点做了截断。
在预约当天可以核销，如果过期第二天，认为自动核销。在预约日期之前可以再次预约时间，或者退票，但是到了当天，就只能核销门票了。过了当天，不能退票，也不能核销了。

## 7️⃣ <b id="check(uint256,string,address)🇼">check(uint256,string,address)🇼</b> [🔙](#home)
- **描述**: 核销

- selector: 0x7ac4e3ee

- 版本更新: 

### 参数

- **[uint256] tokenId**: 门票ID

- **[string] _right**: 权益/打卡点（注意是字符串，必须和创建时候的权益一致）

- **[address] _who**: 预约人的链地址

- **备注**: 核销需要在预约当天

## 8️⃣ <b id="claim(address,uint256)🇼">claim(address,uint256)🇼</b> [🔙](#home)
- **描述**: 活动（免费）领取

- selector: 0xaad3ec96

- 版本更新: 

### 参数

- **[address] _to**: 给某人

- **[uint256] tokenId**: 门票编号

- **备注**: 领取的条件需要单独在合约定义

## 9️⃣ <b id="contractInfo()🇷">contractInfo()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 1️⃣0️⃣ <b id="creator(uint256)🇷">creator(uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x510b5158

- 版本更新: 

### 参数

- [uint256] : 

### 返回值

- [address] : 

- 备注: 

## 1️⃣1️⃣ <b id="exists(uint256)🇷">exists(uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x4f558e79

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [bool] : 

- 备注: 

## 1️⃣2️⃣ <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x081812fc

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣3️⃣ <b id="getBankRest()🇷">getBankRest()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x6b796ec0

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## 1️⃣4️⃣ <b id="getOperator(uint256)🇷">getOperator(uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x05f63c8a

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣5️⃣ <b id="getOperators()🇷">getOperators()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x27a099d8

- 版本更新: 

### 返回值

- [address[]] : 

- 备注: 

## 1️⃣6️⃣ <b id="getQuota(address)🇷">getQuota(address)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x43a2a302

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [uint256] : 

- 备注: 

## 1️⃣7️⃣ <b id="getStatus(uint256,uint8)🇷">getStatus(uint256,uint8)🇷</b> [🔙](#home)
- **描述**: 获取门票的状态

- selector: 0xbec5c007

- 版本更新: 

### 参数

- **[uint256] tokenId**: 门票编号

- **[uint8] rightId**: 权益打卡点的编号，注意不是字符串

### 返回值

- **[uint8]**: 状态码：
 0= 未预约
 1= 已预约未到时间 
 2= 已预约已到今天 
 3= 已过预约时间核销 
 4= 已核销 
 5= 已过期 
 6= 未开始 
 7= 门票不存在 
 8= 其它错误

- **[uint256]**: 预约/核销的时间戳

- **备注**: 获得状态码后可以查询状态信息数组对应信息

## 1️⃣8️⃣ <b id="init(string[],string[],bytes1[],uint256,uint256)🇼">init(string[],string[],bytes1[],uint256,uint256)🇼</b> [🔙](#home)
- **描述**: 初始化门票

- selector: 0xea0ecdc4

- 版本更新: 

### 参数

- **[string[]] _info**: 6个字符串：名字，描述，图片地址，额外图片如3D地址，detailsURL（图文详情），did

- **[string[]] _rights**: 若干权益数组及权益的图片数组。如果数组长度等同于_rights长度，则一一对应。如果是_rights长度的2倍，则前半部分对于权益名字，后半部分对应权益图片地址。

- **[bytes1[]] _types**: 字符数组。R代表亮码，S代表扫码，N代表预约入园码

- **[uint256] _startTime**: 开始时间

- **[uint256] _validTime**: 到期时间

- **备注**: 权益图片是可选的，可以不设置。如果设置了权益图片，则权益图片数组长度必须等于权益数组长度的2倍。权益图片会出现在tokenURI的属性中，属性名称为权益名称，value为图片的地址。

## 1️⃣9️⃣ <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b> [🔙](#home)
- 描述: 

- selector: 0xe985e9c5

- 版本更新: 

### 参数

- [address] owner: 

- [address] operator: 

### 返回值

- [bool] : 

- 备注: 

## 2️⃣0️⃣ <b id="isOperator(address)🇷">isOperator(address)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x6d70f7ae

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [bool] : 

- 备注: 

## 2️⃣1️⃣ <b id="isReservedDay(uint256,uint8)🇷">isReservedDay(uint256,uint8)🇷</b> [🔙](#home)
- **描述**: 判断是否是预约日期当天

- selector: 0x24bfeb95

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [uint8] rightId: 

### 返回值

- [bool] : 

- 备注: 

## 2️⃣2️⃣ <b id="mint(address,uint256)🇼">mint(address,uint256)🇼</b> [🔙](#home)
- **描述**: 铸造门票/发票

- selector: 0x40c10f19

- 版本更新: 

### 参数

- **[address] _to**: 给用户的地址

- **[uint256] tokenId**: 门票编号

- **备注**: 门票编号不能重复，由发票方自己管理，总数量不能超过发票方的额度。

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
- **描述**: 检查某个资产的拥有人

- selector: 0x6352211e

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 2️⃣6️⃣ <b id="refund(uint256)🇼">refund(uint256)🇼</b> [🔙](#home)
- **描述**: 退票

- selector: 0x278ecde1

- 版本更新: 

### 参数

- [uint256] tokenId: 

- **备注**: 注意如果某个权益打卡点已经核销，不能退票

## 2️⃣7️⃣ <b id="removeBank(uint256)🇼">removeBank(uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x3ad3bfa8

- 版本更新: 

### 参数

- [uint256] _amount: 

- 备注: 

## 2️⃣8️⃣ <b id="removeOperator(address)🇼">removeOperator(address)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xac8a584a

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## 2️⃣9️⃣ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b> [🔙](#home)
- 描述: 

- selector: 0x715018a6

- 版本更新: 

- 备注: 

## 3️⃣0️⃣ <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b> [🔙](#home)
- **描述**: 转移资产

- selector: 0x42842e0e

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 3️⃣1️⃣ <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xb88d4fde

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [bytes] data: 

- 备注: 

## 3️⃣2️⃣ <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xa22cb465

- 版本更新: 

### 参数

- [address] operator: 

- [bool] approved: 

- 备注: 

## 3️⃣3️⃣ <b id="setAttr(uint256,string,string)🇼">setAttr(uint256,string,string)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x3c614562

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [string] name: 

- [string] value: 

- 备注: 

## 3️⃣4️⃣ <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0x03ce3355

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## 3️⃣5️⃣ <b id="setTreadstone(address)🇼">setTreadstone(address)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xfc780816

- 版本更新: 

### 参数

- [address] _treadstone: 

- 备注: 

## 3️⃣6️⃣ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x01ffc9a7

- 版本更新: 

### 参数

- [bytes4] interfaceId: 

### 返回值

- [bool] : 

- 备注: 

## 3️⃣7️⃣ <b id="symbol()🇷">symbol()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x95d89b41

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 3️⃣8️⃣ <b id="ticketStatusInfo()🇷">ticketStatusInfo()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x27f1e6ca

- 版本更新: 

### 返回值

- [string[9]] : 

- 备注: 

## 3️⃣9️⃣ <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x4f6ccce7

- 版本更新: 

### 参数

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣0️⃣ <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0x2f745c59

- 版本更新: 

### 参数

- [address] owner: 

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣1️⃣ <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b> [🔙](#home)
- 描述: 

- selector: 0xc87b56dd

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [string] : 

- 备注: 

## 4️⃣2️⃣ <b id="tokens(uint256,uint256)🇷">tokens(uint256,uint256)🇷</b> [🔙](#home)
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

## 4️⃣3️⃣ <b id="tokensOf(address,uint256,uint256)🇷">tokensOf(address,uint256,uint256)🇷</b> [🔙](#home)
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

## 4️⃣4️⃣ <b id="totalBank()🇷">totalBank()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x22457b02

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣5️⃣ <b id="totalSupply()🇷">totalSupply()🇷</b> [🔙](#home)
- 描述: 

- selector: 0x18160ddd

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣6️⃣ <b id="transfer(address,address,uint256)🇼">transfer(address,address,uint256)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xbeabacc8

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

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

## 4️⃣9️⃣ <b id="update(string,string)🇼">update(string,string)🇼</b> [🔙](#home)
- 描述: 

- selector: 0xf4c84d19

- 版本更新: 

### 参数

- [string] _image: 

- [string] _suffix: 

- 备注: 

___

*[🔙](#home) updated: 2024-10-05 18:43:25    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

