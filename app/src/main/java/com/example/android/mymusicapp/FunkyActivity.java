package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FunkyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funky);

        // Create an array of words
        ArrayList<String> playlist_funky = new ArrayList<String>();

        playlist_funky.add("one");
        playlist_funky.add("two");
        playlist_funky.add("three");
        playlist_funky.add("four");
        playlist_funky.add("five");
        playlist_funky.add("six");
        playlist_funky.add("seven");
        playlist_funky.add("eight");
        playlist_funky.add("nine");
        playlist_funky.add("ten");


        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,playlist_funky);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}


