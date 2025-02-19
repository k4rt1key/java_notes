
## Important Array Methods and Operations

### System.arraycopy()
```java
int[] source = {1, 2, 3, 4, 5};
int[] dest = new int[5];
System.arraycopy(source, 0, dest, 0, 5);
```

### Arrays Utility Class Methods
```java
// Binary Search
int[] arr = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(arr, 3);  // Returns 2

// Sorting
int[] unsorted = {5, 2, 8, 1, 9};
Arrays.sort(unsorted);

// Filling
int[] arr = new int[5];
Arrays.fill(arr, 42);

// Comparing
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
boolean isEqual = Arrays.equals(arr1, arr2);  // true
```
## StringBuilder Examples

### Basic Operations
```java
StringBuilder sb = new StringBuilder();

// Append examples
sb.append("Hello");              // sb = "Hello"
sb.append(" ");                  // sb = "Hello "
sb.append("World");             // sb = "Hello World"
sb.append(2023);                // sb = "Hello World2023"
sb.append('!');                 // sb = "Hello World2023!"

// Insert examples
sb = new StringBuilder("Hello World");
sb.insert(5, " Beautiful");     // sb = "Hello Beautiful World"
sb.insert(0, "Say ");           // sb = "Say Hello Beautiful World"

// Delete examples
sb.delete(0, 4);                // sb = "Hello Beautiful World"
sb.deleteCharAt(5);             // sb = "HelloBeautiful World"

// Replace examples
sb.replace(5, 14, "Amazing");   // sb = "Hello Amazing World"

// Reverse example
sb.reverse();                   // sb = "dlroW gnizamA olleH"

// Information methods
int length = sb.length();       // Gets current length
int capacity = sb.capacity();   // Gets current capacity
char ch = sb.charAt(5);         // Gets character at index 5
String sub = sb.substring(6, 13); // Gets substring from index 6 to 12
```

## StringBuffer Examples
```java
StringBuffer buffer = new StringBuffer();

// Thread-safe operations
buffer.append("Hello");         // buffer = "Hello"
buffer.append(" ");             // buffer = "Hello "
buffer.append("World");         // buffer = "Hello World"

// Synchronized methods
synchronized(buffer) {
    buffer.insert(0, "Safe ");  // buffer = "Safe Hello World"
    buffer.reverse();           // buffer = "dlroW olleH efaS"
}
```

## Array Examples

### Sorting Arrays
```java
// Basic sorting
int[] numbers = {5, 2, 8, 1, 9};
Arrays.sort(numbers);
// numbers = {1, 2, 5, 8, 9}

// Partial sorting
int[] partialSort = {5, 2, 8, 1, 9};
Arrays.sort(partialSort, 1, 4);  // Sort from index 1 to 3
// partialSort = {5, 1, 2, 8, 9}

// Custom comparator sorting
String[] words = {"banana", "apple", "Cherry", "date"};
Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
// words = {"apple", "banana", "Cherry", "date"}
```

### Searching Arrays
```java
// Binary search
int[] sortedNumbers = {1, 2, 5, 8, 9};
int index = Arrays.binarySearch(sortedNumbers, 5);  // returns 2
int notFound = Arrays.binarySearch(sortedNumbers, 6);  // returns negative value

// Range search
int rangeIndex = Arrays.binarySearch(sortedNumbers, 0, 3, 2);  // searches in range 0-2
```

### Array Manipulation
```java
// Copying arrays
int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOf(original, original.length);
int[] extended = Arrays.copyOf(original, 7);  // {1, 2, 3, 4, 5, 0, 0}
int[] portion = Arrays.copyOfRange(original, 1, 4);  // {2, 3, 4}

// System.arraycopy example
int[] src = {1, 2, 3, 4, 5};
int[] dest = new int[5];
System.arraycopy(src, 0, dest, 0, src.length);
// dest = {1, 2, 3, 4, 5}

// Filling arrays
int[] fillArray = new int[5];
Arrays.fill(fillArray, 10);  // {10, 10, 10, 10, 10}
Arrays.fill(fillArray, 1, 4, 20);  // {10, 20, 20, 20, 10}
```

### Array Comparison
```java
// Simple array comparison
int[] array1 = {1, 2, 3};
int[] array2 = {1, 2, 3};
boolean isEqual = Arrays.equals(array1, array2);  // true

// Nested array comparison
int[][] nested1 = {{1, 2}, {3, 4}};
int[][] nested2 = {{1, 2}, {3, 4}};
boolean isDeepEqual = Arrays.deepEquals(nested1, nested2);  // true
```

### Array Conversion
```java
// Convert array to List
String[] strArray = {"apple", "banana", "cherry"};
List<String> list = Arrays.asList(strArray);

// Convert array to Stream
int[] numbers = {1, 2, 3, 4, 5};
IntStream stream = Arrays.stream(numbers);

// Array to String conversion
String simpleStr = Arrays.toString(numbers);  // "[1, 2, 3, 4, 5]"
int[][] matrix = {{1, 2}, {3, 4}};
String deepStr = Arrays.deepToString(matrix);  // "[[1, 2], [3, 4]]"
```

### 2D Array Operations
```java
// Creating 2D array
int[][] matrix = new int[3][4];

// Initializing 2D array
int[][] initialized = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Accessing and modifying 2D array
matrix[0][0] = 1;  // Set value at first row, first column
int value = matrix[1][2];  // Get value from second row, third column

// Iterating over 2D array
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = i + j;
    }
}
```

## Common Patterns and Best Practices

### Efficient String Building
```java
// Good practice: Set initial capacity if known
StringBuilder sb = new StringBuilder(1000);

// Good practice: Chain operations
StringBuilder chain = new StringBuilder()
    .append("Hello")
    .append(" ")
    .append("World")
    .append("!");

// Bad practice: Don't use + operator in loops
String result = "";
for (int i = 0; i < 1000; i++) {
    result += i;  // Inefficient
}

// Good practice: Use StringBuilder in loops
StringBuilder efficient = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    efficient.append(i);
}
```

### Safe Array Operations
```java
// Check bounds before access
int[] arr = {1, 2, 3};
if (index >= 0 && index < arr.length) {
    int value = arr[index];
}

// Safe resizing
arr = Arrays.copyOf(arr, arr.length * 2);

// Null checking
if (arr != null && arr.length > 0) {
    // Process array
}
```
