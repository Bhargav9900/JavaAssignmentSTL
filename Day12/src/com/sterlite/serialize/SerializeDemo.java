/*
 * @author bhargav.bechara@stltech.in
 * @date 04-02-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Demonstrate object serialize
 */

package com.sterlite.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.sterlite.dates.MyDate;
import com.sterlite.emp.Employee;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(
				//open file in write mode
				FileOutputStream fos = new FileOutputStream("empData.dat");
				
				//create objectoutputstream and linj with fileoutputstream
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			)
		{
			Employee e = new Employee(1611, "Bhargav Bechara", 34000.000,new MyDate(1,1,2022));
			
			//serialize an employee object
			//save or persist the state of an employee object
			oos.writeObject(e);
			
			System.out.println("Serialized sucessfully!1");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
