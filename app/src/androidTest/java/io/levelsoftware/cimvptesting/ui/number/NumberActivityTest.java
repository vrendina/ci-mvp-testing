package io.levelsoftware.cimvptesting.ui.number;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.levelsoftware.cimvptesting.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
public class NumberActivityTest {

    @Rule
    public ActivityTestRule<NumberActivity> mActivityTestRule = new ActivityTestRule<>(NumberActivity.class);

    @Test
    public void numberActivityTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.tv_number1), isDisplayed()));
        appCompatEditText.perform(replaceText("54"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.tv_number2), isDisplayed()));
        appCompatEditText2.perform(replaceText("63"), closeSoftKeyboard());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn_add), withText("Add"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction textView = onView(allOf(withId(R.id.tv_result), isDisplayed()));
        textView.check(matches(withText("117")));

    }
}
