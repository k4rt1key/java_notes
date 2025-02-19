package codes.practicals;

interface Calculator {
    int calculate(int a, int b);
}

public class Q23 {
    public static void main(String[] args) {
       Calculator add = (a,b) -> a+b;
       Calculator sub = (a,b) -> a-b;
       Calculator div = (a,b) -> a/b;
       Calculator mul = (a,b) -> a*b;

        System.out.println(sub.calculate(1,3));
    }


}
