package com.lekenny.reactnative.changelauncher;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

/**
 * Created by admin on 2017/10/26.
 */

public class ChangeLuancherModule extends ReactContextBaseJavaModule {

  public ChangeLuancherModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "ChangeLuancher";
  }
  public void changeLuancher(){

  }
}
