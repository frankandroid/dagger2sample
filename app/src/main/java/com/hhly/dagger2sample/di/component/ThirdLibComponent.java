package com.hhly.dagger2sample.di.component;

import com.hhly.dagger2sample.ScrollingActivity;
import com.hhly.dagger2sample.di.module.FirstModule;
import com.hhly.dagger2sample.di.module.ThirdLibModule;

import dagger.Component;

/**
 * @创建者 frank
 * @时间 2017/1/22 14:52
 * @描述：${使用module的方式提供实例的component,除了提供第三方的实例，也可以通过这种方式提供自己的类的实例}
 */

@Component(modules = {ThirdLibModule.class, FirstModule.class})
public interface ThirdLibComponent {

    void injectScrollingActivity(ScrollingActivity activity);

}
