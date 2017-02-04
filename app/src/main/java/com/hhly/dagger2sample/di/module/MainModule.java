package com.hhly.dagger2sample.di.module;

import com.hhly.dagger2sample.bean.FirstStudent;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @创建者 frank
 * @时间 2017/2/4 16:33
 * @描述：${TODO}
 */
@Module
public class MainModule {

    @Named("namedStudent")
    @Provides
    FirstStudent provideNamedStudent(){
        return new FirstStudent("谢凯");
    }

}
