package com.example.retrovideogamesinformationsystem;

import com.example.retrovideogamesinformationsystem.Controllers.GController;
import com.example.retrovideogamesinformationsystem.Controllers.GMController;
import com.example.retrovideogamesinformationsystem.Controllers.GPController;
import com.example.retrovideogamesinformationsystem.Controllers.SController;
import com.example.retrovideogamesinformationsystem.Models.Game;
import com.example.retrovideogamesinformationsystem.Models.GamePort;
import com.example.retrovideogamesinformationsystem.Models.GamesMachine;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.example.retrovideogamesinformationsystem.Models.myNode;

import java.io.IOException;

public class SystemApplication extends Application {

    public static Scene sceneSystem, sceneAddGMachine, sceneAddGame, sceneAddGamePort, sceneAdd, sceneEdit, sceneEditGame, sceneEditGMachine, sceneEditGamePort, sceneViewSystem, sceneViewGM, Test;

    public static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("system-view.fxml"));
        sceneSystem = new Scene(fxmlLoader.load(), 550, 400);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("Add/add-game-machine.fxml"));
        sceneAddGMachine = new Scene(fxmlLoader.load(), 550, 400);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("Add/add-game.fxml"));
        sceneAddGame = new Scene(fxmlLoader.load(), 550, 400);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("Add/add-game-port.fxml"));
        sceneAddGamePort = new Scene(fxmlLoader.load(), 550, 400);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("Add/add.fxml"));
        sceneAdd = new Scene(fxmlLoader.load(), 550, 400);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("Edit/edit.fxml"));
        sceneEdit = new Scene(fxmlLoader.load(), 550, 400);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("Edit/edit-game.fxml"));
        sceneEditGame = new Scene(fxmlLoader.load(), 550, 400);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("Edit/edit-gmachine.fxml"));
        sceneEditGMachine = new Scene(fxmlLoader.load(), 550, 400);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("Edit/edit-game-port.fxml"));
        sceneEditGamePort = new Scene(fxmlLoader.load(), 550, 400);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("View/view-system.fxml"));
        sceneViewSystem = new Scene(fxmlLoader.load(), 550, 400);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("View/view-gMachine.fxml"));
        sceneViewGM = new Scene(fxmlLoader.load(), 550, 400);

        fxmlLoader = new FXMLLoader(SystemApplication.class.getResource("View/Test.fxml"));
        Test = new Scene(fxmlLoader.load(), 550, 400);


        stage.setTitle("System Controller");
        stage.setScene(sceneSystem);
        stage.show();
        primaryStage = stage;
    }

    public static void main(String[] args) {
        launch();
    }

    //switches to game machine
    public static void switchSceneToAddGM() {
        primaryStage.setScene(sceneAddGMachine);
    }

    //switches to Game scene
    public static void switchSceneToAddGame() {
        primaryStage.setScene(sceneAddGame);

    }

    //switches to game port
    public static void switchSceneToAddGp() {
        primaryStage.setScene(sceneAddGamePort);
        myNode<GamePort> temp = SController.allGP.head;
        GPController.contGP.ChoiceBoxGPGame.getItems().clear();
        while (temp != null) {
            GPController.contGP.ChoiceBoxGPGame.getItems().add(temp.getContents().getPortedGame());
            temp = temp.next;
        }
    }

    public static void switchSceneToMenu() {
        primaryStage.setScene(sceneSystem);
    }

    public static void switchSceneToAdd() {
        primaryStage.setScene(sceneAdd);
    }

    public static void switchSceneToEdit() {
        primaryStage.setScene(sceneEdit);
    }

    public static void switchSceneToEditGame() {
        primaryStage.setScene(sceneEditGame);
        GController.contG.GameToEditCB.getItems().clear();
        myNode<Game> temp = SController.allGames.head;
        while (temp != null) {
            GController.contG.GameToEditCB.getItems().add(temp.getContents().getGameName());
            temp = temp.next;
        }
    }

    public static void switchSceneToEditGM() {
        primaryStage.setScene(sceneEditGMachine);
        GMController.contGM.ChoiceBoxGMName.getItems().clear();
        myNode<GamesMachine> temp = SController.allGM.head;
        while (temp != null) {
            GMController.contGM.ChoiceBoxGMName.getItems().add(temp.getContents().getMachineName());
            temp = temp.next;
        }
    }

    public static void switchSceneToEditGP() {
        primaryStage.setScene(sceneEditGamePort);
        GPController.contGP.ChoiceBoxGPGame.getItems().clear();
        myNode<GamePort> temp = SController.allGP.head;
        while (temp != null) {
            GPController.contGP.ChoiceBoxGPGame.getItems().add(temp.getContents().getPortedGame());
            temp = temp.next;
        }
    }

    public static void switchSceneToViewSystem() {
        primaryStage.setScene(sceneViewSystem);
    }

    public static void switchSceneToViewGM() {
        primaryStage.setScene(sceneViewGM);
    }

    public static void switchSceneToViewTest() {
        primaryStage.setScene(Test);
    }
}


//test