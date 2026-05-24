package coreJavaQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {
	
	public static void main(String args[]) {
		String str= "sunny";
		Map<Character, Long> result =str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x, Collectors.counting()));
		System.out.println(result);
		
		//using hashmap
        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        // Loop through each character
        for (char ch : str.toCharArray()) {
            // Update frequency count
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        // Print results
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        
        
        
        
        
        
       
	}

}
