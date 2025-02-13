package codes.practicals;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            if(a < 0 || b < 0){
                throw new InputMismatchException("Only +ve numbers are allowed");
            }

            int c = a/b;
            System.out.println(c);
        } catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        } catch(InputMismatchException ie){
            System.out.println(ie.getMessage());
        }
    }    
}
