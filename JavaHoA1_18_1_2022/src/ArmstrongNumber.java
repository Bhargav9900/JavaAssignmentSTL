/*
 * @author bhargav.bechara@stltech.in
 * @date 18-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Armstrong Number demonstration
 */
public class ArmstrongNumber {

	// create method to check number is armstrong or not
	public static void armstrong(int num) {
		
		int temp = num;
		int sum = 0;
		int len = String.valueOf(temp).length();
		while(temp>0) {
			int l = temp%10;
			sum +=(Math.pow(l,len));
			temp = temp/10;
		}
		if(sum == num) {
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
	}
	
	public static void main(String args[]){  
		
		armstrong(456);
	}
}
