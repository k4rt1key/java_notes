package codes.threading;

import java.util.concurrent.*;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync( () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return 10;
        });

        completableFuture.thenApply((x)-> x + 10).thenAccept((x)-> System.out.println(x));


        ExecutorService ex1 = Executors.newSingleThreadExecutor();
        Future<Integer> submit = ex1.submit(() -> 10);
        Future<?> submit1 = ex1.submit(() -> {
            System.out.println("runnable");
        });
        Thread.sleep(10);
        submit1.cancel(false);
        Thread.sleep(10);
        System.out.println(submit1.isCancelled());

    }
}
