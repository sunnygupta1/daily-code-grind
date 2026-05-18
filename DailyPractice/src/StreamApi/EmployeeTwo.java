package StreamApi;

import java.util.List;

public class EmployeeTwo {
	 private String name;
	    private List<String> skills;

	    public EmployeeTwo(String name, List<String> skills) {
	        this.name = name;
	        this.skills = skills;
	    }

	    public String getName() { return name; }
	    public List<String> getSkills() { return skills; }

		@Override
		public String toString() {
			return "EmployeeTwo [name=" + name + ", skills=" + skills + "]";
		}

	    
	
}
