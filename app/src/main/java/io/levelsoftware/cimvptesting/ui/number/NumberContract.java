package io.levelsoftware.cimvptesting.ui.number;

import io.levelsoftware.cimvptesting.ui.base.BasePresenter;
import io.levelsoftware.cimvptesting.ui.base.BaseView;

public interface NumberContract {

    interface Presenter extends BasePresenter {

        int calculateResult(int numberOne, int numberTwo);

        int parseNumber(CharSequence sequence);

    }

    interface View extends BaseView<Presenter> {

        void displayResult();

    }

}
