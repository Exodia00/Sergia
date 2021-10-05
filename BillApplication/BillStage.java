package BillApplication;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BillStage extends Stage{
	private Scene scene;
	private BorderPane root;
	private BillTop top;
	private BillCenter center;
	private BillBottom bottom;
	
	public BillStage() {
		buildUI();
		setStage();
		show();
	}
	
// private methods
	private void buildUI() {
	//root layout
		root = new BorderPane();
		//Styling root
		root.setPadding(new Insets(30));
		
	// children nodes
		//top
		top = new BillTop();
		
		//center
		center = new BillCenter();
		
		//Bottom
		bottom = new BillBottom();
	
	// Adding children to root
		root.setTop(top);
		root.setCenter(center);
		root.setBottom(bottom);
	
	}
	
	private void setStage() {
		scene = new Scene(root, 1000 , 600);
		setScene(scene);
		setTitle("Facture :");
	}
	
}
