# 📘 Stream API in Java

## 🚀 Introduction
- **Stream API** is used to process a **collection of objects (data)**.
- It is part of the **Collection Framework**.
- ❗ **Note:** It is completely different from Java IO Streams.
- Introduced in **Java SE 8**.

---

## 🎯 Uses of Stream API
1. 🔄 Perform **bulk operations** on collections.
2. ✂️ **Reduces code length** and improves readability.
3. ⚡ Enables **functional programming** style in Java.
4. 🧠 Makes code more **declarative** (what to do, not how to do).

---

## 🏗️ Hierarchy of Stream API
```
java.util.stream
    ├── BaseStream
    │     ├── Stream<T>
    │     ├── IntStream
    │     ├── LongStream
    │     └── DoubleStream
```

---

## 🔄 Stream API Operations Lifecycle

### 1️⃣ Create Stream
```java
List<Integer> list = Arrays.asList(1, 2, 3, 4);
Stream<Integer> stream = list.stream();
```

### 2️⃣ Intermediate Operations 🔧
```java
stream.filter(x -> x > 2)
      .map(x -> x * 2);
```

### 3️⃣ Terminal Operations 🎯
```java
long count = list.stream().count();
```

---

## 📌 Stream Interface

```java
public interface Stream<T> {
    void forEach();
    Stream<T> filter();
    Stream<R> map();
    Object collect();
    Stream<T> sorted();
    Optional<T> min();
    Optional<T> max();
    long count();

    static Stream<T> of();
    static Stream<T> empty();
    static Builder<T> builder();
}
```

---

## 🔥 Common Stream Methods

### 🔍 filter()
```java
list.stream().filter(x -> x > 5);
```

### 🔄 map()
```java
list.stream().map(x -> x * 2);
```

### 📊 sorted()
```java
list.stream().sorted();
```

### 📦 collect()
```java
list.stream().collect(Collectors.toList());
```

### 🔢 count()
```java
list.stream().count();
```

### 🔽 min() / 🔼 max()
```java
list.stream().min(Integer::compareTo);
```

---

## ⚠️ Important Points
- ❌ Stream does not store data.
- 🔁 Stream cannot be reused once consumed.
- ⚡ Supports parallel processing.
- 🧩 Works with lambda expressions.

---

## 💡 Example Program

```java
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream()
            .filter(x -> x % 2 == 0)
            .map(x -> x * x)
            .forEach(System.out::println);
    }
}
```

---

## 🎉 Summary
- Stream API simplifies data processing.
- Supports functional programming.
- Uses pipeline approach (source → intermediate → terminal).
- Improves performance & readability.
