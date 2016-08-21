package com.akaita.example.appmodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.akaita.example.nativeapi.Time;

public class MainActivity extends AppCompatActivity {

    private TextView mHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mHello = (TextView) findViewById(R.id.txtTime);

        Button btnGet = (Button) findViewById(R.id.btnTime);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Time nativeTime = new Time();
                mHello.setText(nativeTime.now());
            }
        });
    }
}
