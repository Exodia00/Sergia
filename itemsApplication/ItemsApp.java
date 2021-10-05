package itemsApplication;

import itemFormApplication.ItemFormStage;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ItemsApp {

	
	// New Item Action
	public static void newItemAction(Button btn) {
		btn.setOnAction(e -> new ItemFormStage());
	}
	

	
}
