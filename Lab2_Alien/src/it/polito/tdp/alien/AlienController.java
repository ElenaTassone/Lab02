package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	Dizionario d = new Dizionario();
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String ar[]=txtWord.getText().split(" ");
    	if(ar.length==1){
    		String traduzione=d.traduci(ar[0]);
    		txtResult.setText(traduzione);
    		}
    	else if(ar.length==2){
    		String s= d.salvaParola(ar[0], ar[1]);
    		txtResult.setText(s);
    		
    	}
    	makeGUIvisible(true);
    	txtWord.clear();;
    }
    
    
    //push
    
    private void makeGUIvisible(boolean b) {
		txtResult.setVisible(b);
		btnReset.setVisible(b);
		
	}


	@FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    	makeGUIvisible(false);
    }
    
}
