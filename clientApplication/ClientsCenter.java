package clientApplication;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
// this class contains the clientsView's center content
public class ClientsCenter extends VBox{
	private TextField searchFld;
	private ComboBox<String> cityFld;
	private ClientsList clientsList;
	

//Constructor 
	public ClientsCenter() {
	//children nodes
		//search fld
		searchFld = new TextField();
			//Style
		searchFld.setPromptText("Recherche");
		
		// cityFld
		cityFld = new ComboBox<String>();
			//style
		cityFld.setPromptText("Ville");
		
		//clientsList
		clientsList = new ClientsList();
		
		
	
	//children containers
		// search filters
		HBox searchFilter = new HBox(searchFld,cityFld);
			//style
		searchFilter.setSpacing(30);
		searchFilter.maxWidthProperty().bind(clientsList.widthProperty());
	
	
	// Adding nodes to layout
		getChildren().addAll(searchFilter , clientsList);
		
	//layout style
		setPadding(new Insets(20 , 20 , 20 , 100));
		setSpacing(30);
		setAlignment(Pos.CENTER);
//		setFillWidth(true) ;
		
		
	}

}
