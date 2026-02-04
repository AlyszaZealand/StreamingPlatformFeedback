package com.example.streamingplatformfeedback.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import com.example.streamingplatformfeedback.infrastructure.DbConfig;
import com.example.streamingplatformfeedback.repository.DataAccessException;

public class HelloController {

    @FXML private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
