package com.example.retrovideogamesinformationsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SystemApplication extends Application {

    public static Scene sceneSystem,sceneGMachine,sceneGame,sceneGamePort;

    public static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("system-view.fxml"));
        sceneSystem = new Scene(fxmlLoader.load(), 800, 800);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("game-machine.fxml"));
        sceneGMachine = new Scene(fxmlLoader.load(), 800, 800);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("game.fxml"));
        sceneGame = new Scene(fxmlLoader.load(), 800, 800);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("game-port.fxml"));
        sceneGamePort = new Scene(fxmlLoader.load(), 800, 800);


        stage.setTitle("System Controller");
        stage.setScene(sceneSystem);
        stage.show();
        primaryStage = stage;
    }

    public static void main(String[] args) {
        launch();
    }

    //switches to game machine
    public static void switchSceneToGM(){
        primaryStage.setScene(sceneGMachine);
    }
    //switches to Game scene
    public static void switchSceneToGame(){
        primaryStage.setScene(sceneGame);
    }
    //switches to game port
    public static void switchSceneToGp(){
        primaryStage.setScene(sceneGamePort);
    }

    public static void switchSceneToMenu(){
        primaryStage.setScene(sceneSystem);
    }


}

//test