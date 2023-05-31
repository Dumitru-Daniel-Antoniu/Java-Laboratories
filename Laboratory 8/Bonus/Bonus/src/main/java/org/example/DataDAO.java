package org.example;

import java.sql.SQLException;

public abstract class DataDAO<T> {
    public abstract void create(T object) throws SQLException, ClassNotFoundException;
    public abstract T findByName(T object) throws SQLException, ClassNotFoundException;
    public abstract T findById(T object) throws SQLException, ClassNotFoundException;
}
