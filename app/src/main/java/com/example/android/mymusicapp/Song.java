package com.example.android.mymusicapp;

/**
 * {@link Song} represents a details of the songs.
 * Each object has 4 properties: song title, song singer, image resource ID, image to play another playlist.
 */
public class Song {

    // Name of the song
    private String mSongTitle;

    // Name of the singer
    private String mSongSinger;

    // Drawable resource image of the song
    private int mImageResourceId;

    // Drawable icon play button
    private int mIconPlayButton;


    /*
     * Create a new Song object.
     *
     * @param vTitle is the name of the song
     * @param vSinger is the corresponding song performer
     * @param imageResourceId is drawable reference ID that corresponds to the image of the song
     * @param iconPlayButton is drawable reference to the icon of play button
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
    public int getIconPlayButton() {
        return mIconPlayButton;
    }


    }


