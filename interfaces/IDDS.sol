// SPDX-License-Identifier: MIT
// IISOTOP version 0.10
// Creator: Dr. Zu team
pragma solidity ^0.8.4;

//  @title PLAN-BEE IDDS Domain Data System 域名数据系统
// @author Iwan Cao
// @notice 开放使用合约，任何人可以存储自己的数据
// @dev 每个domain可以存储一组key，每个key存储一个bytes数据. 默认的domain是公开的，任何人可读。如果需要私有化数据，选择DATATYPE 为PRIVATE。
// @dev 数据的拥有者才能更改数据，更改为bytes(0)意味着删除这个key.
// @dev 数据默认是msg.sender作为拥有者，如果需要个人账户tx.origin作为拥有者，请选择DATATYPE 为PERSONAL
// @custom:planbee 这是一个PLAN-BEE计划认证的合约

address constant DDS_ADDRESS = 0x1E68f6Aee73e3A8e4Cb09B035b9736Ad193c1001;

interface IDDS {
    enum DATATYPE {
        PUBLIC_CONTRACT,
        PUBLIC_PERSONAL,
        PRIVATE_CONTRACT,
        PRIVATE_PERSONAL
    }

    function put(
        string calldata _domain,
        string calldata _key,
        bytes calldata _data,
        DATATYPE _type
    ) external;

    function put(
        string calldata _domain,
        string calldata _key,
        bytes calldata _data
    ) external;

    function getOwner(string calldata _domain) external view returns (address);

    function get(
        string calldata _domain,
        string calldata _key
    ) external view returns (bytes memory);

    function get(
        string calldata _domain,
        string calldata _key,
        bool _personal
    ) external view returns (bytes memory);

    function getKeys(
        string calldata _domain
    ) external view returns (string[] memory);

    function getKeys(
        string calldata _domain,
        bool _personal
    ) external view returns (string[] memory);

    function setValue(
        string memory t,
        string memory p,
        string memory l
    ) external pure returns (string memory);

    function toAddress(bytes memory b) external pure returns (address addr);

    function toInt(bytes calldata b) external pure returns (uint256 value);

    function toBool(bytes calldata b) external pure returns (bool);
}
