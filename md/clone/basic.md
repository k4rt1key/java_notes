# .clone()
- .clone() performs shallow copy 
- It creates a new object of the same class
- Copies all fields bit-by-bit
- For primitives: creates a true copy
- For references: copies only the reference (both original and clone point to same object)
- Requires class to implement Cloneable interface

```java
class Demo implements Cloneable {
    int a = 10;
    int[] arr = new int[]{1,2,3,4,5,6,7};

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
```

- If we dont write ```implements Cloneable``` 
  - During compile time there will be no problem
  - During runtime it will throws CloneNotSupportedException
- If we dont mention ```CloneNotSupportedException```
  - During compile time there will be **an error**
  - ```java: unreported exception java.lang.CloneNotSupportedException; must be caught or declared to be thrown```

```java
  public static void main(String[] args)  throws  CloneNotSupportedException {
    Demo d = new Demo();
    Demo d2 = (Demo) d.clone();

    System.out.println("d.a => " + d.a);
    System.out.println("d.arr[0] => " + d.arr[0]);

    System.out.println("d2.a => " + d2.a);
    System.out.println("d2.arr[0] => " + d2.arr[0]);

    d.a = 20;
    d.arr[0] = 11;

    System.out.println("d.a => " + d.a);
    System.out.println("d.arr[0] => " + d.arr[0]);

    System.out.println("d2.a => " + d2.a); // this will not updated to 20 because primitive data is copied by value not reference
    System.out.println("d2.arr[0] => " + d2.arr[0]); // this will be changed to 11
}
```