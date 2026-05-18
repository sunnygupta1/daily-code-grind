package coreJavaQuestion;

public class FindFirstNonRepeatedChar {
	public static void main(String args[]) {
		String s= "sunny";
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			
			System.out.println(s.indexOf("n"));
			System.out.println(s.lastIndexOf("n"));
			
			if(s.indexOf(ch)==s.lastIndexOf(ch)) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

}
