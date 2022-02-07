package com.sterlite.containment.dinnerset;

import com.sterlite.containment.dish.Dish;

public class Dinnerset {
	
	Dish d1;
	
	public Dinnerset(){
		d1 = new Dish();
	}
	
	public Dinnerset(Dish d2){
		d1 = d2;
	}
	
	public void printDs() {
		System.out.println("hello");
	}
}
