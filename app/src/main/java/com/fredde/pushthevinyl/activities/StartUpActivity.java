package com.fredde.pushthevinyl.activities;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Fredde on 23/06/2015.
 */
public class StartUpActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainActivity.start(this);
        finish();
    }
}
