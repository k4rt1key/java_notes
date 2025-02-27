package codes.threading;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class X {
    private String name;
    private Integer age;

    X(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

}

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        Stream<Integer> listStream = list.stream();
        Map<String, Integer> numberMap = list.stream()
                .collect(Collectors.toMap(
                        num -> String.valueOf(num),  // Convert Integer to String
                        num -> num,                  // Value remains Integer
                        (existing, newValue) -> newValue  // Keeps the last occurrence
                ));
        System.out.println(numberMap);

        List<String> words = Arrays.asList("Hello", "World");

        List<Character> letters = words.stream()
                .flatMap(word -> word.chars().mapToObj(m -> (char)m))
                .collect(Collectors.toList());

        Predicate<Integer> isEven = (y) -> y%2 == 0 ;
        System.out.println(listStream.allMatch(isEven));

    }
}
