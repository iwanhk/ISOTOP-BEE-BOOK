| 方法   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| [addBank(uint256)🇼](#addBank(uint256)🇼)| 增加票仓数量 | :white_check_mark: |  |
| [addOperator(address)🇼](#addOperator(address)🇼)| 增加管理员 | :white_check_mark: |  |
| [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 增加管理员操作的额度 | :white_check_mark: |  |
| [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| [balanceOf(address)🇷](#balanceOf(address)🇷)|  |  |  |
| [burn(uint256)🇼](#burn(uint256)🇼)|  |  |  |
| [check(uint256,string,uint256,string,address)🇼](#check(uint256,string,uint256,string,address)🇼)| 预约 | :white_check_mark: |  |
| [check(uint256,string,address)🇼](#check(uint256,string,address)🇼)| 核销 | :white_check_mark: |  |
| [claim(address,uint256)🇼](#claim(address,uint256)🇼)| 活动（免费）领取 | :white_check_mark: |  |
| [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| [creator(uint256)🇷](#creator(uint256)🇷)|  |  |  |
| [exists(uint256)🇷](#exists(uint256)🇷)|  |  |  |
| [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| [getBankRest()🇷](#getBankRest()🇷)|  |  |  |
| [getOperator(uint256)🇷](#getOperator(uint256)🇷)|  |  |  |
| [getOperators()🇷](#getOperators()🇷)|  |  |  |
| [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| [getStatus(uint256,uint8)🇷](#getStatus(uint256,uint8)🇷)| 获取门票的状态 | :white_check_mark: |  |
| [init(string[],string[],bytes1[],uint256,uint256)🇼](#init(string[],string[],bytes1[],uint256,uint256)🇼)| 初始化门票 | :white_check_mark: |  |
| [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| [isReservedDay(uint256,uint8)🇷](#isReservedDay(uint256,uint8)🇷)| 判断是否是预约日期当天 | :white_check_mark: |  |
| [mint(address,uint256)🇼](#mint(address,uint256)🇼)| 铸造门票/发票 | :white_check_mark: |  |
| [name()🇷](#name()🇷)|  |  |  |
| [owner()🇷](#owner()🇷)|  |  |  |
| [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)| 检查某个资产的拥有人 | :white_check_mark: |  |
| [refund(uint256)🇼](#refund(uint256)🇼)| 退票 | :white_check_mark: |  |
| [removeBank(uint256)🇼](#removeBank(uint256)🇼)|  |  |  |
| [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)| 转移资产 | :white_check_mark: |  |
| [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| [setAttr(uint256,string,string)🇼](#setAttr(uint256,string,string)🇼)|  |  |  |
| [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| [setTreadstone(address)🇼](#setTreadstone(address)🇼)|  |  |  |
| [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| [symbol()🇷](#symbol()🇷)|  |  |  |
| [ticketStatusInfo()🇷](#ticketStatusInfo()🇷)|  |  |  |
| [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)|  |  |  |
| [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)|  |  |  |
| [totalBank()🇷](#totalBank()🇷)|  |  |  |
| [totalSupply()🇷](#totalSupply()🇷)|  |  |  |
| [transfer(address,address,uint256)🇼](#transfer(address,address,uint256)🇼)|  |  |  |
| [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)|  |  |  |
| [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |
| [update(string,string)🇼](#update(string,string)🇼)|  |  |  |

- **合约及版本**: eTicket-v3.9

- **获取方法**: 工厂合约clone eTicket

- **描述**: 数字权益门票合约模板,改变了核销方式，需要预约，预约后过期就是核销

- **ABI📝**: eTicket-v3.9.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## <b id="addBank(uint256)🇼">addBank(uint256)🇼</b>
- **描述**: 增加票仓数量

- 版本更新: 

### 参数

- [uint256] _amount: 

- 备注: 

- selector: 0x9e8d004a

## <b id="addOperator(address)🇼">addOperator(address)🇼</b>
- **描述**: 增加管理员

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

- selector: 0x9870d7fe

## <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b>
- **描述**: 增加管理员操作的额度

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

- selector: 0xf045000d

## <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [address] to: 

- [uint256] tokenId: 

- 备注: 

- selector: 0x095ea7b3

## <b id="balanceOf(address)🇷">balanceOf(address)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [address] owner: 

### 返回值

- [uint256] : 

- 备注: 

- selector: 0x70a08231

## <b id="burn(uint256)🇼">burn(uint256)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [uint256] tokenId: 

- 备注: 

- selector: 0x42966c68

## <b id="check(uint256,string,uint256,string,address)🇼">check(uint256,string,uint256,string,address)🇼</b>
- **描述**: 预约

- 版本更新: 

### 参数

- **[uint256] tokenId**: 门票ID

- **[string] _right**: 权益/打卡点（注意是字符串，必须和创建时候的权益一致）

- **[uint256] _time**: 预约时间（到日期）

- **[string] _code**: 预约码（可以是闸机返回的系统预约码，也可以是随机生成的，供自己的小程序来核验）

- **[address] _who**: 预约人的链地址

- **备注**: 预约的时间是日期（没有小时，分钟），如果时间不是整数，合约按照北京时间零点做了截断。
在预约当天可以核销，如果过期第二天，认为自动核销。在预约日期之前可以再次预约时间，或者退票，但是到了当天，就只能核销门票了。过了当天，不能退票，也不能核销了。

- selector: 0x43073b91

## <b id="check(uint256,string,address)🇼">check(uint256,string,address)🇼</b>
- **描述**: 核销

- 版本更新: 

### 参数

- **[uint256] tokenId**: 门票ID

- **[string] _right**: 权益/打卡点（注意是字符串，必须和创建时候的权益一致）

- **[address] _who**: 预约人的链地址

- **备注**: 核销需要在预约当天

- selector: 0x7ac4e3ee

## <b id="claim(address,uint256)🇼">claim(address,uint256)🇼</b>
- **描述**: 活动（免费）领取

- 版本更新: 

### 参数

- **[address] _to**: 给某人

- **[uint256] tokenId**: 门票编号

- **备注**: 领取的条件需要单独在合约定义

- selector: 0xaad3ec96

## <b id="contractInfo()🇷">contractInfo()🇷</b>
- 描述: 

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

- selector: 0x15c43aaf

## <b id="creator(uint256)🇷">creator(uint256)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [uint256] : 

### 返回值

- [address] : 

- 备注: 

- selector: 0x510b5158

## <b id="exists(uint256)🇷">exists(uint256)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [bool] : 

- 备注: 

- selector: 0x4f558e79

## <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

- selector: 0x081812fc

## <b id="getBankRest()🇷">getBankRest()🇷</b>
- 描述: 

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

- selector: 0x6b796ec0

## <b id="getOperator(uint256)🇷">getOperator(uint256)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

- selector: 0x05f63c8a

## <b id="getOperators()🇷">getOperators()🇷</b>
- 描述: 

- 版本更新: 

### 返回值

- [address[]] : 

- 备注: 

- selector: 0x27a099d8

## <b id="getQuota(address)🇷">getQuota(address)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [uint256] : 

- 备注: 

- selector: 0x43a2a302

## <b id="getStatus(uint256,uint8)🇷">getStatus(uint256,uint8)🇷</b>
- **描述**: 获取门票的状态

- 版本更新: 

### 参数

- **[uint256] tokenId**: 门票编号

- **[uint8] rightId**: 权益打卡点的编号，注意不是字符串

### 返回值

- **[uint8] **: 状态码：
 0= 未预约
 1= 已预约未到时间 
 2= 已预约已到今天 
 3= 已过预约时间核销 
 4= 已核销 
 5= 已过期 
 = 未开始 
 7= 门票不存在 
 8= 其它错误

- **[uint256] **: 预约/核销的时间戳

- **备注**: 获得状态码后可以查询状态信息数组对应信息

- selector: 0xbec5c007

## <b id="init(string[],string[],bytes1[],uint256,uint256)🇼">init(string[],string[],bytes1[],uint256,uint256)🇼</b>
- **描述**: 初始化门票

- 版本更新: 

### 参数

- **[string[]] _info**: 6个字符串：名字，描述，图片地址，额外图片如3D地址，detailsURL（图文详情），did

- **[string[]] _rights**: 若干权益数组及权益的图片数组。如果数组长度等同于_rights长度，则一一对应。如果是_rights长度的2倍，则前半部分对于权益名字，后半部分对应权益图片地址。

- **[bytes1[]] _types**: 字符数组。R代表亮码，S代表扫码，N代表预约入园码

- **[uint256] _startTime**: 开始时间

- **[uint256] _validTime**: 到期时间

- **备注**: 权益图片是可选的，可以不设置。如果设置了权益图片，则权益图片数组长度必须等于权益数组长度的2倍。权益图片会出现在tokenURI的属性中，属性名称为权益名称，value为图片的地址。

- selector: 0xea0ecdc4

## <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [address] owner: 

- [address] operator: 

### 返回值

- [bool] : 

- 备注: 

- selector: 0xe985e9c5

## <b id="isOperator(address)🇷">isOperator(address)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [bool] : 

- 备注: 

- selector: 0x6d70f7ae

## <b id="isReservedDay(uint256,uint8)🇷">isReservedDay(uint256,uint8)🇷</b>
- **描述**: 判断是否是预约日期当天

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [uint8] rightId: 

### 返回值

- [bool] : 

- 备注: 

- selector: 0x24bfeb95

## <b id="mint(address,uint256)🇼">mint(address,uint256)🇼</b>
- **描述**: 铸造门票/发票

- 版本更新: 

### 参数

- **[address] _to**: 给用户的地址

- **[uint256] tokenId**: 门票编号

- **备注**: 门票编号不能重复，由发票方自己管理，总数量不能超过发票方的额度。

- selector: 0x40c10f19

## <b id="name()🇷">name()🇷</b>
- 描述: 

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

- selector: 0x06fdde03

## <b id="owner()🇷">owner()🇷</b>
- 描述: 

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

- selector: 0x8da5cb5b

## <b id="ownerOf(uint256)🇷">ownerOf(uint256)🇷</b>
- **描述**: 检查某个资产的拥有人

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

- selector: 0x6352211e

## <b id="refund(uint256)🇼">refund(uint256)🇼</b>
- **描述**: 退票

- 版本更新: 

### 参数

- [uint256] tokenId: 

- **备注**: 注意如果某个权益打卡点已经核销，不能退票

- selector: 0x278ecde1

## <b id="removeBank(uint256)🇼">removeBank(uint256)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [uint256] _amount: 

- 备注: 

- selector: 0x3ad3bfa8

## <b id="removeOperator(address)🇼">removeOperator(address)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

- selector: 0xac8a584a

## <b id="renounceOwnership()🇼">renounceOwnership()🇼</b>
- 描述: 

- 版本更新: 

- 备注: 

- selector: 0x715018a6

## <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b>
- **描述**: 转移资产

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

- selector: 0x42842e0e

## <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [bytes] data: 

- 备注: 

- selector: 0xb88d4fde

## <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [address] operator: 

- [bool] approved: 

- 备注: 

- selector: 0xa22cb465

## <b id="setAttr(uint256,string,string)🇼">setAttr(uint256,string,string)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [uint256] tokenId: 

- [string] name: 

- [string] value: 

- 备注: 

- selector: 0x3c614562

## <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

- selector: 0x03ce3355

## <b id="setTreadstone(address)🇼">setTreadstone(address)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [address] _treadstone: 

- 备注: 

- selector: 0xfc780816

## <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [bytes4] interfaceId: 

### 返回值

- [bool] : 

- 备注: 

- selector: 0x01ffc9a7

## <b id="symbol()🇷">symbol()🇷</b>
- 描述: 

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

- selector: 0x95d89b41

## <b id="ticketStatusInfo()🇷">ticketStatusInfo()🇷</b>
- 描述: 

- 版本更新: 

### 返回值

- [string[9]] : 

- 备注: 

- selector: 0x27f1e6ca

## <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

- selector: 0x4f6ccce7

## <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [address] owner: 

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

- selector: 0x2f745c59

## <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [string] : 

- 备注: 

- selector: 0xc87b56dd

## <b id="tokens(uint256,uint256)🇷">tokens(uint256,uint256)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [uint256] offset: 

- [uint256] limit: 

### 返回值

- [uint256] total: 

- [uint256[]] tokenIds: 

- 备注: 

- selector: 0x8b4864d6

## <b id="tokensOf(address,uint256,uint256)🇷">tokensOf(address,uint256,uint256)🇷</b>
- 描述: 

- 版本更新: 

### 参数

- [address] owner: 

- [uint256] offset: 

- [uint256] limit: 

### 返回值

- [uint256] total: 

- [uint256[]] tokenIds: 

- 备注: 

- selector: 0x23185dc9

## <b id="totalBank()🇷">totalBank()🇷</b>
- 描述: 

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

- selector: 0x22457b02

## <b id="totalSupply()🇷">totalSupply()🇷</b>
- 描述: 

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

- selector: 0x18160ddd

## <b id="transfer(address,address,uint256)🇼">transfer(address,address,uint256)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

- selector: 0xbeabacc8

## <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

- selector: 0x23b872dd

## <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [address] newOwner: 

- 备注: 

- selector: 0xf2fde38b

## <b id="update(string,string)🇼">update(string,string)🇼</b>
- 描述: 

- 版本更新: 

### 参数

- [string] _image: 

- [string] _suffix: 

- 备注: 

- selector: 0xf4c84d19

___

*updated: 2024-10-05 01:58:42 - isotop⚛“2024*

