package com.wwh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class A_Activity extends AppCompatActivity {

    private static final String TAG = "111";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "log Aaaa");
        Log.d(TAG, "log bb");
        Log.d(TAG, "log cc111");
        Log.d(TAG, "log dddd");


    }
}
