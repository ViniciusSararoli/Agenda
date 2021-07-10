package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	private String url = "jdbc:mysql://localhost:3306/agenda";
	private String user = "root";
	private String password = "";
	
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	/*public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}*/
}
