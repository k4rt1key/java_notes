# Predicate 

- Predicate is **functional interface** that represents a function which takes input T and gives output boolean
- Example 
-

```java
// checking if number is greater than 10

import java.util.function.Predicate;

Predicate<Integer> greaterThan10 = (Integer i) -> i > 10;
boolean result = greaterThan10.test(12);
System.out.

println(result);

// checking if number is greater than 10 and less than 20
Predicate<Integer> greaterThan10 = (Integer i) -> i > 10;
Predicate<Integer> lessThan20 = (Integer i) -> i < 20;
Predicate<Integer> getGreaterThan10AndLessThan20 = greaterThan10.and(lessThan20).test(19);


String str = "hey";
Predicate<String> isHelloString = Predicate.isEqual(str);
System.out.println(isHelloString.test("hey")); // returns true
    System.out.println(isHelloString.test("hello")); // returns false
```