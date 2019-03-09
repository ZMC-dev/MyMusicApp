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
import java.util.Objects;

public class FunkyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.funky_playlist);

        // Set this method to to unable the Up navigation and the text to display
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("All my Playlists");



        // Method of the first Image button "Favorite Playlists" (Horizontal Layout) on funky_playlist.xml
        ImageButton imgBtn_playlist1 = (ImageButton) findViewById(R.id.imgBtn_LoveOnFunky);
        imgBtn_playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistLove = new Intent(FunkyActivity.this, LoveSongsActivity.class);
                startActivity(openPlaylistLove);

                Toast.makeText(FunkyActivity.this, "Playlist Love", Toast.LENGTH_SHORT).show();

            }
        });

        // Method of the second Image button "Favorite Playlists" (Horizontal Layout) on funky_playlist.xml
        ImageButton imgBtn_playlist2 = (ImageButton) findViewById(R.id.imgBtn_RelaxOnFunky);
        imgBtn_playlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistRelax = new Intent(FunkyActivity.this, RelaxActivity.class);
                startActivity(openPlaylistRelax);

                Toast.makeText(FunkyActivity.this, "Playlist Relax", Toast.LENGTH_SHORT).show();

            }
        });

        // Method of the third Image button "Favorite Playlists" (Horizontal Layout) on funky_playlist.xml
        ImageButton imgBtn_playlist3 = (ImageButton) findViewById(R.id.imgBtn_WorkoutOnFunky);
        imgBtn_playlist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistWorkout = new Intent(FunkyActivity.this, WorkingOutActivity.class);
                startActivity(openPlaylistWorkout);

                Toast.makeText(FunkyActivity.this, "Playlist Working Out", Toast.LENGTH_SHORT).show();
            }
        });

        // Method of the fourth Image button "Favorite Playlists" (Horizontal Layout) on funky_playlist.xml
        ImageButton imgBtn_playlist4 = (ImageButton) findViewById(R.id.imgBtn_PartyOnFunky);
        imgBtn_playlist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistParty = new Intent(FunkyActivity.this, PartyActivity.class);
                startActivity(openPlaylistParty);

                Toast.makeText(FunkyActivity.this, "Playlist Party", Toast.LENGTH_SHORT).show();

            }
        });



        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("On The Beat", "The B.B. & Q. Band", R.drawable.funky_1_on_the_beat, R.drawable.play_btn));
        songs.add(new Song("Give me The Night", "George Benson", R.drawable.funky_2_give_me_the_night, R.drawable.play_btn));
        songs.add(new Song("Superstition", "Stevie Wonder", R.drawable.funky_3_superstition, R.drawable.play_btn));
        songs.add(new Song("Celebration", "Kool & The Gang", R.drawable.funky_4_celebration, R.drawable.play_btn));
        songs.add(new Song("Fire", "Ohio Players", R.drawable.funky_5_fire, R.drawable.play_btn));
        songs.add(new Song("Mary Jane", "Rick James", R.drawable.funky_7_mary_jane,R.drawable.play_btn));
        songs.add(new Song("Getaway", "Earth, Wind & Fire", R.drawable.funky_8_getaway,R.drawable.play_btn));
        songs.add(new Song("Another One Bites The Dust", "Queen", R.drawable.funky_9_another_one_bites,R.drawable.play_btn));
        songs.add(new Song("Rock with You", "Michael Jackson", R.drawable.funky_10_rock_with_you,R.drawable.play_btn));


        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(FunkyActivity.this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listViewFunkySongs);
        listView.setAdapter(songAdapter);

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

