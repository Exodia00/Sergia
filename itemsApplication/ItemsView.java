package itemsApplication;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ItemsView extends BorderPane{
	private ItemsLeft left;
	private ItemsCenter center;
	
//Constructor
	public ItemsView() {
	//Children nodes
		//left
		left = new ItemsLeft();
		
		//center 
		center = new ItemsCenter();
		
	// Adding children nodes to layout
		setCenter(center);
		setLeft(left);
	}
	
	//getters 
	public Button getExitBtn() {
		return left.getExitBtn();
	}
}
