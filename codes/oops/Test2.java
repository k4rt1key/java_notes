package codes.oops;

import codes.p1.*;


class Test1Child {
    void print(){
        // System.out.println(new Test1Child().s);
        System.out.println(new Test1());
    }
}

public class Test2{
    public static void main(String[] args) {
        // System.out.println(new Test1Child().s);
        // System.out.println(new Test1().s);
        new Test1Child().print();
    }
}
