 package clientFormApplication;

import java.util.ArrayList;

import databaseApplication.DatabaseApp;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClientFormApp {

// Event handlers	
	//Add new phone
	public static void newPhoneAction(Button btn) {
		VBox centerParentContent = (VBox) btn.getParent().getParent();
		btn.setOnAction(e -> centerParentContent.getChildren().add(new ClientFormPhoneFld()));
	}
	//remove this phone number
	public static void removePhoneAction(Button btn) {
		ClientFormPhoneFld phoneToRmv = (ClientFormPhoneFld) btn.getParent();
		VBox centerParentContent = (VBox) phoneToRmv.getParent();
		btn.setOnAction(e -> centerParentContent.getChildren().remove(phoneToRmv));
	}
	
	//closing stage
	public static void cancelClientAction(Button btn) {
		BorderPane rootParent = (BorderPane) btn.getParent().getParent();
		Scene scene = rootParent.getScene();
		Stage stage = (Stage) scene.getWindow();
		btn.setOnAction(e -> stage.close());
	}
	
	// Saving a client
	public static void saveClientAction(Button btn) {
		ClientFormView  form = (ClientFormView) btn.getScene().getWindow();
		BorderPane root= (BorderPane) btn.getScene().getRoot();
		ClientFormCenter center = (ClientFormCenter) root.getCenter();
		btn.setOnAction(e -> {
			//getting form elements
			String clientName = form.getClientNameValue();
			int clientIce = form.getClientIceValue();
			String clientCity = form.getClientCityValue();
			String clientAddress = form.getClientAddressValue();
			
			ArrayList<Integer> clientPhoneValues = center.getPhonesValues();
			
			// checking city value against the database
			DatabaseApp.insertCity(clientCity);	
			DatabaseApp.insertClient(clientName, clientIce, DatabaseApp.getCityId(clientCity), clientAddress);
			int clientId = DatabaseApp.getClientId(clientName);
			for(int phoneNumber : clientPhoneValues) {
				DatabaseApp.insertPhone(phoneNumber, clientId);
			}
			form.close();
			
		});
	}
	
	// Adding phone numbers to database
	

	
}
