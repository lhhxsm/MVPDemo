package com.example.demo.mvp.presenter;

import com.example.demo.mvp.view.MvpView;

/**
 * Create in 2018/4/15 21:26.
 *
 * @author lhh.
 */
public interface MvpPresenter<V extends MvpView> {

    /**
     * 绑定View
     *
     * @param view
     */
    void attachView(V view);

    /**
     * 解除绑定
     */
    void detachView();
}
