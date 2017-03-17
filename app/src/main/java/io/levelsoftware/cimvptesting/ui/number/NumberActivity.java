/*
 * Copyright (c) 2017 Level Software LLC.
 */

package io.levelsoftware.cimvptesting.ui.number;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import io.levelsoftware.cimvptesting.R;
import io.levelsoftware.cimvptesting.ui.result.ResultActivity;

public class NumberActivity extends AppCompatActivity implements NumberContract.View {

    private NumberContract.Presenter numberPresenter;

    private TextView numberOneTextView;

    private TextView numberTwoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        numberOneTextView = (TextView) findViewById(R.id.tv_number1);
        numberTwoTextView = (TextView) findViewById(R.id.tv_number2);

        Button submitButton = (Button) findViewById(R.id.btn_add);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayResult();
            }
        });

        numberPresenter = new NumberPresenter(this);
    }

    @Override
    public void setPresenter(@NonNull NumberContract.Presenter presenter) {

    }

    @Override
    public void displayResult() {
        Intent intent = new Intent(this, ResultActivity.class);

        int result = numberPresenter.calculateResult(
                numberPresenter.parseNumber(numberOneTextView.getText()),
                numberPresenter.parseNumber(numberTwoTextView.getText())
        );
        intent.putExtra("result", result);

        startActivity(intent);
    }

}
