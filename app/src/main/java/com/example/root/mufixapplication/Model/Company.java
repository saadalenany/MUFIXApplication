package com.example.root.mufixapplication.Model;

import android.net.Uri;

/**
 * Created by root on 17/02/18.
 */

public class Company extends User {

    int numberOfEmployees;

    public Company(String user_id, String user_name, String user_email, String user_password, String user_phone, Uri user_image, int user_type, int numberOfEmployees) {
        super(user_id, user_name, user_email, user_password, user_phone, user_image, user_type);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "user_id='" + user_id + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_image=" + user_image +
                '}';
    }
}
