package collections;

import java.util.HashMap;
import java.util.Set;

public class UsingForeach {
	
	        public static void main(String[] args) {
			
			HashMap<Integer, String> hm=new HashMap<Integer, String>();
			
			hm.put(1, "Rajeev");
			hm.put(2, "Mallya");
			hm.put(3, "Harish");
			hm.put(4, "Rajeev");
			hm.put(5, "Praveen");
			hm.put(6, "Mallya");
			hm.put(7, "Praveen");
			hm.put(8, "Shaila");
			hm.put(9, "Pawan");
			hm.put(10, "Radhika");
			HashMap rmdup= new HashMap();
			String str = hm.get(4);
			//System.out.println(str);
			Set set=hm.keySet();
			int count = 0;
			for (Object key1:set)
			{
				String str1 = hm.get(key1);
				//making the values of hashmap1 as key in hashmap2 and same key of 1 as value of 2
				rmdup.put(str1, key1);
				
			}
			Set val=rmdup.keySet();
			
			for(Object dup:val)
			{
				String fin = dup.toString();
				//and print keys 
				System.out.println(fin);
				
			}
			
	        }
}