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
 * - By default all methods are abstract and public
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

