package com.example.root.mufixapplication.Controllers;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.root.mufixapplication.Model.User;
import com.example.root.mufixapplication.R;
import com.example.root.mufixapplication.Statics;

import java.util.Calendar;
import java.util.Date;

import static com.example.root.mufixapplication.Statics.dataProcessor;
import static com.example.root.mufixapplication.Statics.loggedUser;
import static com.example.root.mufixapplication.Statics.users;

/**
 * Created by root on 18/02/18.
 */

public class SignUpController {

    Context context;
    private LayoutInflater layoutInflater;

    int dateday, datemonth, dateyear;
    public SignUpController(Context context) {
        this.context = context;
    }

    public void signUp(Context sourceActivity, Class<?> destinationActivity, Uri image, EditText mUsername, EditText mEmail, EditText mPassword, EditText mPhone, Button uploadImage) {
        int returned = testData(sourceActivity,image, mUsername, mEmail, mPassword, mPhone,uploadImage);
        if(returned == 1){
            createUserObject(image, mUsername, mEmail, mPassword, mPhone);
            dataProcessor.goToActivity(sourceActivity,destinationActivity);
        }
    }

    private void createUserObject(Uri image, EditText mUsername, EditText mEmail, EditText mPassword, EditText mPhone) {
        String username = mUsername.getText().toString();
        String email = mEmail.getText().toString();
        String password = mPassword.getText().toString();
        String phone = mPhone.getText().toString();

        Statics.loggedUser.setUser_name(username);
        Statics.loggedUser.setUser_email(email);
        Statics.loggedUser.setUser_password(password);
        Statics.loggedUser.setUser_phone(phone);
        Statics.loggedUser.setUser_image(image);

    }

    private int testData(Context sourceActivity, Uri image, EditText mUsername, EditText mEmail, EditText mPassword, EditText mPhone, Button uploadImage) {

        String username = mUsername.getText().toString();
        String email = mEmail.getText().toString();
        String password = mPassword.getText().toString();
        String phone = mPhone.getText().toString();

        if(testAndNotify(username,mUsername,"Name") == 2){  return 2; }

        if(testAndNotify(email,mEmail,"Email") == 2){   return 2; }

        if(testAndNotify(password,mPassword,"Password") == 2){  return 2; }

        if(testAndNotify(phone,mPhone,"Phone") == 2){   return 2; }

        if(image == null){
            uploadImage.setError("Upload a Picture!");
            return 2;
        }

        for (User u : users){
            if (u.getUser_email().equalsIgnoreCase(email)){
                Toast.makeText(sourceActivity,"This E-Mail is already signed!",Toast.LENGTH_SHORT).show();
                return 0;
            }
        }

//        loggedUser = dataProcessor.insertUser(username,email,password,phone,image);

        return 1;
    }

    private int testAndNotify(String data, EditText component,String flag) {
        if(data.isEmpty()){
            component.setError(flag+" is Empty!");
            return 2;
        }
        return 3;
    }

    public void listenToRadioGroup(RadioGroup radioGroup, final LinearLayout dynamic_area) {

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.d("SignUpController", "ListenToRadioGroup : id " + checkedId);

                dynamic_area.removeAllViews();
                switch (checkedId) {
                    case R.id.normal_radiobutton:
                        prepareDateButton(dynamic_area);
                        break;
                    case R.id.company_radiobutton:
                        View dynamic_edit_text_view = inflateFile(R.layout.dynamic_edit_text);
                        EditText dynamic_edit_text = dynamic_edit_text_view.findViewById(R.id.dynamic_edit_text);
                        dynamic_edit_text.setHint("Number of Employees");
                        dynamic_edit_text.setInputType(InputType.TYPE_CLASS_NUMBER);
                        dynamic_area.addView(dynamic_edit_text_view);
                        break;
                }
            }
        });
    }

    private void prepareDateButton(LinearLayout dynamic_area) {
        View dynamic_button_view = inflateFile(R.layout.dynamic_button);
        final Button dynamic_button = dynamic_button_view.findViewById(R.id.dynamic_button);
        if(dateday > 0){
            dynamic_button.setText(dateyear+"/"+datemonth+"/"+dateday);
        }
        dynamic_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker arg0, int year, int dayOfMonth, int monthOfYear) {
                        monthOfYear ++;
                        dateday = dayOfMonth;
                        datemonth = monthOfYear;
                        dateyear = year;
                        dynamic_button.setText(dateyear+"/"+datemonth+"/"+dateday);
                    }
                };

                Calendar min = Calendar.getInstance();min.add(Calendar.YEAR,-30);
                Calendar max = Calendar.getInstance();min.add(Calendar.YEAR,-18);

                DatePickerDialog datePickerDialog = new DatePickerDialog(context, myDateListener, dateyear, datemonth, dateday);
                datePickerDialog.getDatePicker().setMinDate(min.getTimeInMillis());
                datePickerDialog.getDatePicker().setMaxDate(max.getTimeInMillis());
                datePickerDialog.show();

            }
        });
        dynamic_area.addView(dynamic_button_view);
    }

    private View inflateFile(int resId){
        if(layoutInflater == null){
            layoutInflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        }
        assert layoutInflater != null;
        return layoutInflater.inflate(resId,null);
    }

}
