package com.example.root.mufixapplication.Model;

import android.net.Uri;

import java.util.Date;

/**
 * Created by root on 17/02/18.
 */

public class Normal extends User {

    boolean normal_signed;
    Date birth_date;

    public Normal(String user_id, String user_name, String user_email, String user_password, String user_phone, Uri user_image, int user_type, boolean normal_signed, Date birth_date) {
        super(user_id, user_name, user_email, user_password, user_phone, user_image, user_type);
        this.normal_signed = normal_signed;
        this.birth_date = birth_date;
    }

    public boolean isNormal_signed() {
        return normal_signed;
    }

    public void setNormal_signed(boolean normal_signed) {
        this.normal_signed = normal_signed;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    @Override
    public String toString() {
        return "Normal{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", normal_signed=" + normal_signed +
                ", user_email='" + user_email + '\'' +
                ", birth_date=" + birth_date +
                ", user_password='" + user_password + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_image=" + user_image +
                ", user_type=" + user_type +
                '}';
    }
}
