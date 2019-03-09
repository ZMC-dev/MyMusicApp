package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RelaxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relax_playlist);


        // Set this method to to unable the Up navigation and the text to display
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("All my Playlists");


        // Method of the first Image button "Favorite Playlists" (Horizontal Layout) on relax_playlist.xml
        ImageButton imgBtn_playlist1 = (ImageButton) findViewById(R.id.imgBtn_FunkyOnRelax);
        imgBtn_playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistFunky = new Intent(RelaxActivity.this, FunkyActivity.class);
                startActivity(openPlaylistFunky);

                Toast.makeText(RelaxActivity.this, "Playlist Funky", Toast.LENGTH_SHORT).show();
            }
        });

        // Method of the second Image button "Favorite Playlists" (Horizontal Layout) on relax_playlist.xml
        ImageButton imgBtn_playlist2 = (ImageButton) findViewById(R.id.imgBtn_LoveOnRelax);
        imgBtn_playlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistLove = new Intent(RelaxActivity.this, LoveSongsActivity.class);
                startActivity(openPlaylistLove);

                Toast.makeText(RelaxActivity.this, "Playlist Love", Toast.LENGTH_SHORT).show();
            }
        });

        // Method of the third Image button "Favorite Playlists" (Horizontal Layout) on relax_playlist.xml
        ImageButton imgBtn_playlist3 = (ImageButton) findViewById(R.id.imgBtn_WorkoutOnRelax);
        imgBtn_playlist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistWorkout = new Intent(RelaxActivity.this, WorkingOutActivity.class);
                startActivity(openPlaylistWorkout);

                Toast.makeText(RelaxActivity.this, "Playlist WorkingOut", Toast.LENGTH_SHORT).show();
            }
        });

        // Method of the fourth Image button "Favorite Playlists" (Horizontal Layout) on relax_playlist.xml
        ImageButton imgBtn_playlist4 = (ImageButton) findViewById(R.id.imgBtn_PartyOnRelax);
        imgBtn_playlist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistParty = new Intent(RelaxActivity.this, PartyActivity.class);
                startActivity(openPlaylistParty);

                Toast.makeText(RelaxActivity.this, "Playlist Party", Toast.LENGTH_SHORT).show();
            }
        });


        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Trouble", "Coldplay", R.drawable.relax_1_trouble,R.drawable.play_btn));
        songs.add(new Song("Ride", "Lana del Rey", R.drawable.relax_2_ride,R.drawable.play_btn));
        songs.add(new Song("Chasing Cars", "Snow Patrol", R.drawable.relax_3_chasing_cars,R.drawable.play_btn));
        songs.add(new Song("Diamonds", "Rihanna", R.drawable.relax_4_diamonds,R.drawable.play_btn));
        songs.add(new Song("Stay", "Rihanna", R.drawable.relax_5_stay,R.drawable.play_btn));
        songs.add(new Song("The Reason", "Hoobastank", R.drawable.relax_6_reason,R.drawable.play_btn));
        songs.add(new Song("Iris", "Goo Goo Dolls", R.drawable.relax_7_iris,R.drawable.play_btn));
        songs.add(new Song("Who Knew", "Pink", R.drawable.relax_8_who_knew,R.drawable.play_btn));


        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listViewRelaxSongs);
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
