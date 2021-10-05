package BillApplication;

import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class BillItemPanel extends AnchorPane{
	private Text itemNameTxt, itemQteTxt, itemUniteTxt, itemPriceTxt, itemTotalTxt;

// Constructor
	public BillItemPanel() {
	// Children nodes
		// itemName
		itemNameTxt = new Text("Désignation");
		
		//itemQte
		itemQteTxt = new Text("QTE");
		
		// item Unite
		itemUniteTxt = new Text("UTE");
		
		//item price
		itemPriceTxt = new Text("P.U.H.T");
		
		//item total
		itemTotalTxt = new Text("M.HT");
	
	// container
		HBox numContainer = new HBox(itemQteTxt, itemUniteTxt, itemPriceTxt, itemTotalTxt);
		//Style
		numContainer.setSpacing(10);
		
	//Adding children to layout
		getChildren().addAll(itemNameTxt, numContainer);
		
	// setting children position
		AnchorPane.setLeftAnchor(itemNameTxt, 0.0);
		AnchorPane.setTopAnchor(itemNameTxt, 0.0);

		
		AnchorPane.setRightAnchor(numContainer, 0.0);
		AnchorPane.setTopAnchor(numContainer, 0.0);
		
	// Styling layout
		setPadding(new Insets(20));

	}
	
}
