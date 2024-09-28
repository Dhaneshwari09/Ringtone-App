package com.cscorner.rintonerecycle;

public class itemmessage {
    String name;
    private boolean isplaying;
    private int songResId;

    public itemmessage(String name, boolean isplaying, int songResId) {
        this.name = name;
        this.isplaying = isplaying;
        this.songResId = songResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsplaying() {
        return isplaying;
    }

    public void setIsplaying(boolean isplaying) {
        this.isplaying = isplaying;
    }

    public int getSongResId() {
        return songResId;
    }

    public void setSongResId(int songResId) {
        this.songResId = songResId;
    }
}
