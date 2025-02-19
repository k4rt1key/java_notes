## String builder 

- It's not thread safe so that's why it's faster and not synchronized
- Used in single threaded environment

```java

// creates empty string builder with capacity of 16 characters
StringBuilder sb = new StringBuilder();
System.out.println(sb.capacity());

sb.append("hello");
sb.insert(5,"world"); // from 5th index insert "world"
sb.delete(5,11); // from 5th index and till before 11th index
sb.reverse(); // reverse the string

String s = sb.toString();
// when .toString() called string builder will store String object with given value in the heap
// but string is not stored in scp it's in the heap
// for storing string in scp we need to call .intern()
```

## Similarities between string builder and buffer

- Both use the same default capacity (16)
- Both expand their capacity in the same way
- Both handle setLength() the same way
- Both maintain length and capacity separately