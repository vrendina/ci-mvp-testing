package io.levelsoftware.cimvptesting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_isWrong() throws Exception {
        assertEquals("Trying to add two numbers", 4, 1+2);
    }

    @Test
    public void addition_still_isWrong() throws Exception {
        //fail();
    }
}