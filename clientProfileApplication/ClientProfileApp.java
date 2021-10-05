package clientProfileApplication;

import BillApplication.BillStage;
import clientApplication.ClientsScene;
import clientApplication.ClientsView;
import clientFormApplication.ClientFormView;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ClientProfileApp {
	
	// modifier un client
	public static void modifyClientAction(Button btn, String clientName) {
		btn.setOnAction(e -> {
			new ClientFormView(clientName);
		});
	}
	
	// exit
	public static void exitBtnAction(Button btn) {
		btn.setOnAction(e -> {
			Stage stage = (Stage) btn.getParent().getParent().getScene().getWindow();
			stage.setScene(new ClientsScene(new ClientsView()));
			stage.setTitle("Clients");
			
		});
	}
	
	// opening a bill
	public static void openBillAction(Node node) {
		node.setOnMouseClicked(e -> {
			BillStage bill = new BillStage();
			
		});
	}
}
