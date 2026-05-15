package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		String fileName = "/Users/sunny/Documents/Java Learning/serialization practice/serial.txt";
		FileInputStream fis= new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//here we are trying to read the obj... agr student.class file nhi mili to class not found exception ayaga.
		Student s = (Student) ois.readObject();
		System.out.println(s.getAddress());

		
	}

}
