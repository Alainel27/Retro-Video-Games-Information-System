package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.Game;
import com.example.retrovideogamesinformationsystem.Models.GamesMachine;
import com.example.retrovideogamesinformationsystem.Models.GamePort;
import com.example.retrovideogamesinformationsystem.Models.myLinkedList;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;


public class SController {


    //The following code is for the other classes so there this class can be assessed easily.
    public static SController contS;
    @FXML
    private void initialize(){
        contS=this;
    }

    public static myLinkedList<Game> allGames = new myLinkedList<>();

    public static myLinkedList<GamesMachine> allGM = new myLinkedList<>();

    public static myLinkedList<GamePort> allGP = new myLinkedList<>();


    //Put the switching methods at the bottom of code
    @FXML
    private void switchToMenu(){
        SystemApplication.switchSceneToMenu();
    }

    @FXML
    private void switchToAdd(){
        SystemApplication.switchSceneToAdd();
    }
    @FXML
    private void switchToAddGame(){
        SystemApplication.switchSceneToAddGame();
    }

    @FXML
    private void switchToAddGameMachine(){
        SystemApplication.switchSceneToAddGM();
    }

    @FXML
    private void switchToAddGamePort(){
        SystemApplication.switchSceneToAddGp();
    }

    @FXML
    private void switchToEdit(){
        SystemApplication.switchSceneToEdit();
    }

    @FXML
    private void switchToEditGame(){
        SystemApplication.switchSceneToEditGame();
    }

    @FXML
    private void switchToEditGameMachine(){
        SystemApplication.switchSceneToEditGM();
    }

    @FXML
    private void switchToEditGamePort(){
        SystemApplication.switchSceneToEditGP();
    }

    @FXML
    private void switchToViewSystem(){
        SystemApplication.switchSceneToViewSystem();
    }

    @FXML
    private void switchToViewGames(){
        SystemApplication.switchSceneToViewGames();
    }

    @FXML
    private void switchToViewGamesMachine(){
        SystemApplication.switchSceneToViewGM();
    }

    @FXML
    private void switchToViewGamesPort(){
        SystemApplication.switchSceneToViewGP();
    }

}
