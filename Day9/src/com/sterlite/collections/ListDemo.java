/*
 * @author bhargav.bechara@stltech.in
 * @date 31-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Animal Class implement movable
 */
package com.sterlite.collections;

//import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//before java 5
//		ArrayList numList = new ArrayList();
//		numList.add(Integer.valueOf(100));
//		numList.add(500);
//		numList.add("Hello");
//		numList.add(new Date(3,4,23));
//		
//		Integer i1 = new Integer(100);
//		
//		Integer i2 = Integer.valueOf(200);
//		
//		//Autoboxing since java 1.5
//		//Automaticaly assign value of primitive value
//		Integer i3 = 300;
//		
//		int a = i2.intValue();
//		//Autounboxing
//		int b = i3;
		
		//ArrayList Diamond 
		ArrayList<Integer> numList2 = new ArrayList<Integer>();
		numList2.add(16);
		//numList2.add("Hello"); // Type safety done by compiler
		numList2.add(400);
		numList2.add(16);
		numList2.add(119);
		
		//using for loop
		for(int i=0;i<numList2.size();i++) {
			System.out.println(numList2.get(i));
		}
		
		//using Iterator
		System.out.println("Iterator");
		
		Iterator<Integer> it = numList2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		System.out.println("ForEach loop");
		
		for(int ele: numList2) {
			System.out.println(ele);
		}
		
		//using forEach() method
		System.out.println("\nFor Each method");
		numList2.forEach( (ele)->System.out.println(ele));;
	
		//sorting the list
		System.out.println("Sorting numList in ascending order");
		Collections.sort(numList2);
		
		numList2.forEach( (ele)->System.out.println(ele));
		
		System.out.println("Sorting numList in descending order");
		Collections.sort(numList2, (n1,n2)->n1>n2?-1:1);
		
		numList2.forEach( (ele)->System.out.println(ele));
	}

}
