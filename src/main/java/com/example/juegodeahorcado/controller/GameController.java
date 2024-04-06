package com.example.juegodeahorcado.controller;

import com.example.juegodeahorcado.model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import com.example.juegodeahorcado.model.Dice;

public class GameController {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField campoDeTextoLetraClave;
    private Player player;
    private Dice dice1;
    private ImageView diceImageView1;

    public void setPlayer(Player player) {
        this.player = player;
    }

    @FXML
    public void onHandleButtonRollTheDice(ActionEvent event) {

        if (diceImageView1 != null) {
            anchorPane.getChildren().remove(diceImageView1);
        }
        dice1 = new Dice();
        diceImageView1 = dice1.getDiceImage();
        anchorPane.getChildren().addAll(diceImageView1);

        if (player != null) {
            // Le asignamos el metodo generado en el modelo para obtener la palabraClave
            String palabraClave = player.getPalabraClave();
            // Traemos el texto gracias al metodo getText y lo asignamos a una variable que creamos con el nombre "letraSecretaText"
            String letraSecretaText = campoDeTextoLetraClave.getText();

            // Los resultados de letras los convertimos en arreglos de tipo char para que sean recorridos y comparados

            char[] arregloDeLetra = letraSecretaText.toCharArray();
            char[] arregloDeLaPalabra = palabraClave.toCharArray();

            for (char caracter : arregloDeLaPalabra) {
                boolean letraEncontrada = false;

                for (char letra : arregloDeLetra) {
                    if (caracter == letra) {
                        letraEncontrada = true;
                        break; // Salir del bucle interno si se encuentra la letra
                    }

                }
                if (letraEncontrada) {
                    System.out.println("La letra '" + caracter + "' está en el arreglo.");

                } else {
                    System.out.println("La letra '" + caracter + "' no está en el arreglo.");
                    if (diceImageView1 != null) {
                        anchorPane.getChildren().remove(diceImageView1);
                    }
                    dice1 = new Dice();
                    diceImageView1 = dice1.getDiceImage();
                    anchorPane.getChildren().addAll(diceImageView1);
                }
            }
        }
    }


    @FXML
    public void onHandleButtonRollTheAyuda(ActionEvent event) {
    }
}