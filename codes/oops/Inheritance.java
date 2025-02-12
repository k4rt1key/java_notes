package codes.oops;

public class Inheritance {
    public static void main(String[] args) {

        /*
         * For GrandGrandParent reference and Child() as a object
         * It will find .getId() method in GrandGrandFather class first if not exist then it will give compile time error 
         * Otherwise it starts finding overriden method .getId() from Child class 
         * If in Child class .getId() not found it will find in Parent class 
         * If it finds .getId() in Parent class it will run that method OTHERWISE... 
         * It will find .getId() in GrandParent class
         * If it finds .getId() in GrandParent class it will run that method OTHERWISE...
         * It will find .getId() in GrandGrandParent() ( Which is that class itself )
         * And we know that class contains that method ( Otherwise it would gave compilation error at first step )
         */

         /*
          * If Parent class has method getId() as protected then Child class can inherit that getId() as protected, default and public 
          */
        

        /* === How constuctor called ===
         * Suppose We created object x of class Child using new Child()
         * Then Child's constructor will be called inside that constructor by default super() will be called 
         *      which will call it's parent's constructor which is Parent's consturctor
         * Then Parent class's constructor will be called also inside that constructor by default super() will be called 
         *      whilch will call it's parent's constructor which is GrandParent's constructor
         * Then GrandParent class's constructor will be called also inside that constructor by default super() will be called
         *      whilch will call it's parent's constructor which is GrandGrandParent's constructor
         * Then GrandParent class's constructor will be called also inside that constructor by default super() will be called
         *      whilch will call it's parent's constructor which is Object class's constructor
         * Then Object class will run it's constructor then control reaches to GrandGrandParent's constructor then GrandParent's
         * Then Parent's and after this Child's constructor will be called 
         * 
         * This is same as Recursive call
         * 
         */
        Child x = new Child();
        // System.out.println(x.id);
        System.out.println(x.id);

    }
}

class GrandGrandParent {
    int id = -10;

    GrandGrandParent(){
        System.out.println("Constructor of GrandGrandParent");
    }

    // protected void getId(){
    //     System.out.println("GrandGrandParent getId method == " + id);
    // }
}

class GrandParent extends GrandGrandParent{
    int id = 0;

    GrandParent(){
        System.out.println("Constructor of GrandParent");
    }

    // public void getId() {
    //     super.getId();
    //     // System.out.println("GrandParent getId method == " + id);
    // }
}

class Parent extends GrandParent {
    protected int id = 10;

    Parent(){
        System.out.println("Constructor of Parent");
    }

    protected void getId() {
        System.out.println("Parent getId method == " + id);
    }
}


class Child extends Parent {
    // int id = 20;    
    
    Child(){
        System.out.println("Constructor of Child");
    }

    public void getId() {
        super.getId();
    }
}


