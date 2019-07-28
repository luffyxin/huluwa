package com.huluwa.mapper;

import com.huluwa.model.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 注册
     *
     * @param user 用户实体
     * @return
     */
    int register(@Param("user") User user);

    /**
     * 根据姓名查找用户
     *
     * @param name 用户实体
     * @return
     */
    User getUserByName(@Param("name") String name);
}
