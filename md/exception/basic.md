# Java Exception Handling In-Depth Guide

## 1. Throwable - The Root of Exception Hierarchy

In Java, `Throwable` is the root class of the entire exception hierarchy. It has two main subclasses:

- **Error**: Represents serious problems that a reasonable application should not try to catch (e.g., `OutOfMemoryError`)
- **Exception**: Represents conditions that a reasonable application might want to catch

```
                       Throwable
                      /        \
                    Error    Exception
                                /    \
                           Checked   RuntimeException (Unchecked)
```

## 2. Exception & Its Types

Exceptions in Java are primarily divided into two categories:

### Checked Exceptions
- Must be either caught or declared in the method signature using `throws`
- Extend `Exception` but not `RuntimeException`
- Examples: `IOException`, `SQLException`, `ClassNotFoundException`

### Unchecked Exceptions
- Do not need to be explicitly caught or declared
- Include `RuntimeException` and its subclasses, and all `Error` classes
- Examples: `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`

## 3. Types of Exceptions

1. **Standard Exceptions**: Built into Java (like those mentioned above)
2. **Custom Exceptions**: User-defined exceptions that extend either `Exception` (for checked) or `RuntimeException` (for unchecked)

## 4. Syntax Edge Cases

### Try-Catch-Finally Block
```java
try {
    // Code that might throw an exception
} catch (SpecificException e) {
    // Handle specific exception
} catch (Exception e) {
    // Handle any other exceptions
} finally {
    // Always executed
}


try {
    throw new RuntimeException();
}
finally {
    // this will work and execute code inside finally
    // because we are throwing RuntimeException
}


try {
    throw new Exception();
}
finally {
    // this will not work and not execute code inside finally
    // because we are throwing Exception
}
```

Edge cases:
- A `try` block must be followed by at least one `catch` block or a `finally` block
- Multiple `catch` blocks must be ordered from most specific to most general exception types
- The `finally` block executes even if an exception is thrown or a `return` statement is reached
- Since Java 7, you can use multi-catch: `catch (IOException | SQLException e)`

### Unreachable Code in Try-Finally

If you have an unconditional return, throw, break, or continue statement in the try block, the code after it becomes unreachable, but the finally block will still execute:

```java
try {
    return true;  // This will not immediately return
    // Unreachable code - compiler error
} finally {
    System.out.println("This always executes, even after a return");
}
// The method returns after finally executes
```

The same applies to infinite loops or System.exit() calls:

```java
try {
    while(true) { } // Infinite loop
    // Unreachable code - compiler error
} finally {
    // This will never execute if the loop is truly infinite
}
```

With System.exit():
```java
try {
    System.exit(0);
    // Unreachable code - compiler error
} finally {
    // This will NOT execute when System.exit() is called
}
```

## 5. Throws Keyword

The `throws` keyword is used in method declarations to indicate that this method might throw certain exceptions.

```java
public void readFile() throws IOException {
    // Method implementation
}
```

### How it Behaves in Inheritance

When overriding methods, there are specific rules for the `throws` clause:

1. An overriding method can throw any unchecked exceptions
2. An overriding method can throw fewer exceptions than the parent method
3. An overriding method can throw narrower (subclass) exceptions
4. An overriding method cannot throw broader or new checked exceptions

### Detailed Example: Parent Reference, Child Object

```java
class Parent {
    void methodA() throws IOException {}
    void methodB() throws Exception {}
    void methodC() {}
}

class Child extends Parent {
    // Valid: throws same exception
    @Override
    void methodA() throws IOException {}
    
    // Valid: throws narrower exception
    @Override
    void methodB() throws IOException {}
    
    // Valid: throws new unchecked exception
    @Override
    void methodC() throws RuntimeException {}
}
```

Now, let's see what happens with different reference/object combinations:

```java
Parent p = new Child();

// Case 1: Same exception in parent and child
try {
    p.methodA();  // Compile-time: must handle IOException
} catch (IOException e) { }  // This works fine

// Case 2: Narrower exception in child
try {
    p.methodB();  // Compile-time: must handle Exception
} catch (IOException e) { }  // Compile Error! Must catch Exception
                             // Even though at runtime only IOException is possible

// Case 3: New unchecked exception in child
p.methodC();  // No compile-time requirement to catch
              // But at runtime, may throw RuntimeException
```

Invalid scenarios that won't compile:

```java
class BadChild extends Parent {
    // ERROR: Cannot throw broader checked exception
    @Override
    void methodA() throws Exception {}
    
    // ERROR: Cannot throw new checked exception
    @Override
    void methodC() throws IOException {}
}
```

Runtime behavior:
- The actual object's implementation determines which exceptions might be thrown
- Compile-time checking is based on the reference type
- This can lead to situations where you must catch exceptions that won't actually occur at runtime (as in Case 2 above)

### Child Reference, Child Object

With a child reference, the compiler uses the child's declared exceptions:

```java
Child c = new Child();
try {
    c.methodB();  // Compile-time: must handle IOException (not Exception)
} catch (IOException e) { }  // This is sufficient
```

## Multi-Catch Block (Java 7+)
```java
try {
    // code
} catch (IOException | SQLException e) {
    // Handle both exception types the same way
    // The variable e is effectively final in this block
}
```