package practicepgms;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterInString {
	
	
	public static void main(String[] args) {
	
	{
   
        HashMap<Character, Integer> charCountMap
            = new HashMap<Character, Integer>();
 
    
        String inputString ="geeksforgeeks";
        char[] strArray = inputString.toCharArray();
 
     
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
 
                charCountMap.put(c, 1);
            }
        }
 
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }}
}
