package com.bjpowernode.controller;
import com.bjpowernode.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:IndexController
 * Package:com.bjpowernode.controller
 * Description: 描述信息
 *
 * @date:2022/3/1 4:18
 * @author:白白白
 */
@Controller
public class IndexController {

    @RequestMapping("/test/index")
    public ModelAndView indexView(){
        ModelAndView modelAndView = new ModelAndView();
        //添加数据
        modelAndView.addObject("msg","接收modelanview");
        modelAndView.addObject("fun","执行操作");

        //指定视图，指定视图路径跳转的
        modelAndView.setViewName("show");

        return modelAndView;
    }


    /**
     * 接收请求参数：
     *      处理器的形参名和请求的参数名必须一致，
     *      会对应的赋值
     *
     *      框架接收参数步骤:
     *                     1.使用request对象接收参数
     *                     2.springmvc框架通过dispacherservlet 调用controller方法
     *                     调用方法时，按照名称对应，把接受的参数赋值给对应的形参
     *                     框架会提供类型转换功能 把对应的参数类型转换给形参
     *
     *
     * 注意：用户输入地址只能访问到controller上面的，不能直接访问页面。
     *
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/test/index2")
    public ModelAndView indexView2(String name,String age){
        ModelAndView modelAndView = new ModelAndView();
        //添加数据
        modelAndView.addObject("name",name);
        modelAndView.addObject("age",age);

        //指定视图，指定视图路径跳转的
        modelAndView.setViewName("showStudent");

        return modelAndView;
    }


    /**
     * 处理形参和轻请求的参数名不一样
     * @requestParam():解决请求中参数和形参名称不一样
     *     属性:1.value 请求中的参数名称
     *          2.required 默认true
     *          请求必须包含参数
     *          false:参数有也可以没有
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/test/index3")
    public ModelAndView indexView3(@RequestParam("rname") String name,
                                   @RequestParam("rage") String age){
        ModelAndView modelAndView = new ModelAndView();
        //添加数据
        modelAndView.addObject("name",name);
        modelAndView.addObject("age",age);

        //指定视图，指定视图路径跳转的
        modelAndView.setViewName("showStudent");

        return modelAndView;
    }


    /**
     * 处理器方法的形参是对象时，对象的属性要与请求的参数名称一致。
     * 框架会自动给形参赋值，调用set()方法
     * @param student
     * @return
     */
    @RequestMapping("/test/index4")
    public ModelAndView indexView4(Student student){
        ModelAndView modelAndView = new ModelAndView();
        //添加数据
        modelAndView.addObject("name",student.getName());
        modelAndView.addObject("age",student.getAge());
        modelAndView.addObject("student",student);
        //指定视图，指定视图路径跳转的
        modelAndView.setViewName("showStudent");

        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("/test/index5")
    public List<Student> indexView5(){

        ArrayList<Student> list = new ArrayList<>();

        Student student = new Student();
        student.setName("李四");
        student.setAge(20);

        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(15);

        list.add(student);
        list.add(student1);
        return list;
    }

    @ResponseBody
    @RequestMapping("ajaxdo1")
    public Student indexView6(String name,int age){

        Student student = new Student();
        student.setName("mjc");
        student.setAge(12);
        return student;
    }


}
