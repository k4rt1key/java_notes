package codes.threading;

class Testing extends Thread
{
    public void start(){
        System.out.println("Start");
    }
    public void run(){
        System.out.println("run");
    }
}
public class Test {

    public static void main(String args[])
    {
       Testing t = new Testing();
       t.start();
    }
}