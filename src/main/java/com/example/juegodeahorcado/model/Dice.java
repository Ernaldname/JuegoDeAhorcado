package com.example.juegodeahorcado.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Dice {
    private ImageView diceImage;

    public Dice() {
        updateHangmanImage(); // Inicias con el máximo de intentos permitidos
    }

    public void updateHangmanImage() {// Método para actualizar la imagen basada en el contador de errores
        String PATH = "/com/example/juegodeahorcado/images/dices/";
        int maxIntentos = 6; // Máximo de intentos permitidos
        int intentoActual = 1; // Número de intento actual

        String imagenPath = PATH + "dice" + intentoActual + ".png";
        // Verifica que el intento actual no sea mayor al máximo permitido
        if (intentoActual > maxIntentos) {
            imagenPath = PATH + "dice" + maxIntentos + ".png";
        }
        this.diceImage = // Carga la imagen correspondiente al contador actual
                new ImageView(
                        new Image(String.valueOf(getClass().getResource(imagenPath)))
                );
        this.diceImage.setFitWidth(300);
        this.diceImage.setFitHeight(320);
    }

    public ImageView getDiceImage() {
        return diceImage;
    }


}

