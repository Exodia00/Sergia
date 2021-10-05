package clientFormApplication;

import java.util.ArrayList;

import componentsApplication.ComboBoxApp;
import databaseApplication.DatabaseApp;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ClientFormCenter extends ScrollPane{
	private VBox contentContainer;
	private TextField nameFld , iceFld;
	private ClientFormPhoneFld phoneFld;
	private ComboBox<String> cityCB;
	private TextArea addressArea;
	
	public static int FLD_MAX_WIDTH = 200 ;
	
// constructors
	// new client
	public ClientFormCenter() {
		buildUI();
	}
	
	//Modify exiting client
	public ClientFormCenter(String clientName){
		// this should have a fetch functionality
		buildUI();
		
		nameFld.setText(clientName);
	}
	
// building the ui
	public void buildUI() {
	// children nodes
		//name 
		nameFld = new TextField();
			//Style
		nameFld.setPromptText("Nom");
		nameFld.setMaxWidth(FLD_MAX_WIDTH);
		
		//iceFld
		iceFld = new TextField();
		iceFld.setMaxWidth(FLD_MAX_WIDTH);	
			//Style
		iceFld.setPromptText("Ice");
		
		//city
		cityCB = new ComboBox<String>(DatabaseApp.getAllCitiesNames());
			//Style
		cityCB.setPromptText("Ville");
		cityCB.setMinWidth(FLD_MAX_WIDTH);
		cityCB.setEditable(true);
			// Action
		ComboBoxApp.autoCompleteOn(cityCB);
		cityCB.getEditor().setOnAction(e -> cityCB.show());
		
		//Phone
		phoneFld = new ClientFormPhoneFld();
		
		// Address
		addressArea = new TextArea();
			//Style
		addressArea.setMinHeight(100);
		addressArea.setMaxHeight(100);
		addressArea.setMaxWidth(FLD_MAX_WIDTH+100);
		addressArea.setPromptText("Adresse :");
		
	// layout 
		contentContainer = new VBox(nameFld , iceFld , cityCB , addressArea, phoneFld);
		
	//Styling layout
		contentContainer.setPadding(new Insets(50));
		contentContainer.setSpacing(30);
		contentContainer.setAlignment(Pos.TOP_CENTER);
		
	//Setting content
		setContent(contentContainer);
	//Styling scrollPane
		setFitToWidth(true);
	}
	
// Form Values getters
	// Client Name
	public String getClientNameValue() {
		return nameFld.getText();
	}
	// Client ICE
	public int getClientIceValue() {
		return Integer.parseInt(iceFld.getText());
	}
	// client city
	public String getClientCityValue() {
		return cityCB.getValue();
	}
	public String getClientCityText() {
		return cityCB.getEditor().getText();
	}
	//phone number
	public int getClientPhoneValue() {
		return phoneFld.getPhoneValue();
	}
	// Address
	public String getClientAddressValue() {
		return addressArea.getText();
	}

// methods
	// getting phone fields
	public ArrayList<Integer> getPhonesValues() {
		ArrayList<Integer> phonesValues = new ArrayList<Integer>();
		ArrayList<ClientFormPhoneFld> phones = new ArrayList<ClientFormPhoneFld>();
		ObservableList<Node> childrenList = contentContainer.getChildren();
		for(Node node : childrenList) {
			if(node instanceof ClientFormPhoneFld) {
				phones.add((ClientFormPhoneFld) node);
			}
		}
		for(ClientFormPhoneFld phoneFld : phones) {
			phonesValues.add(phoneFld.getPhoneValue());
		}
		return phonesValues;
	}
	
}
