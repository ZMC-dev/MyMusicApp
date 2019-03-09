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

public class LoveSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.love_playlist);

        // Set this method to to unable the Up navigation and the text to display
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("All my Playlists");


        // Method of the first Image button "Favorite Playlists" (Horizontal Layout) on love_playlist.xml
        ImageButton imgBtn_playlist1 = (ImageButton) findViewById(R.id.imgBtn_FunkyOnLove);
        imgBtn_playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistFunky = new Intent(LoveSongsActivity.this, FunkyActivity.class);
                startActivity(openPlaylistFunky);

                Toast.makeText(LoveSongsActivity.this, "Playlist Funky", Toast.LENGTH_SHORT).show();

            }
        });

        // Method of the second Image button "Favorite Playlists" (Horizontal Layout) on love_playlist.xml
        ImageButton imgBtn_playlist2 = (ImageButton) findViewById(R.id.imgBtn_RelaxOnLove);
        imgBtn_playlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistRelax = new Intent(LoveSongsActivity.this, RelaxActivity.class);
                startActivity(openPlaylistRelax);

                Toast.makeText(LoveSongsActivity.this, "Playlist Relax", Toast.LENGTH_SHORT).show();

            }
        });

        // Method of the third Image button "Favorite Playlists" (Horizontal Layout) on love_playlist.xml
        ImageButton imgBtn_playlist3 = (ImageButton) findViewById(R.id.imgBtn_WorkoutOnLove);
        imgBtn_playlist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistWorkout = new Intent(LoveSongsActivity.this, WorkingOutActivity.class);
                startActivity(openPlaylistWorkout);

                Toast.makeText(LoveSongsActivity.this, "Playlist Working Out", Toast.LENGTH_SHORT).show();

            }
        });

        // Method of the fourth Image button "Favorite Playlists" (Horizontal Layout) on love_playlist.xml
        ImageButton imgBtn_playlist4 = (ImageButton) findViewById(R.id.imgBtn_PartyOnLove);
        imgBtn_playlist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistParty = new Intent(LoveSongsActivity.this, PartyActivity.class);
                startActivity(openPlaylistParty);

                Toast.makeText(LoveSongsActivity.this, "Playlist Party", Toast.LENGTH_SHORT).show();

            }
        });


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


        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listViewLoveSongs);
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
