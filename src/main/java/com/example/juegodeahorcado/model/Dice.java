package com.example.juegodeahorcado.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Dice {
    private ImageView diceImage;

    public Dice() {
        updateHangmanImage(6); // Inicias con el máximo de intentos permitidos
    }
    public void updateHangmanImage(int contador) {// Método para actualizar la imagen basada en el contador de errores
        String PATH = "/com/example/juegodeahorcado/images/dices/";
        contador = 1;// Modificando en esta zona la logica del contador podremos obeter las vidas del usuario que se accionaran cada que se equivoque en la letra
        this.diceImage = // Carga la imagen correspondiente al contador actual
                new ImageView(
                        new Image(String.valueOf(getClass().getResource(PATH + "dice" + contador + ".png")))
                );
        this.diceImage.setFitWidth(300);
        this.diceImage.setFitHeight(320);
    }

    public ImageView getDiceImage() { return diceImage; }
}

