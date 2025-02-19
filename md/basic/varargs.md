# Understanding Java Varargs (Variable Arguments)

## What are Varargs?
Varargs (variable arguments) is a feature in Java that allows methods to accept a variable number of arguments. It provides a cleaner way to handle methods that need to accept multiple arguments of the same type without explicitly defining the number of parameters.

## Syntax and Behavior

The varargs parameter is denoted by three dots (`...`) after the type declaration:

```java
void method(int... numbers) {
    // numbers is treated as an array inside the method
    for (int num : numbers) {
        System.out.println(num);
    }
}
```

### Key Rules
1. Only one varargs parameter is allowed per method
2. The varargs parameter must be the last parameter in the method declaration
3. Internally, varargs are converted to an array

## When to Use Varargs

### Use Cases
1. When you need methods that can handle varying numbers of parameters
2. To create more flexible APIs without multiple method overloads
3. When the number of parameters isn't known at compile time

## Practical Examples

### Basic Sum Calculator
```java
public static int sum(int... numbers) {
    int total = 0;
    for (int num : numbers) {
        total += num;
    }
    return total;
}

// Usage examples:
sum();               // returns 0
sum(1);             // returns 1
sum(1, 2, 3);       // returns 6
```

### Combining Regular Parameters with Varargs
```java
public static void printDetails(String name, int age, String... hobbies) {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Hobbies: " + Arrays.toString(hobbies));
}

// Usage examples:
printDetails("John", 25);                          // No hobbies
printDetails("John", 25, "reading");              // One hobby
printDetails("John", 25, "reading", "gaming");    // Multiple hobbies
```

### Custom Message Logger
```java
public static void log(String level, String message, Object... args) {
    String formatted = String.format(message, args);
    System.out.printf("[%s] %s%n", level, formatted);
}

// Usage example:
log("INFO", "User %s logged in from %s", "john", "192.168.1.1");
```

## Common Pitfalls

1. **Overloading Confusion**: Methods with varargs can cause ambiguity in method overloading.
   ```java
   void method(int... nums) { }
   void method(Integer... nums) { }  // Compilation error due to erasure
   ```

2. **Null Handling**: Be careful when passing null to varargs methods:
   ```java
   method((String[])null);  // Passes null array
   method((String)null);    // Passes array containing null
   ```

3. **Empty Varargs**: Remember that varargs methods can be called with zero arguments:
   ```java
   method();  // Valid call, creates empty array
   ```