package io.levelsoftware.cimvptesting.ui.result;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.levelsoftware.cimvptesting.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class ResultActivityTest {

    public static final int RESULT = 1000;

    @Rule
    public ActivityTestRule<ResultActivity> activityTestRule
            = new ActivityTestRule<>(ResultActivity.class, false, false);

    @Test
    public void resultActivityTest() {
        Intent intent = new Intent();
        intent.putExtra("result", RESULT);

        activityTestRule.launchActivity(intent);

        onView(allOf(withId(R.id.tv_result), isDisplayed()))
                .check(matches(withText(String.valueOf(RESULT))));
    }
}