package billFormApplication;

import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

// This class contains the bill form gui

public class BillFormView extends Stage{
	private Scene scene;
	private BorderPane root;
	private BillFormHeader header;
	private BillFormCenter center;
	private BillFormFooter footer;
	private ScrollPane scrollable;
	
	
	// Constructor
	public BillFormView() {
		root = new BorderPane();
		
		buildUI();
		
		scene = new Scene(scrollable, 1000 , 600);
		setScene(scene);
		setTitle("Facturation");
		initModality(Modality.APPLICATION_MODAL);
		
	}
	
	private void buildUI() {
	//children nodes
		//**header
		header=new BillFormHeader(this);
		
		//**center
		center=new BillFormCenter();
		
		//**footer
		footer = new BillFormFooter();
		
	// Add children nodes
		root.setTop(header);
		root.setCenter(center);
		root.setBottom(footer);
		
	// scrollable
		scrollable = new ScrollPane();
		scrollable.setFitToWidth(true);
		
		scrollable.setContent(root);
	
	}
	
	public  void closeFormWindow() {
		close();
	}
	
	// getting form elements

	
	// setting form elements
		// Setting clientCB value
	public void setClientValue(String client) {
		ComboBox<String> clientCB = center.getClientCB();
				clientCB.setValue(client);;
	}
	
}
