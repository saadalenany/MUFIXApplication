package com.example.root.mufixapplication.Model;

/**
 * Created by root on 18/02/18.
 */

public class Post_Likes {

    String like_id;
    String post_id;
    String liker_id;

    public Post_Likes() {
    }

    public Post_Likes(String like_id, String post_id, String liker_id) {
        this.like_id = like_id;
        this.post_id = post_id;
        this.liker_id = liker_id;
    }

    public String getLike_id() {
        return like_id;
    }

    public void setLike_id(String like_id) {
        this.like_id = like_id;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getLiker_id() {
        return liker_id;
    }

    public void setLiker_id(String liker_id) {
        this.liker_id = liker_id;
    }

    @Override
    public String toString() {
        return "Post_Likes{" +
                "like_id='" + like_id + '\'' +
                ", post_id='" + post_id + '\'' +
                ", liker_id='" + liker_id + '\'' +
                '}';
    }
}
