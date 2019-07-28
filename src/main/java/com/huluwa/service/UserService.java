package com.huluwa.service;

import com.huluwa.exception.ServiceException;
import com.huluwa.model.entity.User;

public interface UserService {

    void register(User user);
}
