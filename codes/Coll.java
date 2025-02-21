package codes;
import java.util.*;
public class Coll {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        // add 
        l.add(1);
        l.add(2);
        l.add(3);

        
        // get
        System.out.println(l.get(0)); // 1

        // set element present at 1st index to value 3
        l.set(1,3);
        System.out.println(l); // 1 3 3
        
        // remove element present at 2nd index
        l.remove(2); 
        System.out.println(l); // 1 3   

        // remove particular element 
        // ( it will remove first occurance of that object )
        Integer i = 3;
        l.remove(i); 
        System.out.println(l); // 1        

    }
}
