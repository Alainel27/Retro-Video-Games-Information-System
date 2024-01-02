package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.Game;
import com.example.retrovideogamesinformationsystem.Models.GamesMachine;
import com.example.retrovideogamesinformationsystem.Models.myNode;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
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
        gameMachine.setMedia(media);
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

    public static GamesMachine getGameMachineByName(String GameMName){
        //create temp node at head
        myNode<GamesMachine> temp=SController.allGM.head;

        //Iterate linkedList until end or matching port name
        while (temp!=null && !temp.getContents().getMachineName().equals(GameMName)){
            temp = temp.next;
        }

        //if temp is null return null else return the contents of node
        return temp==null ? null : temp.getContents();
        //if(temp==null) return null; else return temp.getContents();

    }

    @FXML
    private void removeGame(){
        //get the name of the game from the choice box
        GamesMachine gameMachine = getGameMachineByName(ChoiceBoxGMName.getValue());
        //if the game is not null the game with the same name will be removed
        if (gameMachine != null){
            SController.allGM.remove(gameMachine);
        }

    }

    //SEARCHING METHOD AND DISPLAYING METHODS

    public String search(String searchName){
        myNode<GamesMachine> temp = SController.allGM.head;
        while (temp != null) {
            GamesMachine gamesMachine = temp.getContents();

            if (gamesMachine.getMachineName().equalsIgnoreCase(searchName)){
                return "Game Machine: " + gamesMachine.getMachineName() + " " + gamesMachine.getManufacturer();
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

    @FXML
    private void switchToViewSystem(){
        SystemApplication.switchSceneToViewSystem();
    }
}
