package com.example.androidplusdemo.app;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVUser;
import com.example.androidplusdemo.data.model.User;
import com.example.androidplusdemo.di.component.DaggerAppComponent;

import org.greenrobot.eventbus.EventBus;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by Administrator on 2018/7/11.
 */

public class MyApplication extends DaggerApplication {
    private static final String APP_ID = "PPF8SUuzxVmva0wYCP1tVTyi-gzGzoHsz";
    private static final String APP_KEY = "pVkQyBJVdPqNmjRf5oEpfNId";
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.create();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initSubClasses();
        // 初始化参数依次为 this, AppId, AppKey
        AVOSCloud.initialize(this,APP_ID,APP_KEY);
        // 放在 SDK 初始化语句 AVOSCloud.initialize() 后面，只需要调用一次即可
        AVOSCloud.setDebugLogEnabled(true);

//        EventBus.builder().addIndex(new MyEventBusIndex()).installDefaultEventBus();


    }

    private void initSubClasses() {
        AVObject.registerSubclass(User.class);
        AVUser.alwaysUseSubUserClass(User.class);
    }
}
