/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description method overloading test
 */
public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathEngine m1 = new MathEngine();
		//method with 2 int parameter value 
		System.out.println(m1.multiply(16, 9));
		
		//method with 3 int parameter value
		m1.multiply(11, 9, 4);
		
		//first parameter float and second parameter int
		System.out.println(m1.multiply(16.9f, 9));
		
		//first parameter int and second parameter float
		System.out.println(m1.multiply(9, 11.9f));
	}

}
