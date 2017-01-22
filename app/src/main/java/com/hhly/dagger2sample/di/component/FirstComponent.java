package com.hhly.dagger2sample.di.component;

import dagger.Component;

/**
 * @创建者 frank
 * @时间 2017/1/22 17:36
 * @描述：${TODO}
 */
@Component()
public interface FirstComponent {

    /**
     * 注意一个类不能同时被两个component注入，因为这些东西是在编译的时候生成的，那么在编译的时候，你一个类同时
     * 被两个component注入，那目标类会不知道去哪个component里面找，于是就去第一个找，结果找不到，于是就会
     * 报错。
     */

   /* void injectScrollingActivity(ScrollingActivity activity);*/

}
