package com.sterlite.collections;
import java.util.*;
public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> dq = new LinkedList<Integer>();
		dq.add(500);
		dq.addLast(300);
		dq.addFirst(700);
		dq.addFirst(200);
		dq.addLast(800);
		
		System.out.println("Head of DeQue: " + dq.peek());
		
		System.out.println("Front of DeQue: " + dq.peekFirst());
		
		System.out.println("Rear of DeQue: " + dq.peekLast());
		
		System.out.println("Removing Front of DeQue: " + dq.pollFirst());
		
		System.out.println("Removing Rear of DeQue: " + dq.pollLast());
		
System.out.println("Front of DeQue: " + dq.peekFirst());
		
		System.out.println("Rear of DeQue: " + dq.peekLast());
		
		
	}

}
