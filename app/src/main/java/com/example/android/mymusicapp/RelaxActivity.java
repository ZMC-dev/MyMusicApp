package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RelaxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relax_playlist);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("PLAY ALL THE PLAYLIST", "Playlist RELAX", R.drawable.relax,R.drawable.play_button));
        songs.add(new Song("Trouble", "Coldplay", R.drawable.relax_1_trouble,R.drawable.play_btn));
        songs.add(new Song("Ride", "Lana del Rey", R.drawable.relax_2_ride,R.drawable.play_btn));
        songs.add(new Song("Chasing Cars", "Snow Patrol", R.drawable.relax_3_chasing_cars,R.drawable.play_btn));
        songs.add(new Song("Diamonds", "Rihanna", R.drawable.relax_4_diamonds,R.drawable.play_btn));
        songs.add(new Song("Stay", "Rihanna", R.drawable.relax_5_stay,R.drawable.play_btn));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listViewRelaxSongs);
        listView.setAdapter (songAdapter);



        // Create an ArrayList of Playlists objects
        ArrayList<Playlists> playlists = new ArrayList<Playlists>();

        playlists.add(new Playlists("Checkout my favorite playlists", R.drawable.party, R.drawable.workout, R.drawable.love_songs, R.drawable.funky));

        // Create an {@link PlaylistsAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list
        PlaylistsAdapter playlistsAdapter = new PlaylistsAdapter(this, playlists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView playlistsView = (ListView) findViewById(R.id.playlistOptionsOnRelax);
        playlistsView.setAdapter(playlistsAdapter);

    }
}
