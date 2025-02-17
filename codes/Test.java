package codes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLClientInfoException;

class A extends Exception{
    void funa() throws IOException{}
    void funb() throws Exception{}
}

class B extends A {
    void funa() throws FileNotFoundException{}
    void funb() throws IOException{}
}

class Test {

    public static int main2(String[] args) {
        try{
             System.out.println("try");
             throw new Exception("runtime");
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
            return 2;
        } finally{
            return 3;
        }

    }
    public static void main(String[] args) {
           System.out.println(main2(args));        
    }

}