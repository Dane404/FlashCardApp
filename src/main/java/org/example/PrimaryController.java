package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PrimaryController {

    @FXML
    private ScrollPane scrollPane;

    @FXML
    public void initialize()
    {
        VBox box =new VBox();
        box.setId("ScrollbarContent");
        scrollPane.setContent(box);
    }

    // String format = Name;Color
    public void AddDeck(String )
    {

    }

}
