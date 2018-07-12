package com.example.androidplusdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.androidplusdemo.ui.activity.BaseActivity;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends BaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }
}
