package main.java.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import main.java.services.NewTab;
import main.java.services.OpenFile;

public class Screen1Controller {
    @FXML
    private TabPane tabPane;

    //New File menuItem.
    @FXML
    private void menuItem2() {
        new NewTab(tabPane);
    }

    //Open File menuItem.
    @FXML
    private void menuItem3() {
        new OpenFile(tabPane);
    }

    //Close Tab menuItem.
    @FXML
    private void menuItem7() {
        Tab tab = tabPane.getSelectionModel().getSelectedItem();
        tabPane.getTabs().remove(tab);
    }
}
