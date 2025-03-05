package codes.threading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServices {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex1 = Executors.newCachedThreadPool();
        ExecutorService ex2 = Executors.newFixedThreadPool(10);
        ExecutorService ex3 = Executors.newCachedThreadPool();
        ExecutorService ex4 = Executors.newScheduledThreadPool(10);
        ExecutorService ex5 = Executors.newSingleThreadExecutor();
        ExecutorService ex6 = Executors.newWorkStealingPool(10);

        ex6.


    }
}
