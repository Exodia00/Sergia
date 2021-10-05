package billFormApplication;



import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class BillFormItem extends AnchorPane{
	private ComboBox<String> client;
	private TextField unitePrice;
	private TextField qte;
	private Button duplicateBtn;
	private Button cancelBtn;
	private Text calculatedCost;
	private HBox fieldsHBox;
	private HBox btnHBox;
	
// Constructor
	public BillFormItem() {
	// children nodes
		// client
		client = new ComboBox<String>();
			//Styling
		client.setPromptText("Designation");
		
		//unitePrice
		unitePrice = new TextField();
			//Stying
		unitePrice.setPromptText("P.U.H.T");
		
		//qte
		qte = new TextField();
			//Styling
		qte.setPromptText("QTE");
		
		//duplicateButton
		duplicateBtn = new Button("Dupliquer");
			//Styling
		
		//cancel
		cancelBtn = new Button("Annuler");
			// event handle
		BillFormApp.removeItem(cancelBtn);
		

		//fields HBox
		fieldsHBox = new HBox();
			//Styling
		fieldsHBox.getChildren().addAll(client , unitePrice , qte);
		fieldsHBox.setSpacing(10.0);
		
		//btn HBow
		btnHBox = new HBox();
			//Styling
		btnHBox.getChildren().addAll(duplicateBtn , cancelBtn);
		btnHBox.setSpacing(10.0);
		
		//cost
		calculatedCost = new Text("M.HT");
	
	// Adding children nodes
		getChildren().addAll(fieldsHBox, btnHBox , calculatedCost);

		
	// Setting children position
		//btnHBox
		AnchorPane.setRightAnchor(btnHBox, 0.0);
		AnchorPane.setTopAnchor(btnHBox, 0.0);
		
		//fieldsHBox
		AnchorPane.setLeftAnchor(fieldsHBox, 0.0);
		AnchorPane.setTopAnchor(fieldsHBox, 20.0);
		
		//calculated cost
		AnchorPane.setRightAnchor(calculatedCost, 0.0);
		AnchorPane.setBottomAnchor(calculatedCost, 0.0);

	// Styling layout
		setPrefHeight(100.0);
		setPadding(new Insets(10 ,30 , 10 ,30));
		setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, null, Insets.EMPTY)));
	}
	
	
	
	
}
