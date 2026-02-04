package com.example.streamingplatformfeedback.ui;

import com.example.streamingplatformfeedback.infrastructure.DbConfig;
import com.example.streamingplatformfeedback.repository.FavoriteRepository;
import com.example.streamingplatformfeedback.repository.MovieRepository;
import com.example.streamingplatformfeedback.repository.SqlRepository;
import com.example.streamingplatformfeedback.repository.UserRepository;
import com.example.streamingplatformfeedback.service.FavoriteService;
import com.example.streamingplatformfeedback.service.MovieService;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import com.example.streamingplatformfeedback.service.UserService;

public class LoginController {

    @FXML private Label welcomeText;


    private UserService userService;
    private FavoriteService favService;
    private MovieService movieService;


    public void initialize() {
        DbConfig db = new DbConfig();
        UserRepository repo = new UserRepository(db);
        MovieRepository movieRepo = new MovieRepository(db);
        FavoriteRepository favRepo = new FavoriteRepository(db);
        userService = new UserService(repo);
        movieService = new MovieService(movieRepo);
        favService = new FavoriteService(favRepo);

    }









    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
