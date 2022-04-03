package com.bjpowernode.mapper;

import com.bjpowernode.beans.Student;

import java.util.List;

/**
 * ClassName:StuMapper
 * Package:com.bjpowernode.mapper
 * Description: 描述信息
 *
 * @date:2022/2/27 7:18
 * @author:白白白
 */
public interface StuMapper {
    int getAllCount();
    List<Student> getAll();
    int addStudent(Student student);

}
