# lamda functions
- It's a instance of **Functional Interface** (**Function**)
- Creates functions without defining a class.
- return type of lamba function is Functional Interface
- We can pass lambda expressions as objects and execute on demand.

## Implementing user defined FunctionalInterface 

```java
interface A{
    int add(int a, int b); // abstract method
}

class Test{
    A func = (int a,int b)-> {return a+b;};
    System.out.println(func.add(10,20));
}
```

```
() -> {}; // valid returns void
() -> “geeksforgeeks”; // valid returns gfg
() -> { return “geeksforgeeks”;}; .. valid returns gfg
(Integer i) -> return “geeksforgeeks” + i; // invalid 
// valid would be (Interger i) -> {return "geeksforgeeks";};
// or (Integer i) -> "geeksforgeeks";
(String s) -> {“geeksforgeeks”;}; // invalid
```