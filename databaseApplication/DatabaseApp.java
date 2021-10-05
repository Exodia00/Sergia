package databaseApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DatabaseApp {
// Attributes
	private static String dbUrl = "jdbc:mysql://localhost:3306/SergiaAppDb";
	private static String user = "root";
	private static String password = "";
	
	private static Connection connection=null;
	
// queries
	// Insertion
		// insert one value
	private static String insertValueToTableQr = "INSERT INTO ? (?)"
			+ "	VALUES (?)";
		// insert client
	private static String insertClientQr = "INSERT INTO Clients_Table (Client_Id, Client_Ice, Client_Name ,City_Id, Client_Address) "
			+ "VALUES (NULL, ?, ?, ?, ?)";
		
		// insertIgnoreCity
	private static String insertIgnoreCityQr = "INSERT IGNORE INTO Cities_Table (City_Name)"
			+ "VALUES (?)";
		
		//insert phone
	private static String insertPhoneQr = "INSERT IGNORE INTO Phones_Table(Phone_Number , Client_Id) VALUES (? , ?)";
	
	// Select
		// select all cities
	private static String getAllCititesQr = "SELECT * FROM Cities_Table";
		// select city id
	private static String getCityIdQr = "SELECT * FROM Cities_Table "
			+ "WHERE city_name = ?";
		// Select client by name
	private static String getClientIdQr = "Select Client_id FROM Clients_Table WHERE Client_Name = ?";
	
	
// open and close Methods =========================================
	// open a connection
	public static void estConnection() {
		try {
			connection = DriverManager.getConnection(dbUrl, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Close connection
	public static void closeConnecton() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
// Insertion methods ==================================================
	//insert value to table
	public static void insertIntToTable(String table, String col,int  value){
		PreparedStatement ps=null;
		try {
			ps = connection.prepareStatement(insertValueToTableQr);
			ps.setString(1, table);
			ps.setString(2, col);
			ps.setInt(3, value);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	// insert client
	public static void insertClient(String clientName, int clientIce, int cityId, String clientAdress) {
		
		PreparedStatement ps=null;
		
		try {
			// preparing the statement
			ps = connection.prepareStatement(insertClientQr);
			// setting parameters
			ps.setInt(1, clientIce);
			ps.setString(2, clientName);
			ps.setInt(3, cityId);
			ps.setString(4, clientAdress);

			//executing
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//closing the prepared statement
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	// insert city
	public static void insertCity(String cityName) {
		PreparedStatement ps  =null;
		
		try {
			ps=connection.prepareStatement(insertIgnoreCityQr);
			ps.setString(1, cityName.toUpperCase());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// insert phone number
	public static void insertPhone(int phone, int clientId) {
		PreparedStatement ps = null;
		
		try {
			ps = connection.prepareStatement(insertPhoneQr);
			ps.setInt(1, phone);
			ps.setInt(2, clientId);
			ps.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	

// Read Methods ==============================================================
	// Return a list of all cities
	public static ObservableList<String> getAllCitiesNames(){
		
		// define statement and result set
		Statement statement = null;
		ResultSet rs = null;
		
		//create empty observable list
		ObservableList<String> citiesList = FXCollections.observableArrayList();
		
		// make a statement, execute, get rs
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(getAllCititesQr);
			// add to cities list
			while(rs.next()) {
				citiesList.add(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//close statement and result set
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}	
		return citiesList;
	}
	
	// Return id of a city
	public static int getCityId(String cityName) {
		System.out.println(cityName);
		int id=0;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = connection.prepareStatement(getCityIdQr);
			ps.setString(1, cityName);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				id=rs.getInt("City_Id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {					
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return id;
	}
	
	// return if of a client by name
	public static int getClientId(String clientName) {
		int id=0;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = connection.prepareStatement(getClientIdQr);
			ps.setString(1, clientName);
			rs = ps.executeQuery();
			while(rs.next()) {
			id = rs.getInt("Client_Id");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return id; 
	}
}
