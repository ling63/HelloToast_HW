
package com.example.android.hellotoast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_COUNT = "com.example.android.hellotoast.COUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount ++;
        if (mShowCount != null){
            mShowCount.setText(String.format(Locale.ENGLISH, "%d", mCount));
        }
    }

    public void sayHello(View view) {
        Intent intent = new Intent(this, HelloToast.class);
        intent.putExtra(EXTRA_COUNT, mCount);
        startActivity(intent);
    }
}
