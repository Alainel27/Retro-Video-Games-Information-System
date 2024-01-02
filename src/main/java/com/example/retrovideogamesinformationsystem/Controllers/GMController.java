package com.example.retrovideogamesinformationsystem.Controllers;
import com.example.retrovideogamesinformationsystem.Models.Game;
import com.example.retrovideogamesinformationsystem.Models.myNode;
import com.example.retrovideogamesinformationsystem.Models.GamesMachine;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


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
        String type = addType.getText();
        String media = addMedia.getText();
        int year = Integer.parseInt(addYear.getText());
        double price = Double.parseDouble(addPrice.getText());
        String URL = addURL.getText();

        //create new GAME MACHINE

        GamesMachine gameMachine = new GamesMachine(machineName,manufacturer,type,media,year,price,URL);
        gameMachine.setMachineName(machineName);
        gameMachine.setManufacturer(manufacturer);
        gameMachine.setType(type);
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
    public ChoiceBox<String> ChoiceBoxGMName;

    public static GamesMachine getGameMachineByName(String gameMName){
        myNode<GamesMachine> temp = SController.allGM.head;

        while (temp != null && !temp.getContents().getMachineName().equals(gameMName)){
            temp = temp.next;
        }
        return temp == null ? null : temp.getContents();
    }
    @FXML
    private void removeGame(){
     GamesMachine gamesMachine = getGameMachineByName(ChoiceBoxGMName.getValue());

        if (gamesMachine != null){
            SController.allGames.remove(gamesMachine);
        }
    }

    @FXML
    private TextField newMachineName,newManufacturer,newType,newMedia,newYear,newPrice,newURL;

    @FXML
    private void updateGameMachine() {
        String selectedGameMName = ChoiceBoxGMName.getValue();

        GamesMachine selectedGameMachine = getGameMachineByName(selectedGameMName);

        if (selectedGameMachine != null) {

            String newMachineNameValue = newMachineName.getText();
            String newManufacturerValue = newManufacturer.getText();
            String newTypeValue = newType.getText();
            String newMediaValue = newMedia.getText();
            int newYearValue = Integer.parseInt(newYear.getText());
            double newPriceValue = Double.parseDouble(newPrice.getText());
            String newURLValue = newURL.getText();

            //create new GAME MACHINE
            selectedGameMachine.setMachineName(newMachineNameValue);
            selectedGameMachine.setManufacturer(newManufacturerValue);
            selectedGameMachine.setType(newTypeValue);
            selectedGameMachine.setType(newTypeValue);
            selectedGameMachine.setYearOfLaunch(newYearValue);
            selectedGameMachine.setPrice(newPriceValue);
            selectedGameMachine.setUrl(newURLValue);

            addMName.clear();
            addManu.clear();
            addType.clear();
            addMedia.clear();
            addYear.clear();
            addPrice.clear();
            addURL.clear();
        }
    }

    @FXML
    private void displayGameMachine(){
        display.setText(SController.allGM.display());
    }


    @FXML
    private void switchToGame(){
        SystemApplication.switchSceneToAddGame();
    }

    @FXML
    private void switchToGameMenu(){
        SystemApplication.switchSceneToMenu();
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
