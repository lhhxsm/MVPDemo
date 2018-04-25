package com.example.demo.base.presenter;

import android.content.Context;
import com.example.demo.base.view.BaseView;
import com.example.demo.mvp.presenter.impl.MvpBasePresenter;

/**
 * Create in 2018/4/15 21:53.
 *
 * @author lhh.
 */
public abstract class BasePresenter<V extends BaseView> extends MvpBasePresenter<V> {
    public BasePresenter(Context context) {
        super(context);
    }
}
