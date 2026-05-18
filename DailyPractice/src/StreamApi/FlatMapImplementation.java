package StreamApi;

import java.util.List;

public class FlatMapImplementation {
	public static void main(String args[]) {
	List<EmployeeTwo> emp = List.of(
            new EmployeeTwo("Sunny", List.of("Java", "Spring", "SQL")),
            new EmployeeTwo("Alex", List.of("Python", "Django")),
            new EmployeeTwo("John", List.of("JavaScript", "React", "Node"))
        );
	
	List<String> allSkill = emp.stream().flatMap(x->x.getSkills().stream()).toList();
	 System.out.println(allSkill);
}
}
