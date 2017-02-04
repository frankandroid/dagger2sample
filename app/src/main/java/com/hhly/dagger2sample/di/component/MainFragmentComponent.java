package com.hhly.dagger2sample.di.component;

import com.hhly.dagger2sample.MainFragment;
import com.hhly.dagger2sample.di.scope.PerActivity;

import dagger.Subcomponent;

/**
 * @创建者 frank
 * @时间 2017/2/4 15:45
 * @描述：${被包含的component}
 */

@PerActivity
@Subcomponent
public interface MainFragmentComponent {

    void injectFragment(MainFragment mainFragment);

}
