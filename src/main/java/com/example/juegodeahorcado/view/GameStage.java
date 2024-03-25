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
        FXMLLoader loader = new FXMLLoader(getClass().getResource(""));
        Parent root = loader.load();
        gameController = loader.getController();
        Scene scene = new Scene(root);
        setTitle("Juego de ahorcado");
        getIcons().add(
                new Image(
                        String.valueOf(getClass().getResource(""))));
        setResizable(false);
        setScene(scene);
        show();
    }

    public static GameStage getInstance() throws IOException {
       return GameStageHolder.INSTANCE = new GameStage();
    }

    public static void deleteInstance(){
        GameStageHolder.INSTANCE.close();
        GameStageHolder.INSTANCE = null;
    }

    pirvate static class GameStageHolder {
        private static GameStage INSTANCE;
    }

}
