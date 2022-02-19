package com.sterlite.jdbc.oracle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sterlite.jdbc.connection.DBConnection;

public class AddProduct {

	public static void main(String[] args) {
		
		try(
				Scanner sc = new Scanner(System.in);
				Scanner sc1 = new Scanner(System.in);
				Connection con = DBConnection.getDBConnectivity();
			)
		{
			con.setAutoCommit(false);
			//database operation logic
			//create satatements  using connection
			//second time this queries not complie it is called pricomplied qury or parameterized qury
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?,?)");
			
			System.out.println("Enter id:");
			int id = sc.nextInt();
			//parameter index
			pstmt.setInt(1,id);
			
			System.out.println("Enter Name:");
			String name  = sc1.nextLine();
			pstmt.setString(2,name);
			
			System.out.println("Enter brand:");
			String brand  = sc1.nextLine();
			pstmt.setString(3,brand);
			
			System.out.println("Enter price:");
			float pri  = sc.nextFloat();
			pstmt.setFloat(4,pri);
			
			
			
			//int updateCnt = stmt.executeUpdate("insert into product values(3015,'AC','Whirlpool',67000.00)");
			
			
			int updateCnt = pstmt.executeUpdate();
			con.commit();
			
			
			if(updateCnt > 0) {
				System.out.println("New product added");
				
			}
			else {
				con.rollback();
				System.out.println("Not added");
			}
		} 
		
		catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
