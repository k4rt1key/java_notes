package codes.threading;

class Task2 extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("1000 ms computation in Task2");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Task2 is running...");

        try {
            System.out.println("2000 ms computation in Task2");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Task2(), "thread-1");
        t1.start();

    }
}
