package com.tiza.leo.springsike_apiservice01;

import com.tiza.leo.springsike_apiservice01.beanPostProcessor.BeanPostProcessorTest;
import com.tiza.leo.springsike_apiservice01.lifeCycle.lifeCycleBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author leowei
 * @date 2021/12/19  - 14:42
 */
public class Test09LifeCycle {
    public static void main(String[] args) {

        ClassPathResource resource = new ClassPathResource("bean2.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        factory.addBeanPostProcessor(new lifeCycleBean());
        lifeCycleBean lifeCycleBean = (lifeCycleBean) factory.getBean("lifeCycle");
        lifeCycleBean.display();

        System.out.println("方法调用完成，容器开始关闭....");
        // 关闭容器
        factory.destroySingletons();


    }
}
