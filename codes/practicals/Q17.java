package codes.practicals;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q17 {
    public static void appendToFile(String content, String name) throws IOException {
        FileWriter fileWriter = new FileWriter(name);
        fileWriter.append(content);
    }

    public static void main(String[] args){
        try {
            appendToFile("hey", "output.txt");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
