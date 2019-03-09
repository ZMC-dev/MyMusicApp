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

public class PartyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.party_playlist);


        // Set this method to to unable the Up navigation and the text to display
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("All my Playlists");


        // Method of the first Image button "Favorite Playlists" (Horizontal Layout) on party_playlist.xml
        ImageButton imgBtn_playlist1 = (ImageButton) findViewById(R.id.imgBtn_FunkyOnParty);
        imgBtn_playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistFunky = new Intent(PartyActivity.this, FunkyActivity.class);
                startActivity(openPlaylistFunky);

                Toast.makeText(PartyActivity.this, "Playlist Funky", Toast.LENGTH_SHORT).show();

            }
        });

        // Method of the second Image button "Favorite Playlists" (Horizontal Layout) on party_playlist.xml
        ImageButton imgBtn_playlist2 = (ImageButton) findViewById(R.id.imgBtn_RelaxOnParty);
        imgBtn_playlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistRelax = new Intent(PartyActivity.this, RelaxActivity.class);
                startActivity(openPlaylistRelax);

                Toast.makeText(PartyActivity.this, "Playlist Relax", Toast.LENGTH_SHORT).show();

            }
        });

        // Method of the third Image button "Favorite Playlists" (Horizontal Layout) on party_playlist.xml
        ImageButton imgBtn_playlist3 = (ImageButton) findViewById(R.id.imgBtn_WorkoutOnParty);
        imgBtn_playlist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistWorkout = new Intent(PartyActivity.this, WorkingOutActivity.class);
                startActivity(openPlaylistWorkout);

                Toast.makeText(PartyActivity.this, "Playlist Working Out", Toast.LENGTH_SHORT).show();

            }
        });

        // Method of the fourth Image button "Favorite Playlists" (Horizontal Layout) on party_playlist.xml
        ImageButton imgBtn_playlist4 = (ImageButton) findViewById(R.id.imgBtn_LoveOnParty);
        imgBtn_playlist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistLove = new Intent(PartyActivity.this,LoveSongsActivity.class);
                startActivity(openPlaylistLove);

                Toast.makeText(PartyActivity.this, "Playlist Love", Toast.LENGTH_SHORT).show();

            }
        });


        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Crazy in Love", "The B.B. & Q. Band", R.drawable.party_1_crazy_inlove,R.drawable.play_btn));
        songs.add(new Song("Umbrella", "Rihanna", R.drawable.party_2_umbrella,R.drawable.play_btn));
        songs.add(new Song("I Gotta Feeling", "The Black Eyes Peas", R.drawable.party_3_gotta_feeling,R.drawable.play_btn));
        songs.add(new Song("Taki Taki", "DJ Snake", R.drawable.party_4_taki_taki,R.drawable.play_btn));
        songs.add(new Song("Cosmic Girl", "Jamiroquai", R.drawable.party_5_cosmic_girl,R.drawable.play_btn));
        songs.add(new Song("Price Tag", "Jessie J", R.drawable.party_6_price_tag,R.drawable.play_btn));
        songs.add(new Song("Shape of You", "Ed Sheeran", R.drawable.party_7_shape_of_you,R.drawable.play_btn));
        songs.add(new Song("Treasure", "Bruno Mars", R.drawable.party_8_treasure,R.drawable.play_btn));


        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listViewPartySongs);
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
