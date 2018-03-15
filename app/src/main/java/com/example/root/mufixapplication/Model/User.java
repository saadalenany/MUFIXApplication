package com.example.root.mufixapplication.Model;

import android.net.Uri;

import java.io.Serializable;

/**
 * Created by root on 17/02/18.
 */

public class User implements Serializable{

    String user_id ;
    String user_name;
    String user_email;
    String user_password;
    String user_phone;
    Uri user_image;
    int user_type;

    public User() {
    }

    public User(String user_name, String user_email, String user_password, String user_phone, Uri user_image, int user_type) {
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_phone = user_phone;
        this.user_image = user_image;
        this.user_type = user_type;
    }

    public User(String user_id, String user_name, String user_email, String user_password, String user_phone, Uri user_image, int user_type) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_password = user_password;
        this.user_phone = user_phone;
        this.user_image = user_image;
        this.user_type = user_type;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public Uri getUser_image() {
        return user_image;
    }

    public void setUser_image(Uri user_image) {
        this.user_image = user_image;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_image=" + user_image +
                ", user_type=" + user_type +
                '}';
    }
}
