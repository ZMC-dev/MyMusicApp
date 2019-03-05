package com.example.android.mymusicapp;

/**
 * {@link Playlists} represents a details of the songs.
 * Each object has 4 properties: song title, song singer, image resource ID, image to play another playlist.
 */

public class Playlists {

    // title to introduce the playlists
    private String mIntro_playlists;

     // Name of the first proposed playlist
     private int mPlaylist_1;

     // Name of the second proposed playlist
     private int mPlaylist_2;

     // Name of the third proposed playlist
     private int mPlaylist_3;

     // Name of the fourth proposed playlist
     private int mPlaylist_4;




    // Create a new Playlist object.
    public Playlists (String introPlaylists, int playlist_1, int playlist_2, int playlist_3, int playlist_4) {

        mIntro_playlists = introPlaylists;
        mPlaylist_1 = playlist_1;
        mPlaylist_2 = playlist_2;
        mPlaylist_3 = playlist_3;
        mPlaylist_4= playlist_4;


    }

    /**
     * Get the intro for the playlists
     */
    public String getIntro_playlists () { return mIntro_playlists; }

    /**
     * Get the image of the playlist 1
     */
    public int getPlaylist_1 () { return mPlaylist_1; }

     /**
      * Get the image of the playlist 2
      */
     public int getPlaylist_2 () { return mPlaylist_2; }

     /**
      * Get the image of the playlist 3
      */
     public int getPlaylist_3 () { return mPlaylist_3; }

     /**
      * Get the image of the playlist 4
      */
     public int getPlaylist_4 () { return mPlaylist_4; }


}
