package com.example.myapplication;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

public class MainInstrumentedTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainInstrumentedTest() {
        super("com.example.myapplication",MainActivity.class);
    }

    public void testUI(){
        Activity activity = getActivity();

        final Button button = (Button)activity.findViewById(R.id.btn_signin);
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {

            button.performClick();
            }
        });

    }
}
