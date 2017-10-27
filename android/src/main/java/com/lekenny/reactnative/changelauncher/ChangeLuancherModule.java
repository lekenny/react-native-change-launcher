package com.lekenny.reactnative.changelauncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by admin on 2017/10/26.
 */

public class ChangeLuancherModule extends ReactContextBaseJavaModule implements
    LifecycleEventListener {

  private final ReactApplicationContext reactContext;
  String changeTo;

  public ChangeLuancherModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "ChangeLuancher";
  }

  @Override
  public void initialize() {
    getReactApplicationContext().addLifecycleEventListener(this);
  }

  @ReactMethod
  public void changeLuancher(String name){
    this.changeTo = name;
  }

  private void cl(String name){
    PackageManager pm = reactContext.getPackageManager();
    Activity activity = getCurrentActivity();
    //隐藏之前显示的桌面组件
    pm.setComponentEnabledSetting(activity.getComponentName(),
        PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    //显示新的桌面组件
    pm.setComponentEnabledSetting(new ComponentName(activity, name),
        PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);

  }

  @Override
  public void onHostResume() {

  }

  @Override
  public void onHostPause() {

  }

  @Override
  public void onHostDestroy() {
    if(!TextUtils.isEmpty(changeTo)){
      cl(changeTo);
    }
  }
}
