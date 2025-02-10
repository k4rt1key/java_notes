![jdk-jre-jvm](/Images/jdk-jre-jvm.png)
![javacompilation](/Images/javacompilation.png)

## 1. Source Code Creation 🖋️
**What It Is:** A human-readable Java file (`.java`)
**Core Purpose:** Translate your logical thinking into a structured programming language

## 2. Compilation: Transforming Code 🔧

### 2.1 Lexical Analysis (Tokenization)
- **Concept:** Breaking code into digestible pieces
- **Key Functions:**
  - Decompose code into meaningful tokens
  - Remove unnecessary whitespaces
  - Identify language elements

**Example:**
```java
int age = 25;  // Original code
→ [int] [age] [=] [25] [;]  // Tokenized representation
```

### 2.2 Syntax Analysis (Parsing)
- **Purpose:** Grammatical code validation
- **Verification Checks:**
  - Structural code integrity
  - Correct method signatures
  - Proper use of language constructs
  - Balanced brackets and parentheses

### 2.3 Semantic Analysis
- **Goal:** Logical and type-level verification
- **Validates:**
  - Type compatibility
  - Variable scoping rules
  - Logical code correctness
  - Method call compatibility

### 2.4 Bytecode Generation
- **Output:** Platform-independent `.class` file
- **Contents:**
  - Executable instructions
  - Class metadata
  - Method implementations

## 3. Java Virtual Machine (JVM) Execution 💻

### Class Loaders: The Gatekeepers
- Loads bytecode into **RAM**

#### 1. Bootstrap Class Loader
- **Role:** Load core Java runtime libraries
- **Location:** `<JAVA_HOME>/lib`
- **Loaded Classes:**
  - `java.lang.Object`
  - `java.lang.String`
  - Essential system classes

#### 2. Platform/ Extension Class Loader
- Platform loader is module based newer concept 
- Jar based system is old and updated with module based system
- **Role:** Load Java extension packages
- **Location:** `<JAVA_HOME>/lib/ext` for maintaining backward compatibility
- **Handles:**
  - Platform specific modules like java.sql, java.desktop 
  - Security extensions

#### 3. Application/System Class Loader
- **Role:** Load application-specific classes
- **Location:** Classpath
- **Manages:**
  - User-defined classes
  - Third-party libraries
  - Project-specific compiled code

### Linking Process Stages

#### 1. Verification Stage
- **Purpose:** Ensure bytecode safety and integrity
- **Checks:**
  - Bytecode structural correctness
  - Prevent malicious code injection
  - Validate syntax and type safety

#### 2. Preparation Stage
- **Purpose:** Memory allocation for static variables
- **Actions:**
  - Allocate memory for static fields
  - Initialize to default values:
    - `0` for numeric types
    - `null` for objects
    - `false` for booleans

#### 3. Resolution Stage
- **Purpose:** Convert symbolic references to memory addresses
- **Resolves:**
  - Class references
  - Method references
  - Field references

### Execution Mechanisms

#### Interpretation
- Reads bytecode instruction by instruction
- Slower execution
- Suitable for less-frequently used code paths

#### Just-In-Time (JIT) Compilation
- Identifies and optimizes frequently executed code
- Converts to native machine code
- Improves runtime performance

## Workflow Visualization
```
Source Code (.java)
   ↓ Compilation
Bytecode (.class)
   ↓ JVM Execution
Running Program
```
