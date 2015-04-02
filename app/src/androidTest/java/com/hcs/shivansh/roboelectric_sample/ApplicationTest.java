package com.hcs.shivansh.roboelectric_sample;

import android.app.Activity;
import android.app.Application;
import android.view.Menu;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class ApplicationTest {
    public ApplicationTest() {
        super(Application.class);
    }
    @Test
    public void onCreate_shouldInflateTheMenu() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);

        final Menu menu = shadowOf(activity).getOptionsMenu();
        assertThat(menu.findItem(R.id.item1).getTitle()).isEqualTo("First menu item");
        assertThat(menu.findItem(R.id.item2).getTitle()).isEqualTo("Second menu item");
    }
}