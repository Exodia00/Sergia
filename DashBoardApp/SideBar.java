package DashBoardApp;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class SideBar extends VBox{
	private Text title;
	private Button newBillBtn;
	private Button clientsBtn;
	private Button itemsBtn;
	private Button openBillFolderBtn;
	
	public SideBar() {
		
		
	// Children Nodes 
		//title : =====
		title = new Text("Menu");
			//style
		
		//Buttons : =====
		// ** new bill
		newBillBtn = new Button("+ facture");
			//action
		SideBarApp.newBillAction(newBillBtn);
			//Style
		newBillBtn.setPrefWidth(Double.MAX_VALUE);
		
		//**clients
		clientsBtn = new Button("Clients");
			// action is in mainview class
			//Style
		clientsBtn.setPrefWidth(Double.MAX_VALUE);
		
		//**items
		itemsBtn = new Button("Services/Biens");
			//Action
		Platform.runLater(()->SideBarApp.toggleItemsAction(itemsBtn));
			//Style
		itemsBtn.setPrefWidth(Double.MAX_VALUE);
		
		//open folder
		openBillFolderBtn = new Button("Dossier des factures");
			//Style
		openBillFolderBtn.setPrefWidth(Double.MAX_VALUE);
		
		//Styling layout
		setSpacing(20);
		setPadding(new Insets(10));
		setMaxWidth(200);
		setBackground(new Background(new BackgroundFill(Color.WHITE, null, Insets.EMPTY)));
		
		setMargin(title, new Insets(50,0,0,0));
		
		
	// Add nodes to layout
		getChildren().addAll(title , newBillBtn , clientsBtn , itemsBtn , openBillFolderBtn);
		
	}
	
	public Button getClientsBtn() {
		return clientsBtn;
	}
	

	
}


