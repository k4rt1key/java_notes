# How java initialize objects and class

```java
package codes;


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

    {
        System.out.println("simple block 2");
    }

    Test(){
        System.out.println("constructor");
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
    }

}
```

## Output : 
```
static block 1
static i init
static block 2
main
```

- Only static block and variables are initialized if we dont create any object


## If we create object

```java
package codes;


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
```

## Output 

```
static block 1
static i init
static block 2
main
simple block 1
instance var j init
simple block 2
constructor
```