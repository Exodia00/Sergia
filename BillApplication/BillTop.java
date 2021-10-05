package BillApplication;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class BillTop extends AnchorPane{
	private Text clientNameTxt, clientIceTxt, clientCityTxt;
	private Text billDateTxt, billIdTxt, billBcTxt, billBlTxt, billModeRglTxt;
	
// constructor
	public BillTop() {
	// Children nodes
		//clientName
		clientNameTxt = new Text("Nom");
		
		//client ice
		clientIceTxt = new Text("Ice");
		
		//clientCity
		clientCityTxt = new Text("Ville");
		
		//billDate
		billDateTxt = new Text("Date");
		
		//BillIdTxt
		billIdTxt = new Text("Facture N");
		
		//bill BL
		billBlTxt = new Text("Bl N");
		
		//bill BC
		billBcTxt = new Text("BC N");
		
		//Mode de reglement
		billModeRglTxt = new Text("Mode de réglement");
		
	// containers
		//client info container
		VBox clientInfoContainer = new VBox(clientNameTxt, clientIceTxt, clientCityTxt);
			//Style
		clientInfoContainer.setSpacing(5);
		
		//bill info container
		VBox billInfoContainer = new VBox(billDateTxt, billIdTxt, billBlTxt, billBcTxt, billModeRglTxt);
			//Style
		billInfoContainer.setSpacing(5);
	
	// Adding containers to layout
		getChildren().addAll(clientInfoContainer, billInfoContainer);
		
	// containers positions
		AnchorPane.setLeftAnchor(clientInfoContainer, 0.0);
		AnchorPane.setTopAnchor(clientInfoContainer, 0.0);

		AnchorPane.setRightAnchor(billInfoContainer, 0.0);
		AnchorPane.setTopAnchor(billInfoContainer, 0.0);		
	
	}
}
