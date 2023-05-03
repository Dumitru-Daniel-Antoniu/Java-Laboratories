package com.mycompany.optional;

import java.sql.*;

public class Artist extends Data {
    private int id;
    private String name;
    @Override
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getReleaseYear() {
        return 0;
    }
    @Override
    public String getArtist() {
        return "0";
    }
    @Override
    public String getGenre() {
        return "0";
    }
}
