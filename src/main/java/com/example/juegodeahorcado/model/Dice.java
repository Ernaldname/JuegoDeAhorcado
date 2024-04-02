package com.example.juegodeahorcado.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Dice {
    private ImageView diceImage;
    private int errorCount;

    public Dice() {
        updateHangmanImage(6); // Inicias con el máximo de intentos permitidos
    }

    // Método para actualizar la imagen basada en el contador de errores
    public void updateHangmanImage(int contador) {
        String PATH = "/com/example/juegodeahorcado/images/dices/";
        this.errorCount = contador;
        // Modificando en esta zona la logica del contador podremos obeter las vidas del usuario que se accionaran cada que se equivoque en la letra
        // contador = 6;

        // Carga la imagen correspondiente al contador actual
        this.diceImage =
                new ImageView(
                        new Image(String.valueOf(getClass().getResource(PATH + "dice" + contador + ".png")))
                );
        this.diceImage.setFitWidth(300);
        this.diceImage.setFitHeight(320);
    }

    public ImageView getDiceImage() { return diceImage; }

    public int getNumDice() { return errorCount; }

}

