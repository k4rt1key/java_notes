package codes;

public class Test {
    public static void main(String[] args) {
        B.fun();
    }   
}

class A{
    int a;

    static void fun(){
        System.out.println("A");
    }

}

class B extends A{
    int b;

    static void fun(){
        System.out.println("B");
    }
}
