package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class WorkingOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("On The Beat", "The B.B. & Q. Band", R.drawable.funky_1_on_the_beat,R.drawable.play_button));
        songs.add(new Song("Give me The Night", "George Benson", R.drawable.funky_2_give_me_the_night,R.drawable.play_button));
        songs.add(new Song("Superstition", "Stevie Wonder", R.drawable.funky_3_superstition,R.drawable.play_button));
        songs.add(new Song("Celebration", "Kool & The Gang", R.drawable.funky_4_celebration,R.drawable.play_button));
        songs.add(new Song("Fire", "Ohio Players", R.drawable.funky_5_fire,R.drawable.play_button));
        songs.add(new Song("Cutie Pie", "One Way", R.drawable.funky_6_cutie_pie,R.drawable.play_button));
        songs.add(new Song("Mary Jane", "Rick James", R.drawable.funky_7_mary_jane,R.drawable.play_button));
        songs.add(new Song("Getaway", "Earth, Wind & Fire", R.drawable.funky_8_getaway,R.drawable.play_button));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter (songAdapter);

    }
}
