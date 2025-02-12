package codes.oops;

/*
 * Two types of class 
 * 1) Abstract 
 * - Incomplete
 * - Can't create instance of this class
 * - We can just extend these classes
 * 
 * 2) Non-Abstract
 * - complete
 */

 public class AbstractClass {
    
    public static void main(String[] args) {
        
        /*
         * ` AbstractClass ab = new AbstractClass(); `
         * 
         * Above code will give compile time error
         * E) Class.java:30: error: AbstractClass is abstract; cannot be instantiated 
         */

         /*
          * If we inititalize object with Parent's reference AND
          * Want to access it's methods and instance variables THEN
          * FOR methods 
          *     - It will find for this method whether child has overriden method or not
          *     - If yes, then it will run that overriden method in Child class
          *     - Otherwise it will run Parent's method
          * FOR instance variables
          *     - Sience instance variables cannot be overriden 
          *     - It will directly look into Parent class for that instance variable
          */
    
         ParentAbstractClass p = new ChildOfParentAbstractClass();
         p.printTime();
         p.printCount();
         System.out.println("p.TIME " + p.time);

         // This will call printTime() & printCount() of Child class 
         // And time varible ( in c.time ) of Parent class

         ChildOfParentAbstractClass c = new ChildOfParentAbstractClass();
         c.printTime();
         c.printCount();
         System.out.println("C.TIME " + c.time);
         // Because we dont have any Parentclass's reference pointing to Child's reference
         // This will call all printTime() & printCount() & time variable of Child class 
    

    }
}

// ===================== PARENT ========================
abstract class ParentAbstractClass {
    ParentAbstractClass(){
        System.out.println("PARENT CLASS CONSTRUCTOR CALLED");
        count = -1;
        System.out.println("INIT COUNT TO -1");
    }
    
    int count;
    int time = 10;

    // Concrete method : method with body
    void increment(){
        System.out.println("INCREMENTING COUNT FROM " + count + " TO " + (count+1) );
        // () is neccesary for arithmetic operations otherwise it will treat 1 after + as "1"
        this.count++;
    }

    void decrement(){
        System.out.println("DECREMENTING COUNT FROM " + count + " TO " + (count-1) );
        this.count--;
    }

    void printCount(){
        System.out.println("<== PRINTING COUNT FROM PARENT CLASS PRINT METHOD ==> " + count);
    }

    void printTime(){
        System.out.println("<== PRINTING TIME FROM PARENT CLASS PRINT METHOD ==> " + time);
    }

    // Abstract Method : method without a body
    // abstract void set(int v); // Abstract Method 
    // We can't declare body using {} for abstract method
    // This method must be implemented by child classes

}

// ====================== CHILD ==========================
class ChildOfParentAbstractClass extends ParentAbstractClass {

/*
 * We must provide implementation for `void set(int v)`
 * Because ChildOfAbstractClass extends abstractclass `AbstractClass` and 
 * ChildOfAbstractClass is not abstract
 * 
 * E) Class.java:53: error: ChildOfAbstractClass is not abstract and does not override abstract method set(int) in AbstractClass
 * E) class ChildOfAbstractClass extends AbstractClass {
 * E) ^
 */


    /*
     * First Abstract class constructor will be called 
     * After Child class constructor will be called
     */
    int count;
    int time = 20;

    ChildOfParentAbstractClass(){
        System.out.println("CHILD CLASS CONSTRUCTOR CALLED");
        count = 1;
        System.out.println("INIT COUNT TO 1");
    }
    
    void set(int v){
        count = v;
    }

    void printCount(){
        System.out.println("<== PRINTING COUNT FROM CHILD CLASS PRINT METHOD ==> " + count);
    }

    void printTime(){
        System.out.println("<== PRINTING TIME FROM CHILD CLASS PRINT METHOD ==> " + time);
    }

}

