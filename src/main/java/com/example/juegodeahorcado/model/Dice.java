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
        // Carga la imagen correspondiente al contador actual
        this.diceImage = new ImageView(new Image(getClass().getResource(PATH + "hangman" + errorCount + ".png").toExternalForm(), true));
        this.diceImage.setFitWidth(64);
        this.diceImage.setFitHeight(64);
    }

    public ImageView getDiceImage() { return diceImage; }

    public int getNumDice() { return errorCount; }
}

