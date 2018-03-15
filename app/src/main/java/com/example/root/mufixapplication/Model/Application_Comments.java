package com.example.root.mufixapplication.Model;

import java.util.Date;

/**
 * Created by root on 18/02/18.
 */

public class Application_Comments {

    String comment_id;
    String comment_content;
    Date comment_date;
    String commentator;
    String application_id;

    public Application_Comments() {
    }

    public Application_Comments(String comment_content, Date comment_date, String commentator, String application_id) {
        this.comment_content = comment_content;
        this.comment_date = comment_date;
        this.commentator = commentator;
        this.application_id = application_id;
    }

    public Application_Comments(String comment_id, String comment_content, Date comment_date, String commentator, String application_id) {
        this.comment_id = comment_id;
        this.comment_content = comment_content;
        this.comment_date = comment_date;
        this.commentator = commentator;
        this.application_id = application_id;
    }

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public Date getComment_date() {
        return comment_date;
    }

    public void setComment_date(Date comment_date) {
        this.comment_date = comment_date;
    }

    public String getCommentator() {
        return commentator;
    }

    public void setCommentator(String commentator) {
        this.commentator = commentator;
    }

    public String getApplication_id() {
        return application_id;
    }

    public void setApplication_id(String application_id) {
        this.application_id = application_id;
    }

    @Override
    public String toString() {
        return "Application_Comments{" +
                "comment_id='" + comment_id + '\'' +
                ", comment_content='" + comment_content + '\'' +
                ", comment_date=" + comment_date +
                ", commentator='" + commentator + '\'' +
                ", application_id='" + application_id + '\'' +
                '}';
    }
}
