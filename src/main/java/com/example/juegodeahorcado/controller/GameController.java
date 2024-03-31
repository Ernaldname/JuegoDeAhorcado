package com.example.juegodeahorcado.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import com.example.juegodeahorcado.model.Dice;
import com.example.juegodeahorcado.model.Player;

public class GameController {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Label contadorDeVida, contadorDeAyuda;
    @FXML
    private TextArea ingresoPalabraSecreta;


    private Player player;
    private Dice dice1;
    private ImageView diceImageView1;


    // Este es el controlador que manejara y dara la logica a nuestro boton de ingresar la letra que se encuentra en JuegoDeAhorcado-View

    @FXML
    public void onHandleButtonRollTheDice(ActionEvent event) {
        if (diceImageView1 != null) {
            anchorPane.getChildren().remove(diceImageView1);

        }
        dice1 = new Dice();

        diceImageView1 = dice1.getDiceImage();
        diceImageView1.setX(76);
        diceImageView1.setY(50);

        anchorPane.getChildren().addAll(diceImageView1);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

}
