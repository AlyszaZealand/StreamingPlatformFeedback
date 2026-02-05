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
import javafx.scene.control.cell.PropertyValueFactory;

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
    @FXML private TableColumn<Favorite, String> favoriteTitleColumn;
    @FXML private TableColumn<Favorite, Double> favoriteRatingColumn;
    @FXML private TableColumn<Favorite, String> favoriteGenreColumn;

    @FXML private TableView movieTableView;
    @FXML private TableColumn<> movieTitleColumn;
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

        setupMovieTable();
    }

    @FXML
    private void handleAddFavorite(){

    }

    @FXML
    private void handleRemoveFavorite(){

    }

    private void setupMovieTable(){
        movieGenreColumn.setCellValueFactory(new PropertyValueFactory<>("Genre"));
        movieRatingColumn.setCellValueFactory(new PropertyValueFactory<>("Rating"));
        movieTitleColumn.setCellValueFactory(new PropertyValueFactory<>("Title"));
    }

    private void setupFavoriteTable(){
        favoriteGenreColumn.setCellValueFactory(new PropertyValueFactory<>("Genre"));
        favoriteRatingColumn.setCellValueFactory(new PropertyValueFactory<>("Rating"));
        favoriteColumn.setCellValueFactory(new PropertyValueFactory<>("Title"));
    }

    @FXML
    private void onRefreshButtonClick() {
//        refreshTable();
    }


}
