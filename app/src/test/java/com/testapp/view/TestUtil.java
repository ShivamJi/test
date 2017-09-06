package com.testapp.view;


import com.testapp.BuildConfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 18)
public class TestUtil {
    @Test
    public void testSum() {
        Assert.assertEquals(20, Util.sum(10,10));
    }
}
