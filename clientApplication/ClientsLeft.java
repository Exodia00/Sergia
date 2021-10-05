package clientApplication;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

// this class contains the left section of the clientsView(borderpane)
public class ClientsLeft extends VBox{
	private Button exitBtn;
	private Button newClientBtn;
	
// Constructor
	public ClientsLeft() {
	//children nodes
		// exit btn
		exitBtn = new Button("Retour");
			//action in mainView
		//new client btn
		newClientBtn = new Button("Ajouter un client");
			// action
		ClientApp.newClientAction(newClientBtn);

		// Styling layout
		setHeight(Double.MAX_VALUE);
		setPadding(new Insets(20));
		
		// region
		Region seperator = new Region();
		seperator.setMinHeight(200);
		
	
	// Adding children nodes
		getChildren().addAll(exitBtn ,seperator, newClientBtn);
			
	}
	
	public Button getExitBtn() {
		return exitBtn;
	}
	
}
