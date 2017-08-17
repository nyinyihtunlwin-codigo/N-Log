package com.nyinyihtunlwin.library;

import android.util.Log;

/**
 * Created by Dell on 8/17/2017.
 */

public class LogDebug {
    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
