package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import org.graph4j.Edge;

public class Dates {
    private int vertices;
    private List<Album> albums;

    private List<Edge> edges;

    public Dates() {}

    public int getVertices() {
        return vertices;
    }

    public void setVertices() throws SQLException, ClassNotFoundException {
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select count(title) from albums")) {
            if(resultSet.next()) this.vertices = resultSet.getInt(1);
            else this.vertices = 0;
        }
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums() throws SQLException, ClassNotFoundException {
        this.albums = new ArrayList<>();
        Connection connection = Database.getConnection();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select title from albums")) {
            while(resultSet.next()) {
                Album album = new Album();
                album.setTitle(resultSet.getString(1));
                this.albums.add(album);
            }
        }
    }

    public List<Edge> getEdges() {
        return this.edges;
    }

    public void setEdges() throws SQLException, ClassNotFoundException {
        this.edges = new ArrayList<>();
        AlbumDAO albumDAO = new AlbumDAO();
        int i;
        int j;
        for(Album album1 : albums) {
            album1 = albumDAO.findByName(album1);
            i = album1.getId();
            for(Album album2 : albums) {
                album2 = albumDAO.findByName(album2);
                j = album2.getId();
                if(i < j) {
                    if(album1.getReleaseYear() != album2.getReleaseYear() && !album1.getArtist().equals(album2.getArtist()) && !album1.getGenre().equals(album2.getGenre())) {
                        Edge edge = new Edge(album1.getId(), album2.getId());
                        System.out.println(edge);
                        this.edges.add(edge);
                    }
                }
            }
        }
    }
}
