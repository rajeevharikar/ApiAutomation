package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmapexample {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap();
		
		hm.put(1, "rajeev");
		hm.put(2, "Mallya");
		hm.put(3, "harish");
		hm.put(4, "praveen");
		hm.put(5, "praveen");
		
		String str = hm.get(4);
		System.out.println(str);
		Set set=hm.keySet();
		
		Iterator it= set.iterator();
		
		while(it.hasNext())
		{
			int key1 = (int)it.next();
			System.out.println(key1);
			while(it.hasNext())
		{
			
			int key2 = (int) it.next();
			System.out.println(key2);
			String val1 = hm.get(key1);
			System.out.println(val1);
			String val2= hm.get(key2);
			System.out.println(val2);
			if(!val1.equals(val2))
			{
				if(val1.equals(val2))
				{
					hm.remove(val2);
				}
				
			}
			
		}
						
			
		}
		
		for(Object k :set)
		{
			String no = k.toString();
			String finaltext = hm.get(no);
			System.out.println(finaltext);
		}
		
		
	}
}


