/*
 * @author bhargav.bechara@stltech.in
 * @date 18-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Fibonacci series demonstration
 */
public class Fibonacci {
	
	public static void fibo(int terms)
	{
		//check terms are not zero or negative
		if(terms <= 0) {
			System.out.println("Please enter valid term number");
		}
		else {
			int t1=0;
			int t2=1;
			int t3;
			
			//print series for number of term = 1
			if(terms == 1) {
				System.out.println(t1);
			}
			
			//print series for number of terms = 2
			else if(terms == 2) {
				System.out.print(t1+" "+t2);
			}
			
			//print series for number of terms more than 2
			else {
				System.out.print(t1+" "+t2);
				
				for(int i=2;i<terms;i++) {
					t3 = t1 + t2;
					System.out.print(" "+t3);
					t1=t2;
					t2=t3;
				}
			}
		}
	}
	
	public static void main(String args[]){  
		
		fibo(6);
	}
}
