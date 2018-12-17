package collections;

import java.util.HashMap;

public class Example {
	
	public static void main(String[] args){ 

		HashMap<String,Integer> hm=new HashMap<String,Integer>(); 
		hm.put("AK",1); 
		hm.put("BK",2); 
		hm.put("CK",3); 
		hm.put("DK",4); 
		hm.put("EK",5);	
		hm.put("FK",6); 
		hm.put("GK",7); 
		hm.put("HK",6); 
		hm.put("IK",7); 


		System.out.println("values are "+hm.values()); 

		// Removing the duplicate VALUES from Map 
		System.out.println("\n After removing duplicate values "); 

		for(Object key1:hm.keySet()){ 

		for(Object key2:hm.keySet()){ 
		if(!key1.toString().equals(key2.toString())){ 
		int x=hm.get(key1); 
		int y=hm.get(key2); 
		if(x==y){ 
		hm.remove(key2); 
		} 
		} 

		} 


		} 


}
}
