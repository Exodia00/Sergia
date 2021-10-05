package componentsApplication;

import clientProfileApplication.ClientProfileApp;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ClientBillThmb extends AnchorPane{
	private Text clientNameTxt,	billDateTxt, billTotalTxt;
	private Text test1, test2 , test3 ;

// Constructor 
	public ClientBillThmb() {
	// children nodes
		// clientNameTxt
		clientNameTxt = new Text("Nom");
		
		//billDateTxt
		billDateTxt = new Text("Date");
		
		//bill total
		billTotalTxt = new Text("Total H.T");
		
		// tests
		test1 = new Text("Désignation 1 ");
		test2 = new Text("Désignation 2 ");
		test3 = new Text("Désignation 3 ");
		
	// Containers
		//topLeft
		VBox topLeft = new VBox(clientNameTxt , billDateTxt);
			//style
		topLeft.setSpacing(5);
		
		VBox itemsContainer = new VBox(test1, test2, test3);
			//style
		itemsContainer.setSpacing(5);
		
	//Adding children
		getChildren().addAll(topLeft, billTotalTxt, itemsContainer);
		
	// Children layout position
		AnchorPane.setLeftAnchor(topLeft, 0.0);
		AnchorPane.setTopAnchor(topLeft, 0.0);
		
		AnchorPane.setBottomAnchor(billTotalTxt, 0.0);
		AnchorPane.setLeftAnchor(billTotalTxt, 0.0);
		
		AnchorPane.setRightAnchor(itemsContainer, 0.0);
		AnchorPane.setTopAnchor(itemsContainer, 0.0);
	
	//Styling layout
		setMinHeight(150);
		setPadding(new Insets(20));
		setCursor(Cursor.HAND);
		
	//Setting action
		ClientProfileApp.openBillAction(this);
		
	}
}
