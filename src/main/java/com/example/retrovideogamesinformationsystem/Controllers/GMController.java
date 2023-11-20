package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.GamesMachine;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class GMController {



    //the following code is for the other classes so there this class can be assessed easily.
    public static GMController contGM;
    @FXML
    private void initialize(){
        contGM=this;
    }
    @FXML
    public TextField addMName,addManu,addType,addMedia,addYear,addPrice,addURL;

    @FXML
    private Label display;

    @FXML
    private void addGameMachine(){
        //Obtain data from text fields
        String machineName = addMName.getText();
        String manufacturer = addManu.getText();
        String OldMachine = addType.getText();
        String media = addMedia.getText();
        int year = Integer.parseInt(addYear.getText());
        double price = Double.parseDouble(addPrice.getText());
        String URL = addURL.getText();

        //create new GAME MACHINE
        GamesMachine gameMachine = new GamesMachine(machineName,manufacturer,OldMachine,media,year,price,URL);
        gameMachine.setMachineName(machineName);
        gameMachine.setManufacturer(manufacturer);
        gameMachine.setType(OldMachine);
        gameMachine.setType(media);
        gameMachine.setYearOfLaunch(year);
        gameMachine.setPrice(price);
        gameMachine.setUrl(URL);


        SController.allGM.add(gameMachine);

        addMName.clear();
        addManu.clear();
        addType.clear();
        addMedia.clear();
        addYear.clear();
        addPrice.clear();
        addURL.clear();

    }
//put the switching methods at the bottom of code

    @FXML
    private void displayGameMachine(){
        display.setText(SController.allGM.display());
    }
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

    @FXML
    private void switchToEdit(){
        SystemApplication.switchSceneToEdit();
    }

}
