package com.tiza.leo.springsike_apiservice01.beanStudent;


/**
 * @author leowei
 * @date 2021/12/16  - 0:20
 */
public class StudentService{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    private BookService bookService;
    StudentService(String name,Integer age,BookService bookService){
        this.name = name;
        this.age =age;
        this.bookService =bookService;
    }
}
