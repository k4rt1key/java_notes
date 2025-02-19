package codes.practicals;

public class Q7 {
    public static void main(String[] args) {
        final String s1 = "a";
        final String s2 = "b";
        String s3 = s1 + s2;
        String s4 = "a" + "b";


        System.out.println(s3 == s4);
        System.out.println((s1+s2) == s3 );
        System.out.println((s1+s2) == s4 );
        System.out.println("a" + "b" == "ab" );

    }
}
