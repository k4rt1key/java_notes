package codes.practicals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13 {
    static void print(List<?> list){
        for(Object l : list){
            System.out.println(l);
        }
    }


    public static void main(String[] args) {
//        List<?> l = new ArrayList<>();
//        we can't add anything except null due to ?
//        example l.add(10); // compiler error

        // T vs ?
        // T =>
        //  T is a type parameter that you explicitly declare
        //  It maintains the specific type throughout the class/method
        // ? =>
        //  ? Represents an unknown type
        //  You can't refer to the actual type later in the code
        // With ? - you can only read
//        public void printFirst(List<?> list) {
//            System.out.println(list.get(0));
//            list.set(0, something); // Won't compile!
//        }


        List<?> l = Arrays.asList("hey", 0, 0.0000000000);

        print(l);
    }
}
