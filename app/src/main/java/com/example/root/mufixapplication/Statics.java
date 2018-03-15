package com.example.root.mufixapplication;

import com.example.root.mufixapplication.Controllers.DataProcessor;
import com.example.root.mufixapplication.Model.User;

import java.util.ArrayList;

/**
 * Created by root on 18/02/18.
 */

public class Statics {
    public static User loggedUser = new User();
    public static ArrayList<User> users = new ArrayList<>();
    public static DataProcessor dataProcessor = new DataProcessor();

}
