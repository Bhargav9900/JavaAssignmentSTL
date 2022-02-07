package com.sterlite.shapes;

public abstract class Shape {

	private int a;
	public static final float MATH_PI = 3.14f;
	public Shape() {
		a = 10;
		
	}
	
	
	public Shape(int a) {
		//super();
		this.a = a;
	}


	public int getA() {
		return a;
	}
	
	public abstract void calArea();
}
