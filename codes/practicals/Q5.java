package codes.practicals;

import java.util.Arrays;

public class Q5 {

    /*
     * Streams are used for process collections of objects in functional way ( like js does )
     * Features : it is parallel and simple syntax
     */
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int sum = Arrays.stream(numbers) // Creates an IntStream
                .sorted()
                .filter(n -> n % 2 != 0) // Filter out even numbers
                .map(n -> n * n) // Square each number
                .sum(); // Sum all values (terminal operation for IntStream)

        System.out.println("Sum of squared odd numbers: " + sum);
    }
}
