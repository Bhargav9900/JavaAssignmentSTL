/*
 * @author bhargav.bechara@stltech.in
 * @date 19-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstration of method overloading
 */
public class OverloadDemo {

	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int add() {
		return 10+20;
	}
	
	public static float add(float a,int b) {
		return a+b;
	}
	
	public static float add(int a,float b) {
		return a+b;
	}
	
	public static void add(float a,float b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(45.6f,67));
		System.out.println(add(45,67.6f));
		add(45.0f,67.6f);
		System.out.println(add());
	}

}
