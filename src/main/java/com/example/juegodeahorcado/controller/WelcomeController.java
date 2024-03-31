package com.example.juegodeahorcado.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.example.juegodeahorcado.model.Player;
import com.example.juegodeahorcado.view.GameStage;
import com.example.juegodeahorcado.view.WelcomeStage;

import java.io.IOException;

public class WelcomeController {
    @FXML
    private TextField campoDeTextoPalabraClave;

    @FXML
    void onHandleButtonPlay(ActionEvent event) throws IOException {
        String palabraClave = campoDeTextoPalabraClave.getText();

        Player player = new Player(1, palabraClave);
        GameStage.getInstance().getGameController().setPlayer(player);
        WelcomeStage.deleteInstance();
    }
}
