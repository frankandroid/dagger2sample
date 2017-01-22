package com.hhly.dagger2sample.di.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dagger.Module;
import dagger.Provides;

/**
 * @创建者 frank
 * @时间 2017/1/22 14:59
 * @描述：${提供实例的module}
 */

@Module
public class ThirdLibModule {



    @Provides
    Gson provideGson(){
        return new GsonBuilder().create();
    }

}
