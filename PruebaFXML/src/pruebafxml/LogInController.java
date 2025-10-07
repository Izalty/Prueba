/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafxml;

import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author iandasal
 */
public class LogInController implements Initializable{
    
    @FXML
    private Label label;
    @FXML
    private Label label2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        label2.setText("Juajas");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    
}
