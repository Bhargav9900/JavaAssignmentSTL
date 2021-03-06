package com.sterlite.collection;

public class LambdaExpDemo {

	public static void doMath(MyMath m) {
		System.out.println("Res "+m.add(45, 30));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//lambda is also a object of anonames class
		MyMath ob = (int x,int y) -> {return x+y;};
		//ob.add(34, 23);
		System.out.println(ob.add(34, 23));
		
		MyMath ob1 = (c,d)->c+d;
		//
		System.out.println(ob1.add(16, 9));
		
		System.out.println();
		System.out.println("Mul: " + ob.multiply(34, 13));
		doMath( (p,q)-> p+q );
		
		System.out.println("Div "+ MyMath.div(25, 5));
	}

}
