package com.example.demo.mvp.view.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.example.demo.mvp.presenter.MvpPresenter;
import com.example.demo.mvp.view.MvpView;

/**
 * Create in 2018/4/15 21:29.
 *
 * @author lhh.
 */
public abstract class MvpActivity<P extends MvpPresenter, V extends MvpView> extends AppCompatActivity {

    private P mPresenter;
    private V mView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = bindPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(bindView());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

    public P getPresenter() {
        return mPresenter;
    }

    /**
     * 绑定具体的实现类
     *
     * @return
     */
    protected abstract P bindPresenter();

    /**
     * 绑定具体的视图
     *
     * @return
     */
    protected abstract V bindView();
}
