package BillApplication;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class BillCenter extends VBox{
	private BillItemsList itemsList;
	private Text billTotalHtTxt, billTotalTvaTxt, billTotalTtcTxt;
	
// constructor
	public BillCenter() {
	// Children nodes
		//items list
		itemsList = new BillItemsList();
		
		//bill total ht
		billTotalHtTxt = new Text("Total HT");
		
		// bill total tva
		billTotalTvaTxt = new Text("Taux TVA");
		
		// bill Total ttc
		billTotalTtcTxt = new Text("Net à payer TTC");
		
	// Container
		HBox totalContainer = new HBox(billTotalHtTxt, billTotalTvaTxt, billTotalTtcTxt);
		//Style
		totalContainer.setSpacing(10);
		totalContainer.setAlignment(Pos.CENTER);
		
	// Adding children to layout
		getChildren().addAll(itemsList, totalContainer);
	
	// Styling layout
		setAlignment(Pos.TOP_CENTER);
		setPadding(new Insets(20));
		setSpacing(30);
	}
}
