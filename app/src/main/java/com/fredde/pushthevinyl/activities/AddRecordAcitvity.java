package com.fredde.pushthevinyl.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.fredde.pushthevinyl.R;

/**
 * Created by Fredde on 30/07/2015.
 */
public class AddRecordAcitvity extends AppCompatActivity{

    public static void start(Context context) {
        Intent launchIntent = new Intent(context, AddRecordAcitvity.class);
        context.startActivity(launchIntent);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.add_record_activity);
    }
}
