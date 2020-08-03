package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("lifecycle" , "OnCreate() invoked");

        TextView txtMsg2 =findViewById(R.id.tvMsg2);
        txtMsg2.setText(R.string.Msg2);



    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("lifecycle" , "OnStart() invoked");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("lifecycle" , "OnResume() invoked");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("lifecycle" , "OnPause() invoked");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("lifecycle" , "OnStop() invoked");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("lifecycle" , "OnDestroy() invoked");
    }
}