package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.Game;
import com.example.retrovideogamesinformationsystem.Models.myLinkedList;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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

        SController.allGames.add(g);

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

    public static Game getGameByName(String GameName){
        //create temp node at head
        myNode<Game> temp=SController.allGames.head;

        //Iterate linkedList until end or matching port name
        while (temp!=null && !temp.getContents().getGameName().equals(GameName)){
            temp = temp.next;
        }

        //if temp is null return null else return the contents of node
        return temp==null ? null : temp.getContents();
        //if(temp==null) return null; else return temp.getContents();

    }

    //MOTHA FUKING WORKS
    @FXML
    private void removeGame(){
        //get the name of the game from the choice box
        Game game = getGameByName(GameName.getValue());
        //if the game is not null the game with the same name will be removed
        if (game != null){
            SController.allGames.remove(game);
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
