package com.hhly.dagger2sample.di.module;

import com.hhly.dagger2sample.bean.FirstStudent;

import dagger.Module;
import dagger.Provides;

/**
 * @创建者 frank
 * @时间 2017/1/22 17:45
 * @描述：${TODO}
 */
@Module
public class FirstModule {

    @Provides
    FirstStudent provideStudent(){
        return new FirstStudent(40);
    }
}
