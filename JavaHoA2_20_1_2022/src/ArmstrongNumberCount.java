import java.util.*;
/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 2.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Armstrong Number demonstration
 */
public class ArmstrongNumberCount {

	
	public static void armstrongCount(int count) {
		
		int c=0;
		for(int i=1;i<10000;i++) {
			int temp = i;
			int sum = 0;
			int len = String.valueOf(temp).length();
			while(temp>0) {
				int l = temp%10;
				sum +=(Math.pow(l,len));
				temp = temp/10;
			}
			if(sum == i && c < count) {
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
		System.out.println("First "+count+" Armstrong Numbers are...");
		armstrongCount(count);
		sc.close();
	}

}
