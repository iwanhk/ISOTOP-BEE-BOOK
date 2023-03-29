// SPDX-License-Identifier: MIT

pragma solidity ^0.8.4;

import "../contracts/ERC3525/interfaces/IERC3525.sol";
import "../contracts/ERC3525/interfaces/IERC3525Metadata.sol";
import "@openzeppelin/contracts/token/ERC721/extensions/IERC721Enumerable.sol";
import {IGasLoader, IDetails} from "./IISOTOP.sol";

// 管理员的用户标识
uint256 constant ADMIN_ID = type(uint256).max;

interface IISOTOP1021 is
    IERC3525,
    IERC3525Metadata,
    IERC721Enumerable,
    IGasLoader,
    IDetails
{
    // 初始化合约。名称，标识，基本URI，详情URI，总发行的积分数量
    function init(
        string memory name_,
        string memory symbol_,
        string memory base_,
        string memory details_,
        uint256 _totalPoints
    ) external;

    // 为编号为tokenId的会员卡充值_value
    function fill(uint256 tokenId, uint256 _value) external;

    function fill(address _to, uint256 _value, uint256 newId) external;

    // 消耗积分
    function consume(uint256 tokenId, uint256 _value) external;
}
