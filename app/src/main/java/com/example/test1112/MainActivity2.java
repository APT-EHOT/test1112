package com.example.test1112;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("LifecycleActivityTag", "onCreate2");
        tv = findViewById(R.id.textView2);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifecycleActivityTag", "onStart2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifecycleActivityTag", "onResume2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifecycleActivityTag", "onPause2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifecycleActivityTag", "onRestart2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifecycleActivityTag", "onStop2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifecycleActivityTag", "onDestroy2");
    }
}