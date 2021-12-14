package com.tiza.leo.springsike_apiservice01;

import com.tiza.leo.springsike_apiservice01.beanReplace.Method;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author leowei
 * @date 2021/12/15  - 0:58
 */
public class Test03Replace {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        Method method = (Method) context.getBean("method");
        method.display();
    }
}
