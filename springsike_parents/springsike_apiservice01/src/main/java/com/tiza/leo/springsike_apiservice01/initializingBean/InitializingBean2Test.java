package com.tiza.leo.springsike_apiservice01.initializingBean;

/**
 * @author leowei
 * @date 2021/12/18  - 22:09
 */
public class InitializingBean2Test {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOtherName(){
        System.out.println("InitializingBeanTest setOtherName...");

        this.name = "leo  3 号";
    }

    public void initBean(){
        System.out.println("InitializingBeanTest initBean...");

        this.name = "leo  4号 initBean";

    }
}
