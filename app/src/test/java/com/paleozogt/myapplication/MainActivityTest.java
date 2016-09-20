package com.paleozogt.myapplication;

import android.app.Activity;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {
    public MainActivityTest() {
    }

    @Test
    public void testNoop() {
        ActivityController<MainActivity> controller= Robolectric.buildActivity(MainActivity.class)
                .setup();
        MainActivity activity= controller.get();
    }
}
