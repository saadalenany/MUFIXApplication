package com.example.root.mufixapplication.Model;

/**
 * Created by root on 18/02/18.
 */

public class Followers {

    String company_id;
    String normal_id;

    public Followers() {
    }

    public Followers(String company_id, String normal_id) {
        this.company_id = company_id;
        this.normal_id = normal_id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getNormal_id() {
        return normal_id;
    }

    public void setNormal_id(String normal_id) {
        this.normal_id = normal_id;
    }

    @Override
    public String toString() {
        return "Followers{" +
                "company_id='" + company_id + '\'' +
                ", normal_id='" + normal_id + '\'' +
                '}';
    }
}
