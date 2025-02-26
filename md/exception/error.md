# Exception vs. Error in Java

| **Aspect**      | **Exception**                  | **Error**                      |
|-----------------|--------------------------------|--------------------------------|
| **Definition**  | Recoverable issues            | Serious, unrecoverable issues |
| **Examples**    | `IOException`                 | `OutOfMemoryError`            |
| **Recovery**    | Possible                      | Usually not possible          |
| **Cause**       | App-level (e.g., bad input)   | System/JVM (e.g., no memory)  |

---

## Can We Catch Errors?
- **Yes:** `Error` inherits from `Throwable`, so `try-catch` works (e.g., `catch (Error e)`).
- **Why Allowed:** Flexibility for rare cases (e.g., logging before crashing).
- **Should You?** No—errors signal fatal conditions (e.g., `StackOverflowError`). Catching them risks instability; they’re meant to stop execution.

---

## Example
```java
try {
    throw new Error("Test");
} catch (Error e) {
    System.out.println("Caught: " + e); // Works, but risky
}
```