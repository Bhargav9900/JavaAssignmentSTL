import java.util.Scanner;

/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description vowel count in string
 */
public class VowelCount {

	public static int countVowels(String str) {
		int total_vowel = 0;
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O'
					|| c == 'u' || c == 'U') {
				total_vowel++;
			}
		}
		
		return total_vowel;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int count = countVowels(st);
		System.out.println("Number of vowels in given string= "+count);
		sc.close();
	}

}
