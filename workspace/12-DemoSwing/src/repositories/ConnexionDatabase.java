package repositories;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnexionDatabase {
	
	public static Connection getConnexion() throws Exception{
		Connection cnx = null;
		
		Properties p = new Properties();
		p.load(new FileInputStream("config.properties"));
		
		cnx = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("password"));

		return cnx;
	}

}
