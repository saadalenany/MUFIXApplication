package com.example.root.mufixapplication.Controllers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.example.root.mufixapplication.Model.User;

import java.util.ArrayList;

/**
 * Created by root on 18/02/18.
 */

public class DataProcessor {

    void goToActivity(Context sourceActivity, Class<?> destinationActivity) {
        Intent i = new Intent(sourceActivity,destinationActivity);
        sourceActivity.startActivity(i);
    }

}
