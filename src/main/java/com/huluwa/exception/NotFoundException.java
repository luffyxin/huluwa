package com.huluwa.exception;

/**
 * 资源没找到异常类
 *
 * @Author wuwenjie
 * @Date 2019/7/28 16:51
 * @Version 1.0
 **/
public class NotFoundException extends GlobalException {

    public NotFoundException(String message, int code) {
        super(message, code);
    }
}
