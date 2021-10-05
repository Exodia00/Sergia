package clientFormApplication;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class ClientFormPhoneFld extends HBox{
	private TextField phone;
	private Button newPhone , removePhone;
	
//constructor
	public ClientFormPhoneFld() {
	// Children nodes
		//phone
		phone = new TextField();
			//Style
		phone.setPromptText("Tél");
		
		//new Phone 
		newPhone = new Button("+ Tél");
			//action
		Platform.runLater(()->ClientFormApp.newPhoneAction(newPhone));
		
		//remove phone
		removePhone = new Button("Supprimer");
			//action
		Platform.runLater(()->ClientFormApp.removePhoneAction(removePhone));
		
		
	//Adding children
		getChildren().addAll(phone , newPhone , removePhone);
		setMaxWidth(ClientFormCenter.FLD_MAX_WIDTH+100);
		setSpacing(10);
	}
	
// Getting value
	public int getPhoneValue() {
		if (phone.getText()!="") {
		return Integer.parseInt(phone.getText());
		}
		return 0;
	}	
}
