package com.example.root.mufixapplication.Activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.root.mufixapplication.Controllers.LoginController;
import com.example.root.mufixapplication.R;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity{

    // UI references.
    private EditText mEmail;
    private EditText mPassword;
    LoginController loginController;
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Set up the login form.
        mEmail = (EditText) findViewById(R.id.sign_in_email);
        mPassword = (EditText) findViewById(R.id.sign_in_password);
        pb = findViewById(R.id.login_progressbar);

        loginController = new LoginController();
    }

    public void onSignIn(View view) {
        pb.setVisibility(View.VISIBLE);
        final Thread t = new Thread(){
            @Override
            public void run() {
                loginController.signIn(LoginActivity.this,MainActivity.class,mEmail,mPassword);
                pb.setVisibility(View.INVISIBLE);
            }
        };
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Handler handler = new Handler();
                handler.postDelayed(t,2000);
            }
        });
    }

    public void onSignUp(View view) {
        loginController.signUp(LoginActivity.this,SignUpActivity.class);
    }

}

