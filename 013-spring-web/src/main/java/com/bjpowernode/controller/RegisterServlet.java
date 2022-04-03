package com.bjpowernode.controller;

import com.bjpowernode.beans.Student;
import com.bjpowernode.service.StuServices;
import com.bjpowernode.service.StuServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName:${NAME}
 * Package:${PACKAGE_NAME}
 * Description: 描述信息
 *
 * @date:2022/2/28 22:28
 * @author:白白白
 */
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      String name =  request.getParameter("name");
        String id = request.getParameter("id");
        String email = request.getParameter("email");
        String age = request.getParameter("age");


        String config = "applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
       StuServices stuServices= (StuServices)context.getBean("stuServicesImpl");

        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setAge(Integer.parseInt(age));
        student.setId(Integer.parseInt(id));
        stuServices.insertStudent(student);


        //页面成功跳转
        request.getRequestDispatcher("/result.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
