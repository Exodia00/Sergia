package billFormApplication;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class BillFormFooter extends HBox{
	private Button previewBtn;
	private Button finishBtn;
	
//Construtor
	public BillFormFooter() {
	//Children nodes
		previewBtn = new Button("Aperçu");
		
		finishBtn = new Button("Valider");
	
	// Adding children
		getChildren().addAll(previewBtn, finishBtn);
		
	//Styling layout
		setAlignment(Pos.CENTER_RIGHT);
		setPadding(new Insets(10));
		setSpacing(10);
	}
}
