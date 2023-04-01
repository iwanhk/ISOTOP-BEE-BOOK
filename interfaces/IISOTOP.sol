// SPDX-License-Identifier: MIT
// IISOTOP version 0.10
// Creator: Dr. Zu team

pragma solidity ^0.8.13;

/// @title PLAN-BEE IISOTOP 扩展接口
/// @author Iwan Cao
/// @notice ISOTOP扩展的合约接口
/// @dev 钱包查看NFT时，应该检查SupportInterface 来确认是否具有扩展功能
/// @custom:planbee 这是一个PLAN-BEE计划认证的合约

/// @dev 0x80ac58cd, 0xc21b8f28, 0xad092b5c, 0x10f4a07c
/// @dev ERC721, ERC721A, ERC4907A, IDetails

/// @dev child contract MUST implement this interface
/// @dev transferOwnership should accept 0 as the previours owner

interface IsotopTemplate {
    function transferOwnership(address newOwner) external;

    function contractName() external returns (string memory);
}

interface IDetails {
    // interfaceID: 0x10f4a07c
    event detailsURIChanged(string uri);

    function Details() external view returns (string memory);

    function setDetailsURI(string memory uri_) external;
}

interface ITicket {
    function init(
        string memory name_,
        string memory symbol_,
        string memory base_,
        string memory details_,
        string[] memory sites_,
        string memory suffix_
    ) external;

    function addSites(string[] memory sites_) external;

    function check(uint256 tokenId, uint8 _site, address _who) external;

    function unCheck(uint256 tokenId, uint8 _site, address _who) external;
}

interface IMOAP {
    function assign(address _to, string memory _name) external;

    function addMark(address _from, string memory message) external;

    function getMemories() external view returns (string[] memory memo);

    function addMemmory(string memory memo) external;

    function mark(string memory message) external;
}
