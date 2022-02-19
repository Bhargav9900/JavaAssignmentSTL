package com.sterlite.jdbc.postgre;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sterlite.jdbc.connection.DBConnection;

public class GetAllProductPostgresql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				Connection con = DBConnection.getDBConnectivity();
			)
		{
			//database operation logic
			//create satatements  using connection
			Statement stmt = con.createStatement();
			
			//fire the static SQL Embedded and obtain resultSet
			ResultSet rs = stmt.executeQuery("select * from product");
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String brand = rs.getString("brand");
				float price = rs.getFloat("price");
				System.out.println("ID: " + id +
									"\tName: " + name +
									"\tBrand: " + brand +
									"\tPrice: " + price);
			}
		} 
		
		catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
