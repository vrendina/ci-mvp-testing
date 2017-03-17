package io.levelsoftware.cimvptesting.ui.result;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.levelsoftware.cimvptesting.R;

public class ResultActivity extends AppCompatActivity implements ResultContract.View {

    private ResultContract.Presenter resultPresenter;

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView = (TextView)findViewById(R.id.tv_result);

        resultPresenter = new ResultPresenter(this);

        int result = getIntent().getIntExtra("result", 0);
        resultPresenter.updateResult(result);
    }


    @Override
    public void setPresenter(ResultContract.Presenter presenter) {

    }

    @Override
    public void displayResult() {
        resultTextView.setText(String.valueOf(resultPresenter.getResult()));
    }

}
