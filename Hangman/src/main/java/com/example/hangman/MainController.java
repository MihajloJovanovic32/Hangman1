package com.example.hangman;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    public void klikNewGame() {
        Application.stage.setScene(Application.scenes[1]);
    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        System.exit(0);
    }
}