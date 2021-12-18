package com.tiza.leo.springsike_apiservice01;

import com.tiza.leo.springsike_apiservice01.beanPostProcessor.BeanPostProcessorTest;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author leowei
 * @date 2021/12/18  - 21:46
 */
public class Test06BeanPostProcessor {
    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("bean.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        BeanPostProcessorTest test = (BeanPostProcessorTest) factory.getBean("beanPostProcessorTest");
        test.display();

    }
}
