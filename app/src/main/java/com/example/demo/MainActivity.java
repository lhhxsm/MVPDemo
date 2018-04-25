package com.example.demo;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.demo.base.view.BaseActivity;

public class MainActivity extends BaseActivity<MainPresenter, MainView> implements MainView,
    View.OnClickListener {
  private Button mButton;

  @Override protected MainPresenter bindPresenter() {
    return new MainPresenter(this);
  }

  @Override protected MainView bindView() {
    return this;
  }

  @Override protected int bindLayoutId() {
    return R.layout.activity_main;
  }

  @Override protected void initView() {
    mButton = findViewById(R.id.button);
    mButton.setOnClickListener(this);
  }

  @Override protected void initData() {
    mButton.setText("请点击我");
  }

  @Override public void showToast(String message) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show();
  }

  @Override public void onClick(View v) {
    switch (v.getId()) {
      case R.id.button:
        getPresenter().showMessage();
        break;
    }
  }
}
