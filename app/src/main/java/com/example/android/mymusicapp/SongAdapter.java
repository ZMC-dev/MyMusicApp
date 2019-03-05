package com.example.android.mymusicapp;


/*
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Song} objects.
 * */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter <Song> {
    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param songs   A List of song objects to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
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
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.song_title);
        // Get the title from the current Song object and
        // set this text on the name TextView
        titleTextView.setText(currentSong.getSongTitle());

        // Find the TextView in the list_item.xml layout with the ID song_singer
        TextView singerTextView = (TextView) listItemView.findViewById(R.id.song_singer);
        // Get the version number from the current Song object and
        // set this text on the number TextView
        singerTextView.setText(currentSong.getSongSinger());

        // Find the ImageView in the list_item.xml layout with the ID list_song_image
        ImageView imageSongView = (ImageView) listItemView.findViewById(R.id.list_song_image);
        // Get the image resource ID from the current Song object and
        // set the image to iconView
        imageSongView.setImageResource(currentSong.getImageResourceId());

        // Find the ImageView in the list_item.xml layout with the ID play_btn_icon
        ImageView iconPlayBtnView = (ImageView) listItemView.findViewById(R.id.play_btn_icon);
        // Get the image resource ID from the current Song object and
        // set the image to iconView
        iconPlayBtnView.setImageResource(currentSong.getIconPlayButton());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }

}




