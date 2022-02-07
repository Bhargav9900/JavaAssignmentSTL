import java.util.*;
/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description print prime number based on user count(range)
 */
public class PrimeNumberCount {

	public static void primeCount(int count) {
		
		int c=0;
		//int [] primeArray = new int[count];
		for(int i=2;i<=1000;i++) {
			int flag=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag++;
					break;
				}
			}
			if(flag==0 && c<count) {
				System.out.println(i);
				c++;
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get value from user
		System.out.println("Enter range");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println("First "+count+" Prime Numbers are...");
		primeCount(count);
		sc.close();
	}

}
