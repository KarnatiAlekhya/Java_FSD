package ProductDetails;
import java.sql.*;
public class DatabaseConnection {
	static Connection con=null;
	public static Connection getConnection() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/productdetails";
		String user="root";
		String password="Alekhya@0721";
		con=DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}

