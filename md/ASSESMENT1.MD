# Why java is robust

- Robust = Strong 
- Due to strict types and exception handling 

# Main benifits of jvm

- Abstracts memory management at os level and provides mapping of logical memory and physical memory
- Security of bytecode verification

# Rules for overriding

- Same method name 
- Same signature
- Same return type
- Inheritance should be there 
- Access specifiers broadening
- Overriden methods should throw narrower checked exceptions 

# Covarient return type

- A method's return type that can be replaced by a narrower type when overridden in a subclass

# Why we can convert Long to float

- float's range is larger in comparision to long
- because it uses e^x concept 

# Anonymous array

- An anonymous array in Java is an array without a name, created and used in a single expression, primarily for passing directly as an argument to a method. It's useful for one-time array usage, avoiding the need to declare a named array variable.

# extends vs implements

- **implements**
- Ensures a class adheres to a defined contract 
- Indicates that the class will provide implementations for all methods declared in the interface 
- **extends**
- Allows a subclass to inherit properties and methods from a superclass 
- Allows a subclass to reuse and override code defined in the supertype 
- Establishes an inheritance relationship between the subclass and the superclass 

# Default imported package in java is java.lang


# return type of constructor

- A constructor does not have a return type; it is specifically designed to not return any value, not even "void" as its primary purpose is to initialize an object when it is created

# finalize()

- protected method in java.lang.Object 
- called by GC 
- to give chance to object for cleanup

```java
@Override
protected void finalize() throws Throwable {
    try {
        // Cleanup code here
    } finally {
        super.finalize();
    }
}
```

# Why array's length are fixed 

- Because we want contiguous memory allocation 
- There might be change that during runtime object created at memory location which is immediate after array's memory location
- and then if we want to increase array's size we can't assign that memory in contiguous manner

# record class 
-  They automatically generate essential methods, reducing boilerplate code They automatically generate essential methods, reducing boilerplate code
-  data are implicitly final
```java
    record Person(String name, int age) {}
```

this will convert into 

```java
public final class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double length() { return this.length; }
    double width()  { return this.width; }

    // Implementation of equals() and hashCode(), which specify
    // that two record objects are equal if they
    // are of the same type and contain equal field values.
    public boolean equals...
    public int hashCode...

    // An implementation of toString() that returns a string
    // representation of all the record class's fields,
    // including their names.
    public String toString() {...}
}
```

# string to char arr

```java
char[] chArr = new char[10];
String s = "kartikey";
s.toCharArray();
// or 
s.getChar(0, s.length(), chArr, 0);
```


# why innerClass

- if we want to assosiate one or more particular class to it's corresponding class 
- example 

class Bank

class Account, class Loan, class Dashboard


# iterator

- In Java, an iterator is an object that enables traversal through the elements of a collection, one at a time. It provides a way to access and manipulate elements in a sequential manner without exposing the underlying structure of the collection. Java offers three types of iterators:
**Iterator:**
This is the standard iterator, allowing traversal in the forward direction only. It provides three methods:
hasNext(): Checks if there are more elements to iterate.
next(): Returns the next element in the iteration.
remove(): Removes the current element from the collection (optional operation).
**ListIterator:**
This iterator extends the functionality of the standard Iterator and allows bidirectional traversal (both forward and backward) specifically for lists. It provides additional methods such as:
hasPrevious(): Checks if there are elements before the current position.
previous(): Returns the previous element in the iteration.
add(element): Inserts an element into the list.
set(element): Replaces the current element with a new element.

