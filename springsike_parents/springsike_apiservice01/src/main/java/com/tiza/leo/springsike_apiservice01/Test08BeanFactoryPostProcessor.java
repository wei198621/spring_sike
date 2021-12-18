package com.tiza.leo.springsike_apiservice01;

import com.tiza.leo.springsike_apiservice01.beanFactoryPostProcessor.StudentService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author leowei
 * @date 2021/12/18  - 23:01
 */
public class Test08BeanFactoryPostProcessor {
    public static void main(String[] args) {
        //testBeanFactoryPostProcessor();
        //test02PropertySourcesPlaceholderConfigurer();
        test03PropertyOverrideConfigurer();
    }

    private static void test03PropertyOverrideConfigurer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        StudentService2 studentService = (StudentService2) context.getBean("student");
        System.out.println("student name:" + studentService.getName());
    }

    private static void test02PropertySourcesPlaceholderConfigurer() {
        test03PropertyOverrideConfigurer();
    }

    private static void testBeanFactoryPostProcessor() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        StudentService2 studentService = (StudentService2)context.getBean("studentService2");
        System.out.println("student name:" + studentService.getName() + "-- age:" + studentService.getAge());
    }
}
