package com.tiza.leo.springsike_apiservice01.beanCar;

/**
 * @author leowei
 * @date 2021/12/15  - 0:47
 */
public abstract class Display {
    public void display(){
        getCar().display();
    }
    public abstract Car getCar();
}
