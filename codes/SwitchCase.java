package codes;

public class SwitchCase {

    public static void main(String[] args) {
        
    }

    /*
     * NOTES
     * === 1 === If we can't put break; statement at the end of each case and...
     * For x = 1, case 1: statement is true then it will execute all the code of
     * case 1:, case 2:, case 3:,..., default:
     * till it reaches to break statement
     * So it will print ==> ONE TWO THREE RANDOM
     * 
     * === 2 === Position of default does not matter if there is proper use of break
     * statement in every case and default
     * 
     * === 3 === We can have only one default in one switch case
     * 
     * === 4 === If no cases is turn out to be true then...
     * Java will start executing code of default
     * If default has break; then code will stop after executing code under default
     * Otherwise it will start executing code from default to case x, case y in
     * order until it finds break;
     * Like if default is on top and below default there is case 1, case 2, case 3
     * and case 2 contains break;
     * then Java will execute code under default, case 1, case 2 and stops when it
     * encounters break; in case 2
     */

    static void switchCase() {
        int x = 4;

        // We can't use float, double, boolean, Object in switch case
        switch (x) {
            case 0:
                System.out.println("ZERO");
                // break;
            case 1:
                System.out.println("ONE");
                // break;
            case 2:
                System.out.println("TWO");
                // break;
            case 3:
                System.out.println("THREE");
                // break;
            default:
                System.out.println("DEFAULT");
                // break;
        }

        System.out.println("INT SWITCH CASE CALLED");

    }

}
