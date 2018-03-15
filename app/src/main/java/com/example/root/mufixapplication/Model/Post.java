package com.example.root.mufixapplication.Model;

import java.util.Date;

/**
 * Created by root on 18/02/18.
 */

public class Post {

    String post_id;
    String post_content;
    Date post_date;
    String post_owner;

    public Post() {
    }

    public Post(String post_id, String post_content, Date post_date, String post_owner) {
        this.post_id = post_id;
        this.post_content = post_content;
        this.post_date = post_date;
        this.post_owner = post_owner;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public String getPost_owner() {
        return post_owner;
    }

    public void setPost_owner(String post_owner) {
        this.post_owner = post_owner;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id='" + post_id + '\'' +
                ", post_content='" + post_content + '\'' +
                ", post_date=" + post_date +
                ", post_owner='" + post_owner + '\'' +
                '}';
    }
}
