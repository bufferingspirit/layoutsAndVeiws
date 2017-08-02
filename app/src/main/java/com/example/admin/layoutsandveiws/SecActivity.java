package com.example.admin.layoutsandveiws;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecActivity extends AppCompatActivity {

    private static final String TAG = "Second";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Intent intent = getIntent();

        switch(intent.getAction()){
            case "sendingValue":
                Log.d(TAG, "onCreate: " + intent.getStringExtra(getString(R.string.KEY_VALUE1)));
                break;
            case "sendingPerson":
                Person person = (Person) intent.getSerializableExtra("person");
                Log.d(TAG, "onCreate: " + person.getName() + person.getGender());
                break;
        }

        Log.d(TAG, "onCreate: " + intent.getStringExtra(getString(R.string.KEY_VALUE1)));
    }
}
