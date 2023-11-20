package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GMController {



    //the following code is for the other classes so there this class can be assessed easily.
    public static GMController contGM;
    @FXML
    private void initialize(){
        contGM=this;
    }

    //ahsahhas



    //put the switching methods at the bottom of code


    @FXML
    private void switchToGame(){
        SystemApplication.switchSceneToGame();
    }

    @FXML
    private void switchToGameMenu(){
        SystemApplication.switchSceneToMenu();
    }

    @FXML
    private void switchToGamePort(){
        SystemApplication.switchSceneToGp();
    }



}
