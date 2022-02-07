package com.sterlite.collections;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer> numSt = new ArrayDeque<Integer>();
		
		numSt.addFirst(300);//pushing element on the top of the stack
		numSt.addFirst(100);
		numSt.addFirst(700);
		numSt.addFirst(200);
		numSt.addFirst(100);
		
		System.out.println("Checking top of stack: " + numSt.peekFirst());
		
		System.out.println("Removing top of the stack: " + numSt.removeFirst());
		
		System.out.println("New Checking top of stack: " + numSt.peekFirst());
		
		while(!numSt.isEmpty()) {
			System.out.println("Removing top of the stack: " + numSt.removeFirst());
		}
	}

}
