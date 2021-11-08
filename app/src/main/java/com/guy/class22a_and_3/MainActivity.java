package com.guy.class22a_and_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.gson.Gson;
import com.guy.class22a_and_3.objects.MyDB;
import com.guy.class22a_and_3.objects.Record;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // https://github.com/amitshekhariitbhu/Android-Debug-Database

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //int a1 = MSPV1.getIntSP(this, "SCORE-1", 0);
        //MSPV2 mspv2 = new MSPV2(this);
        //int a2 = mspv2.getIntSP("SCORE-1", 0);
        //int a3 = MSPV3.getMe().getInt("SCORE-1", 0);


        MyDB myDB = new MyDB();
        for (int i = 0; i < 10; i++) {
            myDB.getRecords().add(new Record()
                    .setTime(System.currentTimeMillis() - (i*1000*60*60*24))
                    .setScore(new Random().nextInt(100))
                    .setLat(i*10)
                    .setLon(i*10)
            );
        }



        String json = new Gson().toJson(myDB);
        MSPV3.getMe().putString("MY_DB", json);


        String js = MSPV3.getMe().getString("MY_DB", "");
        MyDB md = new Gson().fromJson(js, MyDB.class);

        int x = 0;

    }

}