package billFormApplication;

import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;

public class BillFormCenter extends VBox{
// Data
	private GeneralBillDataPanel generalDataPanel;
	private BillFormItem billFormItem;
	private AddItemPanel addItemPanel;
	private BillFormTotal billFormTotal;

// Constructor
	public BillFormCenter() {
	//children nodes
		generalDataPanel = new GeneralBillDataPanel();
		
		billFormItem = new BillFormItem();
	
		addItemPanel = new AddItemPanel();
		
		billFormTotal = new BillFormTotal();
	// Adding children nodes
		getChildren().addAll(generalDataPanel , billFormItem , addItemPanel , billFormTotal);
		
	//Styling layout
		setSpacing(40);
	}
	
	// getters
		// getting the client conbobox xfrom withing the general cill info panel
	public ComboBox<String> getClientCB(){
		return generalDataPanel.getClientCB();
	}
	
}
