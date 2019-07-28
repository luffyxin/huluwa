package com.huluwa.model.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wuwenjie
 * @Date 2019/7/28 15:20
 * @Version 1.0
 **/
@Data
public class User implements Serializable {
    /**
     * 用户Id
     */
    private Long id;
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 管理权限（0：没有权限；1：有权限）
     */
    private Integer permission;
}
