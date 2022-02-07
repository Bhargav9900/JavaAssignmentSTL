/*
 * @author bhargav.bechara@stltech.in
 * @date 18-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description PrimeNumber demonstration
 */

public class PrimeNumber {

	public static String prime(int num) {
		
		String msg;
		
		//set msg for zero value
		if(num == 0)
		{
			msg = "Zero is neither prime nor composite";
		}
		
		//set msg for negative value
		else if(num < 0) {
			msg = "You enter negative number";
		}
		
		//check given number is prime or not and assign msg value
		else {
			int flag = 0;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					flag++;
					break;
				}
			}
			if(flag==0) {
				msg = "Number is prime";
			}
			else {
				msg = "Not Prime";
			}
			
		}
		
		return msg;
	}
	
	public static void main(String args[]){  
		
		//Get prime() value in pri_num variable
		String pri_num = prime(5);
		
		//print message in output 
		System.out.println(pri_num);
		
	}
	
}
