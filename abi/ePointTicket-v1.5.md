| <b id="home">方法</b>   ╰┈➤    [🌰](#sample)  〰   [⬇](#end) | 说明  | 重要  | 更新    |
|:-------|:-------|:-------|:-------|
| ¹ [addBank(uint256)🇼](#addBank(uint256)🇼)|  |  |  |
| ² [addOperator(address)🇼](#addOperator(address)🇼)|  |  |  |
| ³ [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)|  |  |  |
| ⁴ [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| ⁵ [balanceOf(address)🇷](#balanceOf(address)🇷)|  |  |  |
| ⁶ [burn(uint256)🇼](#burn(uint256)🇼)|  |  |  |
| ⁷ [check(uint256,uint16,string,address)🇼](#check(uint256,uint16,string,address)🇼)| 核销卡中的门票 | ✅ |  |
| ⁸ [check(uint256,uint16,string,uint256,string,address)🇼](#check(uint256,uint16,string,uint256,string,address)🇼)| 预约卡中的门票 | ✅ |  |
| ⁹ [claim(address,uint256)🇼](#claim(address,uint256)🇼)| 活动兑换领取卡 | ✅ |  |
| ¹⁰ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| ¹¹ [exists(uint256)🇷](#exists(uint256)🇷)|  |  |  |
| ¹² [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| ¹³ [getBankRest()🇷](#getBankRest()🇷)|  |  |  |
| ¹⁴ [getOperator(uint256)🇷](#getOperator(uint256)🇷)|  |  |  |
| ¹⁵ [getOperators()🇷](#getOperators()🇷)|  |  |  |
| ¹⁶ [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| ¹⁷ [getStatus(uint256,uint16,uint8)🇷](#getStatus(uint256,uint16,uint8)🇷)|  |  |  |
| ¹⁸ [init(string[],address[],uint16[],uint8[],uint16,uint256,uint256)🇼](#init(string[],address[],uint16[],uint8[],uint16,uint256,uint256)🇼)| 初始化卡片 | ✅ |  |
| ¹⁹ [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| ²⁰ [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| ²¹ [mint(address,uint256)🇼](#mint(address,uint256)🇼)|  |  |  |
| ²² [name()🇷](#name()🇷)|  |  |  |
| ²³ [owner()🇷](#owner()🇷)|  |  |  |
| ²⁴ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)|  |  |  |
| ²⁵ [redeem(uint256,address,uint8)🇼](#redeem(uint256,address,uint8)🇼)| 兑换门票 | ✅ |  |
| ²⁶ [refund(uint256)🇼](#refund(uint256)🇼)|  |  |  |
| ²⁷ [removeBank(uint256)🇼](#removeBank(uint256)🇼)|  |  |  |
| ²⁸ [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| ²⁹ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| ³⁰ [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)|  |  |  |
| ³¹ [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| ³² [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| ³³ [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| ³⁴ [setTreadstone(address)🇼](#setTreadstone(address)🇼)|  |  |  |
| ³⁵ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| ³⁶ [symbol()🇷](#symbol()🇷)|  |  |  |
| ³⁷ [ticketsPool(uint256,uint256)🇷](#ticketsPool(uint256,uint256)🇷)|  |  |  |
| ³⁸ [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| ³⁹ [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| ⁴⁰ [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)|  |  |  |
| ⁴¹ [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| ⁴² [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)|  |  |  |
| ⁴³ [totalBank()🇷](#totalBank()🇷)|  |  |  |
| ⁴⁴ [totalSupply()🇷](#totalSupply()🇷)|  |  |  |
| ⁴⁵ [transfer(address,address,uint256)🇼](#transfer(address,address,uint256)🇼)|  |  |  |
| ⁴⁶ [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)|  |  |  |
| ⁴⁷ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |

- **合约及版本**: ePointTicket-v1.5
- **获取方法**: 工厂克隆
- **描述**: 积分兑换卡合约，积分兑换卡允许用户自由兑换卡中包含的门票，根据每张卡的积分额度和每张票的价格来兑换，不限量
- **ABI🔗**: [ePointTicket-v1.5.json](https://github.com/iwanhk/ISOTOP-BEE-BOOK/blob/main/abi/ePointTicket-v1.5.json)
# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」
## ¹ <b id="addBank(uint256)🇼">addBank(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x9e8d004a
- 版本更新: 
### 参数
- [uint256] _amount: 
- 备注: 
## ² <b id="addOperator(address)🇼">addOperator(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x9870d7fe
- 版本更新: 
### 参数
- [address] _operator: 
- 备注: 
## ³ <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
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
## ⁷ <b id="check(uint256,uint16,string,address)🇼">check(uint256,uint16,string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 核销卡中的门票
- selector: 0x1be5b8dd
- 版本更新: 
### 参数
- **[uint256] tokenId**: 卡号
- **[uint16] ticketId**: 换门票的编号
- **[string] _right**: 权益/打卡点
- **[address] _who**: 拥有人
- 备注: 
## ⁸ <b id="check(uint256,uint16,string,uint256,string,address)🇼">check(uint256,uint16,string,uint256,string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 预约卡中的门票
- selector: 0xd8980d36
- 版本更新: 
### 参数
- **[uint256] tokenId**: 卡号
- **[uint16] ticketId**: 兑换门票的编号
- **[string] _right**: 权益/打卡点
- **[uint256] _time**: 预约时间
- **[string] _code**: 预约
- **[address] _who**: 拥有人
- **备注**: 预约也将扣除卡的积分
## ⁹ <b id="claim(address,uint256)🇼">claim(address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 活动兑换领取卡
- selector: 0xaad3ec96
- 版本更新: 
### 参数
- [address] _to: 
- [uint256] tokenId: 
- **备注**: 条件需要在合约中单独约定
## ¹⁰ <b id="contractInfo()🇷">contractInfo()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x15c43aaf
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ¹¹ <b id="exists(uint256)🇷">exists(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x4f558e79
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [bool] : 
- 备注: 
## ¹² <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x081812fc
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [address] : 
- 备注: 
## ¹³ <b id="getBankRest()🇷">getBankRest()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x6b796ec0
- 版本更新: 
### 返回值
- [uint256] : 
- 备注: 
## ¹⁴ <b id="getOperator(uint256)🇷">getOperator(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x05f63c8a
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [address] : 
- 备注: 
## ¹⁵ <b id="getOperators()🇷">getOperators()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x27a099d8
- 版本更新: 
### 返回值
- [address[]] : 
- 备注: 
## ¹⁶ <b id="getQuota(address)🇷">getQuota(address)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x43a2a302
- 版本更新: 
### 参数
- [address] _operator: 
### 返回值
- [uint256] : 
- 备注: 
## ¹⁷ <b id="getStatus(uint256,uint16,uint8)🇷">getStatus(uint256,uint16,uint8)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x7af11eff
- 版本更新: 
### 参数
- [uint256] tokenId: 
- [uint16] ticketId: 
- [uint8] rightId: 
### 返回值
- [uint8] : 
- [uint256] : 
- 备注: 
## ¹⁸ <b id="init(string[],address[],uint16[],uint8[],uint16,uint256,uint256)🇼">init(string[],address[],uint16[],uint8[],uint16,uint256,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 初始化卡片
- selector: 0x8cb677e7
- 版本更新: 
### 参数
- **[string[]] _info**: 包含5个字符串：名称，描述，图片地址，额外图片如3D地址，详情页地址（5个字符串）
- **[address[]] _tickets**: 卡中包含的门票合约地址
- **[uint16[]] _price**: 对应门票的兑换价格
- **[uint8[]] _limits**: 对应门票可兑换的限额（0表示不限量）
- **[uint16] _points**: 每张卡包含的面额
- **[uint256] _startTime**: 有效期开始
- **[uint256] _validTime**: 有效期结束
- 备注: 
## ¹⁹ <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0xe985e9c5
- 版本更新: 
### 参数
- [address] owner: 
- [address] operator: 
### 返回值
- [bool] : 
- 备注: 
## ²⁰ <b id="isOperator(address)🇷">isOperator(address)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x6d70f7ae
- 版本更新: 
### 参数
- [address] _operator: 
### 返回值
- [bool] : 
- 备注: 
## ²¹ <b id="mint(address,uint256)🇼">mint(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x40c10f19
- 版本更新: 
### 参数
- [address] _to: 
- [uint256] tokenId: 
- 备注: 
## ²² <b id="name()🇷">name()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x06fdde03
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ²³ <b id="owner()🇷">owner()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x8da5cb5b
- 版本更新: 
### 返回值
- [address] : 
- 备注: 
## ²⁴ <b id="ownerOf(uint256)🇷">ownerOf(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x6352211e
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [address] : 
- 备注: 
## ²⁵ <b id="redeem(uint256,address,uint8)🇼">redeem(uint256,address,uint8)🇼</b>[^2]  [🔙](#home)
- **描述**: 兑换门票
- selector: 0xfecac7bf
- 版本更新: 
### 参数
- **[uint256] tokenId**: 卡号
- **[address] _ticket**: 门票合约地址
- **[uint8] _amount**: 数量
- 备注: 
## ²⁶ <b id="refund(uint256)🇼">refund(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x278ecde1
- 版本更新: 
### 参数
- [uint256] tokenId: 
- 备注: 
## ²⁷ <b id="removeBank(uint256)🇼">removeBank(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x3ad3bfa8
- 版本更新: 
### 参数
- [uint256] _amount: 
- 备注: 
## ²⁸ <b id="removeOperator(address)🇼">removeOperator(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xac8a584a
- 版本更新: 
### 参数
- [address] _operator: 
- 备注: 
## ²⁹ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x715018a6
- 版本更新: 
- 备注: 
## ³⁰ <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x42842e0e
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ³¹ <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xb88d4fde
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- [bytes] data: 
- 备注: 
## ³² <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xa22cb465
- 版本更新: 
### 参数
- [address] operator: 
- [bool] approved: 
- 备注: 
## ³³ <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x03ce3355
- 版本更新: 
### 参数
- [address] _operator: 
- [uint256] _quota: 
- 备注: 
## ³⁴ <b id="setTreadstone(address)🇼">setTreadstone(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xfc780816
- 版本更新: 
### 参数
- [address] _treadstone: 
- 备注: 
## ³⁵ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x01ffc9a7
- 版本更新: 
### 参数
- [bytes4] interfaceId: 
### 返回值
- [bool] : 
- 备注: 
## ³⁶ <b id="symbol()🇷">symbol()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x95d89b41
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ³⁷ <b id="ticketsPool(uint256,uint256)🇷">ticketsPool(uint256,uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0xc4b3615e
- 版本更新: 
### 参数
- [uint256] : 
### 返回值
- [address] : 
- 备注: 
## ³⁸ <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x4f6ccce7
- 版本更新: 
### 参数
- [uint256] index: 
### 返回值
- [uint256] : 
- 备注: 
## ³⁹ <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x2f745c59
- 版本更新: 
### 参数
- [address] owner: 
- [uint256] index: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴⁰ <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0xc87b56dd
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [string] : 
- 备注: 
## ⁴¹ <b id="tokens(uint256,uint256)🇷">tokens(uint256,uint256)🇷</b>[^1]  [🔙](#home)
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
## ⁴² <b id="tokensOf(address,uint256,uint256)🇷">tokensOf(address,uint256,uint256)🇷</b>[^1]  [🔙](#home)
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
## ⁴³ <b id="totalBank()🇷">totalBank()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x22457b02
- 版本更新: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴⁴ <b id="totalSupply()🇷">totalSupply()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x18160ddd
- 版本更新: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴⁵ <b id="transfer(address,address,uint256)🇼">transfer(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xbeabacc8
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ⁴⁶ <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x23b872dd
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ⁴⁷ <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b>[^2]  [🔙](#home)
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
