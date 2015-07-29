package com.fredde.pushthevinyl.activities;

import android.app.Activity;
import android.os.Bundle;

/**
 * Responsible for checking signed in status and launching appropriate activity.
 */
public class StartUpActivity extends Activity {

    /**
     * Debug flag.
     */
    private static final boolean SIGNED_IN = true ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(SIGNED_IN) {
            MainActivity.start(this);
        } else {
            SignInActivity.start(this);
        }
        finish();
    }
}
