package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		//for absolute path of file
		String fileName = "/Users/sunny/Documents/Java Learning/serialization practice/serial.txt";
		
		//it is used to create or open the file at path
		FileInputStream fis= new FileInputStream(fileName);
		
		//outputstream used to allow writing obj in file
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//here we are trying to read the obj... agr student.class file nhi mili to ClassNotFound exception ayaga.
		//agr class load hone ke bad i mean .class file bnne ke bad run time pr .class file accidently delete ho gyi to no class def found exception ayaga.
		Student s = (Student) ois.readObject();
		System.out.println(s.getAddress());

		
	}

}
