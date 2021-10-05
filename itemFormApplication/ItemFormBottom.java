package itemFormApplication;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

public class ItemFormBottom extends HBox{
	private Button saveBtn, exitBtn;
	
//Constructor
	public ItemFormBottom() {
	//children nodes
		//savebtn
		saveBtn = new Button("Sauvegarder");
		
		//exit btn
		exitBtn = new Button("Quitter");
		
		// seperator region
		Region seperator = new Region();
			//Style
		HBox.setHgrow(seperator, Priority.ALWAYS);
		
	// Adding hcildren nodes to layout
		getChildren().addAll(exitBtn, seperator, saveBtn);
		
	//Styling layout
		setPadding(new Insets(20));
		
	}
}
