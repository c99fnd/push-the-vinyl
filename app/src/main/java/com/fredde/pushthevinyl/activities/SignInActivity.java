package com.fredde.pushthevinyl.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.fredde.pushthevinyl.R;

/**
 * Created by Fredde on 23/06/2015.
 */
public class SignInActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent launchIntent = new Intent(context, SignInActivity.class);
        context.startActivity(launchIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(getString(R.string.sign_in_label));
        }
    }
}
