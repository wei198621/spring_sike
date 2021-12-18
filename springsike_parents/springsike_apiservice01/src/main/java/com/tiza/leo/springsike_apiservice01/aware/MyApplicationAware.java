package com.tiza.leo.springsike_apiservice01.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import sun.plugin.com.BeanClass;

/**
 * @author leowei
 * @date 2021/12/18  - 20:54
 */
public class MyApplicationAware implements BeanNameAware,BeanFactoryAware,BeanClassLoaderAware,ApplicationContextAware {

    private String beanName;
    private BeanFactory beanFactory;
    private ClassLoader classLoader;
    private ApplicationContext applicationContext;

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader =classLoader;
        System.out.println(" BeanClassLoaderAware  setBeanClassLoader 方法 ");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory=beanFactory;
        System.out.println("调用了  BeanFactoryAware setBeanFactory 方法");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName=name;
        System.out.println("调用了  BeanNameAware setBeanName 方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("调用了  ApplicationContextAware setApplicationContext 方法");
    }

    public void display(){
        System.out.println(" beanName :" + beanName);
        System.out.println(" 是否为单例：: " + beanFactory.isSingleton(beanName));
        System.out.println(" 系统环境为： : " + applicationContext.getEnvironment());
    }
}
