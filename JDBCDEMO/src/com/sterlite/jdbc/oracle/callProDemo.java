package com.sterlite.jdbc.oracle;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.sterlite.jdbc.connection.DBConnection;

public class callProDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				Connection con = DBConnection.getDBConnectivity();
			){
			
			CallableStatement cstmt = con.prepareCall("{call update_price(?,?)}");
			cstmt.setInt(1, 3002);
			cstmt.setFloat(2,1000.00f);
			cstmt.execute();
			System.out.println("Procedure called successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
