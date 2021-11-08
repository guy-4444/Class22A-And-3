package com.guy.class22a_and_3;

import android.content.Context;
import android.content.SharedPreferences;

public class MSPV1 {

    private static final String SP_FILE = "SP_FILE";

    public static int getIntSP(Context context, String KEY, int defValue) {
        SharedPreferences settings = context.getApplicationContext().getSharedPreferences(SP_FILE, Context.MODE_PRIVATE);
        return settings.getInt(KEY, defValue);
    }

    public static void putIntSP(Context context, String KEY, int value) {
        SharedPreferences settings = context.getApplicationContext().getSharedPreferences(SP_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(KEY, value);
        editor.apply();
    }

    public static String getStringSP(Context context, String KEY, String defValue) {
        SharedPreferences settings = context.getApplicationContext().getSharedPreferences(SP_FILE, Context.MODE_PRIVATE);
        return settings.getString(KEY, defValue);
    }

    public static void putStringSP(Context context, String KEY, String value) {
        SharedPreferences settings = context.getApplicationContext().getSharedPreferences(SP_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(KEY, value);
        editor.apply();
    }
}
