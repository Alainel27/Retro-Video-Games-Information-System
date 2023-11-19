package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.Models.GamesMachine;
import com.example.retrovideogamesinformationsystem.Models.myLinkedList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class GMController {

    private myLinkedList<GamesMachine> allGamesMachines = new myLinkedList<>();

    public TextField addMachineName, addManufacturer, addType, addMedia, addYearOfRelease, addPrice, addURL;
    public Button display;

    @FXML
    protected void addGame(){
        String machineName = addMachineName.getText();
        String manufacturer = addManufacturer.getText();
        String type = addType.getText();
        String media = addMedia.getText();
        int yearOfRelease = Integer.parseInt(addYearOfRelease.getText());
        float price = Float.parseFloat(addPrice.getText());
        String URL = addURL.getText();

        GamesMachine gm = new GamesMachine(machineName, manufacturer, type, media, yearOfRelease, price, URL);
        gm.setMachineName(machineName);
        gm.setManufacturer(manufacturer);
        gm.setType(type);
        gm.setMedia(media);
        gm.setYearOfLaunch(yearOfRelease);
        gm.setPrice(price);
        gm.setUrl(URL);

        allGamesMachines.add(gm);

        addMachineName.clear();
        addManufacturer.clear();
        addType.clear();
        addMedia.clear();
        addYearOfRelease.clear();
        addPrice.clear();
        addURL.clear();


    }

    @FXML
    protected void displayGameMachines(){
        display.setText(allGamesMachines.display());
    }
}
