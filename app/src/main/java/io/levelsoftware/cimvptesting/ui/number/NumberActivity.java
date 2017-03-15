/*
 * Copyright (c) 2017 Level Software LLC.
 */

package io.levelsoftware.cimvptesting.ui.number;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import io.levelsoftware.cimvptesting.R;

public class NumberActivity extends AppCompatActivity implements NumberContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
    }

    @Override
    public void setPresenter(@NonNull NumberContract.Presenter presenter) {

    }
}
