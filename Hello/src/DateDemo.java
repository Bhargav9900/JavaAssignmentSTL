/*
 * @author bhargav.bechara@stltech.in
 * @date 17-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstration date class
 */
public class DateDemo {
	public static void main(String args[]){  
		// creating MyDate class object
		MyDate d = new MyDate();
		
		// call initDate()
		//d.initDate();
		
		// call printDate()
		d.printDate();
		
		d.initDate();
		d.printDate();
	}
}
