package com.testapp.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.testapp.R;

public class MainActivity extends Activity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        text = (TextView) findViewById(R.id.text);
    }
}
