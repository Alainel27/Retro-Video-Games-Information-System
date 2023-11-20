package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.myLinkedList;
import com.example.retrovideogamesinformationsystem.Models.GamePort;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GPController {
    //the following code is for the other classes so there this class can be assessed easily.
    public static GPController contGP;

    @FXML
    private void initialize(){
        contGP=this;
    }

    @FXML
    private TextField addPortedGame, addPortDeveloper, addPortReleaseYear, addCover;

    @FXML
    private Label display;

    @FXML
    protected void addGamePort(){
        String portedGame = addPortedGame.getText();
        String portDeveloper = addPortDeveloper.getText();
        int portReleaseYear = Integer.parseInt(addPortReleaseYear.getText());
        String cover = addCover.getText();

        GamePort gp = new GamePort(portedGame,portDeveloper,portReleaseYear,cover);
        gp.setPortedGame(portedGame);
        gp.setPortDeveloper(portDeveloper);
        gp.setPortReleaseYear(portReleaseYear);
        gp.setCover(cover);

        SController.allGP.add(gp);

        addPortedGame.clear();
        addPortDeveloper.clear();
        addPortReleaseYear.clear();
        addCover.clear();
    }

    @FXML
    protected void displayGamePort(){
        display.setText(SController.allGP.display());
    }

    @FXML
    private void switchToMenu(){
        SystemApplication.switchSceneToMenu();
    }

    @FXML
    private void switchToGameMachine(){
        SystemApplication.switchSceneToGM();
    }

    @FXML
    private void switchToGame(){
        SystemApplication.switchSceneToGame();
    }

    @FXML
    private void switchToEdit(){
        SystemApplication.switchSceneToEdit();
    }

}
