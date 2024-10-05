| <b id="home">方法</b>   | 说明  | 重要  | 更新    |
|-------|-------|-------|-------|
| 0️⃣ [addBank(uint256)🇼](#addBank(uint256)🇼)|  |  |  |
| 1️⃣ [addOperator(address)🇼](#addOperator(address)🇼)|  |  |  |
| 2️⃣ [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)|  |  |  |
| 3️⃣ [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| 4️⃣ [balanceOf(address)🇷](#balanceOf(address)🇷)|  |  |  |
| 5️⃣ [burn(uint256)🇼](#burn(uint256)🇼)|  |  |  |
| 6️⃣ [check(uint256,uint16,string,address)🇼](#check(uint256,uint16,string,address)🇼)| 核销卡中的门票 | ✅ |  |
| 7️⃣ [check(uint256,uint16,string,uint256,string,address)🇼](#check(uint256,uint16,string,uint256,string,address)🇼)| 预约卡中的门票 | ✅ |  |
| 8️⃣ [claim(address,uint256)🇼](#claim(address,uint256)🇼)| 活动兑换领取卡 | ✅ |  |
| 9️⃣ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| 1️⃣0️⃣ [exists(uint256)🇷](#exists(uint256)🇷)|  |  |  |
| 1️⃣1️⃣ [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| 1️⃣2️⃣ [getBankRest()🇷](#getBankRest()🇷)|  |  |  |
| 1️⃣3️⃣ [getOperator(uint256)🇷](#getOperator(uint256)🇷)|  |  |  |
| 1️⃣4️⃣ [getOperators()🇷](#getOperators()🇷)|  |  |  |
| 1️⃣5️⃣ [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| 1️⃣6️⃣ [getStatus(uint256,uint16,uint8)🇷](#getStatus(uint256,uint16,uint8)🇷)|  |  |  |
| 1️⃣7️⃣ [init(string[],address[],uint16[],uint8[],uint16,uint256,uint256)🇼](#init(string[],address[],uint16[],uint8[],uint16,uint256,uint256)🇼)| 初始化卡片 | ✅ |  |
| 1️⃣8️⃣ [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| 1️⃣9️⃣ [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| 2️⃣0️⃣ [mint(address,uint256)🇼](#mint(address,uint256)🇼)|  |  |  |
| 2️⃣1️⃣ [name()🇷](#name()🇷)|  |  |  |
| 2️⃣2️⃣ [owner()🇷](#owner()🇷)|  |  |  |
| 2️⃣3️⃣ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)|  |  |  |
| 2️⃣4️⃣ [redeem(uint256,address,uint8)🇼](#redeem(uint256,address,uint8)🇼)| 兑换门票 | ✅ |  |
| 2️⃣5️⃣ [refund(uint256)🇼](#refund(uint256)🇼)|  |  |  |
| 2️⃣6️⃣ [removeBank(uint256)🇼](#removeBank(uint256)🇼)|  |  |  |
| 2️⃣7️⃣ [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| 2️⃣8️⃣ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| 2️⃣9️⃣ [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)|  |  |  |
| 3️⃣0️⃣ [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| 3️⃣1️⃣ [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| 3️⃣2️⃣ [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| 3️⃣3️⃣ [setTreadstone(address)🇼](#setTreadstone(address)🇼)|  |  |  |
| 3️⃣4️⃣ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| 3️⃣5️⃣ [symbol()🇷](#symbol()🇷)|  |  |  |
| 3️⃣6️⃣ [ticketsPool(uint256,uint256)🇷](#ticketsPool(uint256,uint256)🇷)|  |  |  |
| 3️⃣7️⃣ [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| 3️⃣8️⃣ [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| 3️⃣9️⃣ [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)|  |  |  |
| 4️⃣0️⃣ [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| 4️⃣1️⃣ [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)|  |  |  |
| 4️⃣2️⃣ [totalBank()🇷](#totalBank()🇷)|  |  |  |
| 4️⃣3️⃣ [totalSupply()🇷](#totalSupply()🇷)|  |  |  |
| 4️⃣4️⃣ [transfer(address,address,uint256)🇼](#transfer(address,address,uint256)🇼)|  |  |  |
| 4️⃣5️⃣ [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)|  |  |  |
| 4️⃣6️⃣ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |

- **合约及版本**: ePointTicket-v1.5

- **获取方法**: 工厂克隆

- **描述**: 积分兑换卡合约，积分兑换卡允许用户自由兑换卡中包含的门票，根据每张卡的积分额度和每张票的价格来兑换，不限量

- **ABI📝**: ePointTicket-v1.5.json

# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」

## 0️⃣ <b id="addBank(uint256)🇼">addBank(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x9e8d004a

- 版本更新: 

### 参数

- [uint256] _amount: 

- 备注: 

## 1️⃣ <b id="addOperator(address)🇼">addOperator(address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x9870d7fe

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## 2️⃣ <b id="addQuota(address,uint256)🇼">addQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xf045000d

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## 3️⃣ <b id="approve(address,uint256)🇼">approve(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x095ea7b3

- 版本更新: 

### 参数

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 4️⃣ <b id="balanceOf(address)🇷">balanceOf(address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x70a08231

- 版本更新: 

### 参数

- [address] owner: 

### 返回值

- [uint256] : 

- 备注: 

## 5️⃣ <b id="burn(uint256)🇼">burn(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x42966c68

- 版本更新: 

### 参数

- [uint256] tokenId: 

- 备注: 

## 6️⃣ <b id="check(uint256,uint16,string,address)🇼">check(uint256,uint16,string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 核销卡中的门票

- selector: 0x1be5b8dd

- 版本更新: 

### 参数

- **[uint256] tokenId**: 卡号

- **[uint16] ticketId**: 换门票的编号

- **[string] _right**: 权益/打卡点

- **[address] _who**: 拥有人

- 备注: 

## 7️⃣ <b id="check(uint256,uint16,string,uint256,string,address)🇼">check(uint256,uint16,string,uint256,string,address)🇼</b>[^2]  [🔙](#home)
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

## 8️⃣ <b id="claim(address,uint256)🇼">claim(address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 活动兑换领取卡

- selector: 0xaad3ec96

- 版本更新: 

### 参数

- [address] _to: 

- [uint256] tokenId: 

- **备注**: 条件需要在合约中单独约定

## 9️⃣ <b id="contractInfo()🇷">contractInfo()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x15c43aaf

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 1️⃣0️⃣ <b id="exists(uint256)🇷">exists(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x4f558e79

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [bool] : 

- 备注: 

## 1️⃣1️⃣ <b id="getApproved(uint256)🇷">getApproved(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x081812fc

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣2️⃣ <b id="getBankRest()🇷">getBankRest()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x6b796ec0

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## 1️⃣3️⃣ <b id="getOperator(uint256)🇷">getOperator(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x05f63c8a

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 1️⃣4️⃣ <b id="getOperators()🇷">getOperators()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x27a099d8

- 版本更新: 

### 返回值

- [address[]] : 

- 备注: 

## 1️⃣5️⃣ <b id="getQuota(address)🇷">getQuota(address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x43a2a302

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [uint256] : 

- 备注: 

## 1️⃣6️⃣ <b id="getStatus(uint256,uint16,uint8)🇷">getStatus(uint256,uint16,uint8)🇷</b>[^1]  [🔙](#home)
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

## 1️⃣7️⃣ <b id="init(string[],address[],uint16[],uint8[],uint16,uint256,uint256)🇼">init(string[],address[],uint16[],uint8[],uint16,uint256,uint256)🇼</b>[^2]  [🔙](#home)
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

## 1️⃣8️⃣ <b id="isApprovedForAll(address,address)🇷">isApprovedForAll(address,address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xe985e9c5

- 版本更新: 

### 参数

- [address] owner: 

- [address] operator: 

### 返回值

- [bool] : 

- 备注: 

## 1️⃣9️⃣ <b id="isOperator(address)🇷">isOperator(address)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x6d70f7ae

- 版本更新: 

### 参数

- [address] _operator: 

### 返回值

- [bool] : 

- 备注: 

## 2️⃣0️⃣ <b id="mint(address,uint256)🇼">mint(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x40c10f19

- 版本更新: 

### 参数

- [address] _to: 

- [uint256] tokenId: 

- 备注: 

## 2️⃣1️⃣ <b id="name()🇷">name()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x06fdde03

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 2️⃣2️⃣ <b id="owner()🇷">owner()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x8da5cb5b

- 版本更新: 

### 返回值

- [address] : 

- 备注: 

## 2️⃣3️⃣ <b id="ownerOf(uint256)🇷">ownerOf(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x6352211e

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [address] : 

- 备注: 

## 2️⃣4️⃣ <b id="redeem(uint256,address,uint8)🇼">redeem(uint256,address,uint8)🇼</b>[^2]  [🔙](#home)
- **描述**: 兑换门票

- selector: 0xfecac7bf

- 版本更新: 

### 参数

- **[uint256] tokenId**: 卡号

- **[address] _ticket**: 门票合约地址

- **[uint8] _amount**: 数量

- 备注: 

## 2️⃣5️⃣ <b id="refund(uint256)🇼">refund(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x278ecde1

- 版本更新: 

### 参数

- [uint256] tokenId: 

- 备注: 

## 2️⃣6️⃣ <b id="removeBank(uint256)🇼">removeBank(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x3ad3bfa8

- 版本更新: 

### 参数

- [uint256] _amount: 

- 备注: 

## 2️⃣7️⃣ <b id="removeOperator(address)🇼">removeOperator(address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xac8a584a

- 版本更新: 

### 参数

- [address] _operator: 

- 备注: 

## 2️⃣8️⃣ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x715018a6

- 版本更新: 

- 备注: 

## 2️⃣9️⃣ <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x42842e0e

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 3️⃣0️⃣ <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xb88d4fde

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- [bytes] data: 

- 备注: 

## 3️⃣1️⃣ <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xa22cb465

- 版本更新: 

### 参数

- [address] operator: 

- [bool] approved: 

- 备注: 

## 3️⃣2️⃣ <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x03ce3355

- 版本更新: 

### 参数

- [address] _operator: 

- [uint256] _quota: 

- 备注: 

## 3️⃣3️⃣ <b id="setTreadstone(address)🇼">setTreadstone(address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xfc780816

- 版本更新: 

### 参数

- [address] _treadstone: 

- 备注: 

## 3️⃣4️⃣ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x01ffc9a7

- 版本更新: 

### 参数

- [bytes4] interfaceId: 

### 返回值

- [bool] : 

- 备注: 

## 3️⃣5️⃣ <b id="symbol()🇷">symbol()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x95d89b41

- 版本更新: 

### 返回值

- [string] : 

- 备注: 

## 3️⃣6️⃣ <b id="ticketsPool(uint256,uint256)🇷">ticketsPool(uint256,uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xc4b3615e

- 版本更新: 

### 参数

- [uint256] : 

### 返回值

- [address] : 

- 备注: 

## 3️⃣7️⃣ <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x4f6ccce7

- 版本更新: 

### 参数

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## 3️⃣8️⃣ <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x2f745c59

- 版本更新: 

### 参数

- [address] owner: 

- [uint256] index: 

### 返回值

- [uint256] : 

- 备注: 

## 3️⃣9️⃣ <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0xc87b56dd

- 版本更新: 

### 参数

- [uint256] tokenId: 

### 返回值

- [string] : 

- 备注: 

## 4️⃣0️⃣ <b id="tokens(uint256,uint256)🇷">tokens(uint256,uint256)🇷</b>[^1]  [🔙](#home)
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

## 4️⃣1️⃣ <b id="tokensOf(address,uint256,uint256)🇷">tokensOf(address,uint256,uint256)🇷</b>[^1]  [🔙](#home)
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

## 4️⃣2️⃣ <b id="totalBank()🇷">totalBank()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x22457b02

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣3️⃣ <b id="totalSupply()🇷">totalSupply()🇷</b>[^1]  [🔙](#home)
- 描述: 

- selector: 0x18160ddd

- 版本更新: 

### 返回值

- [uint256] : 

- 备注: 

## 4️⃣4️⃣ <b id="transfer(address,address,uint256)🇼">transfer(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xbeabacc8

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 4️⃣5️⃣ <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0x23b872dd

- 版本更新: 

### 参数

- [address] from: 

- [address] to: 

- [uint256] tokenId: 

- 备注: 

## 4️⃣6️⃣ <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b>[^2]  [🔙](#home)
- 描述: 

- selector: 0xf2fde38b

- 版本更新: 

### 参数

- [address] newOwner: 

- 备注: 

___

*[🔙](#home) updated: 2024-10-05 19:30:43    i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

___

[^1]: 🇷读方法是同步操作，可以直接得到返回值，不消耗GAS费用。
[^2]: 🇼写方法是异步操作，需要消耗GAS费用，无法取得返回值，需要通过交易hash查询链上是否成功。
