package com.seechat.weibo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;

import com.seechat.weibo.auth.Auth;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    Context appContext;

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.

        appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.seechat.weibo.test", appContext.getPackageName());
    }

    @Test
    public void testGetAccessToken() {
        Auth auth = new Auth();

    }

    @MediumTest
    public void ActivityTest() {

    }
}
