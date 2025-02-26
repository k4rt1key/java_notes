# Exception Handling in Java (Concise)

- **If no catch block:** Uncaught exceptions go to the thread’s default handler, which prints the stack trace and terminates the thread.
- **Exception Flow:** Thrown → checks current method for catch → moves up call stack → if uncaught, handled by thread’s uncaught exception handler.
- **Default Handler:** Lies in `ThreadGroup` class; prints stack trace to `System.err` and ends thread.
- **Custom Handler:**
    - Per-thread: `thread.setUncaughtExceptionHandler(new CustomHandler())`
    - Global: `Thread.setDefaultUncaughtExceptionHandler(new CustomHandler())`
    - Implement `Thread.UncaughtExceptionHandler` and override `uncaughtException`.

## Example
```java
class CustomHandler implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Custom: " + e.getMessage());
    }
}

public static void main(String[] args) {
    Thread.setDefaultUncaughtExceptionHandler(new CustomHandler());
    int a = 10 / 0; // Triggers custom handler
}nters an infinite loop or deadlock