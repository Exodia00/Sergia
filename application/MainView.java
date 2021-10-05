package application;

import DashBoardApp.Dashboard;
import DashBoardApp.SideBar;
import clientApplication.ClientsScene;
import clientApplication.ClientsView;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainView {
	private Stage stage;
	private StackPane root;
	private Scene scene;
	private Dashboard dashboard;
	private SideBar sideBar;
	private Button menuBtn;
	// other scenes/layouts
	private ClientsScene clientsScene;
	private ClientsView clientsView;
	// Switching scene buttons
	private Button clientsBtn , exitClientsBtn, exitItemsBtn;
	
	//Constructor 
	public MainView(Stage stage) throws Exception{
		this.stage = stage;
		buildUi();
	}
	
	private void buildUi() throws Exception {
	//root layout
		root = new StackPane();
		
	// Additional Scenes
		clientsView = new ClientsView();
		clientsScene = new ClientsScene(clientsView);
		
	//Children nodes
		//Dashboard
		dashboard = new Dashboard();
		
		// Menu Btn
		menuBtn = new Button("Menu");
			// menu btn event
		menuBtn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				toggleMenu();			
			}		
		});
			// Style
		StackPane.setAlignment(menuBtn, Pos.TOP_LEFT);
		StackPane.setMargin(menuBtn , new Insets(10 , 0 , 0 ,10));
		
		//SideBar
		sideBar = new SideBar();
			//Styling
		StackPane.setAlignment(sideBar, Pos.TOP_LEFT);
		
		// === Scene Switching buttons === //
		
		//clientsBtn
		clientsBtn = sideBar.getClientsBtn();
			//action
		toggleMainView(clientsBtn, stage, clientsScene , "Clients");
		//exit Clients
		exitClientsBtn = ((ClientsView) clientsScene.getRoot()).getExitBtn();
			//exit clients
		setMainView(exitClientsBtn);
		
		//Exit Items
		
		
	
	
	// Adding Children 
		root.getChildren().addAll(dashboard, menuBtn);
		
		//Setting Stage and scene
		scene = new Scene(root , 1000 , 600);
		stage.setTitle("Sergia App");
		stage.setScene(scene);
		stage.show();
	}

	
	// Toogle Menu Method
	public void toggleMenu() {
		ObservableList<Node> viewNodes = root.getChildren();
		if (viewNodes.contains(sideBar)){
			root.getChildren().remove(sideBar);
			menuBtn.setText("Menu");
		}else {
			root.getChildren().remove(menuBtn);
			root.getChildren().add(sideBar);
			root.getChildren().add(menuBtn);
			menuBtn.setText("Close");
		}
	}
	
	//static method 
	public void toggleMainView(Button btn ,Stage stage , Scene scene, String title) {
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				stage.setScene(scene);
				stage.setTitle(title);				
			}
		});
		
	}
	
	public void setMainView(Button btn) {
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				stage.setScene(scene);
				stage.setTitle("Sergia App");				
			}
		});
	}
	
	
	
}
