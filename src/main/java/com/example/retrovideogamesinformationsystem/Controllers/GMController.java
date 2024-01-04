package com.example.retrovideogamesinformationsystem.Controllers;
import com.example.retrovideogamesinformationsystem.Models.*;
import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class GMController {

    //The following code is for the other classes so there this class can be assessed easily.
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
    private TextField newMachineName,newManufacturer,newType,newMedia,newYear,newPrice,newURL;


    //Gathers inputs from user to create a new GameMachine and add it to the list
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
    @FXML
    public ChoiceBox<String> ChoiceBoxGMName;

    //Gathers the names of the existing GameMachine in the list
    public static GamesMachine getGameMachineByName(String gameMName){
        myNode<GamesMachine> temp = SController.allGM.head;

        while (temp != null && !temp.getContents().getMachineName().equals(gameMName)){
            temp = temp.next;
        }
        return temp == null ? null : temp.getContents();
    }

    //From the list of gathered GameMachine names and  removes the selected GameMachine
    @FXML
    private void removeGame(){
     GamesMachine gamesMachine = getGameMachineByName(ChoiceBoxGMName.getValue());

        if (gamesMachine != null){
            SController.allGames.remove(gamesMachine);
        }
    }


    //Gathers info from user to update the contents of a selected GameMachine
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

            //Update an existing GAME MACHINE

            selectedGameMachine.setMachineName(newMachineNameValue);
            selectedGameMachine.setManufacturer(newManufacturerValue);
            selectedGameMachine.setType(newTypeValue);
            selectedGameMachine.setMedia(newMediaValue);
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

    //SEARCHING METHOD

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

    //Sorting

    //Swap two items in the list
    private void swapGameMachine(myLinkedList<GamesMachine> gamesMachine, int i, int j){
        GamesMachine small = gamesMachine.get(i);
        GamesMachine big = gamesMachine.get(j);

        gamesMachine.set(i,big);
        gamesMachine.set(j,small);
    }

    public myLinkedList<GamePort> sortByYearAscending(myLinkedList<GamesMachine> list){
        for(int i = list.size() - 1;i >=0; i--){
            int highestYear = 0;
            for(int j = 0;j <= i;j++) {
                if (list.get(j).getYearOfLaunch() < SController.allGM.get(highestYear).getYearOfLaunch()) {
                    highestYear = j;
                }
            }
            swapGameMachine(list,i,highestYear);
        }
        return null;
    }

    public myLinkedList<GamePort> sortByYearDescending(myLinkedList<GamesMachine> list){
        for(int i = list.size() - 1;i >=0; i--){
            int lowestYear = 0;
            for(int j = 0;j <= i;j++) {
                if (list.get(j).getYearOfLaunch() > SController.allGM.get(lowestYear).getYearOfLaunch()) {
                    lowestYear = j;
                }
            }
            swapGameMachine(list,i,lowestYear);
        }
        return null;
    }

    public myLinkedList<GamePort> sortByPriceAscending(myLinkedList<GamesMachine> list){
        for(int i = list.size() - 1;i >=0; i--){
            int highestPrice = 0;
            for(int j = 0;j <= i;j++) {
                if (list.get(j).getPrice() < SController.allGM.get(highestPrice).getPrice()) {
                    highestPrice = j;
                }
            }
            swapGameMachine(list,i,highestPrice);
        }
        return null;
    }

    public myLinkedList<GamePort> sortByPriceDescending(myLinkedList<GamesMachine> list){
        for(int i = list.size() - 1;i >=0; i--){
            int lowestPrice = 0;
            for(int j = 0;j <= i;j++) {
                if (list.get(j).getPrice() > SController.allGM.get(lowestPrice).getPrice()) {
                    lowestPrice = j;
                }
            }
            swapGameMachine(list,i,lowestPrice);
        }
        return null;
    }

    //Display's
    @FXML
    private void ascendingYearSortDisplay(){
        myLinkedList<GamePort> sortYA = sortByYearAscending(SController.allGM);

        display.setText(sortYA.display());
    }

    @FXML
    private void descendingYearSortDisplay(){
        myLinkedList<GamePort> sortYD = sortByYearDescending(SController.allGM);

        display.setText(sortYD.display());
    }

    @FXML
    private void ascendingPriceSortDisplay(){
        myLinkedList<GamePort> sortPA = sortByPriceAscending(SController.allGM);

        display.setText(sortPA.display());
    }

    @FXML
    private void descendingPriceSortDisplay(){
        myLinkedList<GamePort> sortPD = sortByPriceDescending(SController.allGM);

        display.setText(sortPD.display());
    }

    @FXML
    private void displayGameMachine(){
        display.setText(SController.allGM.display());
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
