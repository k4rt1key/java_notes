package codes.practicals;

import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(Arrays.asList("Kartikey", "America", "Amazon", "Vaghasiya"));
        List<String> res = l.stream()
                .filter(s -> s.charAt(0) != 'A')
                .map(s -> s.toUpperCase())
                        .toList();
        for(String s : res){
            System.out.println(s);
        }
    }
}
