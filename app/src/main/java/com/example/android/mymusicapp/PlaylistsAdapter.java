package com.example.android.mymusicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
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
            Playlists optionalPlaylists = getItem(position);


            // Find the TextView in the list_playlists.xml layout with the ID song_title
            TextView introTextView = (TextView) listPlaylistView.findViewById(R.id.intro_playlists);
            // Get the title from the current Song object and
            // set this text on the name TextView
            introTextView.setText(optionalPlaylists.getIntro_playlists());


            // Find the ImageView in the list_playlists.xml layout with the ID list_song_image
            ImageButton imgBtnPlaylist1 = (ImageButton) listPlaylistView.findViewById(R.id.imgBtn_playlist1);
            // Get the image resource ID from the current Song object and
            // set the image to iconView
            imgBtnPlaylist1.setImageResource(optionalPlaylists.getImgBtn_playlist1());


            // Find this ImageButton in the list_playlists.xml layout
            ImageButton imgBtnPlaylist2 = (ImageButton) listPlaylistView.findViewById(R.id.imgBtn_playlist2);
            // Get the image resource ID from the current Song object and
            // set the image to iconView
            imgBtnPlaylist2.setImageResource(optionalPlaylists.getImgBtn_playlist2());

            // Find the ImageView in the list_playlists.xml layout with the ID play_btn_icon
            ImageButton imgBtnPlaylist3 = (ImageButton) listPlaylistView.findViewById(R.id.imgBtn_playlist3);
            // Get the image resource ID from the current Song object and
            // set the image to iconView
            imgBtnPlaylist3.setImageResource(optionalPlaylists.getImgBtn_playlist3());

            // Find the ImageView in the list_playlists.xml layout with the ID play_btn_icon
            ImageButton imgBtnPlaylist4 = (ImageButton) listPlaylistView.findViewById(R.id.imgBtn_playlist4);
            // Get the image resource ID from the current Song object and
            // set the image to iconView
            imgBtnPlaylist4.setImageResource(optionalPlaylists.getImgBtn_playlist4());


            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            return listPlaylistView;
        }

    }


