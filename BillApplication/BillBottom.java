package BillApplication;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class BillBottom extends HBox{
	private Button openInExcelBtn, openFolderBtn, exitBtn;
	
// constructor
	public BillBottom() {
	// children nodes
		// Open excel
		openInExcelBtn = new Button("Ouvrir dans Excel");
		
		//open Folder
		openFolderBtn = new Button("Ouvrir le fichier source");
		
		//exit Btn
		exitBtn = new Button("Retour");
			//Action
		Platform.runLater(()->BillApp.exitAction(exitBtn));
		
	//Adding children nodes
		getChildren().addAll(exitBtn, openFolderBtn, openInExcelBtn);
	
	// Styling layout
		setAlignment(Pos.CENTER_RIGHT);
		setSpacing(10);
	}
}
