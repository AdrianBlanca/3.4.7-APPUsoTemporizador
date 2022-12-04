/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusotemporizador;

import componentes_blancaadrian.Temporizador;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Adrian
 */
public class APPUsoTemporizadorController implements Initializable {
    
    @FXML
    private Temporizador temporizador;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        temporizador.setTiempo(3600);
        temporizador.empezarCuenta();
        
    }    
    
}
