package com.sterlite.collection;

@FunctionalInterface
public interface MyMath {

	//Making interface functional interface we use functional interface annotation
	int add(int a,int b);
	//void multi(int a,int b);
	
	default int multiply(int x,int y) {
		return x*y;
	}
	//after java 8 you can add n number of default/static method with body

	static int div(int x,int y) {
		return x/y;
	}
}
