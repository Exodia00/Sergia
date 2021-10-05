package billFormApplication;

import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class BillFormTotal extends HBox{
	private Text totalHtTxt;
	private Text tvaTxt;
	private Text netTtcTxt;
	
	
//Constructor
	public BillFormTotal() {
	//Children nodes
		totalHtTxt = new Text("Total H.T");
		
		tvaTxt = new Text("Taux Tva");
		
		netTtcTxt = new Text("Net à payer TTC");
		
	//Adding children
		getChildren().addAll(totalHtTxt , tvaTxt , netTtcTxt);
		
	//Styling layout
		setAlignment(Pos.CENTER);
		setSpacing(20);
	}

}
