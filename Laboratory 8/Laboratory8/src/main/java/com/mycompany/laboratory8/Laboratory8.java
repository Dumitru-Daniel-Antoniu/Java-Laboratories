package com.mycompany.laboratory8;

import java.sql.*;

public class Laboratory8 {
    public static void main(String[] args) {
        try {
            var artists = new ArtistDAO();
            artists.create(1, "Pink Floyd");
            artists.create(2, "Michael Jackson");
            Database.getConnection().commit();
            System.out.println(artists.findByName("Pink Floyd"));
        }
        catch(SQLException ex) {
            System.err.println(ex);
            //Database.rollback();
        }
        catch(ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }
}
