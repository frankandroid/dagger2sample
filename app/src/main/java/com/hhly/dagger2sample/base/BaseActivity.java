package com.hhly.dagger2sample.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.hhly.dagger2sample.App;
import com.hhly.dagger2sample.di.component.ActivityComponent;
import com.hhly.dagger2sample.di.component.DaggerActivityComponent;
import com.hhly.dagger2sample.di.module.ActivityModule;

import javax.inject.Inject;

/**
 * @创建者 frank
 * @时间 2017/2/4 15:10
 * @描述：${activity的基类}
 */

public class BaseActivity extends AppCompatActivity{

    ActivityComponent mActivityComponent;

    @Inject
    public Gson mGson;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule())
                .appComponent(((App)getApplication()).getAppComponent())
                .build();
        mActivityComponent.injectActivity(this);
    }
}
