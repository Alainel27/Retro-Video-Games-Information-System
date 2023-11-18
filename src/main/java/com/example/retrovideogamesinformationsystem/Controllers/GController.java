package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.Game;
import com.example.retrovideogamesinformationsystem.Models.myLinkedList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class GController {

    private myLinkedList<Game> allGames = new myLinkedList<>();

    public TextField addGameName, addPublisher, addDescription, addDeveloper, addType, addYearOfRelease, addCover;
    public Button display;

    @FXML
    protected void addGame(){
        String gameName = addGameName.getText();
        String publisher = addPublisher.getText();
        String description = addDescription.getText();
        String developer = addDeveloper.getText();
        String type = addType.getText();
        int yearOfRelease = Integer.parseInt(addYearOfRelease.getText());
        String cover = addCover.getText();

        Game g = new Game(gameName,publisher,description,developer,type,yearOfRelease,cover);
        g.setGameName(gameName);
        g.setPublisher(publisher);
        g.setDescription(description);
        g.setDeveloper(developer);
        g.setType(type);
        g.setYearOfRelease(yearOfRelease);
        g.setCover(cover);

        allGames.add(g);

        addGameName.clear();
        addPublisher.clear();
        addDescription.clear();
        addDeveloper.clear();
        addType.clear();
        addYearOfRelease.clear();
        addCover.clear();
    }

    @FXML
    protected void displayGame(){
        display.setText(allGames.display());
    }
}
