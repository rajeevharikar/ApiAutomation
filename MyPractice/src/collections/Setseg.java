package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setseg {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hs= new HashMap<Integer, String>();
		hs.put(1, "rajeev");
		hs.put(2, null);
		hs.put(null, null);
		Set<Integer> s=hs.keySet();
		Iterator<Integer> it= s.iterator();
	      while(it.hasNext())
	      {
	    	  int val = (int)it.next();
	    	  System.out.println(hs.get(val));
		
	}

	}}
