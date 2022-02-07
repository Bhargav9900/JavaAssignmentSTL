package com.sterlite.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TreeSet<Integer> numSet = new TreeSet<>( (n1,n2)-> n1>n2?-1:1);//sorted and ordered
		TreeSet<Integer> numSet = new TreeSet<>( Collections.reverseOrder());
		//LinkedHashSet<Integer> numSet = new LinkedHashSet<>();//unordered and unsorted
		//HashSet<Integer> numSet = new HashSet<>();//ordered but unsorted
		numSet.add(100);
		numSet.add(100);
		numSet.add(500);
		numSet.add(200);
		numSet.add(450);
		
		Iterator<Integer> it = numSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("using functional programming");
		numSet.forEach(n->System.out.println(n));
	}

}
