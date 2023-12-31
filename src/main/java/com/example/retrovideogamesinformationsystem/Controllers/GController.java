package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.Game;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.example.retrovideogamesinformationsystem.Models.myNode;


public class GController {
    //the following code is for the other classes so there this class can be assessed easily.
    public static GController contG;
    @FXML
    private void initialize(){
        contG=this;
    }


    @FXML
    private TextField addGameName, addPublisher, addDescription, addDeveloper, addType, addYearOfRelease, addCover;
    @FXML
    private Label display;

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

        SController.gameHashMap.put(gameName,g);

        addGameName.clear();
        addPublisher.clear();
        addDescription.clear();
        addDeveloper.clear();
        addType.clear();
        addYearOfRelease.clear();
        addCover.clear();
    }

    @FXML
    public ChoiceBox<String> GameName;

    //PETER MADE THIS CODE FOR ME SEAN
    public static Game getGameByName(String gameName){
       return SController.gameHashMap.get(gameName);
    }

    //MOTHA FUKING WORKS
    @FXML
    private void removeGame(){
        String selectedGameName = GameName.getValue();
        SController.gameHashMap.remove(selectedGameName);
    }

    @FXML
    private TextField newName,newPub,newDes,newDevelop,newType,newYear,newCover;

    @FXML
    public ChoiceBox<String> GameToEditCB;

    @FXML
    private void updateGame() {
        //create a string with the value of the game data from choiceBox
        String selectedGameName = GameToEditCB.getValue();

        Game selectedGame = SController.gameHashMap.get(selectedGameName);

        if (selectedGame != null) {
            // OBTAIN THA DATA
            String newNameValue = newName.getText();
            String newPubValue = newPub.getText();
            String newDesValue = newDes.getText();
            String newDevelopValue = newDevelop.getText();
            String newTypeValue = newType.getText();
            int newYearValue = Integer.parseInt(newYear.getText());
            String newCoverValue = newCover.getText();

            // UPDATE THA MOTHAFUKER
            selectedGame.setGameName(newNameValue);
            selectedGame.setPublisher(newPubValue);
            selectedGame.setDescription(newDesValue);
            selectedGame.setDeveloper(newDevelopValue);
            selectedGame.setType(newTypeValue);
            selectedGame.setYearOfRelease(newYearValue);
            selectedGame.setCover(newCoverValue);

            newName.clear();
            newPub.clear();
            newDes.clear();
            newDevelop.clear();
            newType.clear();
            newYear.clear();
            newCover.clear();

        }
    }


    @FXML
    protected void displayGame(){
        display.setText(SController.gameHashMap.values().toString());
    }

    @FXML
    private void switchToMenu(){
        SystemApplication.switchSceneToMenu();
    }

    @FXML
    private void switchToGameMachine(){
        SystemApplication.switchSceneToAddGM();
    }

    @FXML
    private void switchToGamePort(){
        SystemApplication.switchSceneToAddGp();
    }

    @FXML
    private void switchToAdd(){
        SystemApplication.switchSceneToAdd();
    }

    @FXML
    private void switchToEdit(){
        SystemApplication.switchSceneToEdit();
    }
}
