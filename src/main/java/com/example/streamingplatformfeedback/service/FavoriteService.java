package com.example.streamingplatformfeedback.service;

import com.example.streamingplatformfeedback.model.Favorite;
import com.example.streamingplatformfeedback.repository.FavoriteRepository;

import java.util.List;

public class FavoriteService {
    private final FavoriteRepository favoriteRepo;

    public FavoriteService(FavoriteRepository repo) {
        this.favoriteRepo = repo;
    }

    public List<Favorite> getAllFavorites() {
        return favoriteRepo.findAll();
    }

}
