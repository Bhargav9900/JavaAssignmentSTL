package com.sterlite.containment.dish;

public class Dish {

	private int size;
	public Dish(){
		
		size = 20;
	}
	
	public Dish(int size)
	{
		this.size = size;
	}
	
	public void printSize() {
		System.out.println(size);
	}
}
