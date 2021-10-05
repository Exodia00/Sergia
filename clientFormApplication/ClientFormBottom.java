package clientFormApplication;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ClientFormBottom extends HBox{
	private Button saveClient, cancelClient;
	
//Constructors
	// for a new client
	public ClientFormBottom() {

	//children nodes
		// save button
		saveClient = new Button("Sauvgarder");
			// Action 	
		Platform.runLater(()->ClientFormApp.saveClientAction(saveClient));
	
		//cancelClient
		cancelClient = new Button("Annuler");
		Platform.runLater(()->ClientFormApp.cancelClientAction(cancelClient));
		
	//Adding children nodes
		getChildren().addAll(cancelClient , saveClient);
		
	//Styling layout
		setAlignment(Pos.CENTER_RIGHT);
		setSpacing(20);
		setPadding(new Insets(30));
		
	}

	// for an existing client
	public ClientFormBottom(String client) {
	//children nodes
		// save button
		saveClient = new Button("Sauvgarder");
		// add action to save to existing client field
		
	//Adding children nodes
		getChildren().addAll(saveClient);
		
	//Styling layout
		setAlignment(Pos.CENTER_RIGHT);
		setSpacing(20);
		setPadding(new Insets(30));

	}
}