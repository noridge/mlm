package com.harkish.projectone;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.harkish.multiplication.Multiplication;
import com.harkish.projectone.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
        Multiplication multiplication = new Multiplication();
        Log.d(LOG_TAG, "2 x 3 = " + multiplication.multiply(2, 3));
    }
}