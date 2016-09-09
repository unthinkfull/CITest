package com.egg.android.citest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mTextContent = (TextView) findViewById(R.id.text_main_content);
        mTextContent.setText("CI is OK, and apk is on fir.im http://fir.im/87dg");
        mTextContent.setTextColor(Color.MAGENTA);

    }
}
