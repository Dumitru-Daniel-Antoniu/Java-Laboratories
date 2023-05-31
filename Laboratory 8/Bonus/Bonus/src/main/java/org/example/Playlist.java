package org.example;

import java.util.List;
import java.util.ArrayList;
import java.sql.Timestamp;

public class Playlist {

    private int id;
    private String name;

    private Timestamp time;

    private List<Album> albums;

    public Playlist() {}

    public Playlist(int id, String name, Timestamp time, List<Album> albums) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.albums = albums;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public String getAlbumsNames() {
        String names="";
        for(Album album : this.albums) {
            names += album.getTitle() + ", ";
        }
        names.substring(0, names.length() - 2);
        return names;
    }
}
