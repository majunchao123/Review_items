package com.bjpowernode.service;

import com.bjpowernode.beans.Student;

import java.util.List;

/**
 * ClassName:StuServices
 * Package:com.bjpowernode.service
 * Description: 描述信息
 *
 * @date:2022/2/27 7:21
 * @author:白白白
 */
public interface StuServices {
    int queryStuCount();
    List<Student> queryAllStudent();
    int insertStudent(Student student);
}
