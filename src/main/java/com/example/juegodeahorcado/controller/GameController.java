package com.example.juegodeahorcado.controller;

import com.example.juegodeahorcado.model.Ayuda;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import com.example.juegodeahorcado.model.Dice;
import com.example.juegodeahorcado.model.Player;

public class GameController {
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Label contadorDeAyuda;
    @FXML
    private Label contadorDeVida;
    @FXML
    private TextField campoDeTextoPalabraClave;


    private String palabraClave;
    private char letraClave;
    private Player player;
    private Dice dice1;
    private ImageView diceImageView1;
    private Ayuda ayuda1;
    private char siempreAyuda1;


    // Este es el controlador que manejara y dara la logica a nuestro boton de ingresar la letra que se encuentra en JuegoDeAhorcado-View
    // Este tendra
    @FXML
    public void onHandleButtonRollTheDice(ActionEvent event) {
        // Elimina una imgagen si ya hay una en el anchor pane -> por lo tanto antes de mostrar la sgte primero se borra la anterior si hay anterior
        if (diceImageView1 != null) {
            anchorPane.getChildren().remove(diceImageView1);
        }
        // Se crea la instancia de la clase dice para obtener la imgagen del ahorcado
        dice1 = new Dice();
        // Se crea el objeto y se llama a la accion que ejecuta en el modelo
        diceImageView1 = dice1.getDiceImage();
        // Se agrega a la interfaz grafica
        anchorPane.getChildren().addAll(diceImageView1);

        String palabraClave = campoDeTextoPalabraClave.getText();
        char[] arregloLetrasClave = palabraClave.toCharArray();

        char letraABuscar = letraClave;
        letraABuscar = Character.toLowerCase(letraABuscar); // Hace que no importe si esta en minuscula o mayuscula la letra
        boolean letraEncontrada = false;

        for (char caracter : arregloLetrasClave) {
            if (caracter == letraABuscar) {
                letraEncontrada = true;

                // Esta logica es la que mostrara una letra en pantalla

                break;
            }
        }
    }
    // --------------------------------------------------

    // de aqui para abajo siguen los otros componentes, como el boton de ayuda
    @FXML
    public void onHandleButtonRollTheAyuda(ActionEvent event) {

    }

    public void setPlayer(Player player) {
       this.player = player;
    }
}
