package com.example.juegodeahorcado.controller;

import com.example.juegodeahorcado.model.Player;
import com.example.juegodeahorcado.view.alert.AlertBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import com.example.juegodeahorcado.model.Dice;

import java.io.IOException;
import java.util.regex.Pattern;

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
    private Dice dice; // Instancia de la clase Dice
    public GameController() {
        dice = new Dice(); // Crear una instancia de la clase Dice
    }
    @FXML
    public void onHandleButtonRollTheDice(ActionEvent event) throws IOException {
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

            if (validarPalabraClave(letraSecretaText)) {
                System.out.println("");
            } else {
                String mensaje = "Por favor, ingresa únicamente palabras en el campo de texto.";
                AlertBox.showMessage("Error", "Palabra Clave Inválida", mensaje);
            }
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
                    String mensaje = "Por favor, ingresa únicamente palabras en el campo de texto.";
                    AlertBox.showMessage("Error", "Palabra Clave Inválida", mensaje);
                }
                else {
                   {System.out.println("No esta en el arreglo: ");
                       dice.decrementarContador();
                       break;}
                }
            }
        }
    }
    private boolean validarPalabraClave(String palabraClave) {
        return Pattern.matches("\\b[a-zA-Z]+\\b", palabraClave);
    }
    @FXML
    public void onHandleButtonRollTheAyuda(ActionEvent event) {
    }
}