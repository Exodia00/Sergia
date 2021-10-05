package billFormApplication;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class BillFormApp {

	public static void removeItem(Button btn ) {
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				((VBox)btn.getParent().getParent().getParent()).getChildren().remove(btn.getParent().getParent());
			}
		});
	}
	
	public static void newItem(Button btn) {
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				AddItemPanel parentPanel = (AddItemPanel) btn.getParent();
				BillFormCenter center = (BillFormCenter) parentPanel.getParent();
				int parentIndex = center.getChildren().indexOf(parentPanel);
				center.getChildren().add(parentIndex, new BillFormItem());;
				
			}
		});
	}
}
