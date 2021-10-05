package itemsApplication;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class ItemsCenter extends VBox{
	private ItemsFilter filter;
	private ItemsList itemsList;

//Constructor
	public ItemsCenter() {
	// Children nodes
		//filter
		filter = new ItemsFilter();
		
		//items list
		itemsList = new ItemsList();
		
	//Adding children nodes
		getChildren().addAll(filter, itemsList);
		
	//Styling layout
		setPadding(new Insets(20, 20, 20, 100));
		setSpacing(30);
	}

}
