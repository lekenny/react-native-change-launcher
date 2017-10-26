package com.lekenny.reactnative.changelauncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.PackageManager;

/**
 * Created by admin on 2017/10/26.
 */

public class ChangeLuancher {

  private final Activity activity;

  public ChangeLuancher(Activity activity) {
    this.activity = activity;
  }

  public void changeLauncher(String name) {
    PackageManager pm = activity.getPackageManager();
    //隐藏之前显示的桌面组件
    pm.setComponentEnabledSetting(activity.getComponentName(),
        PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    //显示新的桌面组件
    pm.setComponentEnabledSetting(new ComponentName(activity, name),
        PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
  }

}
