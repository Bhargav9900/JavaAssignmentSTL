package com.sterlite.jdbc.connection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	public static Connection getDBConnectivity() throws IOException, ClassNotFoundException, SQLException {
		
		//create an object of properties class
		Properties props = new Properties();
		
		FileReader fr = new FileReader("dbconfig.properties");
		
		//load db properties from file into pro obj
		props.load(fr);
		
		//retrevie jdbc pro stored in pro obj
		
		//String driverClassName = props.getProperty("jdbc-driver");
		String jdbcUrl = props.getProperty("jdbc-url");
		String dbUser = props.getProperty("db-user");
		String dbpass = props.getProperty("db-password");
		
		
		//load JDBC DRIVER
		//Class.forName(driverClassName);
		
		//System.out.println("Driver loaded");
		
		Connection con = DriverManager.getConnection(jdbcUrl,dbUser,dbpass);
		System.out.println("Connectin done");
		return con;
		
		
	}
}
