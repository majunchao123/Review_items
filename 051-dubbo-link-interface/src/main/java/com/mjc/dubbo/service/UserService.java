package com.mjc.dubbo.service;

import com.mjc.dubbo.model.User;

/**
 * ClassName:UserService
 * Package:com.mjc.dubbo.service
 * Description: 描述信息
 *
 * @date:2022/4/17 15:28
 * @author:白白白
 */
public interface UserService {
    User getUserById(Integer id);
}
