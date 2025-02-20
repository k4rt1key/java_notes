# auto boxing and unboxing 

## Rules 


In case of overloaded methods if the compiler is not able to find a method with exact parameters then the compiler will take method resolution on the following priority:

- first, the compiler will apply widening e.g. convert int to long.
- if no match is found, then the compiler will apply autoboxing/unboxing to find a matching method signature e.g. convert int to Integer.
- if no match is found, then the compiler will search for the method signature with a variable-length argument e.g. find method with int… argument type.

In case of overloaded methods if the compiler is not able to find a method with exact parameters then the compiler will take method resolution on the following priority:

```
public class Test {
public static void main(String[] args) {
    int i = 10;
    m1(i);   //Test.java:4: error: incompatible types: int cannot be converted to Long
}
public static void m1(Long i){...}
}
```

## What is RIWO (Read Indirectly Write Only) state?

```java
class A{
    void fun(){
        System.out.println(a); // valid
    }
    
    static {
        System.out.println(a);// compile error RIWO
    }
    
    static int a;
    
    static {
        System.out.println(a); // valid
    }
}
```


## NOTE 
- If the corresponding class is public then only the compiler will generate a public constructor otherwise it will generate <default> constructor only.
```java
public MyClass(){
    super();
}
```

## NOTE
