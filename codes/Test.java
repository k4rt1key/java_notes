package codes;


import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

class Test {

//    static {
//        System.out.println("static block 1");
//    }
//
//    static int i = initI();
//
//    {
//        System.out.println("simple block 1");
//    }
//
//    int j = initJ();
//
//    static {
//        System.out.println("static block 2");
//    }
//
//    {
//        System.out.println("simple block 2");
//    }
//
//    Test(){
//        System.out.println("constructor");
//    }
//
//    static int initI(){
//        System.out.println("static i init");
//        return 10;
//    }
//
//    int initJ(){
//        System.out.println("instance var j init");
//        return 10;
//    }

    public static void main(String[] args)  throws  CloneNotSupportedException {

        try{
            throw new RuntimeException();
        } finally {
            System.out.println("s");
        }
//        Demo d = new Demo();
//        Demo d2 = (Demo) d.clone();
//
//        System.out.println("d.a => " + d.a);
//        System.out.println("d.arr[0] => " + d.arr[0]);
//
//        System.out.println("d2.a => " + d2.a);
//        System.out.println("d2.arr[0] => " + d2.arr[0]);
//
//        d.a = 20;
//        d.arr[0] = 11;
//
//        System.out.println("d.a => " + d.a);
//        System.out.println("d.arr[0] => " + d.arr[0]);
//
//        System.out.println("d2.a => " + d2.a); // this will not updated to 20 because primitive data is copied by value not reference
//        System.out.println("d2.arr[0] => " + d2.arr[0]); // this will be changed to 11
    }
}

class Demo implements Cloneable {
    int a = 10;
    int[] arr = new int[]{1,2,3,4,5,6,7};

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

/*
 * === 1 ===
 * String a = "1"+"2";
 * String b = "12";
 * 
 * sout(a==b) // true ave
 * 
 * === 2 ===
 * String[] arr = new String[] // compilation error
 * 
 * === 3 ===
 * Boolean a = Boolean.getBoolean("true");
 * Boolean b = Boolean.getBoolean("faLse");
 * Boolean c = Boolean.getBoolean("abc");
 * Boolean d = null;
 * 
 * sout("" + a + "" + b + "" + c + "" + d);
 * 
 * 
 * === 4 ===
 * byte b = 127;
 * 
 * System.out.println(++b); // it will not give compilation error
 * // this will return -128
 * 
 * 
 * === 5 ===
 *   try{
 *      System.out.println("kai nai");
 *   } catch(IOException e){
 *       System.out.println("");
 *   }
 */