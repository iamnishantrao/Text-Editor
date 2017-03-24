package sample.java.services;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

//Create a new Tab in the tabPane.
public class NewTab {
    private TextArea textArea = new TextArea();
    private AnchorPane anchorPane = new AnchorPane(textArea);

    //For New File.
    public NewTab(TabPane tabPane) {
        anchorPane.setTopAnchor(textArea, 0.0);
        anchorPane.setBottomAnchor(textArea, 0.0);
        anchorPane.setLeftAnchor(textArea, 0.0);
        anchorPane.setRightAnchor(textArea, 0.0);

        Tab tab = new Tab("New File", anchorPane);
        tabPane.getTabs().add(tab);
    }
}
