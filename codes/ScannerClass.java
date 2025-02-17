package codes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first int : ");
        int f = sc.nextInt();
        System.out.println("enter second int : ");
        int s = sc.nextInt();

        try {
            if(f < 0 || s < 0 ){
                throw new InputMismatchException("Only Positive numbers are allowed");
            }

            int result = f / s;

            System.out.println(result);

        } catch(InputMismatchException  ie){
            System.out.println(ie.getMessage());
        }  catch( ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
    }
}
