# ☕ Java 8 Feature: default & static method –  Notes

---

## 📌 Java Version Features

### 🔹 JDK 1.0 & 1.1
- Java was created 🚀
- AWT Event Model
- Inner Classes
- JavaBeans
- JDBC
- Reflection API
- RMI
- JIT Compiler (Windows)

---

### 🔹 JDK 1.2
- Collection Frameworks 📚
- `strictfp` keyword
- Swing API
- Java Plugins

---

### 🔹 JDK 1.3
- HotSpot JVM ⚡
- JNDI (Java Naming & Directory Interface)
- JavaSound API 🎵

---

### 🔹 JDK 1.4
- Regular Expressions (RegEx)
- Exception Chaining
- NIO (New Input Output)
- Logging API 📝
- Image I/O API 🖼️

---

### 🔹 JDK 1.5 (Java 5)
- Generics
- Annotations 🏷️
- Autoboxing / Unboxing
- Enumerations (Enums)
- Varargs
- Enhanced for-each loop 🔁
- `java.util.concurrent` package

---

### 🔹 Java SE 6
- JDBC 4.0
- Java Compiler API
- Scripting Language Support (JavaScript, etc.)
- Performance Improvements 🚀
- New Garbage Collection Algorithms

---

### 🔹 Java SE 7
- Strings in `switch`
- JVM Support for Dynamic Languages
- Compressed 64-bit Pointers

---

### 🔹 Java SE 8 ⭐
- Default Methods in Interfaces
- Static Methods in Interfaces
- Functional Interfaces
- Lambda Expressions 🔥
- Predefined Functional Interfaces
  - Predicate
  - Function
  - Consumer
  - Supplier
- Stream API 🌊
- Method References
- Constructor References
- Date & Time API (java.time) ⏰

---

## ❓ Why Java SE 8 Is Important

1. Simplifies Java programming ✨
2. Introduces Functional Programming concepts while keeping Java OOP-based
3. Supports Parallel Programming 🧵
4. Utilizes Multi-Core Processors efficiently ⚙️

---

## 🚀 Java 8 Core Features

---

## 🔸 Default Methods in Interface

- Before Java 8, interfaces could only have abstract methods
- From Java 8, interfaces can have methods with implementation
- Implemented using the `default` keyword

### ✅ Key Points
- Default methods **can be overridden**
- Default methods are **public by default**

### 🎯 Uses
1. Interface changes do not break existing implementations
2. Common implementation can be shared across classes
3. Reduces code duplication ✂️

---

## 🔸 Static Methods in Interface

- Introduced in Java 8
- Static methods have implementation inside the interface only
- Created using the `static` keyword

### ⚠️ Notes
- Can be `public`
- Cannot use `default` keyword
- Static methods **cannot be overridden**
- Improve code shareability

---

## 🔸 Marker Interface

- Interface with **no abstract methods**
- Used to mark a class

### 📌 Examples
- `Cloneable`
- `Serializable`
- `Remote`

---

## 🔸 Functional Interface

- Interface with **only one abstract method**
- Annotated using `@FunctionalInterface`

### ✅ Rules
1. Can have multiple `default` or `static` methods
2. Must have **exactly one abstract method**
3. If parent interface has multiple abstract methods → ❌ Not functional

### 📌 Examples
- `Runnable`
- `Callable`
- `ActionListener`
- `Comparable`

---

## 🔸 Predefined Functional Interfaces (Java 8)

- `Predicate<T>` → returns boolean
- `Function<T, R>` → input → output
- `Consumer<T>` → consumes input, no return
- `Supplier<T>` → supplies value, no input

---

## 🔸 Annotations

- Used to provide metadata 🏷️
- Start with `@`
- No direct effect on compiler execution
- Provide extra information for:
  - Classes
  - Interfaces
  - Methods
  - Variables
  - Constructors

---

✨ **End of Java Default and Static Method Notes** ✨

