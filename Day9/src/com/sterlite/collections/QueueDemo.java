
package com.sterlite.collections;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue<Integer> numQ = new LinkedList<Integer>();
		
		Queue<Integer> numQ = new PriorityQueue<Integer>();
		numQ.add(100);
		numQ.offer(500);
		numQ.offer(200);
		numQ.add(500);
		numQ.add(700);
		
		System.out.println("Head of Q: "+ numQ.peek());
		
		System.out.println("Polling head of Q: " + numQ.poll());
		
		System.out.println("New Head of Q: " + numQ.peek());
		
		while(!numQ.isEmpty()) {
			System.out.println("Polling element: " + numQ.poll());
			
		}
		
		//System.out.println("New Head of Q: " + numQ.element());
		//System.out.println("Polling head of numQ: "+numQ.remove());
		
	}

}
