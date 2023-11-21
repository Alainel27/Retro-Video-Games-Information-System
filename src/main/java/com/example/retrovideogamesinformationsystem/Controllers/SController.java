package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.Game;
import com.example.retrovideogamesinformationsystem.Models.GamesMachine;
import com.example.retrovideogamesinformationsystem.Models.GamePort;
import com.example.retrovideogamesinformationsystem.Models.myLinkedList;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;

public class SController {


    //the following code is for the other classes so there this class can be assessed easily.
    public static SController contS;
    @FXML
    private void initialize(){
        contS=this;
    }

    public static myLinkedList<Game> allGames = new myLinkedList<>();

    public static myLinkedList<GamesMachine> allGM = new myLinkedList<>();

    public static myLinkedList<GamePort> allGP = new myLinkedList<>();


    //put the switching methods at the bottom of code
    @FXML
    private void switchToMenu(){
        SystemApplication.switchSceneToMenu();
    }

    @FXML
    private void switchToAdd(){
        SystemApplication.switchSceneToAdd();
    }
    @FXML
    private void switchToGame(){
        SystemApplication.switchSceneToGame();
    }

    @FXML
    private void switchToGameMachine(){
        SystemApplication.switchSceneToGM();
    }

    @FXML
    private void switchToGamePort(){
        SystemApplication.switchSceneToGp();
    }

    @FXML
    private void switchToEdit(){
        SystemApplication.switchSceneToEdit();
    }


}
