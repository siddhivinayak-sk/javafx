package org.openjfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.scene.control.TextField;

public class ScreenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox vBoxRoot;

    @FXML
    private Button goButton;

    @FXML
    private WebView webViewBrowser;

   @FXML
    private TextField textFieldURL;
	
    @FXML
    void goButtonOnActon(ActionEvent event) {
		WebEngine webEngine = webViewBrowser.getEngine();
		webEngine.load(textFieldURL.getText());
    }

    @FXML
    void initialize() {
        assert vBoxRoot != null : "fx:id=\"vBoxRoot\" was not injected: check your FXML file 'screen.fxml'.";
        assert goButton != null : "fx:id=\"goButton\" was not injected: check your FXML file 'screen.fxml'.";

    }
}
