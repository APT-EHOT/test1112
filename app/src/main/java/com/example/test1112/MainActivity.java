package com.example.test1112;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LifecycleActivityTag", "onCreate");

        tv = findViewById(R.id.textView);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("LifecycleActivityTag", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LifecycleActivityTag", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf("LifecycleActivityTag", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifecycleActivityTag", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifecycleActivityTag", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifecycleActivityTag", "onDestroy");
    }
}