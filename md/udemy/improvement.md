# 1 Difference between normal arithmetic operators and shorthand operators (a+=1 , a = a+1)

```java
byte a = 5;
a = a + 1;    // Error: requires explicit cast because result is int
a += 1;       // Works fine - implicit casting is done automatically
```

# 2 