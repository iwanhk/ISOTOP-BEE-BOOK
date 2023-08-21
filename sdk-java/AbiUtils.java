package com.isotop.demo.utils;

import org.web3j.abi.DefaultFunctionEncoder;
import org.web3j.abi.DefaultFunctionReturnDecoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 这是一些常用的工具
 * 比如转化数图的地址
 * abi编码
 * 解码api返回的数据
 *
 *
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

    /**
     * ABI编码工具
     *
     * @return
     */
    public static String ABIEncoder() {
        Uint256 uint256 = new Uint256(BigInteger.valueOf(0));// uint
        Uint256 uint2561 = new Uint256(BigInteger.valueOf(1));// uint

        Address address = new Address("0x11a1899de1f42d6e9fab2e09c8db45b9396eeb82"); // address
        Utf8String s = new Utf8String("a");
        Function f1 = new Function(
                "mint",
                Arrays.asList(address, uint256, uint2561),
                Collections.emptyList()
        );
        String abiEncodedData = DefaultFunctionEncoder.encode(f1);
        System.out.println("abiEncodedData: " + abiEncodedData);
        return abiEncodedData;
    }

    /**
     * 解析返回数据
     *
     * @throws ParseException
     */
    static void decodeResult() throws ParseException {
        //地址列表
        String helloWorldData = "0x00000000000000000000000000000000000000000000000000000000000000200000000000000000000000000000000000000000000000000000000000000111646174613a6170706c69636174696f6e2f6a736f6e3b6261736536342c65794a755957316c496a6f67496a497a4e44497a49434d7949697767496d526c63324e796158423061573975496a6f67496a497a4e44497a4e43497349434a706257466e5a53493649434a6f64485277637a6f764c334d7a4c6d4e754c573576636e526f4c54457559573168656d39755958647a4c6d4e766253356a6269396d6157786c4c6d686c65575a76627938794d44497a4d4459794e6938784e6a67334e7a63344d4451794f445534587a4d794d433571634763694c4341695a47567a615764755a5849694f69416961584e76644739774c6e52766343497349434a686448527961574a316447567a496a6f675858303d000000000000000000000000000000";
        TypeReference stringTypeReference = TypeReference.create(Utf8String.class);
        // 使用  DefaultFunctionReturnDecoder 来解析 data,
        List<Type> list = DefaultFunctionReturnDecoder.decode(helloWorldData, Arrays.asList(stringTypeReference));
        System.out.println(list.get(0).getValue());
    }


    public static void main(String[] args) throws ParseException {
        //  AbiUtils.ABIEncoder();
        //decodeResult();
        //  String s = conversCFX("", 1);
        // String s1 = CFXConverHexAddress("cfxtest:aatjxvrdy8hvvn188pb5zvmfj06z6nuau2st72rw08", 1);
    }


}
