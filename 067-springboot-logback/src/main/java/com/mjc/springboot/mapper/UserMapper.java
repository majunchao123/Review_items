package com.mjc.springboot.mapper;

import com.mjc.springboot.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectUserByloginActAndloginPwd(String loginAct, String loginPwd);
}