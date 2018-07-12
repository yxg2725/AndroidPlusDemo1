package com.example.androidplusdemo.ui.activity;

import com.avos.avoscloud.AVUser;
import com.example.androidplusdemo.MainActivity;
import com.example.androidplusdemo.R;
import com.example.androidplusdemo.data.model.User;

/**
 * Created by Administrator on 2018/7/12.
 */

public class SplashActivity extends BaseActivity {
    private static final long DELAY_TIME = 2000;

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public void init() {
        //设置透明状态栏
        setStatusBarTransparent();

        //获取当前用户
//        User currentUser = AVUser.getCurrentUser(User.class);
//        //如果当前用户为null,说明用户没有登陆
//        if (currentUser == null) {
            //延时跳转到登陆界面
            navigateToLoginActivity();
//        } else {
//            //延时跳转到主界面
//            navigateToMainActivity();
//        }

        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);


    }

    private void navigateToMainActivity() {
        postDelay(new Runnable() {
            @Override
            public void run() {
                navigateTo(MainActivity.class);
            }
        }, DELAY_TIME);
    }

    private void navigateToLoginActivity() {
        postDelay(new Runnable() {
            @Override
            public void run() {
                navigateTo(LoginActivity.class);
            }
        },DELAY_TIME);
    }
}
