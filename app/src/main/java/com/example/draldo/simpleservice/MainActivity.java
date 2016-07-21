package com.example.draldo.simpleservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("TAG_","We're in the onCreate of the Activity");
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG_","We're in the onStart of the Activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG_","We're in the onRestart of the Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG_","We're in the onResume of the Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG_","We're in the onPause of the Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG_","We're in the onStop of the Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG_","We're in the onDestroy of the Activity");
    }

    public void doMagic(View view) {
        EditText editText = (EditText) findViewById(R.id.a_main_et);
        TextView textView = (TextView) findViewById(R.id.a_main_txt);

        textView.setText(editText.getText());
    }
}
