package com.guy.class22a_and_3.objects;

import java.util.ArrayList;

public class MyDB {

    private ArrayList<Record> records = new ArrayList<>();

    public MyDB() { }

    public ArrayList<Record> getRecords() {
        return records;
    }

    public MyDB setRecords(ArrayList<Record> records) {
        this.records = records;
        return this;
    }
}
