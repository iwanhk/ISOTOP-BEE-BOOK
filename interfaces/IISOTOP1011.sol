// SPDX-License-Identifier: MIT
// IISOTOP version 0.10
// Creator: Dr. Zu team

pragma solidity ^0.8.4;

/**
 * @dev Interface of ISOTOP1011: 增加可销毁接口

主要功能：
*） 给NFT加持内容：setBaseURI
*） 铸造NFT：mint
*） 安全铸造NFT（检查是否可以被合约地址拥有）：safeMint
*） 销毁：burn
*） 可查询接口：tokenByIndex, tokenOfOwnerByIndex
*） 转移：transferFrom

功能要点：
1） 相比ISOTOP1010增加销毁功能  
2） 其它功能完全兼容ISOTOP1010
3） 完全兼容ERC721

 */

import "../contracts/ERC721A/extensions/IERC721ABurnable.sol";
import "./IISOTOP1010.sol";

interface IISOTOP1011 is IISOTOP1010, IERC721ABurnable {}
