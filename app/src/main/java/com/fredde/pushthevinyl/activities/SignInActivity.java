package com.fredde.pushthevinyl.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fredde.pushthevinyl.R;

/**
 * Allows the user to sign in to Discogs.
 */
public class SignInActivity extends AppCompatActivity {

    private Button mSignInButton;

    private EditText mEmailTextEdit;

    private EditText mPwdEditText;

    private boolean mPwdValid;

    private boolean mEmailValid;

    public static void start(Context context) {
        Intent launchIntent = new Intent(context, SignInActivity.class);
        context.startActivity(launchIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(getString(R.string.sign_in_label));
        }

        mSignInButton = (Button) findViewById(R.id.sign_in_button);
        mSignInButton.setEnabled(false);
        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSignIn();
            }
        });

        mEmailTextEdit = (EditText) findViewById(R.id.email_edit_text);
        mEmailTextEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                /* Do nothing. */
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                /* Do nothing. */
            }

            @Override
            public void afterTextChanged(Editable text) {
                if (text.length() != 0) {
                    mEmailValid = true;
                    mSignInButton.setEnabled(mEmailValid && mPwdValid);
                }
            }
        });

        mPwdEditText = (EditText) findViewById(R.id.pwd_edit_text);
        mPwdEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                /* Do nothing. */
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                 /* Do nothing. */
            }

            @Override
            public void afterTextChanged(Editable text) {
                if (text.length() != 0) {
                    mPwdValid = true;
                    mSignInButton.setEnabled(mEmailValid && mPwdValid);
                }
            }
        });
    }

    /**
     * Sign In
     */
    private void doSignIn() {

    }
}
