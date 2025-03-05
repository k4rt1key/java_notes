package codes.threading;

public class ThreadLocalDemo {
    // ThreadLocal variable
    private static ThreadLocal<String> threadLocalValue =
            new ThreadLocal<>();
    private static String s = "hey";

    public static void main(String[] args) {
        // Set thread-specific value
        threadLocalValue.set("Main Thread Value");
        s = "main";

        // Create multiple threads
        Thread t1 = new Thread(() -> {
            // Each thread has its own value
            threadLocalValue.set("Thread 1 Value");
            s = "inside t1";
            System.out.println(threadLocalValue.get() + " <-> " + s); // Prints "Thread 1 Value"
        });

        Thread t2 = new Thread(() -> {
            threadLocalValue.set("Thread 2 Value");
            s = "inside t2";
            System.out.println(threadLocalValue.get() + " <-> " + s); // Prints "Thread 2 Value"
        });

        t1.start();
        t2.start();

        // Main thread value remains unchanged
        System.out.println(threadLocalValue.get() + " <-> " + s); // Prints "Main Thread Value"
    }
}