package com.huluwa.exception;

/**
 * 全局异常类
 *
 * @Author wuwenjie
 * @Date 2019/7/28 16:49
 * @Version 1.0
 **/
public class GlobalException extends RuntimeException {

    private int code;

    public GlobalException(String message) {
        super(message);
    }

    public GlobalException(String message, int code) {
        super(message);
        this.code = code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
