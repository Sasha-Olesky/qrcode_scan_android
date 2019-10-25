package clackor.com.qrscan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import clackor.com.qrscan.Common.Utils;
import clackor.com.qrscan.zxing.CaptureActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getParamsFromIntent();
        getViewByID();
        initNavBar();
        initializeData();
        setOnListener();
    }

    // get params form intent
    public void getParamsFromIntent () {

    }

    // get view from ID
    public void getViewByID () {

    }

    // init navigationbaar
    public void initNavBar () {

    }

    // init data and view
    public void initializeData () {

    }

    // set event on controls
    public void setOnListener () {
        findViewById(R.id.btn_qrcode).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_qrcode:                   // click qrscan button
                Utils.start_Activity(this, CaptureActivity.class);
                break;
        }
    }
}
