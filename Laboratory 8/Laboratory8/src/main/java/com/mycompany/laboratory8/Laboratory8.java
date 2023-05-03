package com.mycompany.laboratory8;

import java.sql.*;

public class Laboratory8 {
    public static void main(String[] args) {
        try {
            var artists = new ArtistDAO();
            artists.create(1, "Pink Floyd");
            artists.create(2, "Michael Jackson");
            System.out.println(artists.findByName("Michael Jackson"));
            var genres = new GenreDAO();
            genres.create(1, "Rock");
            genres.create(2, "Funk");
            genres.create(3, "Soul");
            genres.create(4, "Pop");
            System.out.println(genres.findById(1));
            Database.getConnection().commit();
            var albums = new AlbumDAO();
            albums.create(1, 1979, "The Wall", "Pink Floyd", "Rock");
            albums.create(2, 1982, "Thriller", "Michael Jackson", "Funk,Soul,Pop");
            Database.getConnection().commit();
            for(int i=1;i<3;i++) {
                System.out.println(albums.findById(i));
            }
            Database.getConnection().close();
        }
        catch(SQLException ex) {
            System.err.println("SQL Problem: " + ex);
        }
        catch(ClassNotFoundException ex) {
            System.err.println("Class problem: " + ex);
        }
    }
}
