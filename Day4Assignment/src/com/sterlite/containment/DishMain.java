package com.sterlite.containment;

import com.sterlite.containment.dinnerset.Dinnerset;
import com.sterlite.containment.dish.Dish;

public class DishMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dinnerset d1 = new Dinnerset();
		
		Dinnerset d2 = new Dinnerset(new Dish());
		
		d1.printDs();
		d2.printDs();
	}

}
