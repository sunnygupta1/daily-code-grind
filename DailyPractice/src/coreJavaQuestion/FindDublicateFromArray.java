package coreJavaQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDublicateFromArray {
	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 5, 8, 8, 2 };
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {

			if (!set.add(arr[i])) {
				System.out.println(arr[i]);
			}

		}
		
		int arr2[] = Arrays.stream(arr).distinct().toArray();
		System.out.println("remove dublicate");
		for(int i:arr2) {
			System.out.println(i);
		}
	}
}
