// SPDX-License-Identifier: MIT
// IISOTOP version 0.10
// Creator: Dr. Zu team

pragma solidity ^0.8.4;

/**
 * @dev Interface of ISOTOP1012： 增加可租用功能

主要功能：
*） 给NFT加持内容：setBaseURI
*） 铸造NFT：mint
*） 安全铸造NFT（检查是否可以被合约地址拥有）：safeMint
*） 租借：setUser
*） 检查租借用户，有效期： userOf
*） 销毁：burn
*） 可查询接口：tokenByIndex, tokenOfOwnerByIndex
*） 转移：transferFrom

设计要点：
1） 增加可租用功能
2)  其它功能完全兼容ISOTOP1010
3） 兼容ERC721， ERC4907

 */

import "./IISOTOP1010.sol";
import "../contracts/ERC721A/extensions/IERC4907A.sol";

interface IISOTOP1012 is IISOTOP1010, IERC4907A {}
