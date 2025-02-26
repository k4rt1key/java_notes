package codes.p2;

import codes.p1.*;


class Test1Child  extends Test1{
    void print(){
        System.out.println(new Test1Child().s);
  
    }
}

public class Test2{
    public static void main(String[] args) {
        // System.out.println(new Test1Child().s);
        // System.out.println(new Test1().s);
        new Test1Child().print();
    }
}
