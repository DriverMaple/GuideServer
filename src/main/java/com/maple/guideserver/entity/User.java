package com.maple.guideserver.entity;

/**
 * Created by Maple on 2017/9/14.
 */
public class User {
    private String user_phone;
    private String user_name;
    private String user_pw;
    private Byte user_role;

    public User(){

    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public void setUser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public Byte getUser_role() {
        return user_role;
    }

    public void setUser_role(Byte user_role) {
        this.user_role = user_role;
    }
}
