package itemsApplication;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;

public class ItemPanel extends HBox{
	private Text itemNameTxt, itemUteTxt, itemPriceTxt;

//Constructor
	public ItemPanel() {
	//Children nodes
		//Item name
		itemNameTxt = new Text("Désignation");
		
		//Ute
		itemUteTxt = new Text("UTE");
		
		//price
		itemPriceTxt = new Text("P.U.H.T (Estimation)");
		
		//seperator
		Region seperator1 = new Region();
		Region seperator2 = new Region();
			//Style
		HBox.setHgrow(seperator1, Priority.ALWAYS);
		HBox.setHgrow(seperator2, Priority.ALWAYS);
		//seperator1.setMaxWidth(200);
		seperator2.setMaxWidth(200);

		
	//Adding children nodes
		getChildren().addAll(itemNameTxt, seperator1, itemUteTxt, seperator2, itemPriceTxt);
	
	//Styleing layout
		setPadding(new Insets(20, 70, 20, 70));
		setAlignment(Pos.CENTER);
		setCursor(Cursor.HAND);
		
		
	}
}
