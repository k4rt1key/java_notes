package codes.oops;

/*
 * Method signature 
 * - method name
 * - parameters & it's order
 * 
 * === For overloading ===
 *  Same method name and return type diff signature
 * 
 * Class A {
 *      void sum(int a, int b){}
 *      int sum(int a, int b, int c){}
 *      
 *      // below example methods cannot be called as overloaded
 *      // void sum(int a, int b){}
 *      // int sum(int a, int b){}
 * }
 * 
 * === For overriding ===
 * method signature + return type had to be same 
 * 
 * Class A {
 *      void sum(int a, int b){}
 * }
 * 
 * Class B extends Class A {
 *      // int sum(int a, int b){} // this can't be override because signature + return type should be same 
 *      void sum(int a, int b){} // this is called override
 * }
 * 
 * === For overhiding or method hiding ===
 * method signature + return type had to be same
 * class A {
 *      static void display(){}
 * }
 * 
 * class B {
 *      static void display(){} 
 * }
 * 
 * 
 */

public class Over {
    public static void main(String[] args) {
        
    }
}


