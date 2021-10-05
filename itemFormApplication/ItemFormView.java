package itemFormApplication;

import javafx.scene.layout.BorderPane;

public class ItemFormView extends BorderPane{
	private ItemFormCenter center;
	private ItemFormBottom bottom;
	
// Constructor 
	public ItemFormView() {
	// children nodes
		//center
		center = new ItemFormCenter();
		
		//bottom
		bottom = new ItemFormBottom();
		
	//Adding children nodes to layout
		setCenter(center);
		setBottom(bottom);
		
	}
}
