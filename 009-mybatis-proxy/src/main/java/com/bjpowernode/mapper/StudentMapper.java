package com.bjpowernode.mapper;

import com.bjpowernode.domain.MyStudent;
import com.bjpowernode.domain.Student;
import com.bjpowernode.vo.QueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:StudentMapper
 * Package:com.bjpowernode.mapper
 * Description: 描述信息
 *
 * @date:2022/2/23 17:42
 * @author:白白白
 */
public interface StudentMapper {
    List<Student> getAll();
    Student getStudentById(@Param("id") int id);


    /**
     *多个参数: 命名参数，在形参定义的前面加入@Param("自定义参数")
     */
    List<Student> selectMultiParam(@Param("myName") String name,
                                   @Param("myAge") int age);


    /**
     * 多个参数，使用java对象作为接口中方法的参数
     */
    List<Student> selectMultiParamByQueryParam(QueryParam queryParam);


    /**
     * 多个参数，使用map作为接口中方法的参数
     */
    List<Student> selectMultiParamByMap(Map<String,Object> map);


    /**
     * 使用resultMap定义映射关系
     */

    List<Student> selectAllStudentByResultMap();


    List<MyStudent> selectAllStudentByResultMap2();
    List<MyStudent> selectAllStudentByAs();


    List<Student> selectLikeStuOne(String name);
    List<Student> selectLikeStuOne2(String name);




    List<Student> selectStudentIf(Student student);
    List<Student> selectStudentWhere(Student student);

    List<Student> selectStudentForeach(List list);

    List<Student> selectStudentForeach2(List<Student> list);






}
