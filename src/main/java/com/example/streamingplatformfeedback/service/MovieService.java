package com.example.streamingplatformfeedback.service;

import com.example.streamingplatformfeedback.model.Movie;
import com.example.streamingplatformfeedback.repository.MovieRepository;

import java.util.List;

public class MovieService {
    private final MovieRepository movieRepo;

    public MovieService(MovieRepository repo) {
        this.movieRepo = repo;
    }

    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }



}
