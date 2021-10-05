package itemsApplication;

import DashBoardApp.SideBarApp;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class ItemsLeft extends VBox{
	private Button exitBtn, newItemBtn;

//Constructor
	public ItemsLeft() {
	//Children nodes
		//exit button
		exitBtn = new Button("Retour");
			//Action
		SideBarApp.toggleItemsAction(exitBtn);
		//new Item Btn
		newItemBtn = new Button("Ajouter un service/Bien");
			//Action
		ItemsApp.newItemAction(newItemBtn);
		
		//Seperator region
		Region seperator = new Region();
			//Style
		seperator.setPrefHeight(200);
		
	// Adding children nodes
		getChildren().addAll(exitBtn, seperator, newItemBtn);
		
	//Styling layout
		setPadding(new Insets(20));
	
	}
	
	// getters
	public Button getExitBtn() {
		return exitBtn;
	}
}
