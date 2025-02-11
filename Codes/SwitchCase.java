package Codes;

public class SwitchCase {

    /* NOTES
     * === 1 === If we can't put break; statement at the end of each case and...
     * For x = 1, case 1: statement is true then it will execute all the code of
     * case 1:, case 2:, case 3:,..., default:
     * till it reaches to break statement
     * So it will print ==> ONE TWO THREE RANDOM
     * 
     * === 2 === Position of default does not matter
     * 
     * === 3 === We can have only one default in one switch case
     */
    public static void main(String[] args) {
        int x = 0;
        switch (x) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            default:
                System.out.println("DEFAULT");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
        }

    }
}
