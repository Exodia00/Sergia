package clientApplication;

import clientProfileApplication.ClientProfileApp;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

//this class defines a single client thumbnail to be displayed in the clients list
public class ClientThmb extends AnchorPane{
	 	private Text clientName , clientIce , clientCity ,clientPhone;
	 	private Button addBill , modifyClient , openClient ;
	 	
// constructor
	 	public ClientThmb() {
	 	// children nodes
	 		//clientName
	 		clientName = new Text("Nom");
	 		
	 		// clientIce
	 		clientIce = new Text("ICE");
	 		
	 		//clientCity
	 		clientCity = new Text("Ville");
	 		
	 		//clientPhone
	 		clientPhone = new Text("Tél");
	 		
	 		//add bill
	 		addBill = new Button("+ facture");
	 			// Action
	 		ClientApp.addBillAction(addBill , clientName.getText());

	 		//openclient
	 		openClient = new Button("Ouvrir");
	 			// Action
	 		ClientApp.openClientAction(openClient, clientName.getText());
	 		
	 		// modify client
	 		modifyClient = new Button("Modifier");
	 			//Action
	 		ClientProfileApp.modifyClientAction(modifyClient , clientName .getText());
	 		
	 	//container 
	 		//info Container
	 		VBox infoContainer = new VBox(clientName , clientIce , clientCity , clientPhone);
	 			//style
	 		infoContainer.setSpacing(5);
	 		
	 		//buttons container
	 		VBox buttonContainer = new VBox(addBill , openClient , modifyClient);
	 			//Style
	 		buttonContainer.setAlignment(Pos.CENTER_RIGHT);
	 		buttonContainer.setSpacing(5);
	 		
	 	
	 	// Adding to layout
	 		getChildren().addAll(infoContainer , buttonContainer);
	 	
	 	// Layout positon
	 		AnchorPane.setLeftAnchor(infoContainer, 0.0);
	 		AnchorPane.setTopAnchor(infoContainer, 0.0);
	 		
	 		AnchorPane.setRightAnchor(buttonContainer, 0.0);
	 		AnchorPane.setTopAnchor(buttonContainer, 0.0);
	 		
	 	//Layout Styling
	 		setPadding(new Insets(20));	 		
	 	}
}
