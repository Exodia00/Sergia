package clientApplication;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class ClientsList extends ScrollPane{
	private ClientThmb test1;
	private ClientThmb test2;
	private ClientThmb test3;
	private ClientThmb test4;
	private ClientThmb test5;
	private ClientThmb test6;

//constructor
	public ClientsList() {
		// children nodes
		test1 = new ClientThmb();
		test2 = new ClientThmb();
		test3 = new ClientThmb();
		test4 = new ClientThmb();
		test5 = new ClientThmb();
		test6 = new ClientThmb();

		
		//container node
		VBox container = new VBox(test1 , test2 , test3 , test4 , test5 , test6);
		container.setSpacing(10);
			//Style
		container.prefWidthProperty().bind(widthProperty());
		
		// Adding content to scrollable 
		setContent(container);
		
		//scroll policies
		setFitToWidth(true);
		
		//Layout Style
		setMaxWidth(600);
		
	}
	
	
}
