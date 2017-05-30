package com.example.ericbell.animalsoundsnaor;

/**
 * Created by eric.bell on 5/30/2017.
 */

public class Animal {
  private final int imageResource;
  private final int soundResource;

    public Animal(int imageResource, int soundResource) {
        this.imageResource = imageResource;
        this.soundResource = soundResource;
    }

//getters
    public int getImageResource() {
        return imageResource;
    }

    public int getSoundResource() {
        return soundResource;
    }
}
