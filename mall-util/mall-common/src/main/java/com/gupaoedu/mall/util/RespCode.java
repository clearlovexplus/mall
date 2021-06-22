package com.gupaoedu.mall.util;

/**
 * @author zhouzhen
 * @description 响应码封装类
 * @date 2021/6/22
 */
public enum RespCode {
    /**
     * 操作成功
     */
    SUCCESS(20000,"操作成功"),
    /**
     * 操作失败
     */
    Error(50000,"操作失败"),

    /**
     * 系统错误
     */
    SYSTEM_ERROR(50001,"系统错误");

    private Integer code;
    private String message;

    RespCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
