package JAVA.Utils;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUltils {
	private Properties properties;
	private Connection connection;

	public JdbcUltils() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		properties = new Properties();
		properties.load(new FileInputStream("src\\main\\database.properties"));
		properties.load(new FileInputStream("src\\main\\message.properties"));
		connect();
	}

	public Connection connect() throws ClassNotFoundException, SQLException {
		if (connection != null && !connection.isClosed()) {
			return connection;
		}

		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String driver = properties.getProperty("driver");

		// Step 1: register the driver class with DriverManager
		Class.forName(driver);

		// Step 2: get a Database Connection
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("ss");
		return connection;
	}

}
