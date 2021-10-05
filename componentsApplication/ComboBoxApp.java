package componentsApplication;

import java.util.function.Predicate;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ComboBoxApp {

// set comboBox to have auto complete
	public static void autoCompleteOn(ComboBox<String> cb) {
		
		TextField editor = cb.getEditor();
		ObservableList<String> list = cb.getItems();
		FilteredList<String> filteredList = new FilteredList<>(list);
		editor.textProperty().addListener((observable, oldValue, newValue)->{
			filteredList.setPredicate(refreshItems(editor.getText()));
			cb.setItems(filteredList);
		});
		cb.focusedProperty().addListener((observable, oldValue, newValue)->{
			if(newValue == true) {
				cb.show();
			}
		});;
	}
	
	public static Predicate<String> refreshItems(String input){
		return city -> {
			if(input==null || input.isEmpty()) {
				return true;
			}
			return city.toLowerCase().contains(input.toLowerCase());
		};
		
	}
	
}
