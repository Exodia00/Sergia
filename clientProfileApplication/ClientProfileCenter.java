package clientProfileApplication;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class ClientProfileCenter extends VBox{
	private ClientProfileBillFilter filter;
	private ClientProfileBillList billList;
	
// constructor
	public ClientProfileCenter() {
	//children nodes
		//filter
		filter = new ClientProfileBillFilter();
		
		//list
		billList = new ClientProfileBillList();
		
	// Adding children nodes
		getChildren().addAll(filter , billList);
		
	//Styling layout
		setPadding(new Insets(20,20,20,100));
		setSpacing(50);
	}
}
