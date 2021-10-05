package billFormApplication;

import componentsApplication.TextFieldSwitch;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class GeneralBillDataPanel extends GridPane{
	private ComboBox<String> clientCB;
	private ComboBox<String> modeRglCB;
	private DatePicker datePicker;
	private TextFieldSwitch bcTxtField;
	private TextFieldSwitch blTxtField;
	private TextField tva;
	
//Constructor
	public GeneralBillDataPanel(){
	// Children nodes
		// client
		clientCB = new ComboBox<String>();
			//styling
		CBStyle(clientCB , "Client");
		
		// mode de reglement
		modeRglCB = new ComboBox<String>();
			//Style
		CBStyle(modeRglCB , "Mode de réglement");

		// date picker
		datePicker = new DatePicker();
		
		// BC
		bcTxtField = new TextFieldSwitch("BC N" , "Désactiver");
		
		//BL
		blTxtField = new TextFieldSwitch("BL N" , "Désactiver");
		
		//tva
		tva = new TextField();
			//Style
		tva.setPromptText("Taux TVA");
		tva.setText("20");
		
		
	// Adding children nodes
		add(clientCB , 0 , 0 , 1 , 1);
		add(datePicker ,1,0,1,1);
		add(modeRglCB ,2,0,1,1);
		add(bcTxtField ,0,1,1,1);
		add(blTxtField , 1,1,1,1);
		add(tva , 2,1,1,1);
		
	//Children nodes layout
		GridPane.setValignment(tva, VPos.BOTTOM);
		
	//Style layout
		setPrefWidth(Double.MAX_VALUE);
		setPadding(new Insets(30));
		setHgap(50);
		setVgap(20);
		
	}
	
	// Styling methods
	private void CBStyle(ComboBox<String> cb , String textPrompt) {
		cb.setPromptText(textPrompt);
		cb.setPrefWidth(150);
	}
	
	// getters
	public ComboBox<String> getClientCB(){
		return clientCB;
	}
	
	
}
