package com.sterlite.collections;
import java.util.*;
public class ActorPhoneMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap<String, Long> actorPhMap = new HashMap<String, Long>(); // unordered unsorted
		//LinkedHashMap<String, Long> actorPhMap = new LinkedHashMap<String, Long>(); // follow insertion order unsorted
		//TreeMap<String, Long> actorPhMap = new TreeMap<String, Long>();//sorted and acending ordered
		TreeMap<String, Long> actorPhMap = new TreeMap<String, Long>( Collections.reverseOrder());
		actorPhMap.put("Akshay Kumar", 9840534521L);
		actorPhMap.put("Sid", 8545789865L);
		actorPhMap.put("Shradha Kapoor", 6578986745L);
		actorPhMap.put("Pooja Hegade", 8787878765L);
		actorPhMap.put("Amitabh Bachchan", 8787878765L);
		actorPhMap.put("Emily Clark", 9898987654L);
		
		System.out.println("Checking contact no of Sharadha: " + actorPhMap.get("Shradha Kapoor"));
		
		System.out.println(actorPhMap);
		
		Set<String> act = actorPhMap.keySet();
		
		Iterator<String> it = act.iterator();
		
		while(it.hasNext()) {
			
			String actName = it.next();
			long phoneNo = actorPhMap.get(actName);//retrieving value as per key
			System.out.println("Actor Name: " + actName + "\tContact: " + phoneNo);
		}
	}

}
