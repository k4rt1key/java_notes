package codes.threading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

class Task5 implements Runnable {

    CountDownLatch cdt;
    CyclicBarrier cb;
    Task5(CountDownLatch cdt, CyclicBarrier cb)
    {
        this.cdt = cdt;
        this.cb = cb;
    }


    @Override
    public void run(){
        System.out.println("5 Sec Task started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
//            cdt.countDown();
            cb.getNumberWaiting();
        }

        System.out.println("Task Complete");
    }
}

public class ExecutorServices {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(100);
        CyclicBarrier cb = new CyclicBarrier(100);
        ExecutorService ex1 = Executors.newCachedThreadPool();
        ExecutorService ex2 = Executors.newFixedThreadPool(10);
        ExecutorService ex3 = Executors.newCachedThreadPool();
        ExecutorService ex4 = Executors.newScheduledThreadPool(10);
        ExecutorService ex5 = Executors.newSingleThreadExecutor();
        ExecutorService ex6 = Executors.newWorkStealingPool(10);


            long st = System.currentTimeMillis();
            Task5 task = new Task5(countDownLatch, cb);
            for (int i = 0; i < 100; i++) {
                    ex6.submit(task);
            }
            countDownLatch.await();
            ex6.shutdown();

        long et = System.currentTimeMillis();

        System.out.println( (et-st) + " milliseconds");

    }
}


