package com.example.demo;

import android.content.Context;
import com.example.demo.base.model.BaseModel;
import java.util.Random;

/**
 * Create in 2018/4/25 20:29.
 *
 * @author lhh.
 */
public class MainModel extends BaseModel {
  public MainModel(Context context) {
    super(context);
  }

  public String getRandom() {
    int nextInt = new Random().nextInt();
    return "你的随机号码是:" + nextInt;
  }
}
