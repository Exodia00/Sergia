package clientProfileApplication;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ClientProfileView extends BorderPane{

	private ClientProfileLeft left;
	private ClientProfileCenter center;
	
// Constructor
	public ClientProfileView() {
	// children nodes
		// left
		left = new ClientProfileLeft();
		
		//center
		center = new ClientProfileCenter();
		
	
	// Adding children nodes
		setCenter(center);
		setLeft(left);
	
	}
	
//	getters
	public Button getExitProfileButton() {
		return left.getExitProfileBtn();
	}
	
}
