/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description test Customer class methods
 */
public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cu1 = new Customer();
		
		//print no-arg constructor
		cu1.printDetails();
		
		//get name
		System.out.println(cu1.getName());
		
		//use set method to set name
		cu1.setName("Bhargav Bechara");
		
		//get updated name
		System.out.println(cu1.getName());
		
		//parameterized constructor
		System.out.println();
		System.out.println("Use of parameterized constructor");
		Customer cu2 = new Customer(119,"Test",22,"Jnd",362610);
		cu2.printDetails();
	}

}
