/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstration of constructor-default and parameterized with getter setter method
 */
public class Customer {

	//instance variable
	private int customerid;
	private String name;
	private int age;
	private String city;
	private int pinCode;
	
	//explicit default or no-arg constructor
	public Customer(){
		customerid = 916;
		name = "Bhargav";
		age = 21;
		city = "Ahm";
		pinCode = 380015;
	}
	
	//parameterized constructor
	public Customer(int customerid,String name,int age, String city,int pinCode){
		this.customerid = customerid ;
		this.name = name;
		this.age = age;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	//setter method for name
	public void setName(String name) {
		this.name = name;
	}
	
	//getter method for name
	public String getName() {
		return name;
	}
	
	public void printDetails() {
		System.out.println("Customer Id: "+customerid+" Customer Name: "+name+" Customer Age: "+age+" Customer City: "+city+" PinCode: "+pinCode);
	}
}
