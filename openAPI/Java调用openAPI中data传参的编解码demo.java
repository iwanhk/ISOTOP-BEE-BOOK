package com.dandelion.did.utils;

import org.web3j.abi.DefaultFunctionEncoder;
import org.web3j.abi.DefaultFunctionReturnDecoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Nathan
 * create by wjk on 2023/3/29
 * <p>
 * 更加详细文档请参考 https://github.com/conflux-fans/crypto-knowledge/blob/main/blogs/java-sdk-abi-encode.md
 */
public class AbiUtils {

    /**
     * 转树图链的cfx地址
     *
     * @param address
     * @return
     */
    private static String conversCFX(String address, int chainId) {
        //1标识测试  1029 正式
        conflux.web3j.types.Address web3jAddress = new conflux.web3j.types.Address(conflux.web3j.types.Address.decode(address), chainId);
        System.out.println(web3jAddress.getAddress());
        return web3jAddress.getAddress();
    }

    /**
     * 树图链的cfx地址转0x地址
     *
     * @param address
     * @return
     */
    static String CFXConverHexAddress(String address, int chainId) {
        conflux.web3j.types.Address web3jAddress = new conflux.web3j.types.Address(conflux.web3j.types.Address.decode(address), chainId);
        System.out.println(web3jAddress.getHexAddress());
        return web3jAddress.getHexAddress();
    }

    public static String ABIEncoder() {
        Uint256 uint256 = new Uint256(BigInteger.valueOf(2));// uint
        Uint256 uint2561 = new Uint256(BigInteger.valueOf(1));// uint
        Uint8 uint8 = new Uint8(0);

        Utf8String utf8String = new Utf8String("vip8.id");
        // Utf8String utf8String1 = new Utf8String("1");
        // Utf8String utf8String2 = new Utf8String("https://bafybeigtb3tt4a2eyurd4vk7jrjuiwnetufyfy7evmf4e2nwljatrcsdhq.ipfs.dweb.link/");
        // Utf8String utf8String3 = new Utf8String("2");
        Address address = new Address("0x44028DA500C013DD54e1E0bEeDC839317799B174"); // address
        // Address address1 = new Address("0x8F03f1a3f10c05E7CCcF75C1Fd10168e06659Be7"); // address
        Utf8String s = new Utf8String("1231231.did");
        Function f1 = new Function(
                "addAddress",
                Arrays.asList(s,address),
                Collections.emptyList()
        );
        String abiEncodedData = DefaultFunctionEncoder.encode(f1);
        System.out.println("abiEncodedData: " + abiEncodedData);
        return abiEncodedData;
    }

    static void decodeResult() throws ParseException {
        //地址列表
        // String helloWorldData = "0x00000000000000000000000000000000000000000000000000000000000000200000000000000000000000000000000000000000000000000000000000000006000000000000000000000000861c5c854148140f25a881c160ca41580777202400000000000000000000000081be74d05a2414f11b639dc4c77d8129bbc4827400000000000000000000000082e01925e5eafe15261402ea3f73a85b27a353bf0000000000000000000000008f82109b7c875e89d96ee4464ac6a98dd32fe144000000000000000000000000851f6283d59baefd6630d1bca4c7ebcf6cca516a0000000000000000000000008dad2fa9297b670cecc833bc58decbab7d223d1a";
        // //地址
        // String helloWorldData1 = "0x00000000000000000000000044028da500c013dd54e1e0beedc839317799b174";
        //   TypeReference stringTypeReference = TypeReference.create(Utf8String.class);
        // TypeReference stringTypeReference = TypeReference.create(Address.class);
        // // 使用  DefaultFunctionReturnDecoder 来解析 data,
        // List<Type> list = DefaultFunctionReturnDecoder.decode(helloWorldData, Arrays.asList(stringTypeReference));
        // System.out.println(list.get(0).getValue());
        // String helloWorldData = "0x0000000000000000000000000000000000000000000000000000000000000020000000000000000000000000000000000000000000000000000000000000005b68747470733a2f2f73332e636e2d6e6f7274682d312e616d617a6f6e6177732e636f6d2e636e2f66696c652e69736f746f702e746f702f32303233303732362f313639303334383133353532325f3739362e6a7067302e6a736f6e0000000000";
        String helloWorldData = "0x0000000000000000000000000000000000000000000000000000000000000000";
        TypeReference stringTypeReference = TypeReference.create(Uint256.class);
        // 使用  DefaultFunctionReturnDecoder 来解析 data,
        List<Type> list = DefaultFunctionReturnDecoder.decode(helloWorldData, Arrays.asList(stringTypeReference));
        System.out.println(list.get(0).getValue());
    }


    public static void main(String[] args) throws ParseException {
         AbiUtils.ABIEncoder();
        // decodeResult();
        //  String s = conversCFX("", 1);
        // String s1 = CFXConverHexAddress("cfxtest:aatjxvrdy8hvvn188pb5zvmfj06z6nuau2st72rw08", 1);
    }


}
