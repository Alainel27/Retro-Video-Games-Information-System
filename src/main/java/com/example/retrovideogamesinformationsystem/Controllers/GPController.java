package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.GamePort;
import com.example.retrovideogamesinformationsystem.Models.myLinkedList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class GPController {

    private myLinkedList<GamePort> allGamePorts = new myLinkedList<>();

    public TextField addPortedGame, addPortedDeveloper, addPortReleaseYear, addCover;
    public Button display;

    @FXML
    protected void addGamePorts(){
        String portedGame = addPortedGame.getText();
        String portDeveloper = addPortedDeveloper.getText();
        int yearOfRelease = Integer.parseInt(addPortReleaseYear.getText());
        String cover = addCover.getText();

        GamePort gp = new GamePort(portedGame, portDeveloper, yearOfRelease, cover);
        gp.setPortedGame(portedGame);
        gp.setPortDeveloper(portDeveloper);
        gp.setPortReleaseYear(yearOfRelease);
        gp.setCover(cover);

        allGamePorts.add(gp);

        addPortedGame.clear();
        addPortedDeveloper.clear();
        addPortReleaseYear.clear();
        addCover.clear();
    }

    @FXML
    protected void displayGame(){
        display.setText(allGamePorts.display());
    }
}
