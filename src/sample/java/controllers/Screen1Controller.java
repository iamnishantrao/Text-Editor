package sample.java.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import sample.java.services.NewTab;
import sample.java.services.OpenFile;
import sample.java.services.OpenFolder;

import java.io.File;

public class Screen1Controller {
    @FXML
    private TabPane tabPane;
    @FXML
    private TreeView<String> treeView;

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
        new OpenFile(tabPane, treeView);
    }

    //Open Folder menuItem.
    @FXML
    private void menuItem4() {
        new OpenFolder(treeView);
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

    public TabPane getTabPane() {
        return tabPane;
    }

    public TreeView<String> getTreeView() {
        return treeView;
    }
}
