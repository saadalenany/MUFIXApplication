package com.example.root.mufixapplication.Activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;

import com.example.root.mufixapplication.Controllers.SignUpController;
import com.example.root.mufixapplication.R;

/**
 * A login screen that offers login via email/password.
 */
public class SignUpActivity extends AppCompatActivity{

    // UI references.
    private EditText mUsername;
    private EditText mEmail;
    private EditText mPassword;
    private EditText mPhone;
    private Button uploadImage;
    private RadioGroup myRadioGroup;
    private LinearLayout dynamic_users_area;
    private ProgressBar pb;
    private ImageView pro_image;

    SignUpController signUpController;
    Uri image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Set up the login form.
        mUsername = (EditText) findViewById(R.id.sign_up_username);
        mEmail = (EditText) findViewById(R.id.sign_up_email);
        mPassword = (EditText) findViewById(R.id.sign_up_password);
        mPhone = (EditText) findViewById(R.id.sign_up_phone);
        uploadImage = (Button) findViewById(R.id.uploadImage);
        myRadioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);
        dynamic_users_area = (LinearLayout) findViewById(R.id.dynamic_users_area);
        pb = (ProgressBar) findViewById(R.id.signup_progressbar);
        pro_image = (ImageView) findViewById(R.id.pro_image);

        signUpController = new SignUpController(SignUpActivity.this);
        signUpController.listenToRadioGroup(myRadioGroup,dynamic_users_area);

    }

    public void onUploadPersonalImage(View view) {
        Intent intent = new Intent();

        // Show only images, no videos or anything else
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);

        // Always show the chooser (if there are multiple options available)
        startActivityForResult(Intent.createChooser(intent, "Select Profile Picture"), 1);
    }

    public void onSignUp(View view) {
        pb.setVisibility(View.VISIBLE);
        final Thread t = new Thread(){
            @Override
            public void run() {
                signUpController.signUp(SignUpActivity.this,MainActivity.class,image,mUsername,mEmail,mPassword,mPhone,uploadImage);
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

    /**Multi-Platform Sign Up**/

    //Facebook
    public void onSignUpWithFacebook(View view) {

    }

    //LinkedIn
    public void onSignUpWithLinkedIn(View view) {

    }

    //Google
    public void onSignUpWithGoogle(View view) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data !=  null){
            image = data.getData();
            pro_image.setImageURI(image);
        }
    }
}

