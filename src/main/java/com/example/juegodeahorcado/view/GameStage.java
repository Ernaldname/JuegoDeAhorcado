package com.example.juegodeahorcado.view;

import com.example.juegodeahorcado.controller.GameController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;


public class GameStage extends Stage {
    private GameController gameController;

    public GameStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("")); // Carga el archivo que le indicamos en getResourse
        Parent root = loader.load(); // La variable root pasa a ser un objeto de tipo Parent (Nodo principal)
        gameController = loader.getController(); // Con este .getController asignamos la referencia del controlador de la logica de la interfaz para el FXML cargado
        Scene scene = new Scene(root); // Sirve para crear una nueva escena utilizando el nodo raiz "root" como contenido principal

        // A partir de este momento podemos manipular la escena principal de la aplicacion

        setTitle("Juego de ahorcado"); // Le asignamos un titulo

        getIcons().add(
                new Image(
                        String.valueOf(getClass().getResource("")))); // Le añadimos un icono

        setResizable(false); // Inhabilitamos la capacida de redimensionar manualmente la ventana ('Stage') en jafaFX

        setScene(scene); // Mostramos la escena

        show(); // Permite visualizar e interactuar con la ventana principal de la aplicacion

    }

    // Utilizamos el patron Singleton para la clase GameStage que parece ser una clase que representa una ventana o escenario en una aplicacion de juego (Posiblemente en JavaFX)

    public static GameStage getInstance() throws IOException {
       return GameStageHolder.INSTANCE = new GameStage(); // Utiliza un patron singleton con el fin de garantizar que
        // exista una unica intancia de GameStage y la asigna a GameStage
        //
    }

    public static void deleteInstance(){
        GameStageHolder.INSTANCE.close();
        GameStageHolder.INSTANCE = null;
    }

    private static class GameStageHolder {
        private static GameStage INSTANCE;
    }

}
