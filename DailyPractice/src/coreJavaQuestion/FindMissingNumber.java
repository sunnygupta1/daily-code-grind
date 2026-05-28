package coreJavaQuestion;

import java.util.Arrays;

public class FindMissingNumber {
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,5};
		int n= arr.length;
		  int expected = (n + 1) * (n + 2) / 2;
		int current=0;
		for (int i = 0; i<arr.length; i++) {
			current = current + arr[i];
		}
		int streamSum = Arrays.stream(arr).sum();
		int missing = expected - current;
		
		System.out.println(missing);
		
	}

}
