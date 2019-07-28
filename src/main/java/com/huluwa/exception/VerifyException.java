package com.huluwa.exception;

/**
 * 校验异常处理类
 *
 * @Author wuwenjie
 * @Date 2019/7/28 16:54
 * @Version 1.0
 **/
public class VerifyException extends GlobalException {

    public VerifyException(String message, int code) {
        super(message, code);
    }
}
