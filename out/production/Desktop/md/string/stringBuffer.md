## String buffer

- It's thread safe so it's slower so it's synchronized 
- Used in multi threaded environment

```java
StringBuffer sbuf = new StringBuffer("kartikey");

sb.append("hello");
sb.insert(5,"world"); // from 5th index insert "world"
sb.delete(5,11); // from 5th index and till before 11th index
sb.reverse(); // reverse the string
```