/*
 * @author bhargav.bechara@stltech.in
 * @date 16-02-2022
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description oracle jdbc connection with oracle 11g xe database
 */

package com.sterlite.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		
		try {
			
			//step 1 : load JDBC type 4 for oracle[optional]
			//Class.forName("oracle.jdbc.drive.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			System.out.println("Oracle Databse connection is established");
			//logic to perform database operations
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
