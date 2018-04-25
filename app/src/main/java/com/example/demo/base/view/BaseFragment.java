package com.example.demo.base.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.demo.base.presenter.BasePresenter;
import com.example.demo.mvp.view.impl.MvpFragment;

/**
 * Create in 2018/4/15 22:01.
 *
 * @author lhh.
 */
public abstract class BaseFragment<P extends BasePresenter, V extends BaseView> extends
    MvpFragment<P, V> {
  private View mContentView;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    if (mContentView == null) {
      mContentView = inflater.inflate(bindLayoutId(), container, false);
      initView(mContentView);
    }
    ViewGroup parent = (ViewGroup) mContentView.getParent();
    if (parent != null) {
      parent.removeView(mContentView);
    }
    return mContentView;
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    initData();
  }

  @Override
  protected P bindPresenter() {
    return null;
  }

  @Override
  protected V bindView() {
    return null;
  }

  public View getContentView() {
    return mContentView;
  }

  protected abstract int bindLayoutId();

  protected abstract void initView(View contentView);

  protected abstract void initData();
}
