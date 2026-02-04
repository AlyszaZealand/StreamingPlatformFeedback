package com.example.streamingplatformfeedback.repository;

import com.example.streamingplatformfeedback.infrastructure.DbConfig;
import com.example.streamingplatformfeedback.model.Favorite;
import com.example.streamingplatformfeedback.model.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FavoriteRepository {
    private final DbConfig db;

    public FavoriteRepository(DbConfig db) {
        this.db = db;
    }

    List<Favorite> findAll() {
        String sql = "Select id, title, rating, genre from users";

        List<Favorite> result = new ArrayList<>();

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

    private Favorite mapRow(ResultSet rs) throws SQLException {
        return new Favorite(
                rs.getInt("id"),
                rs.getInt("userid"),
                rs.getInt("movieid")
        );
    }

}
