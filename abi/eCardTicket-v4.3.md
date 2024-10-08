| <b id="home">方法</b>   ╰┈➤    [🌰](#sample)  〰   [⬇](#end) | 说明  | 重要  | 更新    |
|:-------|:-------|:-------|:-------|
| ¹ [addBank(uint256)🇼](#addBank(uint256)🇼)| 加库存 | ✅ |  |
| ² [addOperator(address)🇼](#addOperator(address)🇼)|  |  |  |
| ³ [addQuota(address,uint256)🇼](#addQuota(address,uint256)🇼)| 给管理员渠道商限定最多可卖的票 | ✅ |  |
| ⁴ [approve(address,uint256)🇼](#approve(address,uint256)🇼)|  |  |  |
| ⁵ [balanceOf(address)🇷](#balanceOf(address)🇷)|  |  |  |
| ⁶ [burn(uint256)🇼](#burn(uint256)🇼)|  |  |  |
| ⁷ [check(uint256,address,string,address)🇼](#check(uint256,address,string,address)🇼)| 核销权益卡 | ✅ |  |
| ⁸ [check(uint256,address,string,uint256,string,address)🇼](#check(uint256,address,string,uint256,string,address)🇼)| 预约核销卡权益 | ✅ |  |
| ⁹ [claim(address,uint256)🇼](#claim(address,uint256)🇼)| 活动（免费）领取 | ✅ |  |
| ¹⁰ [contractInfo()🇷](#contractInfo()🇷)|  |  |  |
| ¹¹ [exists(uint256)🇷](#exists(uint256)🇷)|  |  |  |
| ¹² [getApproved(uint256)🇷](#getApproved(uint256)🇷)|  |  |  |
| ¹³ [getBankRest()🇷](#getBankRest()🇷)|  |  |  |
| ¹⁴ [getOperator(uint256)🇷](#getOperator(uint256)🇷)|  |  |  |
| ¹⁵ [getOperators()🇷](#getOperators()🇷)|  |  |  |
| ¹⁶ [getQuota(address)🇷](#getQuota(address)🇷)|  |  |  |
| ¹⁷ [getStatus(uint256,address,uint8)🇷](#getStatus(uint256,address,uint8)🇷)|  |  |  |
| ¹⁸ [init(string[],address[],uint8,uint256,uint256)🇼](#init(string[],address[],uint8,uint256,uint256)🇼)| 初始化 | ✅ |  |
| ¹⁹ [isApprovedForAll(address,address)🇷](#isApprovedForAll(address,address)🇷)|  |  |  |
| ²⁰ [isOperator(address)🇷](#isOperator(address)🇷)|  |  |  |
| ²¹ [mint(address,uint256)🇼](#mint(address,uint256)🇼)| 发行权益卡 | ✅ |  |
| ²² [name()🇷](#name()🇷)|  |  |  |
| ²³ [owner()🇷](#owner()🇷)|  |  |  |
| ²⁴ [ownerOf(uint256)🇷](#ownerOf(uint256)🇷)|  |  |  |
| ²⁵ [refund(uint256)🇼](#refund(uint256)🇼)|  |  |  |
| ²⁶ [removeBank(uint256)🇼](#removeBank(uint256)🇼)|  |  |  |
| ²⁷ [removeOperator(address)🇼](#removeOperator(address)🇼)|  |  |  |
| ²⁸ [renounceOwnership()🇼](#renounceOwnership()🇼)|  |  |  |
| ²⁹ [safeTransferFrom(address,address,uint256)🇼](#safeTransferFrom(address,address,uint256)🇼)| 转增权益卡 | ✅ |  |
| ³⁰ [safeTransferFrom(address,address,uint256,bytes)🇼](#safeTransferFrom(address,address,uint256,bytes)🇼)|  |  |  |
| ³¹ [setApprovalForAll(address,bool)🇼](#setApprovalForAll(address,bool)🇼)|  |  |  |
| ³² [setQuota(address,uint256)🇼](#setQuota(address,uint256)🇼)|  |  |  |
| ³³ [setTreadstone(address)🇼](#setTreadstone(address)🇼)|  |  |  |
| ³⁴ [supportsInterface(bytes4)🇷](#supportsInterface(bytes4)🇷)|  |  |  |
| ³⁵ [symbol()🇷](#symbol()🇷)|  |  |  |
| ³⁶ [tokenByIndex(uint256)🇷](#tokenByIndex(uint256)🇷)|  |  |  |
| ³⁷ [tokenOfOwnerByIndex(address,uint256)🇷](#tokenOfOwnerByIndex(address,uint256)🇷)|  |  |  |
| ³⁸ [tokenURI(uint256)🇷](#tokenURI(uint256)🇷)|  |  |  |
| ³⁹ [tokens(uint256,uint256)🇷](#tokens(uint256,uint256)🇷)|  |  |  |
| ⁴⁰ [tokensOf(address,uint256,uint256)🇷](#tokensOf(address,uint256,uint256)🇷)|  |  |  |
| ⁴¹ [totalBank()🇷](#totalBank()🇷)|  |  |  |
| ⁴² [totalSupply()🇷](#totalSupply()🇷)|  |  |  |
| ⁴³ [transfer(address,address,uint256)🇼](#transfer(address,address,uint256)🇼)|  |  |  |
| ⁴⁴ [transferFrom(address,address,uint256)🇼](#transferFrom(address,address,uint256)🇼)|  |  |  |
| ⁴⁵ [transferOwnership(address)🇼](#transferOwnership(address)🇼)|  |  |  |

- **合约及版本**: eCardTicket-v4.3
- **获取方法**: 工厂合约clone eCardTicket
- **描述**: 权益卡合约模板,每张卡可以兑换任何N张门票，每张票只限一张，先到先得，如果票仓没票，兑换失败
- **ABI🔗**: [eCardTicket-v4.3.json](https://github.com/iwanhk/ISOTOP-BEE-BOOK/blob/main/abi/eCardTicket-v4.3.json)
# 方法「✔ ᵛᵉʳᶦᶠᶦᵉᵈ」
## ¹ <b id="addBank(uint256)🇼">addBank(uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 加库存
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
- **描述**: 给管理员渠道商限定最多可卖的票
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
## ⁷ <b id="check(uint256,address,string,address)🇼">check(uint256,address,string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 核销权益卡
- selector: 0x1812c00a
- 版本更新: 
### 参数
- **[uint256] tokenId**: 卡号
- **[address] _ticket**: 某张门票的地址
- **[string] _right**: 权益/打卡点（字符串）
- **[address] _who**: 权益卡持有人地址
- 备注: 
## ⁸ <b id="check(uint256,address,string,uint256,string,address)🇼">check(uint256,address,string,uint256,string,address)🇼</b>[^2]  [🔙](#home)
- **描述**: 预约核销卡权益
- selector: 0x9b5414f2
- 版本更新: 
### 参数
- **[uint256] tokenId**: 卡号
- **[address] _ticket**: 某张门票的地址
- **[string] _right**: 权益/打卡点（字符串）
- **[uint256] _time**: 预约时间
- **[string] _code**: 核销码
- **[address] _who**: 益卡持有人地址
- 备注: 
## ⁹ <b id="claim(address,uint256)🇼">claim(address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 活动（免费）领取
- selector: 0xaad3ec96
- 版本更新: 
### 参数
- [address] _to: 
- [uint256] tokenId: 
- 备注: 
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
## ¹⁷ <b id="getStatus(uint256,address,uint8)🇷">getStatus(uint256,address,uint8)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x2f2885f4
- 版本更新: 
### 参数
- [uint256] tokenId: 
- [address] _ticket: 
- [uint8] rightId: 
### 返回值
- [uint8] : 
- [uint256] : 
- 备注: 
## ¹⁸ <b id="init(string[],address[],uint8,uint256,uint256)🇼">init(string[],address[],uint8,uint256,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 初始化
- selector: 0xe5a0d3c0
- 版本更新: 
### 参数
- **[string[]] _info**: 包含5个字符串：名称，描述，图片地址，额外图片如3D地址，详情页地址（5个字符串）
- **[address[]] _tickets**: 门票地址（多个）
- **[uint8] _limit**: 最多可以使用的门票数量（0表示不限制）
- **[uint256] _startTime**: 有效时间
- **[uint256] _validTime**: 过期时间
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
- **描述**: 发行权益卡
- selector: 0x40c10f19
- 版本更新: 
### 参数
- **[address] _to**: 给某人
- **[uint256] tokenId**: 卡号
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
## ²⁵ <b id="refund(uint256)🇼">refund(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x278ecde1
- 版本更新: 
### 参数
- [uint256] tokenId: 
- 备注: 
## ²⁶ <b id="removeBank(uint256)🇼">removeBank(uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x3ad3bfa8
- 版本更新: 
### 参数
- [uint256] _amount: 
- 备注: 
## ²⁷ <b id="removeOperator(address)🇼">removeOperator(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xac8a584a
- 版本更新: 
### 参数
- [address] _operator: 
- 备注: 
## ²⁸ <b id="renounceOwnership()🇼">renounceOwnership()🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x715018a6
- 版本更新: 
- 备注: 
## ²⁹ <b id="safeTransferFrom(address,address,uint256)🇼">safeTransferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- **描述**: 转增权益卡
- selector: 0x42842e0e
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ³⁰ <b id="safeTransferFrom(address,address,uint256,bytes)🇼">safeTransferFrom(address,address,uint256,bytes)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xb88d4fde
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- [bytes] data: 
- 备注: 
## ³¹ <b id="setApprovalForAll(address,bool)🇼">setApprovalForAll(address,bool)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xa22cb465
- 版本更新: 
### 参数
- [address] operator: 
- [bool] approved: 
- 备注: 
## ³² <b id="setQuota(address,uint256)🇼">setQuota(address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x03ce3355
- 版本更新: 
### 参数
- [address] _operator: 
- [uint256] _quota: 
- 备注: 
## ³³ <b id="setTreadstone(address)🇼">setTreadstone(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xfc780816
- 版本更新: 
### 参数
- [address] _treadstone: 
- 备注: 
## ³⁴ <b id="supportsInterface(bytes4)🇷">supportsInterface(bytes4)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x01ffc9a7
- 版本更新: 
### 参数
- [bytes4] interfaceId: 
### 返回值
- [bool] : 
- 备注: 
## ³⁵ <b id="symbol()🇷">symbol()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x95d89b41
- 版本更新: 
### 返回值
- [string] : 
- 备注: 
## ³⁶ <b id="tokenByIndex(uint256)🇷">tokenByIndex(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x4f6ccce7
- 版本更新: 
### 参数
- [uint256] index: 
### 返回值
- [uint256] : 
- 备注: 
## ³⁷ <b id="tokenOfOwnerByIndex(address,uint256)🇷">tokenOfOwnerByIndex(address,uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x2f745c59
- 版本更新: 
### 参数
- [address] owner: 
- [uint256] index: 
### 返回值
- [uint256] : 
- 备注: 
## ³⁸ <b id="tokenURI(uint256)🇷">tokenURI(uint256)🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0xc87b56dd
- 版本更新: 
### 参数
- [uint256] tokenId: 
### 返回值
- [string] : 
- 备注: 
## ³⁹ <b id="tokens(uint256,uint256)🇷">tokens(uint256,uint256)🇷</b>[^1]  [🔙](#home)
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
## ⁴⁰ <b id="tokensOf(address,uint256,uint256)🇷">tokensOf(address,uint256,uint256)🇷</b>[^1]  [🔙](#home)
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
## ⁴¹ <b id="totalBank()🇷">totalBank()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x22457b02
- 版本更新: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴² <b id="totalSupply()🇷">totalSupply()🇷</b>[^1]  [🔙](#home)
- 描述: 
- selector: 0x18160ddd
- 版本更新: 
### 返回值
- [uint256] : 
- 备注: 
## ⁴³ <b id="transfer(address,address,uint256)🇼">transfer(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xbeabacc8
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ⁴⁴ <b id="transferFrom(address,address,uint256)🇼">transferFrom(address,address,uint256)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0x23b872dd
- 版本更新: 
### 参数
- [address] from: 
- [address] to: 
- [uint256] tokenId: 
- 备注: 
## ⁴⁵ <b id="transferOwnership(address)🇼">transferOwnership(address)🇼</b>[^2]  [🔙](#home)
- 描述: 
- selector: 0xf2fde38b
- 版本更新: 
### 参数
- [address] newOwner: 
- 备注: 
# <b id="sample">示例 🌰</b>
```json
 {
    "name": "十一特惠卡",
    "description": "中青文旅特别款，仅限学生用户",
    "details": "detailsURI",
    "image": "https://cctv2024.oss-cn-beijing.aliyuncs.com/gugong.png",
    "extURI": "https://isotop.oss-cn-shanghai.aliyuncs.com/20240102/2f0c555cd605483b9edd679f4e9d6d27.html",
    "designer": "isotop.top",
    "attributes": [
        {
            "trait_type": "有效期",
            "value": "2024/10/26 - 2024/12/31"
        },
        {
            "trait_type": "包含门票",
            "value": "2"
        },
        {
            "trait_type": "可用门票",
            "value": "0"
        },
        {
            "trait_type": "0:漫葡·看见贺兰沉浸式演艺小镇",
            "value": "已预约未到时间:1735516800"
        },
        {
            "trait_type": "1:故宫博物院",
            "value": "未预约"
        }
    ]
}
```
___
*[🔙](#home) <b id="end">updated</b>: 2024-10-06 01:54:12          i̧͎̩̦̯͓͓͔̯̦̭s͖̰̫͈̬͕̱̠͜o̖̗̩̬̥͖͕̝͢t̢͖̤̙̲o̪͉͕̲͔͉͈̥͕͜p̘̞͎̪̩̤͓͢*

[^1]: 🇷读方法是同步操作，可以直接得到返回值，不消耗GAS费用。
[^2]: 🇼写方法是异步操作，需要消耗GAS费用，一般没有返回值，需要通过交易hash查询链上是否成功。
