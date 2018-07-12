package com.example.androidplusdemo.di.component;

import com.example.androidplusdemo.app.MyApplication;
import com.example.androidplusdemo.di.module.ActivityBindingModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Administrator on 2018/7/11.
 */
@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, ActivityBindingModule.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    @Override
    void inject(DaggerApplication instance);
}
