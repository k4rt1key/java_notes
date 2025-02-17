package codes;

import java.io.IOException;

/*
 * Throwable : root class which has 2 subclass
 * 1) Error 
 * 2) Exeption
 *      - Checked ( Exception class ) 
 *          - This type of exeption must be handle through try-catch otherwise it will give compilation error
 *          - Example : IOException, FileNotFoundException, SQLException, ...
 *      - Unchecked ( RuntimeException class )
 *          - NullPointerException, IndexOutOfBoundsException, StackOverflowError, OutOfMemoryError
 *          - Will not checked during compiletime   
 * 
 * 
 */

public class ExceptionHandling {

    public static void exeptionDemo(){

        /*
         * For catch block if we position catch(SuperClassException e){} on top of catch(SubClassException e){}...
         * It will give compile time error
         * 
         * E) Unreachable catch block for FileAlreadyExistsException. It is already handled by the catch block for IOException
         * 
         */
        try {
            int a = 10/0;
            // OR
            throw new IOException("IO EXCEPTION");
        } 
        catch(ArithmeticException e){
            System.out.println(e.getMessage()); // which will print divide by zero
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            try{
                int a = 10/0;
            } catch(ArithmeticException ee){
                System.out.println(ee.getMessage());
            }
        } 
    }


    public static int finallyDemo(){
        /*
         * 
         */

        try{
            int i = 10/0;
            return 1; // return, break or any other exception thrown cannot stop execution of code written in finally{} block
        }  
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return 2; // return, break or any other exception thrown cannot stop execution of code written in finally{} block
        } 
        finally{
            System.out.println("finally block");
            try{
              int i = 10/0;
            } catch(ArithmeticException e){
               System.out.println(e.getMessage());
            } finally {
               System.out.println("nested finally block");
            }
        }
    }

    public static void customException(){
        
            try{
                Throwable cause = new ArithmeticException("/ by 0");
                CustomException ce = new CustomException("Something went wrong", cause);
                throw ce;
            }
            catch(CustomException ce){
                System.out.println(ce.getCause());
            };
        
    }

    public static void throwsException() throws Exception, RuntimeException{
        /*
         * throws is the part of method signature
         * When to use throws : 
         *      - when a method might throw a checked exception and we don’t want to handle it within the method.
         *      - 
         */
    }

    static {

    }
    public static void main(String[] args) {
        customException(); // it will return 2
        // because finally overrides try{} block's return
    }   
}


class CustomException extends Exception {  

    CustomException(String m){
        super(m);
    } 

    CustomException(String m, Throwable cause){
        super(m,cause);
    }

    CustomException(Throwable cause){
        super(cause);
    }
}
