package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class FunkyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.funky_playlist);

        ImageButton imgBtn_playlist1 = (ImageButton) findViewById(R.id.imgBtn_playlist1);
        imgBtn_playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistLove = new Intent(FunkyActivity.this, LoveSongsActivity.class);
                startActivity(openPlaylistLove);

            }
        });
        ImageButton imgBtn_playlist2 = (ImageButton) findViewById(R.id.imgBtn_playlist2);
        imgBtn_playlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlaylistRelax = new Intent(FunkyActivity.this, RelaxActivity.class);
                startActivity(openPlaylistRelax);

            }
        });

        ImageButton imgBtn_playlist3 = (ImageButton) findViewById(R.id.imgBtn_playlist3);
        imgBtn_playlist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistWorkout = new Intent(FunkyActivity.this, WorkingOutActivity.class);
                startActivity(openPlaylistWorkout);

            }
        });

        ImageButton imgBtn_playlist4 = (ImageButton) findViewById(R.id.imgBtn_playlist4);
        imgBtn_playlist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent openPlaylistParty = new Intent(FunkyActivity.this, PartyActivity.class);
                startActivity(openPlaylistParty);

            }
        });




        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("PLAY ALL THE PLAYLIST", "Playlist FUNKY", R.drawable.funky, R.drawable.play_button));
        songs.add(new Song("On The Beat", "The B.B. & Q. Band", R.drawable.funky_1_on_the_beat, R.drawable.play_btn));
        songs.add(new Song("Give me The Night", "George Benson", R.drawable.funky_2_give_me_the_night, R.drawable.play_btn));
        songs.add(new Song("Superstition", "Stevie Wonder", R.drawable.funky_3_superstition, R.drawable.play_btn));
        songs.add(new Song("Celebration", "Kool & The Gang", R.drawable.funky_4_celebration, R.drawable.play_btn));
        songs.add(new Song("Fire", "Ohio Players", R.drawable.funky_5_fire, R.drawable.play_btn));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(FunkyActivity.this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listViewFunkySongs);
        listView.setAdapter(songAdapter);
        setListViewHeightBasedOnChildren(listView);


        // Create an ArrayList of Playlists objects
        ArrayList<Playlists> playlists = new ArrayList<Playlists>();

        playlists.add(new Playlists("Checkout my favorite playlists", R.drawable.love_songs, R.drawable.workout, R.drawable.relax, R.drawable.party));

        // Create an {@link PlaylistsAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list
        PlaylistsAdapter playlistsAdapter = new PlaylistsAdapter(FunkyActivity.this, playlists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView playlistsView = (ListView) findViewById(R.id.playlistOptionsOnFunky);
        playlistsView.setAdapter(playlistsAdapter);
        setListViewHeightBasedOnChildren(playlistsView);

    }

    public void setListViewHeightBasedOnChildren(ListView listView) {
        ArrayAdapter listAdapter = (ArrayAdapter) listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

}

