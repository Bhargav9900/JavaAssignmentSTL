/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description find count of particular char in string
 */
public class CharCount {

	public static int countChar(String str,char ch) {
		int countOfchar = 0;
		
		for(int i=0;i<str.length();i++) {
			if(ch == str.charAt(i)) {
				countOfchar++;
			}
		}
		
		return countOfchar;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = countChar("Hello",'l');
		System.out.println("Number of char present in string= "+count);
		count = countChar("Bhargav",'a');
		System.out.println("Number of char present in string= "+count);
	}

}
