package com.huluwa.service.impl;

import com.huluwa.common.EncryptionAndDecryptUtil;
import com.huluwa.exception.Result;
import com.huluwa.exception.ServiceException;
import com.huluwa.mapper.UserMapper;
import com.huluwa.model.entity.User;
import com.huluwa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author wuwenjie
 * @Date 2019/7/28 16:02
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void register(User user) {
        // 前端做了非空校验
        String name = user.getName();
        User userField = userMapper.getUserByName(name);
        if (userField != null) {
            throw new ServiceException("该用户已存在", Result.ErrorCode.USER_ALREADY_EXIST.getCode());
        }
        // 密码加密
       String password = EncryptionAndDecryptUtil.Encryption(user.getPassword());
        user.setPassword(password);
        userMapper.register(user);
    }
}
