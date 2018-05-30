package ru.dglv.lesson2streams.flatmap;

import java.util.ArrayList;
import java.util.List;

public class Album {
    final private String name;
    final private String author;
    final private List<String> tracks;

    public Album(String name, String author) {
        this.name = name;
        this.author = author;
        this.tracks = new ArrayList<>();
    }

    public void addTrack(String track) {
        this.tracks.add(track);
    }

    public List<String> getTracks() {
        return tracks;
    }
}
