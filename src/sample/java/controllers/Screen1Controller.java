package sample.java.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import sample.java.services.NewTab;
import sample.java.services.OpenFile;

public class Screen1Controller {
    @FXML
    private TabPane tabPane;

    //New Window menuItem.
    @FXML
    private void menuItem1() {

    }

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

    @FXML
    private void menuItem4() {
        
    }

    //Close Tab menuItem.
    @FXML
    private void menuItem7() {
        Tab tab = tabPane.getSelectionModel().getSelectedItem();
        tabPane.getTabs().remove(tab);
    }
}
