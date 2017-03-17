package io.levelsoftware.cimvptesting.ui.number;

import android.support.annotation.NonNull;

public class NumberPresenter implements NumberContract.Presenter {

    @NonNull
    private NumberContract.View numberView;

    public NumberPresenter(@NonNull NumberContract.View numberView) {
        this.numberView = numberView;
    }

    @Override
    public int calculateResult(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    @Override
    public int parseNumber(CharSequence sequence) {
        if(sequence.length() == 0)
            return 0;

        return Integer.parseInt(sequence.toString());
    }

}
