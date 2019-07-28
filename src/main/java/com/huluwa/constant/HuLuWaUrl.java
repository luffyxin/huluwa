package com.huluwa.constant;

/**
 * 系统Url常量定义
 *
 * @author jack.wu
 * @date 2019/07/28
 */
public interface HuLuWaUrl {

    /**
     * 角色url
     */
    interface User {
        /**
         * 根路径
         */
        String ROOT = "/user";
        /**
         * 登陆Url
         */
        String LOGIN = "/login";
        /**
         * 退出登陆Url
         */
        String LOG_OUT = "/logout";
        /**
         * 注册Url
         */
        String REGISTER = "/register";
    }
}
