package com.isotop.demo.bean.enums;

/**
 * <p>
 * 服务端响应结果码
 * </p>
 *
 * @author Nathan
 * @since 2019-12-25
 */
public enum CodeEnum {

    /**
     * 系统用
     */
    SUCCESS(0, "成功", "保存しました"),
    FAIL(-1, "失败", "失敗しました");

    private int code;
    private String message;
    private String jpMessage;

    private CodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
        this.message = message;
    }

    private CodeEnum(int code, String message, String jpMessage) {
        this.code = code;
        this.message = message;
        this.jpMessage = jpMessage;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getJpMessage() {
        return jpMessage;
    }

    public void setJpMessage(String jpMessage) {
        this.jpMessage = jpMessage;
    }
}