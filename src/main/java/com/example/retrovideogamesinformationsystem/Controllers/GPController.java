package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.GamesMachine;
import com.example.retrovideogamesinformationsystem.Models.myLinkedList;
import com.example.retrovideogamesinformationsystem.Models.GamePort;
import com.example.retrovideogamesinformationsystem.Models.myNode;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
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
    public ChoiceBox<String> ChoiceBoxGPGame;

    public static GamePort getGamePortGame(String GamePortGame){
        //create temp node at head
        myNode<GamePort> temp=SController.allGP.head;

        //Iterate linkedList until end or matching port name
        while (temp!=null && !temp.getContents().getPortedGame().equals(GamePortGame)){
            temp = temp.next;
        }

        //if temp is null return null else return the contents of node
        return temp==null ? null : temp.getContents();
        //if(temp==null) return null; else return temp.getContents();

    }

    @FXML
    private void removeGame(){
        //get the name of the game from the choice box
        GamePort gamePort = getGamePortGame(ChoiceBoxGPGame.getValue());
        //if the game is not null the game with the same name will be removed
        if (gamePort!= null){
            SController.allGP.remove(gamePort);
        }

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
        SystemApplication.switchSceneToAddGM();
    }

    @FXML
    private void switchToGame(){
        SystemApplication.switchSceneToAddGame();
    }

    @FXML
    private void switchToAdd(){
        SystemApplication.switchSceneToAdd();
    }

}
