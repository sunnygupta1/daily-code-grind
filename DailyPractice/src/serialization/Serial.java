package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Serial {
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) throws IOException {
		Student s = new Student("Sunny", 26, "sg@gamil", "ayodhya");
		
		
		//given the path where we need to create file
		String fileNname = "/Users/sunny/Documents/Java Learning/serialization practice/serial.txt";
		
		//used to create file on specific path
		FileOutputStream fos = new FileOutputStream(fileNname);
		//used to test compiler that this fos 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		    
			//used write method to serialize student obj
			oos.writeObject(s);
			fos.close();
			oos.close();
			System.out.println("now object is stated in");
			
	}

}
