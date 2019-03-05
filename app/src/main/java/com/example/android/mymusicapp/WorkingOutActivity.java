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
        songs.add(new Song("PLAY ALL THE PLAYLIST", "Playlist WORKING-OUT", R.drawable.workout,R.drawable.play_button));
        songs.add(new Song("Con Calma", "Daddy Yankee", R.drawable.workout_1_con_calma,R.drawable.play_btn));
        songs.add(new Song("Pretend", "CNCO", R.drawable.workout_2_pretend,R.drawable.play_btn));
        songs.add(new Song("Taboo", "Don Omar", R.drawable.workout_3_taboo,R.drawable.play_btn));
        songs.add(new Song("Sin Pijama", "Becky G & Natti Natasha", R.drawable.workout_4_sin_pijama,R.drawable.play_btn));
        songs.add(new Song("Dura", "Daddy Yankee", R.drawable.workout_5_dura,R.drawable.play_btn));
        songs.add(new Song("Imposible", "Luis Fonsi", R.drawable.workout_6_impossible,R.drawable.play_btn));
        songs.add(new Song("Mi Cama", "Karol G", R.drawable.workout_7_mi_cama,R.drawable.play_btn));
        songs.add(new Song("Terremoto", "Anitta", R.drawable.workout_8_terremoto,R.drawable.play_btn));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter (songAdapter);

    }
}
