package com.tiza.leo.springsike_apiservice01.beanReplace;

import org.springframework.beans.factory.support.MethodReplacer;

/**
 * @author leowei
 * @date 2021/12/15  - 0:56
 */
public class MethodReplace implements MethodReplacer {



    @Override
    public Object reimplement(Object obj, java.lang.reflect.Method method, Object[] args) throws Throwable {
        System.out.println("我是替换方法");

        return null;
    }
}