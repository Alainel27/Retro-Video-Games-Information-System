package com.example.retrovideogamesinformationsystem;

import com.example.retrovideogamesinformationsystem.Controllers.GController;
import com.example.retrovideogamesinformationsystem.Controllers.GMController;
import com.example.retrovideogamesinformationsystem.Controllers.SController;
import com.example.retrovideogamesinformationsystem.Models.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.example.retrovideogamesinformationsystem.Models.myNode;

import java.io.IOException;

public class SystemApplication extends Application {

    public static Scene sceneSystem,sceneGMachine,sceneGame,sceneGamePort,sceneEdit;

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

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("edit.fxml"));
        sceneEdit = new Scene(fxmlLoader.load(), 800, 800);

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
        myNode<Game> temp= SController.allGames.head;
        GController.contG.GameName.getItems().clear();
        while (temp!=null){
            GController.contG.GameName.getItems().add(temp.getContents().getGameName());
            temp=temp.next;
        }
    }
    //switches to game port
    public static void switchSceneToGp(){
        primaryStage.setScene(sceneGamePort);
    }

    public static void switchSceneToMenu(){
        primaryStage.setScene(sceneSystem);
    }

    public static void switchSceneToEdit(){
        primaryStage.setScene(sceneEdit);
    }


}

//test