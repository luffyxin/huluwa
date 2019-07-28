package com.huluwa.exception;

/**
 * @Author wuwenjie
 * @Date 2019/7/28 16:46
 * @Version 1.0
 **/
public class Result {
    /**
     * 错误内容
     */
    private String error;

    /**
     * 自定义错误码
     */
    private int code;


    public Result(String error, int code) {
        this.error = error;
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public enum ErrorCode {
        /**
         * 用户不存在
         */
        USER_NOT_FOUND(40401),

        /**
         * 用户已存在
         */
        USER_ALREADY_EXIST(40001),

        /**
         * 姓名不能为空
         */
        USER_NOT_NULL(40422);

        private int code;

        public int getCode() {
            return code;
        }

        ErrorCode(int code) {
            this.code = code;
        }
    }
}
