package io.levelsoftware.cimvptesting.ui.result;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class ResultPresenterTest {

    public static final int RESULT = 99;

    @Mock
    ResultContract.View resultsView;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void updateResultCallsDisplayResult() throws Exception {
        ResultContract.Presenter presenter = new ResultPresenter(resultsView);

        presenter.updateResult(RESULT);

        verify(resultsView).displayResult();
    }

    @Test
    public void updateResultThenGetResult() throws Exception {
        ResultContract.Presenter presenter = new ResultPresenter(resultsView);

        presenter.updateResult(RESULT);

        assertEquals(presenter.getResult(), RESULT);
    }

}