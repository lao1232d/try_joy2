package com.lw.pojo;


import com.sun.istack.internal.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


public class Employee {
    private Integer eid;

    @NotEmpty(message = "名字不能为空")
    private String ename;

    private String sex;

    @Max(value = 120,message = "年龄最大120")
    @Min(value = 1,message = "年龄最小为1岁")
    private int age;

    private String address;

    public Employee(){

    }

    public Employee(String ename, String sex, int age, String address) {
        this.ename = ename;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public Employee(Integer eid, String ename, String sex, int age, String address) {
        this.eid = eid;
        this.ename = ename;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }


    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getSex() {
        return sex;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
