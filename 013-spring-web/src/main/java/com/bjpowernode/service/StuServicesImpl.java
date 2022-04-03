package com.bjpowernode.service;

import com.bjpowernode.beans.Student;
import com.bjpowernode.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:StuServicesImpl
 * Package:com.bjpowernode.service
 * Description: 描述信息
 *
 * @date:2022/2/27 7:23
 * @author:白白白
 */

@Service
public class StuServicesImpl implements StuServices {
//    Autowired是默认自动注入
    @Autowired
    StuMapper stuMapper;

    @Override
    public int queryStuCount() {
        int allCount = stuMapper.getAllCount();

        return allCount;
    }

    @Override
    public List<Student> queryAllStudent() {
        return null;
    }

    @Override
    public int insertStudent(Student student) {
        int i = stuMapper.addStudent(student);
        return i;
    }
}
