package com.example.demo;

import android.content.Context;
import com.example.demo.base.presenter.BasePresenter;

/**
 * Create in 2018/4/25 20:29.
 *
 * @author lhh.
 */
public class MainPresenter extends BasePresenter<MainView> {
  private MainModel mMainModel;

  public MainPresenter(Context context) {
    super(context);
    mMainModel = new MainModel(context);
  }

  public void showMessage() {
    String message = mMainModel.getRandom();
    getView().showToast(message);
  }
}
