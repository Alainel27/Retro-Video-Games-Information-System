package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.Game;
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

    public static GamePort getGamePortGame(String gamePortGame) {
        myNode<GamePort> temp = SController.allGP.head;

        while (temp != null && !temp.getContents().getPortedGame().equals(gamePortGame)){
            temp = temp.next;
        }
        return temp == null ? null : temp.getContents();
    }

    @FXML
    private void removeGamePort(){
        GamePort gamePort = getGamePortGame(ChoiceBoxGPGame.getValue());

        if (gamePort != null){
            SController.allGames.remove(gamePort);
        }
    }

    @FXML
    private TextField newPortedGame, newPortDeveloper, newPortReleaseYear, newCover;

    @FXML
    private void updatePort(){
        String selectedGamePort = ChoiceBoxGPGame.getValue();

        GamePort selectedPort = getGamePortGame(selectedGamePort);

        if (selectedPort != null){
            String portedGameValue = newPortedGame.getText();
            String portDeveloperValue = newPortDeveloper.getText();
            int portReleaseYear = Integer.parseInt(newPortReleaseYear.getText());
            String portCover = newCover.getText();

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

    @FXML
    private void switchToEdit(){
        SystemApplication.switchSceneToEdit();
    }

}
