package com.xu.demo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {

    public static String TAG = "FirstActivity";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.i(TAG, this.getTaskId() + "/" + this.toString() + ":onCreate");

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
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
