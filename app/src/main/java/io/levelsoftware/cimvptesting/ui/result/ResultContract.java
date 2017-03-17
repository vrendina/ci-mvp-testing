package io.levelsoftware.cimvptesting.ui.result;

import io.levelsoftware.cimvptesting.ui.base.BasePresenter;
import io.levelsoftware.cimvptesting.ui.base.BaseView;

public interface ResultContract {
    interface Presenter extends BasePresenter {

        void updateResult(int result);

        int getResult();

    }

    interface View extends BaseView<Presenter> {

        void displayResult();

    }

}
