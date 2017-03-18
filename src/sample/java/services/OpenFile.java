package sample.java.services;

import javafx.scene.control.TabPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Choose a file, open it and get its data in a String.
public class OpenFile {
    private File file;

    //Choose a file.
    public OpenFile(TabPane tabPane) {

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

        //Call to create a NewTab.
        new NewTab(fileName, string, tabPane);
    }
}
