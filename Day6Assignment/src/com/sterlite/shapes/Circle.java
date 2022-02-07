package com.sterlite.shapes;
//concrete entity shape Circle
public class Circle extends Shape {

	private float radius;
	
	public Circle() {
		radius = 2.5f;
	}
	
	
	public Circle(float radius) {
		super(70);
		this.radius = radius;
	}


	public void calArea() {
		float area = (float) (MATH_PI * Math.pow(radius,2));
		System.out.println("Area="+area);
	}
}
