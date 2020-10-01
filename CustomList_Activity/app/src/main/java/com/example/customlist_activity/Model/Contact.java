package com.example.customlist_activity.Model;

public class Contact {
    private int mColor;
    private String mSong;
    private String mName;

    public Contact(int mColor, String mSong, String mName) {
        this.mColor = mColor;
        this.mSong = mSong;
        this.mName = mName;
    }

    public int getmColor() {
        return mColor;
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
    }

    public String getmSong() {
        return mSong;
    }

    public void setmSong(String mSong) {
        this.mSong = mSong;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
