package com.seechat.commutils.model;


/**
 * Created by hjw on 2018/3/28.
 */

public class textDemo extends DataModel{

    private int id;
    private String name;
    private String sex;
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }
}
