package com.isotop.demo.config.constant;

/**
 * @author Nathan
 * create by wjk on 2023/3/20
 */
public class ApiConstant {
    //创建账户  POST
    public static final String CREATE = "https://www.isotop.top/chain-api/api/v1/chain/create";
    //查询⽤户在链上账户地址 GET
    public static final String QUERYUSER = "https://www.isotop.top/chain-api/api/v1/chain/queryUser";
    //查询⽤户链上资产 GET
    public static final String QUERYASSET = "https://www.isotop.top/chain-api/api/v1/chain/queryAsset";
    //查询合约地址接⼝是否⽀持某个标准 GET
    public static final String SUPPORTSINTERFACE = "https://www.isotop.top/chain-api/api/v1/chain/supportsInterface";
    //动态写⼊合约⽅法 POST
    public static final String WRITECALL = "https://www.isotop.top/chain-api/api/v1/chain/writeCall";
    //动态读取合约⽅法 POST
    public static final String READCALL = "https://www.isotop.top/chain-api/api/v1/chain/readCall";
    //⽤户导⼊地址 POST
    public static final String IMPORTADDRESS = "https://www.isotop.top/chain-api/api/v1/chain/importAddress";
    //根据交易Hash查询交易信息
    public static final String GETTRANSACTIONBYHASH = "https://www.isotop.top/chain-api/api/v1/chain/getTransactionByHash";
    //导出私钥 get
    public static final String EXPORTADDRESS = "https://www.isotop.top/chain-api/api/v1/chain/exportAddress";


    //创建账户  POST
    // public static final String CREATE = "https://tjtest.pugongyinghulian.com/chain-api/api/v1/chain/create";
    // //查询⽤户在链上账户地址 GET
    // public static final String QUERYUSER = "https://tjtest.pugongyinghulian.com/chain-api/api/v1/chain/queryUser";
    // //查询⽤户链上资产 GET
    // public static final String QUERYASSET = "https://tjtest.pugongyinghulian.com/chain-api/api/v1/chain/queryAsset";
    // //查询合约地址接⼝是否⽀持某个标准 GET
    // public static final String SUPPORTSINTERFACE = "https://tjtest.pugongyinghulian.com/chain-api/api/v1/chain/supportsInterface";
    // //动态写⼊合约⽅法 POST
    // public static final String writecall = "https://tjtest.pugongyinghulian.com/chain-api/api/v1/chain/writeCall";
    // //动态读取合约⽅法 POST
    // public static final String READCALL = "https://tjtest.pugongyinghulian.com/chain-api/api/v1/chain/readCall";

}
