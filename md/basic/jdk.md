# Java Internals: From Source to Execution

## 1. Architecture Overview
- JDK (Java Development Kit): Complete development tools
- JRE (Java Runtime Environment): Required for running Java applications
- JVM (Java Virtual Machine): Executes Java bytecode

## 2. Java Program Lifecycle

### 2.1 Source Code Creation
- Human-readable `.java` files
- Written using Java syntax and language constructs

### 2.2 Compilation Process
1. **Lexical Analysis (Tokenization)**
   - Breaks code into tokens
   - Removes whitespace
   - Example:
     ```java
     int age = 25;  // Original code
     → [int] [age] [=] [25] [;]  // Tokens
     ```

2. **Syntax Analysis (Parsing)**
   - Validates code structure
   - Checks method signatures
   - Ensures balanced brackets
   - Verifies language constructs

3. **Semantic Analysis**
   - Checks type compatibility
   - Validates variable scope
   - Verifies method calls
   - Ensures logical correctness

4. **Bytecode Generation**
   - Creates `.class` files
   - Platform-independent format
   - Contains executable instructions and metadata

## 3. Java Memory Model

### 3.1 Method Area (Metaspace)
- Stores class metadata
- Located outside heap memory
- Contains:
  - Class definitions
  - Method metadata
  - Static variables
  - Class annotations
  - Class loader information

### 3.2 Heap Memory
- Main memory pool
- Stores:
  - Objects
  - Arrays
  - Instance variables
- Divided into:
  - Young Generation (Eden, S0, S1)
  - Old Generation

### 3.3 Stack Memory
- Thread-specific
- Contains:
  - Method frames
  - Local variables
  - Method parameters
  - Return values

### 3.4 Program Counter Register
- Tracks execution:
  - Current instruction
  - Next instruction

## 4. Class Loading System

### 4.1 Class Loader Types
1. **Bootstrap Class Loader**
   - Loads core Java libraries
   - Location: `<JAVA_HOME>/lib`
   - Loads fundamental classes (Object, String)

2. **Platform Class Loader**
   - Modern replacement for Extension Class Loader
   - Handles platform modules
   - Examples: java.sql, java.desktop

3. **Application Class Loader**
   - Loads user-defined classes
   - Manages third-party libraries
   - Uses classpath configuration

### 4.2 Class Loading Process
1. **Loading**
   - Reads `.class` files
   - Creates class representations

2. **Linking**
   - Verification: Ensures bytecode safety
   - Preparation: 
     - Allocates memory ONLY for static fields (class variables)
     - Sets static fields to default values (0, null, false)
     - Does NOT allocate memory for instance fields
   - Resolution: Resolves symbolic references

3. **Initialization**
   - Executes static initializers
   - Sets static fields to user-defined values
   - Instance fields get memory only when objects are created

## 5. Module System (Java 9+)
- Replaces old JAR-based system
- Provides better encapsulation
- Command: `java --list-modules`
- Module path configuration:
  - `--module-path /path/to/modules`
  - `-cp /path/a;path/b` for classpath

## 6. Garbage Collection

### 6.1 Basic Concepts
- Automatic memory management for heap memory
- Removes unreferenced objects
- Triggered by:
  - Threshold in heap memory usage
  - GC algorithm settings
  - JVM configurations
- Can be manually requested (not recommended): `System.gc()`

### 6.2 Reference Types
1. **Strong References**
   ```java
   Person p = new Person();  // Strong reference
   ```
   - Default reference type
   - Objects not eligible for GC

2. **Weak References**
   ```java
   WeakReference<Person> p = new WeakReference<>(new Person());
   ```
   - Objects eligible for GC when next cycle runs
   - Used for caching scenarios

3. **Soft References**
   - Similar to weak references
   - Objects preserved if memory isn't critically needed
   - Deleted only if memory is urgently required
   - Good for memory-sensitive caching

### 6.3 Heap Memory Structure
1. **Young Generation**
   - **Eden Space**
     - Initial location for new objects
     - First stage of object lifecycle
   - **Survival Spaces (S0 and S1)**
     - Objects that survive Eden collection
     - Objects alternate between S0 and S1
     - Age counter tracks survival cycles

2. **Old Generation**
   - Contains long-lived objects
   - Objects promoted from Young Gen
   - Less frequent GC cycles
   - Triggered by different thresholds

### 6.4 GC Algorithms

1. **Mark & Sweep Algorithm**
   - **Minor GC (Young Generation)**
     - Marks unreferenced objects
     - Moves surviving objects between Eden and Survival spaces
     - Updates object age counter
     - Promotes objects to Old Gen when age threshold reached
   
   - **Major GC (Old Generation)**
     - Less frequent than Minor GC
     - More intensive process
     - Handles long-lived objects

2. **Mark & Sweep with Compaction**
   - Additional compaction phase
   - Reduces memory fragmentation
   - Maintains contiguous free space
   - Better memory utilization

### 6.5 GC Implementations

1. **Serial GC**
   - Single-threaded collector
   - Stop-the-world during collection
   - Suitable for small applications

2. **Parallel GC (Default in Java 8)**
   - Multi-threaded collector
   - Uses multiple CPU cores
   - Better performance for larger applications

3. **Concurrent Mark & Sweep (CMS)**
   - Minimizes application pauses
   - Runs concurrently with application
   - No memory compaction
   - Higher CPU usage

4. **G1 (Garbage First) GC**
   - Modern default collector
   - Region-based memory management
   - Predictable pause times
   - Includes memory compaction

5. **ZGC**
   - Scalable low-latency collector
   - Designed for very large heaps
   - Sub-millisecond pause times

### 6.6 Configuration Options
```bash
# Heap Size Configuration
-Xms512m                              # Initial heap size
-Xmx2g                               # Maximum heap size

# Collector Selection
-XX:+UseG1GC                         # Enable G1 GC
-XX:+UseZGC                          # Enable Z GC

# Performance Tuning
-XX:MaxGCPauseMillis=200             # Maximum pause time target
-XX:GCTimeRatio=99                   # 99% application time, 1% GC time
-XX:InitiatingHeapOccupancyPercent=75 # GC trigger threshold

# Additional Options
-XX:+PrintGCDetails                  # Print detailed GC logs
-XX:+PrintGCDateStamps              # Include timestamps in GC logs
```

### 6.7 Memory Generations Evolution
- **Old System**
  - PermGen: Part of heap memory
  - Limited size
  - Stored class metadata

- **Modern System (Java 8+)**
  - Metaspace: Outside of heap
  - Dynamically sized
  - Better memory management
  - More flexible for class metadata
 
## ZGC vs G1GC Comparison
# ZGC (Z Garbage Collector)

- Design Focus: Low latency garbage collector designed to minimize pause times
- Pause Times: Consistently under 10ms regardless of heap size
- Scalability: Handles heaps from 8MB to 16TB efficiently
- Concurrency: Performs most work concurrently without stopping application threads
- Load Balancing: Uses colored pointers technique for reference processing
- Memory Overhead: Typically higher than G1GC
- Java Version: Introduced in JDK 11, production-ready in JDK 15
- Best For: Applications requiring extremely low pause times, large heaps, and latency-sensitive workloads

# G1GC (Garbage-First Garbage Collector)

- Design Focus: Balanced garbage collector optimizing for both throughput and latency
- Pause Times: Longer than ZGC but predictable (typically tens to hundreds of milliseconds)
- Scalability: Works well with medium to large heaps (4GB to 32GB)
- Concurrency: Performs some but not all collection phases concurrently
- Collection Strategy: Divides heap into regions, collecting regions with most garbage first
- Memory Overhead: Lower than ZGC
- Java Version: Introduced in JDK 7, default garbage collector since JDK 9
- Best For: General purpose applications with moderate latency requirements

# Mark and Sweep Algorithm
- The Mark and Sweep algorithm is a fundamental garbage collection technique that operates in two phases:
Mark Phase
- Starting from "root" objects (objects directly referenced from program execution)
- The garbage collector recursively traverses all object references
- Each encountered object is "marked" as reachable (typically using a bit flag)
- This process continues until all reachable objects have been marked

# Sweep Phase

- The garbage collector scans the entire heap memory
- Any objects that were not marked during the mark phase are identified as garbage
- These unmarked objects are "swept" (freed) from memory
- Memory is then returned to the free memory pool for future allocations

# Characteristics

- Stop-the-World: Traditional implementations pause application threads during collection
- Memory Fragmentation: Can lead to memory fragmentation over time
- Variations: Modern GCs build on this with refinements like concurrent marking, incremental sweeping, and compaction phases
- Pros: Handles cyclic references well
- Cons: Basic implementation requires pausing application execution
