package com.hhly.dagger2sample.di.module;

import com.hhly.dagger2sample.bean.FirstStudent;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @创建者 frank
 * @时间 2017/1/22 17:45
 * @描述：${module提供类的实例，当对于同一种类的实例，有多种提供方式时，需要用到@Qualifier限定符}
 */
@Module
public class FirstModule {

    /**
     *当一个类的实例有多种方式可以提供时，那么dagger2不知道需要去注入哪一个类的实例，这个时候，就需要用到@Qualifier限定符。
     * @Named是Dagger2对于@Qualifier一个默认实现，我们也可以自定义，比如@ForApplication和@ForAcitivity来标识不同的Context
     * */
    @Named("agedStudent")
    @Provides
    FirstStudent provideAgedStudent(){
        return new FirstStudent(40);
    }

    @Named("namedStudent")
    @Provides
    FirstStudent provideNamedStudent(){
        return new FirstStudent("谢凯");
    }


}
