package com.lw.pojo;

public class Employee {


    private Integer eid;
    private String ename;
    private char sex;
    private int age;
    private String address;

    public Employee(Integer eid, String ename, char sex, int age, String address) {
        this.eid = eid;
        this.ename = ename;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Long id) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
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
