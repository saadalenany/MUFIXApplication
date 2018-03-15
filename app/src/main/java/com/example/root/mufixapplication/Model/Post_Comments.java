package com.example.root.mufixapplication.Model;

import java.util.Date;

/**
 * Created by root on 18/02/18.
 */

public class Post_Comments {

    String comment_id;
    String comment_content;
    Date comment_date;
    String commentator;
    String post_id;

    public Post_Comments() {
    }

    public Post_Comments(String comment_id, String comment_content, Date comment_date, String commentator, String post_id) {
        this.comment_id = comment_id;
        this.comment_content = comment_content;
        this.comment_date = comment_date;
        this.commentator = commentator;
        this.post_id = post_id;
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

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    @Override
    public String toString() {
        return "Post_Comments{" +
                "comment_id='" + comment_id + '\'' +
                ", comment_content='" + comment_content + '\'' +
                ", comment_date=" + comment_date +
                ", commentator='" + commentator + '\'' +
                ", post_id='" + post_id + '\'' +
                '}';
    }
}
