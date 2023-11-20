package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;

public class GPController {

    //the following code is for the other classes so there this class can be assessed easily.
    public static GPController contGP;
    @FXML
    private void initialize(){
        contGP=this;
    }



    //put the switching methods at the bottom of code
    @FXML
    private void switchToGame(){
        SystemApplication.switchSceneToGame();
    }

    @FXML
    private void switchToGameMachine(){
        SystemApplication.switchSceneToGM();
    }

    @FXML
    private void switchToMenu(){
        SystemApplication.switchSceneToMenu();
    }
}
