package itemsApplication;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class ItemsList extends ScrollPane{

	private ItemPanel test1, test2, test3, test4;
	private VBox list;

//Constructor
	public ItemsList() {
		//children nodes
		test1 = new ItemPanel();
		test2 = new ItemPanel();
		test3 = new ItemPanel();
		test4 = new ItemPanel();
		
		//Adding children nodes
		list = new VBox(30, test1, test2, test3, test4);
		
		//Setting content
		setContent(list);
		
		//scroll behaviour
		setFitToWidth(true);
	}
}
