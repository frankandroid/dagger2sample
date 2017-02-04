package com.hhly.dagger2sample.di.component;

import com.hhly.dagger2sample.base.BaseActivity;
import com.hhly.dagger2sample.di.module.ActivityModule;
import com.hhly.dagger2sample.di.scope.PerActivity;

import dagger.Component;

/**
 * @创建者 frank
 * @时间 2017/2/4 15:09
 * @描述：${TODO}
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void injectActivity(BaseActivity activity);


}
