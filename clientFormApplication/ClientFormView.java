package clientFormApplication;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ClientFormView extends Stage{
	private Scene scene;
	private BorderPane root;
	private ClientFormCenter center;
	private ClientFormBottom bottom;
//constructors
	// Adding a new client
	public ClientFormView() {
	
		buildUI();
		
	// setting stage
		scene = new Scene(root , 500 , 500);
		setScene(scene);
		setTitle("Nouveau Client");
		initModality(Modality.APPLICATION_MODAL);
		show();
	}
	// Modifying an existing client
	public ClientFormView(String clientName) {
		
		buildUI(clientName);
		
		// setting stage
		scene = new Scene(root , 500 , 500);
		setScene(scene);
		setTitle(clientName);
		initModality(Modality.APPLICATION_MODAL);
		show();
	}
	
	
	
// Methods
	public void buildUI() {
	// layout root
		root = new BorderPane();
		
	//children nodes
		//Center
		center = new ClientFormCenter();
		
		//bottom
		bottom = new ClientFormBottom();
	
		//Adding children to layout root
		root.setCenter(center);
		root.setBottom(bottom);
	}
	public void buildUI(String clientName) {
	// layout root
		root = new BorderPane();
	//children nodes
		//Center
		center = new ClientFormCenter(clientName);
		
		//bottom
		bottom = new ClientFormBottom(clientName);
	
	//Adding children to layout root
		root.setCenter(center);
		root.setBottom(bottom);
	}
	

// form values getters
	// client name
	public String getClientNameValue() {
		return center.getClientNameValue();
	}
	// Client ice
	public int getClientIceValue() {
		return center.getClientIceValue();
	}
	// Client City
	public String getClientCityValue() {
		return center.getClientCityValue();
	}
	public String getClientCityText() {
		return center.getClientCityText();
	}
	// phone number
	public int getClientPhoneValue() {
		return center.getClientPhoneValue();
	}
	// adress
	public String getClientAddressValue() {
		return center.getClientAddressValue();
	}

}
