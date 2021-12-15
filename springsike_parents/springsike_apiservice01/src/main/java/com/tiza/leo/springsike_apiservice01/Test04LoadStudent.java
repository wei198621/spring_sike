package com.tiza.leo.springsike_apiservice01;

import com.tiza.leo.springsike_apiservice01.beanStudent.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author leowei
 * @date 2021/12/16  - 0:26
 */
public class Test04LoadStudent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        StudentService studentService = (StudentService)context.getBean("studentService");
        System.out.println(studentService.getName());
    }
}
