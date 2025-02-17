## Edge cases

### 1. Null Reference Cases - Extended

```java
// Basic Null Cases
int[] arr1 = null;
arr1[0] = 1;                // NullPointerException
arr1.length;                // NullPointerException
Arrays.sort(arr1);          // NullPointerException

// Array of Nulls
Integer[] nums = new Integer[5];     // All elements are null
nums[0]++;                          // NullPointerException
nums[0] = nums[1] + nums[2];       // NullPointerException

// Multi-dimensional Array Nulls
Integer[][] matrix = new Integer[3][];
System.out.println(matrix[0]);      // null
matrix[0] = new Integer[3];         // OK
matrix[0][0] = 1;                   // OK now
matrix[1][0] = 1;                   // NullPointerException (matrix[1] still null)

// Tricky Null Cases
Object[] objArr = new String[3];
objArr[0] = null;                   // OK - null is valid for any reference type
objArr = null;                      // OK - array reference can be null
Arrays.asList(objArr);              // NullPointerException

// Method Parameter Null Cases
public void processArray(int[]... arrays) {
    for (int[] array : arrays) {    // arrays can't be null, but elements can be
        if (array == null) continue; // Need to check individual arrays
        // Process array
    }
}
```
