package codes.practicals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(){
        super();
    }
    InvalidAgeException(String s){
        super(s);
    }
}

public class Q25 {
    public static void main(String[] args) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("hello");
        writer.flush();
//        writer.close();

    }
}
