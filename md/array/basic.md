# Java Arrays

## Default Types and Initialization

### Primitive Arrays
```java
byte[] byteArray;     // default: 0
short[] shortArray;   // default: 0
int[] intArray;       // default: 0
long[] longArray;     // default: 0L
float[] floatArray;   // default: 0.0f
double[] doubleArray; // default: 0.0d
char[] charArray;     // default: '\u0000'
boolean[] boolArray;  // default: false
```

### Object Arrays
```java
String[] stringArray;     // default: null
Object[] objectArray;     // default: null
Integer[] wrapperArray;   // default: null
CustomClass[] customArray; // default: null
```

## Memory Considerations

### Stack vs Heap
- Array reference is stored on the stack
- Actual array object is stored on the heap
- For primitive arrays, elements are stored contiguously in memory
- For object arrays, references to objects are stored contiguously

### Memory Usage Examples
```java
// Single-dimensional array
int[] arr = new int[10];  // 40 bytes (4 bytes × 10) + overhead

// Multi-dimensional array
int[][] matrix = new int[10][10];  // 400 bytes + overhead for references

int [] newArr [] = new int[5][]; // correct

int[] incorrect = new int[3]{1,2,3}; // if we mention {1,2,3} we can't specify size
```

### Types 

```java
Integer[] IntegerArr = new Integer[3]; // valid

int[] intArr = new Integer[3]; // compilation error
Integer[] IntegerArr2 = new int[3]; // compilation error 
int[] intArr2 = new Integer[3]; // compilation error  
```