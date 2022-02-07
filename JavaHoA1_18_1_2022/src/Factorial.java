/*
 * @author bhargav.bechara@stltech.in
 * @date 18-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Find Factorial of given number
 */
public class Factorial {
	
	//fact method accept int value and find factorial
	public static int fact(int num) {
		
		int fact_answer;
		int fact = 1;
		if(num < 0)
		{
			fact_answer = 0;
		}
		else if(num == 0) {
			fact_answer=1;
		}
		else {
			for(int i=1;i<=num;i++) {
				fact*=i;
			}
			fact_answer=fact;
		}
		
		return fact_answer;
	}
	
	public static void main(String args[]){  
	
		//call fact() and store value in factorial
		int factorial = fact(-5);
		if(factorial==0) {
		System.out.println("Number is negative");
		}
		
		else {
			System.out.println(factorial);
		}
	}
}
