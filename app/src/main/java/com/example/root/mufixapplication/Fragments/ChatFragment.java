package com.example.root.mufixapplication.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.root.mufixapplication.R;

public class ChatFragment extends Fragment {

    LinearLayout chats_layout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        chats_layout = view.findViewById(R.id.chats_layout);

//        for (int i=0 ; i<10 ; i++){
//            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
//                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//
//            layoutParams.setMargins(0, 0, 0, 7);
//
//            View v = inflater.inflate(R.layout.person_item,null);
//            chats_layout.addView(v,layoutParams);
//        }

        return view;
    }
}
