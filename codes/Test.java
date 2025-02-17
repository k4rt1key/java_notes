package codes;

class A {
    void fun(){}
}

class B extends A {
    int fun(int a){
        return a;
    }
}

class Test {

    static {
        System.out.println("static block 1");
    }

    static int i = initI();

    {
        System.out.println("simple block 1");
    }

    int j = initJ();


    static {
        System.out.println("static block 2");
    }

 
    Test(){
        System.out.println("constructor");
    }


    {
        System.out.println("simple block 2");
    }
    
    static int initI(){
        System.out.println("static i init");
        return 10;
    }

    int initJ(){
        System.out.println("instance var j init");
        return 10;
    }

    public static void main(String[] args) {
       System.out.println("main");
       Test t = new Test();
    }

}