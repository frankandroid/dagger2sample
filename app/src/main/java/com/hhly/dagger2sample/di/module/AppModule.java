package com.hhly.dagger2sample.di.module;

import android.content.Context;

import com.hhly.dagger2sample.bean.FirstStudent;
import com.hhly.dagger2sample.di.scope.PerApp;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @创建者 frank
 * @时间 2017/2/4 14:45
 * @描述：${提供全局实例的module}
 */
@Module
public class AppModule {

    Context mContext;

    public AppModule(Context context) {
        mContext = context;
    }

    @Provides
    @PerApp
    Context provideAppContext() {
        return mContext;
    }

    @Named("agedStudent")
    @Provides
    FirstStudent provideAgedStudent(){
        return new FirstStudent(40);
    }

}
