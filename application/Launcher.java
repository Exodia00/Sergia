package application;
	
import databaseApplication.DatabaseApp;
import javafx.application.Application;
import javafx.stage.Stage;

//this class defines the form for adding a new client -- a new stage 
public class Launcher extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		DatabaseApp.estConnection();
		MainView mainView = new MainView(primaryStage);
		
		/*
		 * Stage stage = new Stage(); stage.setScene(new ItemsScene(new ItemsView()));
		 * stage.show();
		 */
		//new ItemFormStage();
	}
	
	public static void main(String[] args) {
		launch(args);
		DatabaseApp.closeConnecton();
	}
	

}
