package com.example.demo.mvp.model.impl;

import android.content.Context;
import com.example.demo.mvp.model.MvpModel;

/**
 * Create in 2018/4/15 21:23.
 *
 * @author lhh.
 */
public abstract class MvpBaseModel implements MvpModel {

    private Context mContext;

    public MvpBaseModel(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return mContext;
    }
}
