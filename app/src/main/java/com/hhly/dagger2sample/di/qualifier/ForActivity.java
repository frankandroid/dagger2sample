package com.hhly.dagger2sample.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @创建者 frank
 * @时间 2017/2/4 11:46
 * @描述：${自己定义的一个限定符}
 */

@Qualifier
@Documented
@Retention(RUNTIME)
public @interface ForActivity {
}
