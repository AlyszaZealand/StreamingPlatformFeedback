package com.example.streamingplatformfeedback;

import com.example.streamingplatformfeedback.infrastructure.DbConfig;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
//        var url = getClass().getResource("/login-view.fxml");
//
//        System.out.println("FXML url = " + url);
//
//        if (url == null) {
//            throw new IllegalStateException("FXML not found in resources");
//        }

        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("/login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        stage.setTitle("StreamingPlatform!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        testConnection();
        launch(args);
    }

    public static <DB> void testConnection() {
        DbConfig db = new DbConfig();
        try (Connection c = db.getConnection()) {
            DatabaseMetaData md = c.getMetaData();
            System.out.println("✅ Forbindelse OK: " + md.getURL());
            System.out.println("   Driver: " + md.getDriverName() + " - " + md.getDriverVersion());
        } catch (Exception e) {
            System.out.println("❌ Forbindelse FEJL: " + e.getMessage());
            System.out.println("Tip: Tjek URL/USER/PASS og at MySQL kører.");
        }
    }
}


