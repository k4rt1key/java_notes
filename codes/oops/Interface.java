package codes.oops;


public class Interface {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.getCountDefault();
    }   
}

/*
 * Defination : defines contract which contains abstract methods, default methods,  static methods
 * Use for archiving abstraction and multiple inheritance
 * 
 * === Note ===
 * - By default all === methods === are abstract and public
 *      - if we want to keep method private we have to implement that method
 *      - only public, private, abstract, default, static and strictfp ( used for implementing IEEE 753 strict rules for float but now it's by default after java 17 ) are permitted
 * - All variables are public, static and final 
 *  - static : it's associated with interface rather than instance of implementing class
 *  - final : can't change it's value or can't override that method   
 *      - variable : 
 *          - if that variable is instance variable then we can assign that variable in constructor
 *          - otherwise must assign value during declaration 
 *      - methods : 
 *          - cannot be overriden
 *      - class : 
 *          - final class cannot be subclasses ( no inheritance allowed )
 * - Class which implements particular interface must implement all methods 
 * - Interface can extend other interfaces using **extend** keyword
 * 
 * 
 * === MARKER INTERFACE ===
 * - Which doesnot contains any instance variables and methods
 * - Empty interface 
 * 
 * === Serializable interface ===
 * - Whoever implements Serializable interface JVM allows them to be serializable
 * - Serialization : converting objects into bytestreams 
 *                  - use for saving bytestream to file, sent over network
 * 
 * === EDGE CASE 1 ===
 * interface A{ void fun(); }
 * interface B{ static void fun(){} }
 * Class C implements A,B {
 *    void fun(){}
 * }
 * 
 * psvm(){
 *      C c = new C();
 *      C.fun() // this will give compile time error that nonstatic method fun()
 *              // can not be referenced from a static contex
 *      // it means we already override fun() and it's non static
 *      // so now we are not eligible to use static methode fun() from interface B
 * 
 *      c.fun() // it will run method overridden in class C
 * }
 * 
 * 
 * === EDGE CASE 2 ===
 * interface A{ default void fun(){} }
 * class B { void fun(){} }
 * Class C extends B implements A{
 *    // If we try to extend B and implement A it will give us error 
 *    // E) The inherited method B.fun() cannot hide the public abstract method in A
 *    // This means interface's method fun() cannot be hidden due to extended class's method fun()
 * }
 */
interface CounterInterface {
    // constants
    int count = 10;

    // abstract method
    void increment();
    void decrement();

    // static method
    static void getCount(){
        System.out.println(count);
    }

    // default method
    default void getCountDefault(){
        System.out.println(count);
    }
}



class Counter implements CounterInterface {

    int count = CounterInterface.count;

    @Override
    public void increment() {
        count++;
    }

    @Override
    public void decrement() {
       count--;
    }

    @Override
    public void getCountDefault() {
        // CounterInterface.super.getCountDefault();
        System.out.println("INSIDE GETCOUNTDEFAULT OVERRIDEN METHOD");
    }

    static void getCount(){
        System.out.println("INSIDE COUNTER CLASS");
        System.out.println(CounterInterface.count);
    }


}



