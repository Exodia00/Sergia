package clientProfileApplication;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ClientProfileBillFilter extends GridPane{
	private ComboBox<String> itemCB ; 
	private TextField priceMinFld , priceMaxFld;
	private DatePicker dateMinFld , dateMaxFld;
	
// constructor
	public ClientProfileBillFilter() {
	//children nodes
		//itemCb
		itemCB = new ComboBox<String>();
			//style
		itemCB.setPromptText("Désignations");
		
		//priceMin
		priceMinFld = new TextField();
			//style
		priceMinFld.setPromptText("Total H.T (Min)");
		
		//priceMax
		priceMaxFld = new TextField();
			//Style
		priceMaxFld.setPromptText("Total H.t (Max)");
		
		//dateMin
		dateMinFld = new DatePicker();
			//Style
		dateMinFld.setPromptText("Date (Min)");
		
		//date max
		dateMaxFld = new DatePicker();
			//Style
		dateMaxFld.setPromptText("date (Max)");
		
	
	// Adding children
		add(itemCB , 0,0,1,1);
		add(priceMinFld , 1,0,1,1);
		add(priceMaxFld , 2,0,1,1);
		add(dateMinFld , 1,1,1,1);
		add(dateMaxFld , 2,1,1,1);
		
	//Styling layoutS
		setHgap(10);
		setVgap(10);
		
	}
}
