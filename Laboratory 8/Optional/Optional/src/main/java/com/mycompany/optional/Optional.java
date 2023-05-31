package com.mycompany.optional;

import java.sql.SQLException;

public class Optional {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Artist artist1 = new Artist(1, "Pink Floyd");
        Artist artist2 = new Artist(2,"Linkin Park");
        Artist artist3 = new Artist(3, "Michael Jackson");
        ArtistDAO artistConnection = new ArtistDAO();
        artistConnection.create(artist1);
        artistConnection.create(artist2);
        artistConnection.create(artist3);
        System.out.println(artistConnection.findById(artist2));
        Genre genre1 = new Genre(1, "Rock");
        Genre genre2 = new Genre(2, "Pop");
        Genre genre3 = new Genre(3, "Metal");
        GenreDAO genreConnection = new GenreDAO();
        genreConnection.create(genre1);
        genreConnection.create(genre2);
        genreConnection.create(genre3);
        System.out.println(genreConnection.findByName(genre3));
        Album album1 = new Album(1, 1979, "The Wall", "Pink Floyd", "Rock");
        Album album2 = new Album(2,2003,"Meteora","Linkin Park","Rock");
        Album album3 = new Album(3, 1979, "Off the Wall", "Michael Jackson", "Pop");
        AlbumDAO albumConnection = new AlbumDAO();
        albumConnection.create(album1);
        albumConnection.create(album2);
        albumConnection.create(album3);
        System.out.println(albumConnection.findById(album1));
        Database.getConnection().commit();
    }
}
