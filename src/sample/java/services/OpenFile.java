package sample.java.services;

import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.*;

//Choose a file, open it and get its data in a String.
public class OpenFile {

    private TextArea textArea = new TextArea();
    private AnchorPane anchorPane = new AnchorPane(textArea);

    //Choose a file.
    public OpenFile(File file, String fileName, TabPane tabPane, TreeView<String> treeView) {

        String string = "";

        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

            while ((string = bufferedReader.readLine()) != null)
                stringBuilder.append(string).append("\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        anchorPane.setTopAnchor(textArea, 0.0);
        anchorPane.setBottomAnchor(textArea, 0.0);
        anchorPane.setLeftAnchor(textArea, 0.0);
        anchorPane.setRightAnchor(textArea, 0.0);

        Tab tab = new Tab(fileName, anchorPane);
        tabPane.getTabs().add(tab);

        textArea.setText(stringBuilder.toString());
    }

    public TextArea getTextArea() {
        return textArea;
    }
}
