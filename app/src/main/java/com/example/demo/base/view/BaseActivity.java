package com.example.demo.base.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.example.demo.base.presenter.BasePresenter;
import com.example.demo.mvp.view.impl.MvpActivity;

/**
 * Create in 2018/4/15 21:55.
 *
 * @author lhh.
 */
public abstract class BaseActivity<P extends BasePresenter, V extends BaseView> extends
    MvpActivity<P, V> {

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayoutId());
        initView();
        initData();
    }

    protected abstract int bindLayoutId();

    protected abstract void initView();

    protected abstract void initData();

    @Override
    protected P bindPresenter() {
        return null;
    }

    @Override
    protected V bindView() {
        return null;
    }
}
