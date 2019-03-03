package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LoveSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("I Will Always Love You", "The B.B. & Q. Band", R.drawable.love_1_i_will_always_love_you,R.drawable.play_btn));
        songs.add(new Song("Unchained Melody", "George Benson", R.drawable.love_2_unchained_melody,R.drawable.play_btn));
        songs.add(new Song("How Deep is Your Love", "Bee Gees", R.drawable.love_3_how_deep_is_your_love,R.drawable.play_btn));
        songs.add(new Song("I'll Make Love to You", "Boys II Men", R.drawable.love_4_make_love_to_you,R.drawable.play_btn));
        songs.add(new Song("Endless Love", "Queen", R.drawable.love_5_endless_love,R.drawable.play_btn));
        songs.add(new Song("Baby Love", "The Supremes", R.drawable.love_6_baby_love,R.drawable.play_btn));
        songs.add(new Song("Somebody to Love", "Queen", R.drawable.love_7_somebody_to_love,R.drawable.play_btn));
        songs.add(new Song("Love of My Life", "Queen", R.drawable.love_8_love_of_my_life,R.drawable.play_btn));
        songs.add(new Song("Power of Love", "Celine Dion", R.drawable.love_9_power_of_love,R.drawable.play_btn));
        songs.add(new Song("Best of My Love", "The Emotions", R.drawable.love_10_best_of_my_love,R.drawable.play_btn));


        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter (songAdapter);

    }
}
