package com.ggx.ruler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RulerView.RulerCallback{

    TextView tv;
    RulerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.tv);
        rv= (RulerView) findViewById(R.id.rv);
        rv.setCallback(this);
    }

    @Override
    public void resultNum(int num) {
        tv.setText("身高"+num+"cm");
    }
}
