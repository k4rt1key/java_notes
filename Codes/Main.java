package Codes;
// === Note ===

/*
* === 1 === One file can have only one public class 
* Otherwise it will give **compilation error**
* Main.java:11: error: class Main2 is public, should be declared in a file named Main2.java
* public class Main2 {
*   ^
* 1 error

* === 2 === File name should be same as **classname which is declared to be public** otherwise it will give error...

* Mains.java:13: error: class Main is public, should be declared in a file named Main.java
* public class Main {
*    ^
* 1 error 
*
*/ 

public class Main {
    // JVM by default calls main() method as a default
    public static void main(String[] args){
        System.out.println("Hey from MAIN");
    }

    // If we want to execute code without main() we can use 
    static {
        System.out.println("Hey from STATIC BLOCK");
        // System.exit(0);
    }

    /* If we don't write System.exit(0) JVM will look for main() after executing code of static {} block
    *
    * === 1 === If we have both main() and static block 
    * === It will execute static block first 
    *       == If System.exit() not written in static block then it will try to find main() method
    *       == If main() method exist 
    *           = Then it will execute main()
    *       == Otherwise it will throw runtime error
    *           = error: can't find main(String[]) method in class: Main
    */
    
}

