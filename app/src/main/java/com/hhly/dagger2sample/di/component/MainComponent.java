package com.hhly.dagger2sample.di.component;

import com.hhly.dagger2sample.MainActivity;
import com.hhly.dagger2sample.bean.FirstStudent;
import com.hhly.dagger2sample.di.module.ActivityModule;
import com.hhly.dagger2sample.di.module.MainModule;
import com.hhly.dagger2sample.di.scope.PerActivity;

import javax.inject.Named;

import dagger.Component;

/**
 * @创建者 frank
 * @时间 2017/2/4 15:25
 * @描述：${ScollingActivity的component}
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class, MainModule.class})
public interface MainComponent extends ActivityComponent {

    void injectActivity(MainActivity mainActivity);

    MainFragmentComponent getMainFragmentComponent();

    @Named("namedStudent")
    FirstStudent provideFirstStudent();

}
