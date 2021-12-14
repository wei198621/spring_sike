package com.tiza.leo.springsike_apiservice01;


import com.tiza.leo.springsike_apiservice01.beanCar.Display;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author leowei
 * @date 2021/12/15  - 0:32
 */
public class Test02LookUpMethod {




    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Display display = (Display) context.getBean("display");
        display.display();
    }

}
