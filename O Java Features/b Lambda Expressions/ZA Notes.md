# 🧠 Lambda Expressions in Java (Java 8+)

---

## 📌 What is a Lambda Expression?

A **lambda expression** is a **short block of code** that:
- Takes parameters
- Performs an operation
- Returns a result (optional)

✔ A functional interface contains **exactly ONE abstract method**  
✔ Can have multiple **default** and **static** methods  

👉 It allows us to **treat functionality as a method argument**.

📅 Introduced in **Java 8**

---

## 📌 Lambda Expression in Java

👉 **Lambda Expression** is a special type of **function** in Java which **does not have**:

1️⃣ Any **name** ❌  
2️⃣ Any **modifier** (public, private, etc.) ❌  
3️⃣ Any **return type** ❌  

📅 Introduced in **Java 8** to support **functional programming**.

---

## ✨ Lambda Expression Definition

➡️ A lambda expression represents **a block of code that can be passed as an argument** and executed later.

➡️ It provides a **clear and concise way** to implement a method of a functional interface.

---

## 🧩 Lambda Expression Syntax

```
(parameters) -> { body }
```

### Examples 👇

```
() -> System.out.println("Hello")

x -> x * x

(a, b) -> a + b
```

---

## 🌟 Advantages of Lambda Expressions

✅ Reduces the **number of lines of code**  
✅ Calls APIs **very effectively**  
✅ Supports **parallel** and **sequential** execution  
✅ Helps write **readable, maintainable, and concise code**  

---

## ⚠️ Important NOTE

> 🔔 **Lambda Expressions are ALWAYS used with Functional Interfaces**

👉 Without a functional interface, lambda expressions **cannot be used** ❌

---

## 🧠 Functional Interface (Quick Recap)


Example:

```
@FunctionalInterface
interface MyInterface {
    void show();
}
```

Using Lambda:

```
MyInterface m = () -> System.out.println("Hello Lambda");
m.show();
```

---

## 📜 Rules Related to Lambda Expressions

### 🔹 Rule 1
👉 If there is **only one statement**, we can remove **curly braces `{}`**

```
() -> System.out.println("Hello")
```

---

### 🔹 Rule 2
👉 Lambda expressions can take **any number of parameters**

```
(a, b, c) -> a + b + c
```

---

### 🔹 Rule 3
👉 **Data type of parameters is optional**  
➡️ Compiler automatically **deduces the data type** based on context

```
(a, b) -> a + b
```

---

### 🔹 Rule 4
👉 If there is **only ONE parameter**, round brackets `()` are optional

```
x -> x * x
```

---

### 🔹 Rule 5
👉 If lambda expression **returns a value**, the `return` keyword can be removed

```
(a, b) -> a + b
```

---

### 🔹 Rule 6
👉 Lambda expression can have **multiple statements**

```
(x) -> {
    System.out.println(x);
    System.out.println(x * x);
}
```

---

## 🆚 Lambda vs Traditional Method

| Feature | Lambda | Traditional Method |
|------|--------|------------------|
| Name | ❌ No | ✅ Yes |
| Return Type | ❌ No | ✅ Yes |
| Boilerplate Code | Low ✅ | High ❌ |
| Readability | High ✅ | Medium |

---

## 🎯 Key Exam & Interview Points

📌 Lambda expressions were introduced in **Java 8**  
📌 Used only with **functional interfaces**  
📌 Improves performance and readability  
📌 Widely used with **Collections & Streams API**  

---

## 🧾 Summary

✔ Lambda is an **anonymous function**  
✔ Makes Java code **shorter and cleaner**  
✔ Eliminates boilerplate code  
✔ Backbone of **modern Java programming**  

---

✨ **Happy Learning & Happy Coding!** 😄☕

