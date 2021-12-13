package com.tiza.leo.springsike_apiservice01;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author leowei
 * @date 2021/12/13  - 23:01
 */
public class TestLoadBean {

    public static void main(String[] args) {
        ClassPathResource classPathResource = new ClassPathResource("bean.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(classPathResource);
    }
}
