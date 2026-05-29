package StreamApi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OperationOnEmployee {
	
	public static void main(String args[]) {
        List<Employee> emp = List.of(
                new Employee("Sunny", 18, 2000),
                new Employee("Alex", 25, 3000),
                new Employee("John", 18, 2500)
            );

        //sort by age
		List<Employee> list = emp.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
		
		//sort by name
		List<Employee> list2 = emp.stream().sorted(Comparator.comparing(Employee::getName)).toList();
		
		
		//Now by using custom compare and compareTo method
		List<Employee> sortByName = emp.stream().sorted((x,y)-> x.getName().compareTo(y.getName())).toList(); //compareTo
		
		List<Employee> sortByAge = emp.stream().sorted((x,y)-> Integer.compare(x.getAge(), y.getAge())).toList(); //compare
		
		//Find top2 highest salary
		List<Employee> toptwoSalary = emp.stream().sorted((x,y)->y.getSalary()-x.getSalary()).limit(2).toList();
	
		//group employee by age
		Map<Integer, List<Employee>> map = emp.stream().collect(Collectors.groupingBy(x->x.getAge(), Collectors.toList()));
		System.out.println(map);
		
		//salary sum per age group
		Map<Integer, Double> map2 = emp.stream()
			    .collect(Collectors.groupingBy(Employee::getAge, Collectors.summingDouble(Employee::getSalary)));
			System.out.println(map);
			
			System.out.println(emp.stream().collect(Collectors.groupingBy(x->x.getAge(), Collectors.toList())));
			System.out.println(emp.stream().sorted((x,y)->x.getSalary()-y.getSalary()).toList());
		
	}

}
