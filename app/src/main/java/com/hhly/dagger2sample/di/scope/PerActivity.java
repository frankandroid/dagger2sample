package com.hhly.dagger2sample.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @创建者 frank
 * @时间 2017/2/4 15:07
 * @描述：${activity的作用域}
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
