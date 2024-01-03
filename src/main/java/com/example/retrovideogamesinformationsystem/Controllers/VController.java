package com.example.retrovideogamesinformationsystem.Controllers;

import com.example.retrovideogamesinformationsystem.SystemApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class VController {

    @FXML
    public Label display;

    @FXML
    public Button GPButton,GButton,GMButton;

    @FXML
    private void switchToMenu(){
        SystemApplication.switchSceneToMenu();
    }

    @FXML
    private void switchToViewGM(){
        SystemApplication.switchSceneToViewGM();
    }




}
