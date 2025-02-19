package codes;
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
        Integer[] arr = new Integer[1];
        address(arr);
        int i = 1;
        Integer j = 1;
    }

    public static void address(Integer[] a){

        Integer i = 10;
        Integer j = null;
         
        int hashI = System.identityHashCode(i);
        int hashJ = System.identityHashCode(j);

        
        System.out.println(hashI + "()" + hashJ);
        if(hashI == 0 || hashJ == 0) {
            System.out.println("Either hashI or hashJ is null");
        }
        else if(hashI == hashJ){
            System.out.println("Both objects are stored at same memory address");
        } else {
            System.out.println("Both objects are stored at different memory address");
        }
    }

    // If we want to execute code without main() we can use 
    static {
        System.out.println("Hey from STATIC BLOCK");
        // System provides access to system resources
        // It has static methods 
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

