package com.example.demo.base.model;

import android.content.Context;
import com.example.demo.mvp.model.MvpModel;

/**
 * Create in 2018/4/15 21:52.
 *
 * @author lhh.
 */
public abstract class BaseModel implements MvpModel {
  private Context mContext;

  public BaseModel(Context context) {
    this.mContext = context;
  }

  public Context getContext() {
    return mContext;
  }
}
