package com.tiza.leo.springsike_apiservice01.initializingBean;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author leowei
 * @date 2021/12/18  - 22:00
 */
public class initializingBeanTest implements InitializingBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBeanTest initializing...");
        this.name = "leo wei 02";
    }
}
