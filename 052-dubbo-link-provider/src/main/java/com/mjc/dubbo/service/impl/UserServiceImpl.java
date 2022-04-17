package com.mjc.dubbo.service.impl;

import com.mjc.dubbo.model.User;
import com.mjc.dubbo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package:com.mjc.dubbo.service.impl
 * Description: 描述信息
 *
 * @date:2022/4/17 15:29
 * @author:白白白
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("马俊超");
        user.setAge(15);
        return user;
    }
}
