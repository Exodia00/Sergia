package DashBoardApp;

import billFormApplication.BillFormView;
import itemsApplication.ItemsScene;
import itemsApplication.ItemsView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

// This class Contains Event handlers for the SideBar buttons etc ..

public class SideBarApp {
	private static BillFormView billForm;
	
	
// Static methods ==================
	
	// Add a new bill
	static void newBillAction(Button btn) {
		btn.setOnAction(new EventHandler<ActionEvent>() {		
			@Override
			public void handle(ActionEvent event) {
				billForm = new BillFormView();
				billForm.show();
			}
		});
	}
	
	// Opening items view
	public static void toggleItemsAction(Button btn) {
		
		btn.setOnAction(e ->{
			Scene currentScene = btn.getScene();
			Stage stage = (Stage) currentScene.getWindow();
			ItemsView itemsView = new ItemsView();
			stage.setScene(new ItemsScene(itemsView));
			stage.setTitle("Services et Biens");
			
			Button exitBtn = itemsView.getExitBtn();
			exitBtn.setOnAction(ev -> {
				stage.setScene(currentScene);
			});
		});
	}

}
	


	
