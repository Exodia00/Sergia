package searchFilterApplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class SearchFilter extends HBox{
	private ComboBox<String> priorityFilter;
	private ComboBox<String> companyFilter;
	private ComboBox<String> itemFilter;
	private TextField priceMinFilter;
	private TextField priceMaxFilter;
	private TextField wordFilter;
	
// Constructor method
	public SearchFilter() {
		
	// Children nodes
		// PriorityFilter 		
		ObservableList<String> priorityList =FXCollections.observableArrayList(
				"Plus Récent",
				"Plus ancien",
				"A-Z",
				"Z-A"
				);	
		priorityFilter = new ComboBox<String>(priorityList);
			//Styling node
		priorityFilter.setPromptText("Trier");
		HBox.setMargin(priorityFilter, new Insets(0 , 0 , 0 , 10));

		// CompanyFilter
		companyFilter = new ComboBox<String>();
			//Styling node
		companyFilter.setEditable(true);
		companyFilter.setPromptText("par client");
		
		//ItemFilter
		itemFilter = new ComboBox<String>();
			//Styling node:
		itemFilter.setEditable(true);
		itemFilter.setPromptText("par bien/service");
		
		//price Filter
		priceMinFilter=new TextField();
		priceMaxFilter=new TextField();
			//Styling nodes
		priceMinFilter.setPromptText("Prix Minimum");
		priceMaxFilter.setPromptText("Prix Maximum");
		
		//word filter
		wordFilter = new TextField();
			//Styling node
		HBox.setHgrow(wordFilter, Priority.ALWAYS);
		HBox.setMargin(wordFilter, new Insets(0 , 10 , 0 , 0));
		wordFilter.setMaxWidth(300);
		wordFilter.setPromptText("Recherche par mots clés");
		
	//Adding children
		getChildren().addAll(priorityFilter, companyFilter, itemFilter, priceMinFilter, priceMaxFilter, wordFilter);
	
	// Styling layout
		setSpacing(10);
		
	}
	
	
	
	
}
