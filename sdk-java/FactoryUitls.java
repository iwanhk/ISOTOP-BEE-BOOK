package com.isotop.demo.utils;

import com.alibaba.fastjson.JSONObject;
import com.isotop.demo.config.constant.ApiConstant;
import conflux.web3j.types.AddressType;
import org.web3j.abi.DefaultFunctionEncoder;
import org.web3j.abi.DefaultFunctionReturnDecoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;

import java.math.BigInteger;
import java.util.*;

/**
 * 该工具类
 *
 * 利用工厂的形式,创建出自己的合约,以及合约初始化(创建nft的具体内容,比如图片,文字等)
 *
 * @author Nathan
 * create by wjk on 2023/4/13
 */
public class FactoryUitls {


    public void factory() {
        /**
         * 第一步 deployContract  入参字符串, 对应的合约编码***********************************************************************************
         */
        Map<String, String> params = new HashMap<>();
        Utf8String s = new Utf8String("ISOTOP1040");
        Function f1 = new Function(
                "deployContract",
                Arrays.asList(s),
                Collections.emptyList()
        );
        String abiEncodedData = DefaultFunctionEncoder.encode(f1);
        params.put("data", abiEncodedData);
        //链id
        params.put("chainid", "1");
        //文档里的 Factory的合约地址
        params.put("contract", "cfxtest:aceavfyk8bn9fd992as1zf8jyev6tvc192tdk8tgtm");
        //准备管理员的手机号(该手机尽量是从api创建用户生成的,如果不是调用私钥importAddress导入到api中)
        params.put("id", "");
        //管理员的账户地址
        params.put("fromAddress", "");
        //头部
        //调用writeCall接口
        Map<String, String> headerMap = OpenApiUtils.makeHeaders(params);
        String postResult = OpenApiUtils.postRequest(ApiConstant.WRITECALL, headerMap, params);
        JSONObject jsonObjectErrcode = JSONObject.parseObject(postResult);
        // 状态码，0成功，其他失败
        if (Objects.nonNull(jsonObjectErrcode) && jsonObjectErrcode.containsKey("code")
                && "0".equals(jsonObjectErrcode.getString("code"))) {
            //{"success":true,"code":"0","data":"0x15980084aa584648298fdbae25157a9b6a29331a0a1403e8c7e62e7f256009c0"}
            String dataAsset = jsonObjectErrcode.getString("data");
        }
        /**
         * 第二步   获取最后一次的部署的合约地址******************************************************
         */
        Utf8String sGetLastDeployed = new Utf8String("ISOTOP1040");
        Function f1GetLastDeployed = new Function(
                "getLastDeployed",
                Arrays.asList(sGetLastDeployed),
                Collections.emptyList()
        );
        String abiEncodedDataGetLastDeployed = DefaultFunctionEncoder.encode(f1GetLastDeployed);

        Map<String, String> paramsGetLastDeployed = new HashMap<>();
        paramsGetLastDeployed.put("data", abiEncodedDataGetLastDeployed);
        //这些参数同上
        paramsGetLastDeployed.put("chainid", "1");
        paramsGetLastDeployed.put("contract", "cfxtest:aceavfyk8bn9fd992as1zf8jyev6tvc192tdk8tgtm");
        //管理员的手机号和地址
        paramsGetLastDeployed.put("id", "");
        paramsGetLastDeployed.put("fromAddress", "");

        //头部
        Map<String, String> headerMapGetLastDeployed = OpenApiUtils.makeHeaders(paramsGetLastDeployed);
        String postResultGetLastDeployed = OpenApiUtils.getRequest(ApiConstant.READCALL, headerMapGetLastDeployed, paramsGetLastDeployed);

        JSONObject jsonObjectErrcodeGetLastDeployed = JSONObject.parseObject(postResultGetLastDeployed);
        String contractAddress = null;
        // 状态码，0成功，其他失败
        if (Objects.nonNull(jsonObjectErrcodeGetLastDeployed) && jsonObjectErrcodeGetLastDeployed.containsKey("code")
                && "0".equals(jsonObjectErrcodeGetLastDeployed.getString("code"))) {
            //{"success":true,"code":"0","data":"0x3bdbaab6f5d1bc03389bd31a8a7db8d46f5ed1b73d6a732014ce9e9f6a85fc35"}
            //返回值,需要解码成合约地址
            String dataAsset = jsonObjectErrcodeGetLastDeployed.getString("data");
            TypeReference stringTypeReference = TypeReference.create(Address.class);
            // 使用  DefaultFunctionReturnDecoder 来解析 data,
            List<Type> list = DefaultFunctionReturnDecoder.decode(dataAsset, Arrays.asList(stringTypeReference));
            //这是编码后的
            contractAddress = (String) list.get(0).getValue();
            //如果是数图链,需要转为数图的地址 //1标识测试  1029 正式
            String hexAddress = AddressType.User.normalize(contractAddress);
            conflux.web3j.types.Address web3jAddress = new conflux.web3j.types.Address(hexAddress, 1);
            contractAddress = web3jAddress.getAddress();
        }
        /**
         * 第三部初始化合约************************************************
         */
        Map<String, String> paramsinit = new HashMap<>();
        Utf8String utf8String = new Utf8String("名字");
        Utf8String utf8String1 = new Utf8String("symbol_");
        Utf8String utf8String2 = new Utf8String("https://bafybeigtb3tt4a2eyurd4vk7jrjuiwnetufyfy7evmf4e2nwljatrcsdhq.ipfs.dweb.link/");
        Utf8String utf8String3 = new Utf8String("详情 放一个网址也行");
        Function f1Init = new Function(
                "init",
                Arrays.asList(utf8String, utf8String1, utf8String2, utf8String3),
                Collections.emptyList()
        );
        String abiEncodedInit = DefaultFunctionEncoder.encode(f1Init);
        paramsinit.put("data", abiEncodedInit);
        //这些参数同上
        paramsinit.put("chainid", "1");
        //这是自己的合约地址  从这一步开始 都要换成自己的合约地址
        paramsinit.put("contract", contractAddress);
        //管理员的手机号和地址
        paramsinit.put("id", "");
        paramsinit.put("fromAddress", "");
        //头部
        Map<String, String> headerMapInit = OpenApiUtils.makeHeaders(paramsinit);
        String postResultInit = OpenApiUtils.postRequest(ApiConstant.WRITECALL, headerMapInit, paramsinit);

        JSONObject jsonObjectErrcodeInit = JSONObject.parseObject(postResultInit);
        // 状态码，0成功，其他失败
        if (Objects.nonNull(jsonObjectErrcodeInit) && jsonObjectErrcodeInit.containsKey("code")
                && "0".equals(jsonObjectErrcodeInit.getString("code"))) {
            //{"success":true,"code":"0","data":"0x3bdbaab6f5d1bc03389bd31a8a7db8d46f5ed1b73d6a732014ce9e9f6a85fc35"}
            //返回值,需要解码成合约地址
            String dataAsset = jsonObjectErrcodeInit.getString("data");
        }
        /**
         * 开始给某人mint币   铸造 ***************************************************************
         */
        Uint256 a = new Uint256(BigInteger.valueOf(1)); // uint
        Address address = new Address(""); // address
        Function f1mint = new Function(
                "mint",
                Arrays.asList(address, a),
                Collections.emptyList()
        );
        String abiEncodedDataf1mint = DefaultFunctionEncoder.encode(f1mint);
        Map<String, String> paramsmint = new HashMap<>();
        paramsmint.put("data", abiEncodedDataf1mint);
        //自己的合约地址
        paramsmint.put("contract", contractAddress);
        //管理员的手机号和地址
        paramsmint.put("id", "");
        paramsmint.put("fromAddress", "");
        //头部
        Map<String, String> headerMapmint = OpenApiUtils.makeHeaders(paramsmint);
        String postResultmint = OpenApiUtils.postRequest(ApiConstant.WRITECALL, headerMapmint, paramsmint);
        //检查是否异常
        JSONObject jsonObjectErrcodemint = JSONObject.parseObject(postResultmint);
        if (jsonObjectErrcodemint.containsKey("code")) {
            String code = jsonObjectErrcodemint.getString("code");
            if ("0".equals(code)) {
                //交易Hash
                String hash = jsonObjectErrcodemint.getString("data");
            }
        }
    }

}
