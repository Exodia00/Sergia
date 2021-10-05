package clientProfileApplication;

import clientApplication.ClientApp;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ClientProfileLeft extends AnchorPane{
	private Button newBillBtn , modifyClientBtn , exitBtn ;
	private Text clientNameTxt , clientIceTxt , clientCityTxt , clientPhoneTxt;
	
	
// Constructor
	public ClientProfileLeft() {
	// Children nodes
		//clientName
		clientNameTxt = new Text("nom");
		
		//clientIceTxt
		clientIceTxt = new Text("Ice");
		
		//clientCityTxt
		clientCityTxt = new Text("Ville");
		
		//clientPhoneTxt
		clientPhoneTxt = new Text("Tél");
		
		//new bill
		newBillBtn = new Button("+ Facture");
			//Action
		ClientApp.addBillAction(newBillBtn, clientNameTxt.getText());
		
		//modify Client Btn
		modifyClientBtn = new Button("Modifier");
		ClientProfileApp.modifyClientAction(modifyClientBtn , clientNameTxt.getText());
		
		//exitBtn
		exitBtn = new Button("Quitter");
		ClientProfileApp.exitBtnAction(exitBtn);
		
		
	// containers
		// btn container
		VBox btnContainer = new VBox(newBillBtn , modifyClientBtn , exitBtn);
			// Styling
		btnContainer.setSpacing(5);
		
		//txt container
		VBox txtContainer = new VBox(clientNameTxt , clientIceTxt , clientCityTxt ,clientPhoneTxt);
			//Styling
		txtContainer.setSpacing(5);

	
	// Adding containers
		getChildren().addAll(btnContainer , txtContainer);
		
	// children position
		AnchorPane.setLeftAnchor(btnContainer, 0.0);
		AnchorPane.setTopAnchor(btnContainer, 0.0);


		AnchorPane.setLeftAnchor(txtContainer, 0.0);
		AnchorPane.setBottomAnchor(txtContainer, 0.0);

	// Styling layout
		setPadding(new Insets(20));
		
	}
	
	// getters
	public Button getExitProfileBtn() {
		return exitBtn;
	}
	
}
