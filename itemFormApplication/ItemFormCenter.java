package itemFormApplication;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ItemFormCenter extends VBox{
	public TextField itemName, itemPrice;
	public ComboBox<String> itemUte;
	
//Constructor
	public ItemFormCenter() {
	// children ndes
		//item name
		itemName = new TextField();
			//Style
		itemName.setPromptText("Nom de le Désignation");
		
		//item Ute
		itemUte = new ComboBox<String>();
			//Style
		itemUte.setPromptText("UTE");
		itemUte.setPrefWidth(300);
		
		//item Price
		itemPrice = new TextField();
			//Style
		itemPrice.setPromptText("P.U.H.T (Estimation)");
		
	// Adding children nodes
		getChildren().addAll(itemName, itemUte, itemPrice);
		
	//Styling layout
		setAlignment(Pos.CENTER);
		setSpacing(30);
		setPadding(new Insets(40));
		setMaxWidth(300);
		
	}
}
