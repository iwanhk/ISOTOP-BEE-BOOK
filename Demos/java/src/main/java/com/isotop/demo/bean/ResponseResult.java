package com.isotop.demo.bean;

import com.isotop.demo.bean.enums.CodeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 服务端响应结果封装
 * </p>
 *
 * @author Nathan
 * @since 2019-12-25
 */
@Data
public class ResponseResult<T> {

    private static final long serialVersionUID = 8059551920157401674L;
    public static int PARAMETER_ERROR = -999;
    public static String PARAM_EMPTY = "参数不能为空";

    @ApiModelProperty(value = "错误码")
    private int code;
    @ApiModelProperty(value = "消息")
    private String msg;
    @ApiModelProperty(value = "对象")
    private T results;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }

    public ResponseResult() {
        super();
        this.code = CodeEnum.SUCCESS.getCode();
        this.msg = CodeEnum.SUCCESS.getMessage();
    }

    public ResponseResult(T object) {
        super();
        this.code = CodeEnum.SUCCESS.getCode();
        this.msg = CodeEnum.SUCCESS.getMessage();
        this.results = object;
    }

    public ResponseResult(int code, T object) {
        super();
        this.code = CodeEnum.FAIL.getCode();
        this.results = object;
    }

    public int setCodeEnum(CodeEnum codeEnum) {
        setCode(codeEnum.getCode());
        setMsg(codeEnum.getMessage());
        return 0;
    }

    public static ResponseResult success() {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCodeEnum(CodeEnum.SUCCESS);
        return responseResult;
    }

    public static ResponseResult fail() {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCodeEnum(CodeEnum.FAIL);
        return responseResult;
    }

    public static <T> ResponseResult setData(T results) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCodeEnum(CodeEnum.SUCCESS);
        responseResult.setResults(results);
        return responseResult;
    }

    public static <T> ResponseResult setDataNew(T results) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCodeEnum(CodeEnum.SUCCESS);
        responseResult.setResults(results);
        return responseResult;
    }

    public static ResponseResult codeEnum(CodeEnum codeEnum) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCodeEnum(codeEnum);
        return responseResult;
    }

}
