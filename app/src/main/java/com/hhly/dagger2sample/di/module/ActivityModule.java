package com.hhly.dagger2sample.di.module;

import com.google.gson.Gson;
import com.hhly.dagger2sample.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @创建者 frank
 * @时间 2017/2/4 15:08
 * @描述：${提供activity共有的一些类实例}
 */
@Module
public class ActivityModule {

    @Provides
    @PerActivity
    Gson provideGson(){
        return new Gson();
    }

}
