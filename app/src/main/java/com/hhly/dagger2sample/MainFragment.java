package com.hhly.dagger2sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hhly.dagger2sample.base.BaseFragment;
import com.hhly.dagger2sample.bean.FirstStudent;
import com.hhly.dagger2sample.di.component.MainFragmentComponent;

import javax.inject.Inject;
import javax.inject.Named;


/**
 * @创建者 frank
 * @时间 2017/2/4 15:47
 * @描述：${TODO}
 */

public class MainFragment extends BaseFragment {

    private TextView mTextView;
    private View mRootView;
    private MainFragmentComponent mMainFragmentComponent;

    @Inject
    @Named("namedStudent")
    FirstStudent mFirstStudent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_main, container);
        return mRootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTextView = (TextView) mRootView.findViewById(R.id.tv);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (getActivity() instanceof MainActivity) {
           mMainFragmentComponent = ((MainActivity) getActivity()).getMainComponent().getMainFragmentComponent();
           mMainFragmentComponent.injectFragment(this);
           mTextView.setText(mFirstStudent.toString());
        }
    }
}
