package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LoveSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.love_playlist);


        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("PLAY ALL THE PLAYLIST", "Playlist LOVE SONGS", R.drawable.love_songs,R.drawable.play_button));
        songs.add(new Song("I Will Always Love You", "The B.B. & Q. Band", R.drawable.love_1_i_will_always_love_you,R.drawable.play_btn));
        songs.add(new Song("Unchained Melody", "George Benson", R.drawable.love_2_unchained_melody,R.drawable.play_btn));
        songs.add(new Song("How Deep is Your Love", "Bee Gees", R.drawable.love_3_how_deep_is_your_love,R.drawable.play_btn));
        songs.add(new Song("I'll Make Love to You", "Boys II Men", R.drawable.love_4_make_love_to_you,R.drawable.play_btn));
        songs.add(new Song("Endless Love", "Queen", R.drawable.love_5_endless_love,R.drawable.play_btn));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listViewLoveSongs);
        listView.setAdapter (songAdapter);
        setListViewHeightBasedOnChildren(listView);


        // Create an ArrayList of Playlists objects
        ArrayList<Playlists> playlists = new ArrayList<Playlists>();

        playlists.add(new Playlists("Checkout my favorite playlists", R.drawable.party, R.drawable.workout, R.drawable.relax, R.drawable.funky));

        // Create an {@link PlaylistsAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list
        PlaylistsAdapter playlistsAdapter = new PlaylistsAdapter(this, playlists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView playlistsView = (ListView) findViewById(R.id.playlistOptionsOnLove);
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
