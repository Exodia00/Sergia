package componentsApplication;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;

public class TextFieldSwitch extends VBox{
	private ToggleButton toggleButton;
	private TextField textField;
	
// Constructor
	public TextFieldSwitch(String placeholder, String switchLabel){
	// children nodes
		textField = new TextField();
			//styling
		textField.setPromptText(placeholder);
		VBox.setMargin(textField, new Insets(10,0,0,0));
		
		toggleButton = new ToggleButton(switchLabel);
			//Styling
		toggleButton.setStyle("-fx-background-color:green");
			//Event handling
		toggleButton.setOnAction(toggleButtonAction);
	
	//styling
	setAlignment(Pos.BASELINE_RIGHT);	
	
	
		
	// Adding children nodes
		getChildren().addAll(toggleButton , textField);
		
	}
	
	// Event Handling
	private EventHandler<ActionEvent> toggleButtonAction= new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			if(toggleButton.isSelected()) {
				toggleButton.setStyle("-fx-background-color:red");
				toggleButton.setText("Activer");
			}else {
				toggleButton.setStyle("-fx-background-color:green");
				toggleButton.setText("Désactiver");
			}
			
		}
		
	};

}