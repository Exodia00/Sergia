package billFormApplication;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class AddItemPanel extends HBox{
	private Button addItem;
	
//Constructor
	public AddItemPanel() {
	//Children nodes
		addItem = new Button(" + Designation");
		//Event 
		BillFormApp.newItem(addItem);
		
		
	//Adding child
		getChildren().add(addItem);
		
	//Styling pane
		setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY , null , Insets.EMPTY)));
		setPrefHeight(100.0);
		setAlignment(Pos.CENTER);
		
	}
	
}
