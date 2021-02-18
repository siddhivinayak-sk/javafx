/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxtest1.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;

/**
 *
 * @author Sandeep
 */
public class FXMLDocumentController implements Initializable {
    JFileChooser jfc1;
    FileChooser fc1;
    @FXML
    AnchorPane ap1;
    
    
    @FXML
    javafx.scene.control.TextField dirName;
    @FXML
    javafx.scene.control.ProgressBar pbar;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            fc1 = new FileChooser();
            fc1.setTitle("File open dialog");
            fc1.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All files", "*.*"), new FileChooser.ExtensionFilter("Text files", "*.txt"));
            dirName.setText(fc1.showOpenDialog(null).getAbsolutePath());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void handleExecuteButton(ActionEvent event) {
        try {

            javafx.scene.control.MenuItem m1 = new javafx.scene.control.MenuItem("M1");
            javafx.scene.control.MenuItem m2 = new javafx.scene.control.MenuItem("M2");
            javafx.scene.control.MenuItem m3 = new javafx.scene.control.MenuItem("M3");
            javafx.scene.control.ContextMenu ctx = new javafx.scene.control.ContextMenu(m1, m2, m3);
            javafx.scene.control.Menu menu = new javafx.scene.control.Menu("File");
            menu.getItems().addAll(m1, m2, m3);
            javafx.scene.control.MenuBar mbar = new javafx.scene.control.MenuBar();
            mbar.setContextMenu(ctx);
            mbar.getMenus().add(menu);
            mbar.setStyle("-fx-font-size: 18px;");
            
            javafx.scene.layout.VBox vbox = new javafx.scene.layout.VBox();
            vbox.getChildren().add(mbar);
            
            
            
            javafx.stage.Stage pane = new javafx.stage.Stage();
            javafx.scene.Scene scen = new javafx.scene.Scene(vbox);
            
            vbox.getChildren().addAll(new javafx.scene.control.Label("Ok"), new javafx.scene.control.Button("Ok"));
            pane.setMaximized(false);
            pane.setTitle("Dialog");
            pane.initModality(Modality.APPLICATION_MODAL);
            pane.resizableProperty().setValue(Boolean.FALSE);
            pane.setFullScreen(false);
            pane.setMinHeight(200);
            pane.setMinWidth(300);
            pane.setScene(scen);
            pane.show();
            
            
            

            
            /*int i = 0;
            while(i < 100) {
                Thread.sleep(1000);
                pbar.setVisible(false);
            }*/
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void handleExitButton(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    private void cmenurequested(ActionEvent event) {
        ap1.getChildren().add(ap1);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    @FXML
    private void handleDrag(MouseEvent event) {
        System.out.println("Drag not supported");
    }
    
}
