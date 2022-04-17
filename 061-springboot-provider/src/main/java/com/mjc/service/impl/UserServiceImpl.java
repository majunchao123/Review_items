package com.mjc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mjc.service.UserService;
import org.springframework.stereotype.Component;

/**
 * ClassName:UserServiceImpl
 * Package:com.mjc.service.impl
 * Description: 描述信息
 *
 * @date:2022/4/17 22:20
 * @author:白白白
 */
@Component
@Service(interfaceClass = UserService.class,version = "1.0.0",timeout = 15000)
public class UserServiceImpl implements UserService {
    @Override
    public Integer getAllUserCount() {
        return 888;
    }
}
