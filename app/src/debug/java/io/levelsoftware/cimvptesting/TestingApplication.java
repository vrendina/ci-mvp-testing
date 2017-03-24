package io.levelsoftware.cimvptesting;

import android.util.Log;

import io.levelsoftware.cimvptesting.ui.BaseApplication;


public class TestingApplication extends BaseApplication {

    @Override
    public void setupLogging() {
        Log.d("TestingApplication", "setupLogging: Debug build");
    }

}
