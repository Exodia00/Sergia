package clientApplication;

import billFormApplication.BillFormView;
import clientFormApplication.ClientFormView;
import clientProfileApplication.ClientProfileScene;
import clientProfileApplication.ClientProfileView;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ClientApp {

	// Adding a new client
	public static void newClientAction(Button btn) {
		btn.setOnAction(e -> new ClientFormView());
	}
	
	// Add a bill to a client
	public static void addBillAction(Button btn , String client) {
		btn.setOnAction(e -> {
			BillFormView stage = new BillFormView();
			stage.setClientValue(client);
			stage.show();
			stage.setTitle("Facturation : "+client);
		});
	}
	// open a client profile
	public static void openClientAction(Button btn,String clientName) {
		btn.setOnAction(e -> {
			ClientProfileView clientProfile = new ClientProfileView();
			Scene currentScene = btn.getParent().getParent().getParent().getParent().getScene();
			Stage stage = (Stage) currentScene.getWindow();
			stage.setScene(new ClientProfileScene(clientProfile));
			stage.setTitle(clientName);
			
			// Actio to return to clients scene
			Button exitBtn = clientProfile.getExitProfileButton();
			exitBtn.setOnAction(ev -> {stage.setScene(currentScene);});
		});
	}
	
}
