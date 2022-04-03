package com.bjpowernode.mapper;

import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * ClassName:StudentMapper
 * Package:com.bjpowernode.mapper
 * Description: 描述信息
 *
 * @date:2022/2/23 4:20
 * @author:白白白
 */

public interface StudentMapper {

    List<Student> getAll();
    Student getStudentById(int id);
    int insertStudent(Student student);
}
