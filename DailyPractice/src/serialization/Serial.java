package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    private static final long serialVersionUID = 1L;

    public static void main(String args[]) throws IOException {
        // creating a Student object to serialize
        Student s = new Student("Sunny", 26, "sg@gamil", "ayodhya");
        
        // absolute path where the serialized file will be created
        String fileName = "/Users/sunny/Documents/Java Learning/serialization practice/serial.txt";
        
        // FileOutputStream is used to open a file at the given path
        FileOutputStream fos = new FileOutputStream(fileName);
        
        // ObjectOutputStream wraps fos to allow writing objects into the file
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        // writeObject() method serializes the Student object and stores it in the file
        oos.writeObject(s);
        
        // closing streams to release resources
        oos.close();
        fos.close();
        
        System.out.println("Object has been serialized and stored in: " + fileName);
    }
}
