package codes.threading;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
       for(int i = 0; i < 5; i++){
            service.execute(()->{
                try {
                    System.out.println("Running thread : " + Thread.currentThread().getName() );
                    Thread.sleep(1000);
                    System.out.println("Done running thread : " + Thread.currentThread().getName() );
                    cyclicBarrier.await();
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                } catch (BrokenBarrierException be){
                    System.out.println(be.getMessage());
                }
            });
        }

    }
}
