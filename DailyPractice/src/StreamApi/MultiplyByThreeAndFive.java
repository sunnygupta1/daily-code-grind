package StreamApi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplyByThreeAndFive {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 20).boxed().toList();

        // Multiply by 3
        List<Integer> multipliedBy3 = list.stream().map(x -> x * 3).toList();

        // Multiply by 5
        List<Integer> multipliedBy5 = list.stream().map(x -> x * 5).toList();
        
        

        // Combined output using flatMap
        List<Integer> combined = list.stream()
            .flatMap(n -> List.of((n*3),
                                  (n*5)).stream())
            .toList();
        
        Map<Integer, List<Integer>> combinedMap = list.stream()
        	    .collect(Collectors.toMap(
        	        n -> n,
        	        n -> List.of(n * 3, n * 5)
        	    ));

        	System.out.println(combinedMap);

        
        

        System.out.println("Original: " + list);
        System.out.println("Multiplied by 3: " + multipliedBy3);
        System.out.println("Multiplied by 5: " + multipliedBy5);
        System.out.println("Combined (3x and 5x): " + combined);
    }
}
