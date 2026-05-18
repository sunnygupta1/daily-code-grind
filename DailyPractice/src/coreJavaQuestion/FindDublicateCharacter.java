package coreJavaQuestion;

import java.util.HashSet;
import java.util.Set;

public class FindDublicateCharacter {
	public static void main(String arr[]) {
		String s = "sunny";
		Set<Character> set = new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			
			if(!set.add(s.charAt(i))) {
				System.out.println(s.charAt(i));
			}
			
		}
		
		
	}

}
