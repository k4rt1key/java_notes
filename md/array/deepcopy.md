## 1. Array References vs Clone

### Understanding Different Ways to Copy Arrays

```java
class Person {
    String name;
    Person(String name) { 
        this.name = name; 
    }
}

// Three different approaches to copying arrays
Person[] original = {new Person("Alice"), new Person("Bob")};

// Approach 1: Direct Reference
Person[] reference = original;

// Approach 2: Clone
Person[] cloned = original.clone();

// Approach 3: New Array
Person[] newArray = new Person[2];
newArray[0] = original[0];
newArray[1] = original[1];
```

### What Happens When We Modify Arrays?

```java
// Case 1: Modifying Array Structure (changing array elements)
original[0] = new Person("Charlie");

System.out.println(reference[0].name);  // Prints "Charlie" ✗ - Changed!
System.out.println(cloned[0].name);     // Prints "Alice"  ✓ - Protected!
System.out.println(newArray[0].name);   // Prints "Alice"  ✓ - Protected!

// Case 2: Modifying Object Content (changing object properties)
original[1].name = "David";

System.out.println(reference[1].name);  // Prints "David" ✗ - Changed!
System.out.println(cloned[1].name);     // Prints "David" ✗ - Changed!
System.out.println(newArray[1].name);   // Prints "David" ✗ - Changed!
```

### Why This Happens?

1. **Direct Reference (`reference = original`)**
   - Creates no copy
   - Just another pointer to same memory location
   - Any changes to array or objects affect both variables

2. **Clone (`clone()`)**
   - Creates new array (shallow copy)
   - Copies references to same objects
   - Protected against array structure changes
   - NOT protected against object content changes

3. **New Array**
   - Creates new array
   - Copies references to same objects
   - Behaves same as clone()
   - NOT protected against object content changes
