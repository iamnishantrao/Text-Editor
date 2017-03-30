package sample.java.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import sample.java.services.CreateTree;
import sample.java.services.NewTab;

import java.io.File;

public class Screen1Controller {
    @FXML
    private TabPane tabPane;
    @FXML
    private TreeView<String> treeView;

    private File file;

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
        FileChooser fileChooser = new FileChooser();
        file = fileChooser.showOpenDialog(new Stage());

        if (file == null) {

        } else {
            new CreateTree(file, tabPane, treeView);
        }
    }

    //Open Folder menuItem.
    @FXML
    private void menuItem4() {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        file = directoryChooser.showDialog(new Stage());

        //To handle cancel button in DirectoryChooser.
        if (file == null) {

        } else {
            new CreateTree(file, tabPane, treeView);
        }
    }

    //Save File menuItem.
    @FXML
    private void menuItem5() {
    }

    //Close Tab menuItem.
    @FXML
    private void menuItem7() {
        Tab tab = tabPane.getSelectionModel().getSelectedItem();
        tabPane.getTabs().remove(tab);
    }
}
