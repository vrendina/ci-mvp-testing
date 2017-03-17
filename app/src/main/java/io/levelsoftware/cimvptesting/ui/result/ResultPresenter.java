package io.levelsoftware.cimvptesting.ui.result;

import android.support.annotation.NonNull;

public class ResultPresenter implements ResultContract.Presenter {

    @NonNull
    private final ResultContract.View resultView;

    private int result;

    public ResultPresenter(@NonNull ResultContract.View resultView) {
        this.resultView = resultView;

        resultView.setPresenter(this);
    }

    @Override
    public void updateResult(int result) {
        this.result = result;
        resultView.displayResult();
    }

    @Override
    public int getResult() {
        return result;
    }

}
