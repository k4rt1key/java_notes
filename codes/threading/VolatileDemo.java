package codes.threading;

class IntClass{
     volatile private int i;
     volatile private int j;

    public String getI() throws InterruptedException {
        System.out.println("waiting for i to become 1...");
        while(i != 1){
             Thread.sleep(10);
            //
        }
        System.out.println("done waiting :)");
        return "i = " + i +", j = "+ j;
    }

    public String getJ() {
        return "" + j;
    }

    public int incrementI() throws InterruptedException {
        i++;
        j++;
        return i;
    }

}


public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        IntClass intClass = new IntClass();

        Thread t1 = new Thread(()-> {
            try {
                System.out.println(
                        Thread.currentThread().getName() + " increment value of i : " + intClass.incrementI() + " and "
                        + "increment value of j : " + intClass.getJ()
                );
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()-> {
            try {
                System.out.println(
                        Thread.currentThread().getName() + " read : " + intClass.getI()
                );
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t2.start(); // reading thread
        Thread.sleep(10);
        t1.start(); // writing thread

        t1.join();
        t2.join();
    }
}
