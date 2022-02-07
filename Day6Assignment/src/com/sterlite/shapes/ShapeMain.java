package com.sterlite.shapes;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s;
		s = new Circle();
		
		s.calArea();
		
		s=new Circle(4.12f);
		s.calArea();
	}

}
