package DashBoardApp;



import billViewApplication.BillView;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import searchFilterApplication.SearchFilter;

public class Dashboard extends VBox{
	// private data
	private HBox dashboardHeader;
	private SearchFilter searchFilter;
	private BillView billView;
	
	
	//constructor
	public Dashboard()  throws Exception {
	//Children nodes
		dashboardHeader = createDashboardHeader();
		// SearchFilter
		searchFilter=new SearchFilter();
		// Main Bill view
		billView = new BillView();
		
	
		// Adding children
		getChildren().addAll(dashboardHeader , searchFilter , billView);
	}
	
// dashboard header builder	 =========
	private HBox createDashboardHeader() {
		// layout element
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setMinHeight(100);
		
		//child node
		Text text = new Text("Bienvenu");

		// Adding child
		hbox.getChildren().add(text);
		return hbox;
	}
	

	
}
