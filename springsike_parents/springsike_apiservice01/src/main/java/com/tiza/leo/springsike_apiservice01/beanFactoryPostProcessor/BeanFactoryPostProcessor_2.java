package com.tiza.leo.springsike_apiservice01.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * @author leowei
 * @date 2021/12/18  - 22:58
 */
public class BeanFactoryPostProcessor_2 implements BeanFactoryPostProcessor,Ordered {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("");
        BeanDefinition bd = beanFactory.getBeanDefinition("studentService2");
        MutablePropertyValues pvs = bd.getPropertyValues();
        pvs.addPropertyValue("age", 18);
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
