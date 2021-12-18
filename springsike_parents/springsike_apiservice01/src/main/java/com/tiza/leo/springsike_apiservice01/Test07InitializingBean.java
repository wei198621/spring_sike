package com.tiza.leo.springsike_apiservice01;

import com.tiza.leo.springsike_apiservice01.beanPostProcessor.BeanPostProcessorTest;
import com.tiza.leo.springsike_apiservice01.initializingBean.InitializingBean2Test;
import com.tiza.leo.springsike_apiservice01.initializingBean.initializingBeanTest;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author leowei
 * @date 2021/12/18  - 22:04
 */
public class Test07InitializingBean {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("bean.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        initializingBeanTest test = (initializingBeanTest) factory.getBean("initializingBeanTest");
        System.out.println("name:"+ test.getName());

        InitializingBean2Test test2 = (InitializingBean2Test) factory.getBean("initializingBean2Test");
        System.out.println("name:"+ test2.getName());
    }
}
