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

        Game game = new Game(gameName,publisher,description,developer,type,yearOfRelease,cover);
        game.setGameName(gameName);
        game.setPublisher(publisher);
        game.setDescription(description);
        game.setDeveloper(developer);
        game.setType(type);
        game.setYearOfRelease(yearOfRelease);
        game.setCover(cover);

        SController.allGames.add(game);

        addGameName.clear();
        addPublisher.clear();
        addDescription.clear();
        addDeveloper.clear();
        addType.clear();
        addYearOfRelease.clear();
        addCover.clear();
    }

    //PETER MADE THIS CODE FOR ME SEAN
    public Game getGameByName(String gameName){
      myNode<Game> temp = SController.allGames.head;

      while (temp != null && !temp.getContents().getGameName().equals(gameName)){
          temp = temp.next;
      }
      return (temp == null) ? null : temp.getContents();
    }

    @FXML
    private void removeGame(){
        Game game = getGameByName(GameToEditCB.getValue());

        if (game != null){
            SController.allGames.remove(game);
        }
    }

    @FXML
    private TextField newName,newPub,newDes,newDevelop,newType,newYear,newCover;

    @FXML
    public ChoiceBox<String> GameToEditCB;

    @FXML
    private void updateGame() {
        //create a string with the value of the game data from choiceBox
        String selectedGameName = GameToEditCB.getValue();

        Game selectedGame = getGameByName(selectedGameName);

        if (selectedGame != null) {
            // OBTAIN THA DATA
            String NameValue = newName.getText();
            String PubValue = newPub.getText();
            String DesValue = newDes.getText();
            String DevelopValue = newDevelop.getText();
            String TypeValue = newType.getText();
            int YearValue = Integer.parseInt(newYear.getText());
            String CoverValue = newCover.getText();

            // UPDATE THA MOTHAFUKER
            selectedGame.setGameName(NameValue);
            selectedGame.setPublisher(PubValue);
            selectedGame.setDescription(DesValue);
            selectedGame.setDeveloper(DevelopValue);
            selectedGame.setType(TypeValue);
            selectedGame.setYearOfRelease(YearValue);
            selectedGame.setCover(CoverValue);

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
    private TextField newName,newPub,newDes,newDevelop,newType,newYear,newCover;

    @FXML
    public ChoiceBox<String> GameToEditCB;

    @FXML
    private void updateGame() {
        //create a string with the value of the game data from choiceBox
        String selectedGameName = GameToEditCB.getValue();

        Game selectedGame = getGameByName(selectedGameName);

        if (selectedGame != null) {
            // OBTAIN THE DATA
            String newNameValue = newName.getText();
            String newPubValue = newPub.getText();
            String newDesValue = newDes.getText();
            String newDevelopValue = newDevelop.getText();
            String newTypeValue = newType.getText();
            int newYearValue = Integer.parseInt(newYear.getText());
            String newCoverValue = newCover.getText();

            // UPDATE THA
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
        display.setText(SController.allGames.display());
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


