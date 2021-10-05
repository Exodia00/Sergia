package BillApplication;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class BillItemsList extends ScrollPane{
	private BillItemPanel test1, test2, test3, test4;
	private VBox content;
	
// Constructor
	public BillItemsList() {
	//Children nodes
		test1 = new BillItemPanel();
		test2 = new BillItemPanel();
		test3 = new BillItemPanel();
		test4 = new BillItemPanel();
		
	// Layout
		content = new VBox(test1, test2, test3, test4);
		
	// setting content
		setContent(content);
		
	// Styling scrollPane
		setFitToWidth(true);
		
	}
}
