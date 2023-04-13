package com.example.utils;

import org.web3j.abi.DefaultFunctionEncoder;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.generated.Uint256;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

/**
 * 本文件是Java调用openAPI传参的打包方式demo
 * abi编码
 * maven方式导入:
 *
 * <dependency>
 * <groupId>org.web3j</groupId>
 * <artifactId>core</artifactId>
 * <version>4.5.5</version>
 * <scope>compile</scope>
 * </dependency>
 * <p>
 * 更加详细文档请参考 https://github.com/conflux-fans/crypto-knowledge/blob/main/blogs/java-sdk-abi-encode.md
 */
public class ABiEncode {

    public static void main(String[] args) {
        encode();
    }

    public static void encode() {
        Uint256 uint256 = new Uint256(BigInteger.valueOf(1)); // uint
        Address address = new Address("0x8F03f1a3f10c05E7CCcF75C1Fd10168e06659Be7"); // address
        Address address1 = new Address("0x8F03f1a3f10c05E7CCcF75C1Fd10168e06659Be7"); // address
        //具体方法名称和参数,需要参考合约的json文件,联系管理员获取
        Function f = new Function(
                //此处输入方法名称
                "balanceOf",
                //此处输入上面方法的参数,
                Arrays.asList(address, uint256),
                Collections.emptyList()
        );
        String abiEncodedData = DefaultFunctionEncoder.encode(f);
        System.out.println(abiEncodedData);
        // array encode
        // Address a1 = new Address("0x8F03f1a3f10c05E7CCcF75C1Fd10168e06659Be7");
        // Address a2 = new Address("0xab3B229eB4BcFF881275E7EA2F0FD24eeaC8C83a");
        // DynamicArray<Address> da = new DynamicArray<>(Address.class, Arrays.asList(a1, a2));
        // Function f = new Function(
        //         "isApprovedForAl",
        //         Arrays.asList(da),
        //         Collections.<TypeReference<?>>emptyList()
        // );
        // String abiEncodeAddressData = DefaultFunctionEncoder.encode(f);
        // System.out.println(abiEncodeAddressData);
    }
     static void decodeGreetingResult() {
        //字符串
        String helloWorldData = "0x0000000000000000000000007cf9adc8c5a88827eb57d4f7ac25debc6c8d586f";
        //地址
        String helloWorldData1 = "0x00000000000000000000000044028da500c013dd54e1e0beedc839317799b174";
        //   TypeReference stringTypeReference = TypeReference.create(Utf8String.class);
        TypeReference stringTypeReference = TypeReference.create(Address.class);
        // 使用  DefaultFunctionReturnDecoder 来解析 data,
        List<Type> list = DefaultFunctionReturnDecoder.decode(helloWorldData, Arrays.asList(stringTypeReference));
        System.out.println(list.get(0).getValue());
    }

    /**
     * 转树图链的cfx地址
     *
     * @param address
     * @return
     */
    static String converCFX(String address) {
        String hexAddress = AddressType.User.normalize(address);
        //测试链 第二个参数改为1
        conflux.web3j.types.Address web3jAddress = new conflux.web3j.types.Address(hexAddress, 1029);
        return web3jAddress.getAddress();
    }
}
