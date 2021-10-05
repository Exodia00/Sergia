package BillApplication;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BillApp {

	
	//exit btn action
	public static void exitAction(Button btn) {
		Stage stage = (Stage) btn.getParent().getScene().getWindow();
		btn.setOnAction(e -> stage.close());
	}
}
