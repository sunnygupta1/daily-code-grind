package exception;

public class ClassNotFoundException {
	
	public static void main (String args[]) {
		
		try {
			Class.forName("exception.Employee");
			System.out.println("Class loaded");
		} catch (java.lang.ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
