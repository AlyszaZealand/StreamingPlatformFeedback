package com.example.streamingplatformfeedback.ui;

import com.example.streamingplatformfeedback.model.Favorite;
import com.example.streamingplatformfeedback.model.Movie;
import com.example.streamingplatformfeedback.model.User;
import com.example.streamingplatformfeedback.service.FavoriteService;
import com.example.streamingplatformfeedback.service.MovieService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class StreamingServiceController {

    private User currentUser;
    private MovieService movieService;
    private FavoriteService favoriteService;

    public void initializeData(User user, MovieService movieService, FavoriteService favoriteService) {
        this.currentUser = user;
        this.movieService = movieService;
        this.favoriteService = favoriteService;
    }


    // Tableviews and columns for movies and favorites

    @FXML private TableView favoriteTableView;
//    @FXML private TableColumn<Favorite, Movie, User> favoriteTitleColumn;
    @FXML private TableColumn favoriteColumn;
    @FXML private TableColumn favoriteRatingColumn;
    @FXML private TableColumn favoriteGenreColumn;

    @FXML private TableView movieTableView;
    @FXML private TableColumn movieTitleColumn;
    @FXML private TableColumn movieRatingColumn;
    @FXML private TableColumn movieGenreColumn;


    @FXML private Label displayId;
    @FXML private Label displayName;
    @FXML private Label displayEmail;


    @FXML private Button addFavoriteButton;
    @FXML private Button removeFavoriteButton;
    @FXML private Button returnButton;

    @FXML
    public void initialize(){

    }

    @FXML
    private void handleAddFavorite(){

    }

    @FXML
    private void handleRemoveFavorite(){

    }

    private void setupMovieTable(){
    }

    @FXML
    private void onRefreshButtonClick() {
//        refreshTable();
    }


}
