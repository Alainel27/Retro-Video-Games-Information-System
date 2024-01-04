package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.*;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GPController {

    //The following code is for the other classes so there this class can be assessed easily.
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
    public ChoiceBox<String> ChoiceBoxGPGame;

    @FXML
    private TextField newPortedGame, newPortDeveloper, newPortReleaseYear, newCover;

    //Gathers inputs from user to create a new GamePort and add it to the list
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

    //Gathers the names of the existing GamePort in the list
    public static GamePort getGamePortGame(String gamePortGame) {
        myNode<GamePort> temp = SController.allGP.head;

        while (temp != null && !temp.getContents().getPortedGame().equals(gamePortGame)){
            temp = temp.next;
        }
        return temp == null ? null : temp.getContents();
    }

    //From the list of gathered GamePort names and removes the selected GamePort
    @FXML
    private void removeGamePort(){
        GamePort gamePort = getGamePortGame(ChoiceBoxGPGame.getValue());

        if (gamePort != null){
            SController.allGames.remove(gamePort);
        }
    }

    //Gathers info from user to update the contents of a selected GamePort
    @FXML
    private void updatePort(){
        String selectedGamePort = ChoiceBoxGPGame.getValue();

        GamePort selectedPort = getGamePortGame(selectedGamePort);

        if (selectedPort != null){
            String portedGameValue = newPortedGame.getText();
            String portDeveloperValue = newPortDeveloper.getText();
            int portReleaseYear = Integer.parseInt(newPortReleaseYear.getText());
            String portCover = newCover.getText();

            selectedPort.setPortedGame(portedGameValue);
            selectedPort.setPortDeveloper(portDeveloperValue);
            selectedPort.setPortReleaseYear(portReleaseYear);
            selectedPort.setCover(portCover);


            newPortedGame.clear();
            newPortDeveloper.clear();
            newPortReleaseYear.clear();
            newCover.clear();

        }
    }
    //SEARCHING METHOD

    public String search(String searchName){
        myNode<GamePort> temp = SController.allGP.head;
        while (temp != null) {
            GamePort gameport = temp.getContents();

            if (gameport.getPortedGame().equalsIgnoreCase(searchName)){
                return "Game Machine: " + gameport.getPortedGame();
            }

            temp=temp.next;
        }

        return null;
    }

    @FXML
    public TextField searchTF;

    @FXML
    private void searching(){
        String name = searchTF.getText();
        String list = search(name);
        display.setText(list);

    }

    //Sorting

    private void swapGamePort(myLinkedList<GamePort> gamePort, int i, int j){
        GamePort small = gamePort.get(i);
        GamePort big = gamePort.get(j);

        gamePort.set(i,big);
        gamePort.set(j,small);
    }

    public myLinkedList<GamePort> sortByYearAscending(myLinkedList<GamePort> list){
        for(int i = list.size() - 1;i >=0; i--){
            int highestYear = 0;
            for(int j = 0;j <= i;j++) {
                if (list.get(j).getPortReleaseYear() < SController.allGP.get(highestYear).getPortReleaseYear()) {
                    highestYear = j;
                }
            }
            swapGamePort(list,i,highestYear);
        }
        return list;
    }

    public myLinkedList<GamePort> sortByYearDescending(myLinkedList<GamePort> list){
        for(int i = SController.allGP.size() - 1;i >=0; i--){
            int lowestYear = 0;
            for(int j = 0;j <= i;j++) {
                if (SController.allGP.get(j).getPortReleaseYear() > SController.allGP.get(lowestYear).getPortReleaseYear()) {
                    lowestYear = j;
                }
            }
            swapGamePort(SController.allGP,i,lowestYear);
        }
        return list;
    }

    //Display's

    @FXML
    private void ascendingSortDisplay(){
        myLinkedList<GamePort> sortA = sortByYearAscending(SController.allGP);

        display.setText(sortA.display());
    }

    @FXML
    private void descendingSortDisplay(){
        myLinkedList<GamePort> sortD = sortByYearDescending(SController.allGP);

        display.setText(sortD.display());
    }

    @FXML
    protected void displayGamePort(){
        display.setText(SController.allGP.display());
    }

    //Switching Scenes

    @FXML
    private void switchToAdd(){
        SystemApplication.switchSceneToAdd();
    }

    @FXML
    private void switchToEdit(){
        SystemApplication.switchSceneToEdit();
    }

    @FXML
    private void switchToViewSystem(){
        SystemApplication.switchSceneToViewSystem();
    }

}
