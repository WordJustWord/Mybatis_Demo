package com.demo.pojo;

import java.util.Date;

public class Userinfo {

    /**
     * 用户ID
     */
    private int id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 性别
     */
    private int gender;
    /**
     * 用户年龄
     */
    private int age;
    /**
     * 用户状态
     */
    private int active;
    /**
     * 用户创建时间
     */
    private Date createtime;
    /**
     * 用户修改时间
     */
    private Date modifytime;
    /**
     * 创建人
     */
    private int createman;
    /**
     * 修改人
     */
    private int modifyman;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public int getCreateman() {
        return createman;
    }

    public void setCreateman(int createman) {
        this.createman = createman;
    }

    public int getModifyman() {
        return modifyman;
    }

    public void setModifyman(int modifyman) {
        this.modifyman = modifyman;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", active=" + active +
                ", createtime=" + createtime +
                ", modifytime=" + modifytime +
                ", createman=" + createman +
                ", modifyman=" + modifyman +
                '}';
    }
}
