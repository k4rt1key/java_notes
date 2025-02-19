package codes.practicals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Q22 {
    public static void main(String[] args) {

        Predicate<Integer> greaterThan10 = i -> i > 10;

        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
        for(int i : arr) {
            if (greaterThan10.test(i)) {
                System.out.println(i);
            }
        }
    }

}
