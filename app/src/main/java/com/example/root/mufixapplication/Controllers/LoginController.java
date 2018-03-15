package com.example.root.mufixapplication.Controllers;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

import com.example.root.mufixapplication.Activities.LoginActivity;

import static com.example.root.mufixapplication.Statics.dataProcessor;
import static com.example.root.mufixapplication.Statics.loggedUser;
import static com.example.root.mufixapplication.Statics.users;

/**
 * Created by root on 18/02/18.
 */

public class LoginController {

    public LoginController() {
        dataProcessor = new DataProcessor();
    }

    public void signIn(Context sourceActivity,Class<?> destinationActivity, EditText mEmail, EditText mPassword) {
        int returned = testEmailAndPassword(mEmail,mPassword);
        if(returned == 1){
            dataProcessor.goToActivity(sourceActivity,destinationActivity);
        }else if(returned == 0){
            Toast.makeText(sourceActivity,"Either your Email or Password isn't matched!",Toast.LENGTH_SHORT).show();
        }
    }

    public void signUp(LoginActivity LoginActivity, Class<?> SignUpActivityClass) {
        dataProcessor.goToActivity(LoginActivity,SignUpActivityClass);
    }

    private int testEmailAndPassword(EditText mEmail, EditText mPassword) {

        String email = mEmail.getText().toString();
        String password = mPassword.getText().toString();

        if(email.isEmpty()){
            mEmail.setError("Email is empty!");
            mEmail.requestFocus();
            return 2;
        }
        if(password.isEmpty()){
            mPassword.setError("Password is empty!");
            mPassword.requestFocus();
            return 2;
        }

        for (int i=0; i<users.size() ; i++){
            if(users.get(i).getUser_email().equalsIgnoreCase(email) && users.get(i).getUser_password().equalsIgnoreCase(password)){
                loggedUser = users.get(i);
                return 1;
            }
        }

        return 0;
    }
}
