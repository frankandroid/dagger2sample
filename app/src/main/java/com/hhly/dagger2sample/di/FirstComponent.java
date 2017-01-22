package com.hhly.dagger2sample.di;

import com.hhly.dagger2sample.ScrollingActivity;

import dagger.Component;

/**
 * @创建者 frank
 * @时间 2017/1/22 11:48
 * @描述：${用于直接关联类与其成员变量的component}
 */
@Component
public interface FirstComponent {

    //对scorllingActivity进行依赖注入。
    void injectScrollingActivity(ScrollingActivity activity);


}
