package clientProfileApplication;

import componentsApplication.ClientBillThmb;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class ClientProfileBillList extends ScrollPane{
	private ClientBillThmb test1, test2, test3 ;

// Constructor
	public ClientProfileBillList() {
	// children nodes
		test1 = new ClientBillThmb();
		
		test2 = new ClientBillThmb();
		
		test3 = new ClientBillThmb();
	
	// Adding children to VBox layout
		VBox list = new VBox(test1 , test2 , test3);
		list.setSpacing(20);
	
	// setting scrollpane content
		setContent(list);
		
	//Layout
		setFitToWidth(true);
	}
}
