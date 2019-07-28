package com.huluwa.controller;

import com.huluwa.constant.HuLuWaUrl;
import com.huluwa.exception.ServiceException;
import com.huluwa.model.entity.User;
import com.huluwa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @Author wuwenjie
 * @Date 2019/7/28 15:09
 * @Version 1.0
 **/

@RestController
@RequestMapping(HuLuWaUrl.User.ROOT)
public class UserController {


    @Autowired
   private UserService userService;

//    /**
//     * 注册
//     *
//     * @param user
//     * @return
//     */
//    @ResponseStatus(code = HttpStatus.CREATED)
//    @PostMapping(HuLuWaUrl.User.REGISTER)
//    public String register(@RequestBody User user) {
//        userService.register(user);
//        return null;
//    }
}
