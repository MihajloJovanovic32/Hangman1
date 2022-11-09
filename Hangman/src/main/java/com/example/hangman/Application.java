package com.example.hangman;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    public static Stage stage;
    public static Scene[] scenes;
    @Override
    public void start(Stage stage) throws IOException {
        Application.stage=stage;
        scenes=new Scene[5];
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main-menu.fxml"));
        scenes[0] = new Scene(fxmlLoader.load(), 320, 240);
        FXMLLoader fxmlLoader1 = new FXMLLoader(Application.class.getResource("game.fxml"));
        scenes[0] = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scenes[0]);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}