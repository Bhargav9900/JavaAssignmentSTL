package com.sterlite.deserialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.sterlite.emp.Employee;

public class DeserializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
				FileInputStream fis = new FileInputStream("empData.dat");
				
				//create objectinputstream and link with fileinput
				ObjectInputStream ois = new ObjectInputStream(fis);
			)
		{
			//restore the state of object
			//return type type casting
			Employee e = (Employee) ois.readObject();
			e.display();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
