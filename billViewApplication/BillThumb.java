package billViewApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class BillThumb extends VBox{

	Text cmpName;
	Text billDate;
	
	public BillThumb(String companyName , String date) throws Exception{
		
		//text nodes
		this.cmpName=new Text(companyName);
		this.billDate=new Text(date);

		
		
		//adding children
		getChildren().addAll(cmpName , billDate);
		
	}
	
	// Method that translates String format to Date format
	public Date strToDate(String dateStr) throws Exception {
		Date date = new SimpleDateFormat("dd/mm/yyyy").parse(dateStr);
		return date;
	}
	
}
