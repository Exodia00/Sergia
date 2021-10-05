package billFormApplication;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BillFormHeader extends AnchorPane{
	
	private Text title;
	private Button exitButton;
	
	public BillFormHeader(Stage stage){

	
	// Children nodes
		// title
		title = new Text("Facturation");
		
		
		// exit Button
		exitButton = new Button("Quitter");
			// Event handling
		exitButton.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				stage.close();
			}			
			
		});
		
	//Adding children
		getChildren().addAll(title, exitButton);
	
	// layout styling
		AnchorPane.setRightAnchor(exitButton, 10.0);
		AnchorPane.setTopAnchor(exitButton, 40.0);
		
		AnchorPane.setLeftAnchor(title, 10.0);	
		AnchorPane.setTopAnchor(title, 40.0);
	}
	
}
