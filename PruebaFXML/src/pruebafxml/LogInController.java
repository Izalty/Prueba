/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafxml;

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
    private void CambiarVista(ActionEvent event){
        System.out.println("pruebafxml.LogInController.CambiarVista()");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
}
