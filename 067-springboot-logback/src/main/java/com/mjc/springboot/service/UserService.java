package com.mjc.springboot.service;

import com.mjc.springboot.model.User;

/**
 * ClassName:UserService
 * Package:com.mjc.springboot.service
 * Description: 描述信息
 *
 * @date:2022/4/19 10:16
 * @author:白白白
 */
public interface UserService {

    User queryUserByLoginactAndLoginPwd(String loginAct,String loginPwd);


}
