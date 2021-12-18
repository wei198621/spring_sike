package com.tiza.leo.springsike_apiservice01.beanFactoryPostProcessor;

import com.tiza.leo.springsike_apiservice01.beanStudent.BookService;

/**
 * @author leowei
 * @date 2021/12/18  - 22:52
 */
public class StudentService2 {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }



}
