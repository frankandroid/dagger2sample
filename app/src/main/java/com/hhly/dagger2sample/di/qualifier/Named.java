package com.hhly.dagger2sample.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @创建者 frank
 * @时间 2017/2/4 11:41
 * @描述：${@Named是Dagger2对于@Qualifier一个默认实现,这里只是把代码copy了一下，如果需要自己定义Qualifier,那么按照这个去写就是了。}
 */

@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Named {
    /** The name. */
    String value() default "";
}
