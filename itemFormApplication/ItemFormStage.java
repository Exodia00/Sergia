package itemFormApplication;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class ItemFormStage extends Stage{
	private Scene scene;
	private ItemFormView root;
	
//Constructor
	public ItemFormStage() {
		// root layout
		root = new ItemFormView();
		
		//Setting scene and stage
		scene = new Scene(root, 600, 400);
		setScene(scene);
		setTitle("Désignation :");
		show();
	}
}
