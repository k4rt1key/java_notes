package codes.threading;


class Task4 extends Thread{
    private int i;
    Task4(int i ){
        this.i = i;
    }

    public int increment(){
        return ++i;
    }

    public int getI(){
        return i;
    }

    @Override
    public void run(){
        System.out.println("Task4 is running...");
        for(int i = 0; i < 100; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            increment();
        }
    }
}


public class DataPassing {
    public static void main(String[] args) throws InterruptedException {
        Task4 task4 = new Task4(0);
        Thread t1 = new Thread(task4);
        t1.start();

        

        while(true){
            System.out.println(task4.getI());
            Thread.sleep(100);
        }
    }
}
