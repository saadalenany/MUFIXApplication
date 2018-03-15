package com.example.root.mufixapplication.CustomController;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.root.mufixapplication.R;

/**
 * Created by Saad Alenany on 3/4/2018.
 */

public class ProgressDialog extends Dialog{

    String message ;

    public ProgressDialog(@NonNull Context context,String message) {
        super(context);
        this.message = message;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.progress_dialog);

        TextView tv = findViewById(R.id.progressbar_message);
        tv.setText(message);
    }

}
