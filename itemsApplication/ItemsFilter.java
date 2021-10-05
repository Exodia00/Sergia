package itemsApplication;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class ItemsFilter extends GridPane{
	private TextField searchFld, minPriceFld, maxPriceFld;
	private ComboBox<String> itemUteCB;

//Constructor
	public ItemsFilter() {
	// children nodes
		// search field
		searchFld = new TextField();
			//Style
		searchFld.setPromptText("Recherche");
		
		//minPrice
		minPriceFld = new TextField();
			//Style
		minPriceFld.setPromptText("P.U.H.T (min)");
		
		//max Price
		maxPriceFld = new TextField();
			//Style
		maxPriceFld.setPromptText("P.U.H.T (max)");
		
		//itemUteCB
		itemUteCB = new ComboBox<String>();
			//Style
		itemUteCB.setPromptText("UTE");
	
	// Adding children nodes to gridPane
		add(searchFld, 0,0);
		add(itemUteCB, 1,0);
		add(minPriceFld,0,1);
		add(maxPriceFld, 1,1);
		
	//Styling layout
		setHgap(20);
		setVgap(20);
	}
}
