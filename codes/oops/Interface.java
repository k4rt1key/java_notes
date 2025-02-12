package codes.oops;

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
interface UserInterface {
    int id = 10;

}

public class Interface {
    public static void main(String[] args) {
        System.out.println("Main");
    }   
}
