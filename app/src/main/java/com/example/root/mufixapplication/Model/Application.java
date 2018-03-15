package com.example.root.mufixapplication.Model;

import android.media.Image;
import android.net.Uri;

import java.util.Date;

/**
 * Created by root on 17/02/18.
 */

public class Application {

    String application_id;
    String application_owner;
    String application_name;
    Uri application_image;
    Date application_launchdate;
    int application_rate;

    public Application() {
    }

    public Application(String application_owner, String application_name, Uri application_image, Date application_launchdate, int application_rate) {
        this.application_owner = application_owner;
        this.application_name = application_name;
        this.application_image = application_image;
        this.application_launchdate = application_launchdate;
        this.application_rate = application_rate;
    }

    public Application(String application_id, String application_owner, String application_name, Uri application_image, Date application_launchdate, int application_rate) {
        this.application_id = application_id;
        this.application_owner = application_owner;
        this.application_name = application_name;
        this.application_image = application_image;
        this.application_launchdate = application_launchdate;
        this.application_rate = application_rate;
    }

    public String getApplication_id() {
        return application_id;
    }

    public void setApplication_id(String application_id) {
        this.application_id = application_id;
    }

    public String getApplication_owner() {
        return application_owner;
    }

    public void setApplication_owner(String application_owner) {
        this.application_owner = application_owner;
    }

    public String getApplication_name() {
        return application_name;
    }

    public void setApplication_name(String application_name) {
        this.application_name = application_name;
    }

    public Uri getApplication_image() {
        return application_image;
    }

    public void setApplication_image(Uri application_image) {
        this.application_image = application_image;
    }

    public Date getApplication_launchdate() {
        return application_launchdate;
    }

    public void setApplication_launchdate(Date application_launchdate) {
        this.application_launchdate = application_launchdate;
    }

    public int getApplication_rate() {
        return application_rate;
    }

    public void setApplication_rate(int application_rate) {
        this.application_rate = application_rate;
    }

    @Override
    public String toString() {
        return "Application{" +
                "application_id='" + application_id + '\'' +
                ", application_owner='" + application_owner + '\'' +
                ", application_name='" + application_name + '\'' +
                ", application_image=" + application_image +
                ", application_launchdate=" + application_launchdate +
                ", application_rate=" + application_rate +
                '}';
    }
}
