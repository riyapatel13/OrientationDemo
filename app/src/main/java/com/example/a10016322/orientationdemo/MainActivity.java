package com.example.a10016322.orientationdemo;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView)(findViewById(R.id.textView_1));
        t2 = (TextView)(findViewById(R.id.textView_2));
        t3 = (TextView)(findViewById(R.id.textView_3));
        // t3.setText("Land"); crashes in portrait mode b/c t3 does not exist in portrait mode

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
        {//if orientation is in portrait
            t1.setText("Port 1");
            t2.setText("Port 2");
        }
        if(t3 != null) //if t3 exists
            t3.setText("Land");

    }
}
