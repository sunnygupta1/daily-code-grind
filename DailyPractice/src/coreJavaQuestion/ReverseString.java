package coreJavaQuestion;

public class ReverseString {
	public static void main(String args[]) {
	String s = "Sunny";
	String arr[] = s.split("");
	
	for(int i = 0; i<arr.length/2; i++) {
		String temp = arr[i];
		arr[i]= arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
	}
	
	System.out.println(String.join("", arr));

}
}
