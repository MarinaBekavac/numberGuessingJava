package main.controllers;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage mainStage;

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
        stage.setTitle("Guessing Game");
        Scene scene = new Scene(root, 600, 400);
        ////////////////////////
        scene.getStylesheets().add(getClass().getClassLoader().
                getResource("display.css").toExternalForm());
        /////////////////////////

        stage.setScene(scene);
        stage.show();
        mainStage = stage;

    }

    public static void main(String[] args) {
        launch(args);
    }


}
