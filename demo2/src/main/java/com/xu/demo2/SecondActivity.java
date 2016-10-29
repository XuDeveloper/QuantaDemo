package com.xu.demo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {

    public static String TAG = "SecondActivity";
    private Button toFirstButton;
    private Button toSelfButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG, this.getTaskId() + "/" + this.toString() + ":onCreate");

        toFirstButton = (Button) findViewById(R.id.toFirst_bt);
        toSelfButton = (Button) findViewById(R.id.toSelf_bt);

        toFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

        toSelfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, this.getTaskId() + "/" + this.toString() + ":onNewIntent");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, this.getTaskId() + "/" + this.toString() + ":onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, this.getTaskId() + "/" + this.toString() + ":onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, this.getTaskId() + "/" + this.toString() + ":onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, this.getTaskId() + "/" + this.toString() + ":onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, this.getTaskId() + "/" + this.toString() + ":onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, this.getTaskId() + "/" + this.toString() + ":onDestroy");
    }
}
