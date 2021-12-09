package com.tiza.leo.springsike_apiservice01.bean;

/**
 * @author leowei
 * @date 2021/12/10  - 0:49
 */
public class YoungMan {
    private BeautifulGirl beautifulGirl;

    public BeautifulGirl getBeautifulGirl() {
        return beautifulGirl;
    }


    public YoungMan(){
        BeautifulGirl beautifulGirl = new BeautifulGirl();// 方式一，指腹为婚  ，构造函数 注入
        beautifulGirl.setCreateType("by构造函数注入");
        this.beautifulGirl = beautifulGirl;

    }

    public void setBeautifulGirl(BeautifulGirl beautifulGirl){
        beautifulGirl.setCreateType("bySet注入");
        this.beautifulGirl=beautifulGirl;     //方式二、 set 方法  注入  比较常用

    }

    public static void main(String[] args) {
        YoungMan youngMan=new YoungMan();
        BeautifulGirl beautifulGirl = new BeautifulGirl();

        //你有女友了
        //youngMan.setBeautifulGirl(beautifulGirl);
        System.out.println(youngMan.getBeautifulGirl().getCreateType());

    }

}
