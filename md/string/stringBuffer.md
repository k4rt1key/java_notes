## String buffer

- It's thread safe so it's slower so it's synchronized 
- Used in multi threaded environment
- ```java
  public final class StringBuffer
  extends Object
  implements Serializable, Comparable<StringBuffer>, CharSequence
  ```
- Every string buffer has a capacity.
- It is not necessary to allocate a new internal buffer array. If the internal buffer overflows, it is automatically made larger.
- passing a null argument to a constructor or method in this class will cause a NullPointerException to be thrown.

```java
StringBuffer sbuf = new StringBuffer("kartikey");

sb.append("hello");
sb.insert(5,"world"); // from 5th index insert "world"
sb.delete(5,11); // from 5th index and till before 11th index
sb.reverse(); // reverse the string
```

## How to clear sb

```java
StringBuffer sb = new StringBuffer();

sb.append("ababababababababab");
System.out.println(sb.toString() + "...Capacity:" + sb.capacity() + "...Length:" + sb.length());
sb.setLength(0); // for clearing out sb
System.out.println(sb.toString() + "...Capacity:" + sb.capacity() + "...Length:" + sb.length());
sb.append("small");
System.out.println(sb.toString() + "...Capacity:" + sb.capacity() + "...Length:" + sb.length());
```