package io.levelsoftware.cimvptesting.ui.number;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class NumberPresenterTest {

    @Mock
    NumberContract.View numberView;

    NumberContract.Presenter presenter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        presenter = new NumberPresenter(numberView);
    }

    @Test
    public void givenTwoNumbers_Expect_Sum() throws Exception {
        assertEquals(presenter.calculateResult(1, 1), 2);
    }

    @Test
    public void givenCharSequence_Expect_IntValue() throws Exception {
        CharSequence sequence = "1234";
        int result = presenter.parseNumber(sequence);

        assertEquals(result, 1234);
    }

}