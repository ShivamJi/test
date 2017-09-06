package com.testapp.view;

import com.testapp.BuildConfig;

import org.assertj.android.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 18)
public class TestMainActivity {
    MainActivity mainActivity;

    @Before
    public void setUp() {
        org.robolectric.util.ActivityController<MainActivity> mMainActivityController = Robolectric.buildActivity(MainActivity.class);
        mainActivity = mMainActivityController.setup().get();
    }

    @Test
    public void testActivityNotNull() {
        Assertions.assertThat(mainActivity).isNotNull();
    }

    @Test
    public void testTextNotNull() {
        Assertions.assertThat(mainActivity.text).isNotNull();
    }

    @Test
    public void testTextHasTextMatching() {
        Assertions.assertThat(mainActivity.text).hasText("Hello World!!!");
    }
}
