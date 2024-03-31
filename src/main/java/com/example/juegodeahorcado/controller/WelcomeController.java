package com.example.juegodeahorcado.controller;

import com.example.juegodeahorcado.view.alert.AlertBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.example.juegodeahorcado.model.Player;
import com.example.juegodeahorcado.view.GameStage;
import com.example.juegodeahorcado.view.WelcomeStage;


import java.io.IOException;
import java.util.regex.Pattern;

public class WelcomeController {
    @FXML
    private TextField campoDeTextoPalabraClave;

    @FXML
    void onHandleButtonPlay(ActionEvent event) throws IOException {
        String palabraClave = campoDeTextoPalabraClave.getText();

        if (validarPalabraClave(palabraClave)) {
            Player player = new Player(1, palabraClave);
            GameStage.getInstance().getGameController().setPlayer(player);
            WelcomeStage.deleteInstance();
        } else {
            String mensaje = "Por favor, ingresa únicamente palabras en el campo de texto.";
            AlertBox.showMessage("Error", "Palabra Clave Inválida", mensaje);
        }
    }

    private boolean validarPalabraClave(String palabraClave) {
        return Pattern.matches("\\b[a-zA-Z]+\\b", palabraClave);
    }

}