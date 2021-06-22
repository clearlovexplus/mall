package com.gupaoedu.mall.util;

import java.io.Serializable;

/**
 * @author zhouzhen
 * @description 消息返回封装类
 * @date 2021/6/22
 */
public class RespResult<T> implements Serializable {

    /**
     * 响应数据结果集
     */
    private T data;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String message;

    public RespResult() {
    }

    public RespResult(RespCode respCode) {
        this.code = respCode.getCode();
        this.message = respCode.getMessage();
    }

    public RespResult(T data , RespCode respCode){
        this.data = data;
        this.code = respCode.getCode();
        this.message = respCode.getMessage();
    }

    public static RespResult ok(){
        return new RespResult(null,RespCode.SUCCESS);
    }

    public static RespResult ok(Object data){
        return new RespResult(data,RespCode.SUCCESS);
    }

    public static RespResult error(){
        return new RespResult(null,RespCode.Error);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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
