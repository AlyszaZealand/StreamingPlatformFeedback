package com.example.streamingplatformfeedback.repository;

import com.example.streamingplatformfeedback.infrastructure.DbConfig;
import com.example.streamingplatformfeedback.model.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private final DbConfig db;

    public MovieRepository(DbConfig db) {
        this.db = db;
    }
    public List<Movie> findAll() {
        String sql = "Select id, title, rating, genre from users";

        List<Movie> result = new ArrayList<>();

        try(Connection c = db.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                result.add(mapRow(rs));
            }
            return result;

        } catch (Exception e){
            throw new DataAccessException("Fejl ved findAll()", e);
        }
    }

    private Movie mapRow(ResultSet rs) throws SQLException {
        return new Movie(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getDouble("rating"),
                rs.getString("genre")
        );
    }
}
