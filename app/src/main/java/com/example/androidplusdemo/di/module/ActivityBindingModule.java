package com.example.androidplusdemo.di.module;

import com.example.androidplusdemo.di.ActivityScoped;
import com.example.androidplusdemo.ui.activity.LoginActivity;
import com.example.androidplusdemo.ui.activity.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Administrator on 2018/7/12.
 */
@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector
    abstract SplashActivity splashActivity();

    @ActivityScoped
    @ContributesAndroidInjector
    abstract LoginActivity loginActivity();
}
