package com.hhly.dagger2sample.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @创建者 frank
 * @时间 2017/2/4 14:43
 * @描述：${自己定义的appscope注解，和singleton是一样的作用。规定了作用域。}
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerApp {

}
