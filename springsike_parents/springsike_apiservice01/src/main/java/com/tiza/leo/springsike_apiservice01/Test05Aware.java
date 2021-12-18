package com.tiza.leo.springsike_apiservice01;

import com.tiza.leo.springsike_apiservice01.aware.MyApplicationAware;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author leowei
 * @date 2021/12/18  - 21:01
 */
public class Test05Aware {
    public static void main(String[] args) {
        test01();

        //test02();
    }

    private static void test02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        MyApplicationAware myApplicationAware = (MyApplicationAware)context.getBean("myApplicationAware");
        myApplicationAware.display();
    }

    private static void test01() {
        ClassPathResource resource = new ClassPathResource("bean.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        MyApplicationAware applicationAware = (MyApplicationAware)factory.getBean("myApplicationAware");
        applicationAware.display();
    }
}
