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
    private TextField campoDeTextoLetraClave;
    @FXML
    private TextField ingresoLetraSecreta;

    private Player player;
    private Dice dice1;
    private ImageView diceImageView1;


    @FXML
    public void onHandleButtonRollTheDice(ActionEvent event) {

        if (diceImageView1 != null) {anchorPane.getChildren().remove(diceImageView1);}// Elimina una imgagen si ya hay una en el anchor pane -> por lo tanto antes de mostrar la sgte primero se borra la anterior si hay anterior
        dice1 = new Dice();// Se crea la instancia de la clase "dice" con el fin de obtener la descripcion y la imgagen del ahorcado
        diceImageView1 = dice1.getDiceImage(); // Se crea el objeto y se llama a la accion que ejecuta en el modelo
        anchorPane.getChildren().addAll(diceImageView1);// Se agrega a la interfaz grafica

        // Asegúrate de que el usuario haya ingresado al menos un carácter
        String letraSecretaText = campoDeTextoLetraClave.getText(); // Asumiendo que ingresoLetraSecreta es tu campo de texto
        char[] arregloDeLetricas = letraSecretaText.toCharArray();

        String texto = campoDeTextoPalabraClave.getText(); // Extraemos el texto de la palabra secreta
        char[] arregloDeChars = texto.toCharArray();

        // Recorre el arreglo de la palabra ingresada al inicio
        for (int i = 0; i < arregloDeChars.length; i++) {
            char caracter = arregloDeChars[i];
            for (char letra : arregloDeLetricas) {
                if (caracter == letra){
                    System.out.println("Hola rey");
                }
            }
        }
    }


    @FXML
    public void onHandleButtonRollTheAyuda(ActionEvent event) {


    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}