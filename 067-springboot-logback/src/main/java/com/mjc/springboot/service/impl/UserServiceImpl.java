package com.mjc.springboot.service.impl;

import com.mjc.springboot.mapper.UserMapper;
import com.mjc.springboot.model.User;
import com.mjc.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package:com.mjc.springboot.service.impl
 * Description: 描述信息
 *
 * @date:2022/4/19 10:20
 * @author:白白白
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public User queryUserByLoginactAndLoginPwd(String loginAct, String loginPwd) {
        return userMapper.selectUserByloginActAndloginPwd(loginAct,loginPwd);
    }
}
