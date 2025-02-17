# Java Arrays: Type Casting and Copying Guide

## 1. Array Type Casting Rules

### Basic Type Casting Principle
The type casting in arrays follows the same inheritance rules as regular objects, but with additional restrictions.

```java
// Basic principle: You can assign a more specific type to a more general type
Object obj = new Integer(5);         // OK - regular object casting
Object[] objArr = new Integer[5];    // OK - array casting follows same rule
```

### Valid Type Casting Scenarios

```java
// Scenario 1: Upcasting (always safe)
Integer[] integerArray = new Integer[5];
Object[] objectArray = integerArray;    // OK - Integer is-a Object

// Scenario 2: Downcasting to original type
Object[] objArray = new Integer[5];
Integer[] backToInteger = (Integer[]) objArray;  // OK - was originally Integer[]

// Scenario 3: Interface implementation
String[] strArray = new String[5];
CharSequence[] csArray = strArray;      // OK - String implements CharSequence
```

### Invalid Type Casting Scenarios

```java
// Scenario 1: Incompatible types
Object[] objArray = new Integer[5];
Double[] doubleArray = (Double[]) objArray;  // Runtime ERROR - ClassCastException
// This fails because the actual array is of Integer type

// Scenario 2: Primitive type mismatch
int[] intArray = new int[5];
double[] doubleArray = (double[]) intArray;  // Runtime ERROR - ClassCastException
// Primitive arrays cannot be cast to different primitive types

// Scenario 3: Different array dimensions
String[] singleDim = new String[3];
String[][] doubleDim = (String[][]) singleDim;  // Runtime ERROR - ClassCastException
// Cannot cast between different dimensions
```

### Nested Array Casting

```java
// Valid nested array casting
Object[][] objMatrix = new Integer[3][4];  // OK
Integer[][] intMatrix = (Integer[][]) objMatrix;  // OK

// Invalid nested array casting
Object[][] objMatrix = new Integer[3][4];
Double[][] doubleMatrix = (Double[][]) objMatrix;  // Runtime ERROR

// Partial array initialization
Integer[][] matrix = new Integer[3][];  // Only first dimension is initialized
matrix[0] = new Integer[4];            // Initialize second dimension
```


## 2. Primitive vs Wrapper Type Casting

### Primitive Type Casting

```java
// Widening Conversion (Implicit) - Always works ✓
byte b = 10;          // 1 byte
short s = b;          // 2 bytes
int i = s;            // 4 bytes
long l = i;           // 8 bytes
float f = l;          // 4 bytes (but can represent larger numbers)
double d = f;         // 8 bytes

// Narrowing Conversion (Explicit) - May lose data ⚠️
double d2 = 100.5;
float f2 = (float) d2;   // Need explicit cast
long l2 = (long) f2;     // Need explicit cast
int i2 = (int) l2;       // Need explicit cast
```

### Wrapper Type Conversion

```java
// DOES NOT WORK ✗
Integer i = 10;
Double d = i;         // Compilation Error!
Long l = i;           // Compilation Error!

// WHY? Because Integer, Double, Long are different classes
// They don't inherit from each other!

// What works? ✓
Integer i = 10;
Double d = i.doubleValue();    // Using conversion method
Long l = i.longValue();        // Using conversion method

// Auto-unboxing and boxing
int primitive = i;              // Auto-unboxing
double primitiveDouble = i;     // Auto-unboxing then widening
Double wrapperDouble = primitive;  // Widening then auto-boxing
```

### Type Hierarchy Visualization

![typecasting](/Images/typecast.jpg)


