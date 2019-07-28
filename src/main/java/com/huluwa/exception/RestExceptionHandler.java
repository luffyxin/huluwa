package com.huluwa.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author wuwenjie
 * @Date 2019/7/28 16:57
 * @Version 1.0
 **/
@ControllerAdvice
public class RestExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(value = NotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Result handleResourceNotFoundException(NotFoundException e) {
        logger.error(e.getMessage(), e);
        return new Result(e.getMessage(), e.getCode());
    }

    @ExceptionHandler(value = VerifyException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public Result handleVerifyException(VerifyException e) {
        logger.error(e.getMessage(), e);
        return new Result(e.getMessage(), e.getCode());
    }

    @ExceptionHandler(value = ServiceException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result handleServiceException(ServiceException e) {
        logger.error(e.getMessage(), e);
        return new Result(e.getMessage(), e.getCode());
    }
}
