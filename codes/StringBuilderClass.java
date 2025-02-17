package codes;


public class StringBuilderClass {

    public static void main(String[] args) {

        new String(""); // O1
        new String(""); // O2

        String s = new String("s");
        String s32 = "s";

        String one = "three";
        System.out.println(System.identityHashCode(one));
         
        String two = "two";    
        System.out.println(System.identityHashCode(two));
         
        two = one + two; // it will create new object 
        // so mutability of string remians
        System.out.println(System.identityHashCode(two));


        StringBuilder se = new StringBuilder();
        se.append("");

        // It is slower than string builder 
        // Because all methods are synchronized, which adds overhead
        StringBuffer sb = new StringBuffer();
        sb.append("");
        


        String s1 = "aa";
        String s2 = "Abc";

        
        System.out.println(s1=s2);
        
        System.out.println(sb);
    }
}

