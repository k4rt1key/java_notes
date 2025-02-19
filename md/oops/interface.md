# Interface - Abstract class - Derive class
# Static method behaviour
##  Case 1

```java
interface M {
    public static void log() {
        System.out.println("M");
    }
}

abstract class A {
    public static void log() {
        System.out.println("N");
    }
}

class MyClass extends A implements M {

}

public class Test {
    public static void main(String[] args) {
        M obj1 = new MyClass();
        obj1.log(); // gives error
        M.log(); // Prints M

        A obj2 = new MyClass();
        obj2.log(); // Prints N

        MyClass obj3 = new MyClass();
        obj3.log(); // Prints N
    }
}
```

## Case 2

```java
interface M {
    public static void log() {
        System.out.println("M");
    }
}

abstract class A {
    public static void log() {
        System.out.println("N");
    }
}

class MyClass extends A implements M {
    public static void log() {
        System.out.println("O");
    }
}

public class Test {
    public static void main(String[] args) {
        M obj1 = new MyClass();
        obj1.log(); // gives error
        M.log(); // Prints M

        A obj2 = new MyClass();
        obj2.log(); // Prints N

        MyClass obj3 = new MyClass();
        obj3.log(); // Prints O
    }
}
```
## IMP
- static method defined in interface is only accesible by interface name not object
- But static variables can be accesible by interface reference and interface name both
## IMP ENDS
- if interface has static method, abstract class has static method then MyClass can overload that static method
- if abstract class has abstract or normal method we cannot override it in the Child class using static method
- but we can overload
```java
abstract class A {
    public void log() {
        System.out.println("N");
    }
}

class MyClass extends A {
    public static void log(int a) {
        System.out.println("O");
    }
}
```