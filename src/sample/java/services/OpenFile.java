package sample.java.services;

import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import sample.java.controllers.Screen1Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Choose a file, open it and get its data in a String.
public class OpenFile {
    private File file;

    private TextArea textArea = new TextArea();
    private AnchorPane anchorPane = new AnchorPane(textArea);

    //Choose a file.
    public OpenFile(TabPane tabPane, TreeView<String> treeView) {

        FileChooser fileChooser = new FileChooser();
        file = fileChooser.showOpenDialog(new Stage()).getAbsoluteFile();
        String fileName = file.getName();

        String string = "";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);

            int i = 0;
            while ((i = fileInputStream.read()) != -1)
                string = string.concat((char)i + "");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        anchorPane.setTopAnchor(textArea, 0.0);
        anchorPane.setBottomAnchor(textArea, 0.0);
        anchorPane.setLeftAnchor(textArea, 0.0);
        anchorPane.setRightAnchor(textArea, 0.0);

        Tab tab = new Tab(fileName, anchorPane);
        tabPane.getTabs().add(tab);

        textArea.setText(string);

        //To handle cancel bitton in FileChooser.
        if (file == null) {

        } else {
            new CreateTree(file, treeView);
        }
    }
}
