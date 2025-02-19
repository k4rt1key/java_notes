package codes.practicals;

import java.io.*;

class Student implements Serializable {
    String name;
    String rollNumber;
    int age;
    Student(){}
    Student(String name, String rollNumber, int age){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }


}

public class Q15 {
    // What's NOT serializable:

    // Static fields (they belong to class, not object)
    // Transient fields
    // System-level resources (file handles, threads, etc.)
    // Inner classes that don't implement Serializable
    // Objects with references to non-serializable objects (unless marked transient)


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{

        Student s = new Student("kartikey", "21BCP141", 21);

        FileOutputStream outStream = new FileOutputStream("student.sar");
        FileInputStream inputStream = new FileInputStream("student.sar");

        ObjectOutputStream objOutStream = new ObjectOutputStream(outStream);
        objOutStream.writeObject(s);

        ObjectInputStream objInStream = new ObjectInputStream(inputStream);
        Object clonedStudent = objInStream.readObject();

        System.out.println("a" + 10 + 20);
    }
}
