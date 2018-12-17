package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		{
		hm.put(10, "harini");
		hm.put(20, "manasa");
		hm.put(50, "shruthi");
		hm.put(21, null);
		hm.put(34, null);
		
		
		Set s1=hm.keySet();
		
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			int i = (int)it.next();
			String str = (String) hm.get(i);
			System.out.println(str);
		}
		
	}

}}
