/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description reverse string
 */
public class StringReverse {

	public static String reverse(String str) {
		
		String revStr="";
		for(int i=str.length()-1;i >= 0;i--) {
			revStr += str.charAt(i);
		}
		return revStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("hello"));
	}

}
