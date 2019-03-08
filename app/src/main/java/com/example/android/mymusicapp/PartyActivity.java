package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PartyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.party_playlist);

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("PLAY ALL THE PLAYLIST", "Playlist PARTY", R.drawable.party,R.drawable.play_button));
        songs.add(new Song("Crazy in Love", "The B.B. & Q. Band", R.drawable.party_1_crazy_inlove,R.drawable.play_btn));
        songs.add(new Song("Umbrella", "Rihanna", R.drawable.party_2_umbrella,R.drawable.play_btn));
        songs.add(new Song("I Gotta Feeling", "The Black Eyes Peas", R.drawable.party_3_gotta_feeling,R.drawable.play_btn));
        songs.add(new Song("Taki Taki", "DJ Snake", R.drawable.party_4_taki_taki,R.drawable.play_btn));
        songs.add(new Song("Cosmic Girl", "Jamiroquai", R.drawable.party_5_cosmic_girl,R.drawable.play_btn));


        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listViewPartySongs);
        listView.setAdapter (songAdapter);


        // Create an ArrayList of Playlists objects
        ArrayList<Playlists> playlists = new ArrayList<Playlists>();

        playlists.add(new Playlists("Checkout my favorite playlists", R.drawable.love_songs, R.drawable.workout, R.drawable.relax, R.drawable.funky));

        // Create an {@link PlaylistsAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list
        PlaylistsAdapter playlistsAdapter = new PlaylistsAdapter(this, playlists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView playlistsView = (ListView) findViewById(R.id.playlistOptionsOnParty);
        playlistsView.setAdapter(playlistsAdapter);

    }
}
