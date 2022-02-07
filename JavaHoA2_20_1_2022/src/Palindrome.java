import java.util.Scanner;

/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description palindrome
 */
public class Palindrome {

	public static boolean checkPalindrome(String s) {
		
		String temp = s;
		String revS="";
		for(int i=temp.length()-1;i >= 0;i--) {
			revS += temp.charAt(i);
		}
		
		if(s.equals(revS)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		if(checkPalindrome(st.toLowerCase()) == true) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		sc.close();
	}

}
