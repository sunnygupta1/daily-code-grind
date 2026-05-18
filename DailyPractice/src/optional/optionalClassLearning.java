package optional;

import java.util.Optional;

public class optionalClassLearning {

	public static void main(String args[]) {
	String a = null;
	
	//this will give null pointer exception
	//System.out.println(a.length());
	
	//.of use when value is defiantly present.. it does not allow null value
	Optional<String> name = Optional.of("sunny");
	System.out.println("1 " + name.get());
	
	Optional<String> name2 = Optional.ofNullable(null);
	 // this will give output optional.empty...and if use name2.get() then will get noSuchElement Exception..so never blindly use get().
	System.out.println("2 " + name2); 
	
	//.empty
	Optional<String> name3 = Optional.empty();
	System.out.println("3 " +name3); 
	
	if(name3.isPresent()) {
		System.out.println(name2.get());
	}
	
	//Map
	Optional<String> name4 = Optional.of("sunny");
	Optional<String> upper =
	        name.map(x->x.toUpperCase());
	System.out.println("4 "+upper.get());
	
	
	
	 // filter
    Optional<String> result =
            name.filter(n -> n.startsWith("s"));
    System.out.println(result.get());
    
    
 // orElseThrow
    String data =
            name2.orElseThrow(
                    () -> new RuntimeException("No value")
            );

    System.out.println(data);
	
	}
	
	
}
