/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description method overloading
 */
public class MathEngine {

	public int multiply(int n1,int n2) {
		return n1*n2;
	}
	
	public void multiply(int n1,int n2,int n3) {
		
		System.out.println("Parameterized Method with 3 parameter called");
		System.out.println(n1*n2*n3);
	}
	
	public float multiply(float n1,int n2) {
		return n1*n2;
	}
	
	public float multiply(int n1, float n2) {
		return n1*n2;
	}
}
