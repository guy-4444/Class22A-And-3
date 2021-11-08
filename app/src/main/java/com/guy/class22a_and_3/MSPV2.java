package com.guy.class22a_and_3;

import android.content.Context;
import android.content.SharedPreferences;

public class MSPV2 {

    private final String SP_FILE = "SP_FILE";

    private Context context;
    private SharedPreferences sharedPreferences;

    public MSPV2(Context context) {
        this.context = context;
        sharedPreferences = context.getApplicationContext().getSharedPreferences(SP_FILE, Context.MODE_PRIVATE);
    }

    public int getIntSP(String KEY, int defValue) {
        return sharedPreferences.getInt(KEY, defValue);
    }

    public void putIntSP(String KEY, int value) {
        sharedPreferences.edit().putInt(KEY, value).apply();
    }

    public String getStringSP(String KEY, String defValue) {
        return sharedPreferences.getString(KEY, defValue);
    }

    public void putStringSP(String KEY, String value) {
        sharedPreferences.edit().putString(KEY, value).apply();
    }
}
