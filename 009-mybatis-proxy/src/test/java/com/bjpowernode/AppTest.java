package com.bjpowernode;
import com.bjpowernode.domain.MyStudent;
import com.bjpowernode.domain.Student;
import com.bjpowernode.mapper.StudentMapper;
import com.bjpowernode.util.MyBatisUtils;
import com.bjpowernode.vo.QueryParam;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test01() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<MyStudent> myStudents = mapper.selectAllStudentByAs();

        for (MyStudent s :
                myStudents) {
            System.out.println(s);
        }


    }

    @Test
    public void test02() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<MyStudent> all = studentMapper.selectAllStudentByResultMap2();
        for (MyStudent s :
                all) {
            System.out.println(s);
        }
    }

    @Test
    public void test03(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.getStudentById(1);
        System.out.println(student);

    }
    @Test
    public void test04(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        QueryParam queryParam = new QueryParam();
        queryParam.setParamName("张三");
        queryParam.setParamAge(15);
        List<Student> list = studentMapper.selectMultiParamByQueryParam(queryParam);
        for (Student s :
                list) {
            System.out.println("学生："+s);
        }


    }



    @Test
    public void test05(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        HashMap<String, Object> data = new HashMap<>();
        data.put("myName","关羽");
        data.put("myAge",15);

        List<Student> list =studentMapper.selectMultiParamByMap(data);
        for (Student s :
                list) {
            System.out.println("学生："+s);
        }


    }
    @Test
    public void test06() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);




        //第一种方式
        //String name = "%马%";
        String name = "马";
        List<Student> students = mapper.selectLikeStuOne2(name);
        for (Student s :
                students) {
            System.out.println(s);
        }


    }
    @Test
    public void test07() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        //student.setName("马超");
        student.setAge(20);
        List<Student> students = mapper.selectStudentWhere(student);
        for (Student s :
                students) {
            System.out.println(s);
        }
    }

    @Test
    public void test08() {
            SqlSession sqlSession = MyBatisUtils.getSqlSession();
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            ArrayList<Integer> list = new ArrayList<>();
            list.add(15);
            list.add(21);
            list.add(32);
        List<Student> students = mapper.selectStudentForeach(list);

        for (Student s :
                students) {
            System.out.println(s);
        }
    }
    @Test
    public void test09() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        ArrayList<Student> students1 = new ArrayList<>();
        Student s1 = new Student();
        s1.setAge(21);
        s1.setName("张三");
        Student s2 = new Student();
        s2.setAge(20);
        s2.setName("张三");
        Student s3 = new Student();
        s3.setAge(20);
        s3.setName("张三");

        students1.add(s1);
        students1.add(s2);
        students1.add(s3);

        List<Student> students = mapper.selectStudentForeach2(students1);

        for (Student s :
                students) {
            System.out.println(s);
        }
    }

    }




