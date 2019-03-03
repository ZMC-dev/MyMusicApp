package com.example.android.mymusicapp;

/**
 * {@link Song} represents a single Android platform release.
 * Each object has 3 properties: song title, song singer, and image resource ID.
 */
public class Song {

    // Name of the song
    private String mSongTitle;

    // Name of the singer
    private String mSongSinger;

    // Drawable resource ID
    private int mImageResourceId;

    // Drawable icon
    private int mIconPlayButton;

    /*
     * Create a new Song object.
     *
     * @param vTitle is the name of the song
     * @param vSinger is the corresponding song performer
     * @param image is drawable reference ID that corresponds to the icon of the song
     * */
    public Song (String vTitle, String vSinger, int imageResourceId, int iconPlayButton)
    {
        mSongTitle = vTitle;
        mSongSinger = vSinger;
        mImageResourceId = imageResourceId;
        mIconPlayButton = iconPlayButton;
    }

    /**
     * Get the title of the song
     */
    public String getSongTitle () {
        return mSongTitle;
    }

    /**
     * Get the singer of the song
     */
    public String getSongSinger() {
        return mSongSinger;
    }

    /**
     * Get the song image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the play button image icon
     */
    public int getIconPlayButton() { return mIconPlayButton;
    }

}
