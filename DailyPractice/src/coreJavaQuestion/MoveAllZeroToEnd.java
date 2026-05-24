package coreJavaQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveAllZeroToEnd {
	
	public static void main(String args[]) {
		int arr[] = {2,3,0,9,0,9};
		
		//just back trick not correct because its sort all element and do not preserve order of non-zero
//		List<Integer> list = Arrays.stream(arr).boxed().sorted((x,y)-> y-x).toList();
		
		//first step removed all zero
		List<Integer> list = Arrays.stream(arr).boxed().filter(x->x!=0).toList();  // toList() gives immutable list.
		
		List<Integer> list2 = Arrays.stream(arr).boxed().filter(x->x!=0).collect(Collectors.toList());  // Collectors.toList() → returns a mutable ArrayList by default, so you can freely add, remove, etc.
		
		//second step conted how many zeros were present
		Long zeroCount = Arrays.stream(arr).boxed().filter(x->x==0).count();
		
		//third step add zeros to the end of list
		for(int i= 0; i<zeroCount; i++) {
			list = new java.util.ArrayList<>(list);  // making list mutable because toList() gives immutable list.
			list.add(0);
					
		}
		
		for(int i= 0; i<zeroCount; i++) {
			list2.add(0);
					
		}
		
		System.out.println(list);
		System.out.println(list2);
		
		
		
	}

}
