package com.nyinyihtunlwin.samplelibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nyinyihtunlwin.library.L;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        L.d("Debug-Tag", "HelloWorld, This is Debug log.");
        L.e("Error-Tag", "HelloWorld, This is Error log.");
        L.i("Info-Tag", "HelloWorld,This is Info log.");
        L.w("Warn-Tag", "HelloWorld, This is Warn log.");
        L.wtf("WTF-Tag", "HelloWorld, This is WTF log.");
    }
}
