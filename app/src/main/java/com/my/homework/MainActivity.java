package com.my.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TextViewHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextViewHello = findViewById(R.id.TextViewHello);
        TextViewHello.setText("feature_1");

        TextViewHello.setText("feature_2");
    }
}
