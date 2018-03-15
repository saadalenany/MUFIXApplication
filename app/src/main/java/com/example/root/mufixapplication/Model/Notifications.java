package com.example.root.mufixapplication.Model;

import java.util.Date;

/**
 * Created by root on 18/02/18.
 */

public class Notifications {

    String notification_id;
    String notified_user;
    String notification_content;
    Date notification_date;

    public Notifications() {
    }

    public Notifications(String notification_id, String notified_user, String notification_content, Date notification_date) {
        this.notification_id = notification_id;
        this.notified_user = notified_user;
        this.notification_content = notification_content;
        this.notification_date = notification_date;
    }

    public String getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(String notification_id) {
        this.notification_id = notification_id;
    }

    public String getNotified_user() {
        return notified_user;
    }

    public void setNotified_user(String notified_user) {
        this.notified_user = notified_user;
    }

    public String getNotification_content() {
        return notification_content;
    }

    public void setNotification_content(String notification_content) {
        this.notification_content = notification_content;
    }

    public Date getNotification_date() {
        return notification_date;
    }

    public void setNotification_date(Date notification_date) {
        this.notification_date = notification_date;
    }

    @Override
    public String toString() {
        return "Notifications{" +
                "notification_id='" + notification_id + '\'' +
                ", notified_user='" + notified_user + '\'' +
                ", notification_content='" + notification_content + '\'' +
                ", notification_date=" + notification_date +
                '}';
    }
}
