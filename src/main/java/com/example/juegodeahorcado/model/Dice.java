package com.example.juegodeahorcado.model;

import com.example.juegodeahorcado.controller.GameController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Dice {
    private int contadorErrores;
    private int maxIntentos = 6; // Contador máximo de intentos permitidos
    private int intentoActual = 4; // Número de intento actual

    private GameController gameController;
    private ImageView diceImage;

    public Dice() {
        updateHangmanImage(); // Inicias con el máximo de intentos permitidos
    }

    public Object decrementarContador() {
        contadorErrores++;
        updateHangmanImage();
        return null;
    }

    public void updateHangmanImage() {// Método para actualizar la imagen basada en el contador de errores
        String PATH = "/com/example/juegodeahorcado/images/dices/";

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
        this.diceImage.setFitHeight(330);
    }
    public GameController getGameController(){ return gameController; }
    public ImageView getDiceImage() {
        return diceImage;
    }
}
