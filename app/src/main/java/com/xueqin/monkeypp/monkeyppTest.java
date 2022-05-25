package com.xueqin.monkeypp;

import android.util.Log;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SdkSuppress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 18)
public class monkeyppTest {

    public final String TAG = "UiAutomatorExample";

    @Before
    public void setUp() {
        Log.d(TAG, "Before");
        System.out.println("BeforeBefore");
    }

    @Test
    public void test() {
        Log.d(TAG, "Test");
        System.out.println("Test");
    }

    @After
    public void tearDown() {
        Log.d(TAG, "After");
        System.out.println("After");
    }
}
