package com.nyinyihtunlwin.samplelibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nyinyihtunlwin.library.L;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        L.d("Hey-Debug", "HelloWorld");
        L.e("Hey-Error", "HelloWorld, This is error log.");
        L.i("Hey-Info", "HelloWorld");
        L.w("Hey-W", "HelloWorld");
        L.wtf("Hey-WTF", "HelloWorld");
    }
}
