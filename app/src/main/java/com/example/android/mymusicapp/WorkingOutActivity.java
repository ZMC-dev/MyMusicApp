package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class WorkingOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_playlist);

        // Set this method to to unable the Up navigation and the text to display
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("All my Playlists");


        // Method of the first Image button "Favorite Playlists" (Horizontal Layout) on workout_playlist.xml
        ImageButton imgBtn_playlist1 = (ImageButton) findViewById(R.id.imgBtn_FunkyOnWorkout);
        imgBtn_playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistFunky = new Intent(WorkingOutActivity.this, FunkyActivity.class);
                startActivity(openPlaylistFunky);

                Toast.makeText(WorkingOutActivity.this, "Playlist Funky", Toast.LENGTH_SHORT).show();

            }
        });

        // Method of the second Image button "Favorite Playlists" (Horizontal Layout) on workout_playlist.xml
        ImageButton imgBtn_playlist2 = (ImageButton) findViewById(R.id.imgBtn_RelaxOnWorkout);
        imgBtn_playlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistRelax = new Intent(WorkingOutActivity.this, RelaxActivity.class);
                startActivity(openPlaylistRelax);

                Toast.makeText(WorkingOutActivity.this, "Playlist Relax", Toast.LENGTH_SHORT).show();

            }
        });

        // Method of the third Image button "Favorite Playlists" (Horizontal Layout) on workout_playlist.xml
        ImageButton imgBtn_playlist3 = (ImageButton) findViewById(R.id.imgBtn_LoveOnWorkout);
        imgBtn_playlist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistLove = new Intent(WorkingOutActivity.this, LoveSongsActivity.class);
                startActivity(openPlaylistLove);

                Toast.makeText(WorkingOutActivity.this, "Playlist Love", Toast.LENGTH_SHORT).show();

            }
        });

        // Method of the fourth Image button "Favorite Playlists" (Horizontal Layout) on workout_playlist.xml
        ImageButton imgBtn_playlist4 = (ImageButton) findViewById(R.id.imgBtn_PartyOnWorkout);
        imgBtn_playlist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistParty = new Intent(WorkingOutActivity.this, PartyActivity.class);
                startActivity(openPlaylistParty);

                Toast.makeText(WorkingOutActivity.this, "Playlist Party", Toast.LENGTH_SHORT).show();

            }
        });

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();
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
        ListView listView = (ListView) findViewById(R.id.listViewWorkoutSongs);
        listView.setAdapter (songAdapter);

    }

    // NavUtils class's static method link to up navigation bar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
