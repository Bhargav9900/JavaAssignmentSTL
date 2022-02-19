package com.sterlite.jdbc.postgre;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.sterlite.jdbc.connection.DBConnection;

public class CalledProcedurePosgres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				Connection con = DBConnection.getDBConnectivity();
			){
			
			CallableStatement cstmt = con.prepareCall("CALL update_pr(?,?)");
			cstmt.setInt(1,3002);
			cstmt.setInt(2,10000);
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
