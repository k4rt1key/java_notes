package codes.practicals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q18 {

    public static void main(String[] args)  {
        List<Integer> l =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Optional<Integer> res = l.stream()
                .filter(x -> x % 2 == 0)
                .reduce((x,y) -> y += x);

        System.out.println(res.get());
    }
}
