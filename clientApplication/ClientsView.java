package clientApplication;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

// this class contains the root layout of a new Clients scene which is always added to the scene
public class ClientsView extends BorderPane{
	private ClientsLeft left;
	private ClientsCenter center;
	private Button exitClientBtn; // exiting a certain client profile

// constructor
	public ClientsView() {
	// children nodes
		//left
		left = new ClientsLeft();
		
		//center
		center = new ClientsCenter();
	
	
	//Adding children nodes
		setLeft(left);
		setCenter(center);
		
	
	}
	
	public Button getExitBtn() {
		return left.getExitBtn();
}
	
}
