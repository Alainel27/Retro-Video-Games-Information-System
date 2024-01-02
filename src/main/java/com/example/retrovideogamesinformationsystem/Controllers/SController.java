package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.Game;
import com.example.retrovideogamesinformationsystem.Models.GamesMachine;
import com.example.retrovideogamesinformationsystem.Models.GamePort;
import com.example.retrovideogamesinformationsystem.Models.myLinkedList;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;

import java.util.HashMap;

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







}
