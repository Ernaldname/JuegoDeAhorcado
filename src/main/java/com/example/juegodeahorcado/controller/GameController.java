package com.example.juegodeahorcado.controller;

import com.example.juegodeahorcado.model.Ayuda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import com.example.juegodeahorcado.model.Dice;
import com.example.juegodeahorcado.model.Player;
import javax.swing.JOptionPane;
import java.awt.*;

public class GameController {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField campoDeTextoPalabraClave;
    @FXML
    private TextField ingresoLetraSecreta;

    private Player player;
    private Dice dice1;
    private ImageView diceImageView1;


    @FXML
    public void onHandleButtonRollTheDice(ActionEvent event) {
        // Asegúrate de que el usuario haya ingresado al menos un carácter
        String letraSecretaText = ingresoLetraSecreta.getText(); // Asumiendo que ingresoLetraSecreta es tu campo de texto

        if (!letraSecretaText.isEmpty()) {
            char letraClave = letraSecretaText.charAt(0); // Toma el primer carácter del texto ingresado
            String palabraClave = ingresoLetraSecreta.getText();
            char[] arregloPalabraClave = palabraClave.toCharArray();
            boolean letraEncontrada = false;

            for (char caracter : arregloPalabraClave) {
                if (caracter == letraClave) {
                    letraEncontrada = true;
                    break; // Si encontramos la letra, no necesitamos seguir buscando
                }
            }

            if (letraEncontrada) {
                // Opción si la letra fue encontrada
                System.out.println("La letra '" + letraClave + "' está en la palabra.");
            } else {
                // Opción si la letra no fue encontrada
                System.out.println("La letra '" + letraClave + "' no está en la palabra.");

                if (diceImageView1 != null) {anchorPane.getChildren().remove(diceImageView1);}// Elimina una imgagen si ya hay una en el anchor pane -> por lo tanto antes de mostrar la sgte primero se borra la anterior si hay anterior
                dice1 = new Dice();// Se crea la instancia de la clase "dice" con el fin de obtener la descripcion y la imgagen del ahorcado
                diceImageView1 = dice1.getDiceImage(); // Se crea el objeto y se llama a la accion que ejecuta en el modelo
                anchorPane.getChildren().addAll(diceImageView1);// Se agrega a la interfaz grafica

            }
        } else {
            System.out.println("Por favor, ingresa una letra.");
        }


    }


    @FXML
    public void onHandleButtonRollTheAyuda(ActionEvent event) {
        // Por cada que se aprete el boton aparece el cuadro de dialogo
        JOptionPane.showMessageDialog(null,"Pista 1");
        JOptionPane.showMessageDialog(null,"Pista 2");
        JOptionPane.showMessageDialog(null,"Pista 3");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Ganaste rey");
    }

    public void setPlayer(Player player) {
       this.player = player;
    }
}
