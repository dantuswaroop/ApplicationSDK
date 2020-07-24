
package com.gravityxr.myapplication;

import android.app.Application;

import com.gravityxr.mylibrary.AzureSpatialAnchorsActivity;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AzureSpatialAnchorsActivity.init(this);
    }
}
