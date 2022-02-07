import java.util.Scanner;

/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description multiplication table
 */
public class MultiplicationTable {

	public static void mulTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		mulTable(n);
		sc.close();
	}

}
