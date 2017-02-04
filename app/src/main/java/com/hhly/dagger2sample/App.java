package com.hhly.dagger2sample;

import android.app.Application;

import com.hhly.dagger2sample.di.component.AppComponent;
import com.hhly.dagger2sample.di.component.DaggerAppComponent;
import com.hhly.dagger2sample.di.module.AppModule;

/**
 * @创建者 frank
 * @时间 2017/2/4 14:51
 * @描述：${TODO}
 */

public class App extends Application {

    AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }


    public AppComponent getAppComponent(){
        return mAppComponent;
    }

}
