package codes.practicals;

import java.io.*;
import java.util.Date;

class Logger{
    private Logger(){}
    private static Logger instance = null;
    BufferedWriter writer;

    {
        try {
            writer = new BufferedWriter(new FileWriter("log.txt"));
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void log(String m){
        try{
            writer.append(m + "\n");
            writer.flush();
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
}
public class Q10 {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("hey");
        logger.log("hello");
    }

}
