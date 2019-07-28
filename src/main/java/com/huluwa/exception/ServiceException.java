package com.huluwa.exception;

/**
 * 服务异常类
 *
 * @Author wuwenjie
 * @Date 2019/7/28 16:53
 * @Version 1.0
 **/
public class ServiceException extends GlobalException {

    public ServiceException(String message, int code) {
        super(message, code);
    }
}
