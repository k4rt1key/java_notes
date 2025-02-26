package codes;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Coll2 {

    public static void main(String[] args) throws InterruptedException {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        LinkedHashMap<Integer, Integer> x = new LinkedHashMap<>(20,0.87f,true);
        x.put(1,2);
        x.put(2,3);
        x.put(3,4);
        System.out.println(x);
        x.put(2,2);
        System.out.println(x);

    }
}
