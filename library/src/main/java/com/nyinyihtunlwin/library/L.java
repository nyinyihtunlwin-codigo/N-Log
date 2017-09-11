package com.nyinyihtunlwin.library;

import android.util.Log;

/**
 * Created by Dell on 8/17/2017.
 */

public class L {

    public static void d(String tag, String message) {
        String bar = "";
        String tagger = "|*=";
        String tagData = "|* ";
        for (int i = 0; i < message.length(); i++) {
            bar += "-";
        }
        for (int j = 0; j < tag.length(); j++) {
            tagger += "-";
        }
        tag+=" :";
        tagData += tag;
        tagger += " :";
        bar += "=*";
        Log.d(tagger, bar);
        Log.d(tagData, message + " |");
        Log.d(tagger, bar);
    }

    public static void e(String tag, String message) {
        String bar = "";
        String tagger = "|*=";
        String tagData = "|* ";
        for (int i = 0; i < message.length(); i++) {
            bar += "-";
        }
        for (int j = 0; j < tag.length(); j++) {
            tagger += "-";
        }
        tag+=" :";
        tagData += tag;
        tagger += " :";
        bar += "=*";
        Log.e(tagger, bar);
        Log.e(tagData, message + " |");
        Log.e(tagger, bar);
    }

    public static void i(String tag, String message) {
        String bar = "";
        String tagger = "|*=";
        String tagData = "|* ";
        for (int i = 0; i < message.length(); i++) {
            bar += "-";
        }
        for (int j = 0; j < tag.length(); j++) {
            tagger += "-";
        }
        tag+=" :";
        tagData += tag;
        tagger += " :";
        bar += "=*";
        Log.i(tagger, bar);
        Log.i(tagData, message + " |");
        Log.i(tagger, bar);
    }

    public static void v(String tag, String message) {
        String bar = "";
        String tagger = "|*=";
        String tagData = "|* ";
        for (int i = 0; i < message.length(); i++) {
            bar += "-";
        }
        for (int j = 0; j < tag.length(); j++) {
            tagger += "-";
        }
        tag+=" :";
        tagData += tag;
        tagger += " :";
        bar += "=*";
        Log.v(tagger, bar);
        Log.v(tagData, message + " |");
        Log.v(tagger, bar);
    }

    public static void w(String tag, String message) {
        String bar = "";
        String tagger = "|*=";
        String tagData = "|* ";
        for (int i = 0; i < message.length(); i++) {
            bar += "-";
        }
        for (int j = 0; j < tag.length(); j++) {
            tagger += "-";
        }
        tag+=" :";
        tagData += tag;
        tagger += " :";
        bar += "=*";
        Log.w(tagger, bar);
        Log.w(tagData, message + " |");
        Log.w(tagger, bar);
    }

    public static void wtf(String tag, String message) {
        String bar = "";
        String tagger = "|*=";
        String tagData = "|* ";
        for (int i = 0; i < message.length(); i++) {
            bar += "-";
        }
        for (int j = 0; j < tag.length(); j++) {
            tagger += "-";
        }
        tag+=" :";
        tagData += tag;
        tagger += " :";
        bar += "=*";
        Log.e(tagger, bar);
        Log.wtf(tagData, message + " |");
        Log.e(tagger, bar);
    }
}
