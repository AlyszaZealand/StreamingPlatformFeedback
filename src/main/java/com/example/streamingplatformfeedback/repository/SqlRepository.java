package com.example.streamingplatformfeedback.repository;

import com.example.streamingplatformfeedback.model.Movie;
import com.example.streamingplatformfeedback.model.User;

import java.util.List;

public interface SqlRepository {

    List<Movie> findAll();


}
