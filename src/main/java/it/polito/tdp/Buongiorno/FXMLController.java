package it.polito.tdp.Buongiorno;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEta;

    @FXML
    private Button btnOK;

    @FXML
    private Label lblRis;
    
    @FXML
    void handleOK(ActionEvent event) {
//    	System.out.println("OK BOOMER!");
    	String nome = txtNome.getText();
    	
    	if(nome.length()==0) {
    		lblRis.setText("Devi inserire il nome");
    		return;
    	}
    	
    	String etaS = txtEta.getText();
    	int eta;
    	
    	try {
    	eta= Integer.parseInt(etaS);
    	}catch(NumberFormatException e) {
    		//qui devo gestire la NumberFormatException 
    		lblRis.setText("L'eta' deve essere un numero");
    		return;
    	}
    	
    	if(eta<0 || eta >150) {
    		lblRis.setText("Hai inserito un'eta' sbagliata");
    		return;
    	}
    	
    	String saluto;
    	if(eta <18) {
    		saluto = "Ciao, " + nome + "!";
    	}
    	else
    		saluto = "Buongiorno boomer, " + nome + "!";
    	
    	lblRis.setText(saluto); 

    }

    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtEta != null : "fx:id=\"txtEta\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnOK != null : "fx:id=\"btnOK\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblRis != null : "fx:id=\"lblRis\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
