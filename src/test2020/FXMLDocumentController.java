/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2020;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 *
 * @author viceb
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML TextField texto1, texto2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void boton2Accion(ActionEvent event) {
        
        Almuerzo mialmuerzo = new Almuerzo("Huevo a la peruana", "Paloma mami salteada", "Chocolate bañado", "Fanta Light");
        
        System.out.println(mialmuerzo.explicar());
        /*String palabra1=texto1.getText();
        String palabra2 = texto2.getText();
        Integer numero1 = Integer.parseInt(palabra1);
        Integer numero2 = Integer.parseInt(palabra2);
        Integer resultado = numero1+numero2;*/
        label.setText(mialmuerzo.explicar());
        label.setTextFill(Color.WHITE);
    }
    
    @FXML
    private void boton3Accion(ActionEvent event) {
        
        Almuerzo mialmuerzo = new Almuerzo();
        mialmuerzo.setEntrada("Palta Reina");
        mialmuerzo.setPlatoprincipal("Salmón con Papas Fritas");
        mialmuerzo.setPostre("Flan de Chocolate con Manjar");
        mialmuerzo.setBebida("Agua sin Gas");
        
        
        String menu = mialmuerzo.explicar();
        
        
        System.out.println(menu);
        label.setText(menu);
        label.setTextFill(Color.AQUAMARINE);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
