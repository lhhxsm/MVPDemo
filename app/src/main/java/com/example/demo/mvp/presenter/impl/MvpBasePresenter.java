package com.example.demo.mvp.presenter.impl;

import android.content.Context;
import com.example.demo.mvp.presenter.MvpPresenter;
import com.example.demo.mvp.view.MvpView;

/**
 * Create in 2018/4/15 21:27.
 *
 * @author lhh.
 */
public abstract class MvpBasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private Context mContext;
    private V mView;

    public MvpBasePresenter(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return mContext;
    }

    public V getView() {
        return mView;
    }

    @Override
    public void attachView(V view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }
}
