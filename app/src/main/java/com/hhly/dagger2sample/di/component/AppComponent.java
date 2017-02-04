package com.hhly.dagger2sample.di.component;

import android.content.Context;

import com.hhly.dagger2sample.bean.FirstStudent;
import com.hhly.dagger2sample.di.module.AppModule;
import com.hhly.dagger2sample.di.scope.PerApp;

import javax.inject.Named;

import dagger.Component;

/**
 * @创建者 frank
 * @时间 2017/2/4 14:45
 * @描述：${appcomponent}
 */
@PerApp
@Component(modules = AppModule.class)
public interface AppComponent {

    Context getAppContext();

    @Named("agedStudent")
    FirstStudent provideFirstStudent();

}
