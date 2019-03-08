package com.example.android.mymusicapp;

/**
 * {@link Playlists} represents a details of the songs.
 * Each object has 4 properties: song title, song singer, image resource ID, image to play another playlist.
 */

public class Playlists {

    // title to introduce the playlists
    private String mIntro_playlists;

     // ImageButton of the first proposed playlist
     private int mImgBtn_playlist1;

     // ImageButtonof the second proposed playlist
     private int mImgBtn_playlist2;

     // ImageButton of the third proposed playlist
     private int mImgBtn_playlist3;

     // ImageButton of the fourth proposed playlist
     private int mImgBtn_playlist4;




    // Create a new Playlist object.
    public Playlists (String introPlaylists, int playlist_1, int playlist_2, int playlist_3, int playlist_4) {

        mIntro_playlists = introPlaylists;
        mImgBtn_playlist1  = playlist_1;
        mImgBtn_playlist2 = playlist_2;
        mImgBtn_playlist3 = playlist_3;
        mImgBtn_playlist4  = playlist_4;

    }

    /**
     * Get the intro for the playlists
     */
    public String getIntro_playlists () { return mIntro_playlists; }

    /**
     * Get the image of the playlist 1
     */
    public int getImgBtn_playlist1 () { return mImgBtn_playlist1; }

     /**
      * Get the image of the playlist 2
      */
     public int getImgBtn_playlist2 () { return mImgBtn_playlist2; }

     /**
      * Get the image of the playlist 3
      */
     public int getImgBtn_playlist3 () { return mImgBtn_playlist3; }

     /**
      * Get the image of the playlist 4
      */
     public int getImgBtn_playlist4 () { return mImgBtn_playlist4; }


}
