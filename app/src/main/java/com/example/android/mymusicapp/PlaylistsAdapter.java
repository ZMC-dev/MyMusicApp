package com.example.android.mymusicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaylistsAdapter extends ArrayAdapter<Playlists> {
    private static final String LOG_TAG = PlaylistsAdapter.class.getSimpleName();

    /**
     * @param context   The current context. Used to inflate the layout file.
     * @param playlists A List of song objects to display in a list
     */
    public PlaylistsAdapter (Activity context, ArrayList<Playlists> playlists) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, playlists);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
            View listPlaylistView = convertView;
            if (listPlaylistView == null) {
                listPlaylistView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_playlists, parent, false);
            }

            // Get the {@link Song} object located at this position in the list
            Playlists showPlaylists = getItem(position);


            // Find the TextView in the list_playlists.xml layout with the ID song_title
            TextView introTextView = (TextView) listPlaylistView.findViewById(R.id.intro_playlists);
            // Get the title from the current Song object and
            // set this text on the name TextView
            introTextView.setText(showPlaylists.getIntro_playlists());


            // Find the ImageView in the list_playlists.xml layout with the ID list_song_image
            ImageView imagePlaylist1 = (ImageView) listPlaylistView.findViewById(R.id.playlist_1);
            // Get the image resource ID from the current Song object and
            // set the image to iconView
            imagePlaylist1.setImageResource(showPlaylists.getPlaylist_1());


            // Find the ImageView in the list_playlists.xml layout with the ID play_btn_icon
            ImageView imagePlaylist2 = (ImageView) listPlaylistView.findViewById(R.id.playlist_2);
            // Get the image resource ID from the current Song object and
            // set the image to iconView
            imagePlaylist2.setImageResource(showPlaylists.getPlaylist_2());

            // Find the ImageView in the list_playlists.xml layout with the ID play_btn_icon
            ImageView imagePlaylist3 = (ImageView) listPlaylistView.findViewById(R.id.playlist_3);
            // Get the image resource ID from the current Song object and
            // set the image to iconView
            imagePlaylist3.setImageResource(showPlaylists.getPlaylist_3());

            // Find the ImageView in the list_playlists.xml layout with the ID play_btn_icon
            ImageView imagePlaylist4 = (ImageView) listPlaylistView.findViewById(R.id.playlist_4);
            // Get the image resource ID from the current Song object and
            // set the image to iconView
            imagePlaylist4.setImageResource(showPlaylists.getPlaylist_4());


            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            return listPlaylistView;
        }

    }


