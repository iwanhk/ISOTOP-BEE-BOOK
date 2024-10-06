| <b id="home">方法</b>   ╰┈➤    [🌰](#sample)  〰   [⬇](#end) | 说明  | 重要  | 更新    |
|:-------|:-------|:-------|:-------|
| ¹ [addBank(uint256)🇼](#addBank(uint256)🇼)| 增加票仓数量 | ✅ |  |
| ² [addOperator(address)🇼](#addOperator(address)🇼)| 增加管理员 | ✅ |  |
| ³ [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 增加管理员操作的额度 | ✅ |  |
| ⁴ [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| ⁵ [balanceOf(address)🇷](#balanceOf(address)🇷)|  |  |  |
| ⁶ [burn(uint256)🇼](#burn(uint256)🇼)|  |  |  |
| ⁷ [check(uint256,string,uint256,string,address)🇼](#check(uint256,string,uint256,string,address)🇼)| 预约 | ✅ |  |
| ⁸ [check(uint256,string,address)🇼](#check(uint256,string,address)🇼)| 核销 | ✅ |  |
| ⁹ [claim(address,uint256)🇼](#claim(address,uint256)🇼)| 活动（免费）领取 | ✅ |  |
| ¹⁰ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| ¹¹ [creator(uint256)🇷](#creator(uint256)🇷)|  |  |  |
| ¹² [exists(uint256)🇷](#exists(uint256)🇷)|  |  |  |
| ¹³ [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| ¹⁴ [getBankRest()🇷](#getBankRest()🇷)|  |  |  |
| ¹⁵ [getOperator(uint256)🇷](#getOperator(uint256)🇷)|  |  |  |
| ¹⁶ [getOperators()🇷](#getOperators()🇷)|  |  |  |
| ¹⁷ [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| ¹⁸ [getStatus(uint256,uint8)🇷](#getStatus(uint256,uint8)🇷)| 获取门票的状态 | ✅ |  |
| ¹⁹ [init(string[],string[],bytes1[],uint256,uint256)🇼](#init(string[],string[],bytes1[],uint256,uint256)🇼)| 初始化门票 | ✅ |  |
| ²⁰ [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| ²¹ [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| ²² [isReservedDay(uint256,uint8)🇷](#isReservedDay(uint256,uint8)🇷)| 判断是否是预约日期当天 | ✅ |  |
| ²³ [mint(address,uint256)🇼](#mint(address,uint256)🇼)| 铸造门票/发票 | ✅ |  |
| ²⁴ [name()🇷](#name()🇷)|  |  |  |
| ²⁵ [owner()🇷](#owner()🇷)|  |  |  |
| ²⁶ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)| 检查某个资产的拥有人 | ✅ |  |
| ²⁷ [refund(uint256)🇼](#refund(uint256)🇼)| 退票 | ✅ |  |
| ²⁸ [removeBank(uint256)🇼](#removeBank(uint256)🇼)|  |  |  |
| ²⁹ [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| ³⁰ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| ³¹ [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)| 转移资产 | ✅ |  |
| ³² [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| ³³ [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| ³⁴ [setAttr(uint256,string,string)🇼](#setAttr(uint256,string,string)🇼)|  |  |  |
| ³⁵ [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| ³⁶ [setTreadstone(address)🇼](#setTreadstone(address)🇼)|  |  |  |
| ³⁷ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| ³⁸ [symbol()🇷](#symbol()🇷)|  |  |  |
| ³⁹ [ticketStatusInfo()🇷](#ticketStatusInfo()🇷)|  |  |  |
| ⁴⁰ [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| ⁴¹ [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| ⁴² [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)| 门票元数据 | ✅ | ✅ |
| ⁴³ [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| ⁴⁴ [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)|  |  |  |
| ⁴⁵ [totalBank()🇷](#totalBank()🇷)|  |  |  |
| ⁴⁶ [totalSupply()🇷](#totalSupply()🇷)|  |  |  |
| ⁴⁷ [transfer(address,address,uint256)🇼](#transfer(address,address,uint256)🇼)|  |  |  |
| ⁴⁸ [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)|  |  |  |
| ⁴⁹ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |
| ⁵⁰ [update(string,string)🇼](#update(string,string)🇼)|  |  |  |

- **合约及版本**: eTicket-v3.9
- **获取方法**: 工厂合约clone eTicket
- **描述**: 数字权益门票合约模板, ==改变了核销方式，需要预约，预约后过期就是核销==
- **ABI🔗**: [eTicket-v3.9.json](https://github.com/iwanhk/ISOTOP-BEE-BOOK/blob/main/abi/eTicket-v3.9.json)
# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」
## ¹ <b id="addBank(uint256)🇼">addBank(uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 增加票仓数量
- selector: 0x9e8d004a
- 版本更新: 
### 参数
- [uint256] _amount: 
- 备注: 
## ² <b id="addOperator(address)🇼">addOperator(address)🇼</b>[^2]  [🔙](#home)
- **描述**: 增加管理员
- selector: 0x9870d7fe
- 版本更新: 
### 参数
- [address] _operator: 
- 备注: 
## ³ <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 增加管理员操作的额度
- selector: 0xf045000d
- 版本更新: 
### 参数
- [address] _operator: 
- [uint256] _quota: 
- 备注: 
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
## ⁶ <b id="burn(uint256)🇼">burn(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x42966c68
- 版本更新: 
### 参数
- [uint256] tokenId: 
- 备注: 
## ⁷ <b id="check(uint256,string,uint256,string,address)🇼">check(uint256,string,uint256,string,address)🇼</b>[^2]  [🔙](#home)
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
## ⁸ <b id="check(uint256,string,address)🇼">check(uint256,string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 核销
- selector: 0x7ac4e3ee
- 版本更新: 
### 参数
- **[uint256] tokenId**: 门票ID
- **[string] _right**: 权益/打卡点（注意是字符串，必须和创建时候的权益一致）
- **[address] _who**: 预约人的链地址
- **备注**: 核销需要在预约当天
## ⁹ <b id="claim(address,uint256)🇼">claim(address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 活动（免费）领取
- selector: 0xaad3ec96
- 版本更新: 
### 参数
- **[address] _to**: 给某人
- **[uint256] tokenId**: 门票编号
- **备注**: 领取的条件需要单独在合约定义
## ¹⁰ <b id="contractInfo()🇷">contractInfo()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x15c43aaf
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ¹¹ <b id="creator(uint256)🇷">creator(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x510b5158
- 版本更新: 
### 参数
- [uint256] : 
### 返回值
- [address] : 
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
## ¹⁸ <b id="getStatus(uint256,uint8)🇷">getStatus(uint256,uint8)🇷</b>[^1]  [🔙](#home)
- **描述**: 获取门票的状态
- selector: 0xbec5c007
- 版本更新: 
### 参数
- **[uint256] tokenId**: 门票编号
- **[uint8] rightId**: 权益打卡点的编号，注意不是字符串
### 返回值
- [uint8] : 
- [uint256] : 
- **备注**: 获得状态码后可以查询状态信息数组对应信息
## ¹⁹ <b id="init(string[],string[],bytes1[],uint256,uint256)🇼">init(string[],string[],bytes1[],uint256,uint256)🇼</b>[^2]  [🔙](#home)
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
## ²² <b id="isReservedDay(uint256,uint8)🇷">isReservedDay(uint256,uint8)🇷</b>[^1]  [🔙](#home)
- **描述**: 判断是否是预约日期当天
- selector: 0x24bfeb95
- 版本更新: 
### 参数
- [uint256] tokenId: 
- [uint8] rightId: 
### 返回值
- [bool] : 
- 备注: 
## ²³ <b id="mint(address,uint256)🇼">mint(address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 铸造门票/发票
- selector: 0x40c10f19
- 版本更新: 
### 参数
- **[address] _to**: 给用户的地址
- **[uint256] tokenId**: 门票编号
- **备注**: 门票编号不能重复，由发票方自己管理，总数量不能超过发票方的额度。
## ²⁴ <b id="name()🇷">name()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x06fdde03
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ²⁵ <b id="owner()🇷">owner()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x8da5cb5b
- 版本更新: 
### 返回值
- [address] : 
- 备注: 
## ²⁶ <b id="ownerOf(uint256)🇷">ownerOf(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 检查某个资产的拥有人
- selector: 0x6352211e
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [address] : 
- 备注: 
## ²⁷ <b id="refund(uint256)🇼">refund(uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 退票
- selector: 0x278ecde1
- 版本更新: 
### 参数
- [uint256] tokenId: 
- **备注**: 注意如果某个权益打卡点已经核销，不能退票
## ²⁸ <b id="removeBank(uint256)🇼">removeBank(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x3ad3bfa8
- 版本更新: 
### 参数
- [uint256] _amount: 
- 备注: 
## ²⁹ <b id="removeOperator(address)🇼">removeOperator(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xac8a584a
- 版本更新: 
### 参数
- [address] _operator: 
- 备注: 
## ³⁰ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x715018a6
- 版本更新: 
- 备注: 
## ³¹ <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 转移资产
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
## ³³ <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xa22cb465
- 版本更新: 
### 参数
- [address] operator: 
- [bool] approved: 
- 备注: 
## ³⁴ <b id="setAttr(uint256,string,string)🇼">setAttr(uint256,string,string)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x3c614562
- 版本更新: 
### 参数
- [uint256] tokenId: 
- [string] name: 
- [string] value: 
- 备注: 
## ³⁵ <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x03ce3355
- 版本更新: 
### 参数
- [address] _operator: 
- [uint256] _quota: 
- 备注: 
## ³⁶ <b id="setTreadstone(address)🇼">setTreadstone(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xfc780816
- 版本更新: 
### 参数
- [address] _treadstone: 
- 备注: 
## ³⁷ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x01ffc9a7
- 版本更新: 
### 参数
- [bytes4] interfaceId: 
### 返回值
- [bool] : 
- 备注: 
## ³⁸ <b id="symbol()🇷">symbol()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x95d89b41
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ³⁹ <b id="ticketStatusInfo()🇷">ticketStatusInfo()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x27f1e6ca
- 版本更新: 
### 返回值
- [string[9]] : 
- 备注: 
## ⁴⁰ <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x4f6ccce7
- 版本更新: 
### 参数
- [uint256] index: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴¹ <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x2f745c59
- 版本更新: 
### 参数
- [address] owner: 
- [uint256] index: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴² <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>[^1]  [🔙](#home)
- **描述**: 门票元数据
- selector: 0xc87b56dd
- 版本更新: ✅ 𝒀𝒆𝒔
### 参数
- [uint256] tokenId: 
### 返回值
- **[string] **: json格式的元数据，==预约或核销时间已经改为时间戳==
- **备注**: 元数据可能被链上其它应用改变，确保按照最新的元数据解析这张门票
## ⁴³ <b id="tokens(uint256,uint256)🇷">tokens(uint256,uint256)🇷</b>[^1]  [🔙](#home)
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
## ⁴⁴ <b id="tokensOf(address,uint256,uint256)🇷">tokensOf(address,uint256,uint256)🇷</b>[^1]  [🔙](#home)
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
## ⁴⁵ <b id="totalBank()🇷">totalBank()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x22457b02
- 版本更新: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴⁶ <b id="totalSupply()🇷">totalSupply()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x18160ddd
- 版本更新: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴⁷ <b id="transfer(address,address,uint256)🇼">transfer(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xbeabacc8
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ⁴⁸ <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x23b872dd
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ⁴⁹ <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xf2fde38b
- 版本更新: 
### 参数
- [address] newOwner: 
- 备注: 
## ⁵⁰ <b id="update(string,string)🇼">update(string,string)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xf4c84d19
- 版本更新: 
### 参数
- [string] _image: 
- [string] _suffix: 
- 备注: 
# <b id="sample">示例 🌰</b>
```json
 {
    "name": "故宫博物院",
    "description": "故宫博物院成立于1925年10月10日，是以明清两代皇宫和宫廷旧藏文物为基础建立起来的大型综合性古代艺术博物馆，是世界文化遗产地、全国重点文物保护单位和爱国主义教育基地",
    "details": "故宫博物院.did",
    "image": "https://cctv2024.oss-cn-beijing.aliyuncs.com/gugong.png",
    "extURI": "https://isotop.oss-cn-shanghai.aliyuncs.com/20240102/2f0c555cd605483b9edd679f4e9d6d27.html",
    "designer": "isotop.top",
    "attributes": [
        {
            "trait_type": "出品方DID",
            "value": "故宫博物院.did"
        },
        {
            "trait_type": "有效期",
            "value": "2024/8/26-2024/12/31"
        },
        {
            "trait_type": "[S]入口",
            "value": "已预约已到今天:1728086400"
        },
        {
            "trait_type": "入口",
            "value": "入口 Image"
        },
        {
            "trait_type": "[S]午门及东西雁翅楼展厅",
            "value": "已预约已到今天:1728086400"
        },
        {
            "trait_type": "午门及东西雁翅楼展厅",
            "value": "午门及东西雁翅楼展厅 Image"
        },
        {
            "trait_type": "[S]永寿宫展厅",
            "value": "未预约"
        },
        {
            "trait_type": "永寿宫展厅",
            "value": "永寿宫展厅 Image"
        },
        {
            "trait_type": "[S]斋宫展厅",
            "value": "未预约"
        },
        {
            "trait_type": "斋宫展厅",
            "value": "斋宫展厅 Image"
        },
        {
            "trait_type": "[S]古陶瓷研究中心",
            "value": "未预约"
        },
        {
            "trait_type": "古陶瓷研究中心",
            "value": "古陶瓷研究中心 Image"
        },
        {
            "trait_type": "[S]古书画研究中心",
            "value": "已预约未到时间:1735516800"
        },
        {
            "trait_type": "古书画研究中心",
            "value": "古书画研究中心 Image"
        },
        {
            "trait_type": "[S]神武门展厅",
            "value": "已预约未到时间:1733011200"
        },
        {
            "trait_type": "神武门展厅",
            "value": "神武门展厅 Image"
        }
    ]
}
```
___
*[🔙](#home) <b id="end">updated</b>: 2024-10-06 10:31:17          i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

[^1]: 🇷读方法是同步操作，可以直接得到返回值，不消耗GAS费用。
[^2]: 🇼写方法是异步操作，需要消耗GAS费用，一般没有返回值，需要通过交易hash查询链上是否成功。
