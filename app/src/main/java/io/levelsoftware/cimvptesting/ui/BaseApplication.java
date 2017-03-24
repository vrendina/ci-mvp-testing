package io.levelsoftware.cimvptesting.ui;

import android.app.Application;
import android.util.Log;


public abstract class BaseApplication extends Application {

    public abstract void setupLogging();

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("BaseApplication", "onCreate");

        setupLogging();
    }
}
