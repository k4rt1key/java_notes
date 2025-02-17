
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
