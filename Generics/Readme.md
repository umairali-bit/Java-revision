
# 📦 Java Generics, Comparable, and Comparator 
---

## 🎯 What Are Generics?

Imagine a box where you don’t know what’s inside—until someone tells you. That’s what **Generics** in Java are like. They allow you to write code that works with **any type**, while still being safe and easy to reuse.

> 💡 **Analogy:** Think of a generic class as a vending machine that can sell **anything**—snacks, drinks, toys—as long as you tell it what to stock.

### ✅ Why Use Generics?

- **Code Reusability** – One class or method for many data types.
- **Type Safety** – Errors are caught during compile-time, not runtime.
- **Cleaner Code** – No need to cast objects.

---

## 🏗️ Generic Classes

### 🟢 Regular Class (Non-Generic)

```java
class ITellYou {
    private String field;
}
````

This class can only store a `String`.

---

### 🔵 Generic Class

```java
class YouTellMe<T> {
    private T field;
}
```

* The `<T>` means it can hold **any type**—`String`, `Integer`, `Person`, etc.
* You choose the type when creating the object.

### Example:

```java
YouTellMe<String> message = new YouTellMe<>();
YouTellMe<Integer> number = new YouTellMe<>();
```

> 💬 "T" stands for **Type**, but it could be any letter.

---

## 🗂️ Generic Collections Example

```java
ArrayList<String> names = new ArrayList<>();
```

* `ArrayList` is a generic class.
* `<String>` is the type it will store.
* `names` is the variable name.

---

## 🔤 Common Generic Type Parameters

| Symbol | Stands For         | Used In                    |
| ------ | ------------------ | -------------------------- |
| `E`    | Element            | Collections (List, Set)    |
| `K`    | Key                | Map keys                   |
| `V`    | Value              | Map values                 |
| `T`    | Type               | Any object type            |
| `N`    | Number             | Numeric values             |
| `S,U`  | Second/Third types | When multiple types needed |

---

## 🚫 Primitive Types Are Not Allowed

You **can’t** use primitive types like `int`, `double`, or `char` in generics.
✅ Use their **wrapper classes** instead:

| Primitive | Wrapper Class |
| --------- | ------------- |
| `int`     | `Integer`     |
| `double`  | `Double`      |
| `char`    | `Character`   |

---

## ⚖️ Comparable vs Comparator – Sorting Objects

Java provides **two interfaces** to help sort objects: `Comparable` and `Comparator`. They sound similar but serve different purposes.

---

## 🔷 Comparable – Natural Ordering

> 🧭 "I'm a student, and I always sort myself by my age by default."

* Implemented **inside the class**.
* Defines the "default" way objects should be compared.

### Example:

```java
class Person implements Comparable<Person> {
    private String name;
    private int age;

    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // Sort by age
    }
}
```

* `compareTo()` returns:

  * `0` if equal
  * Negative if less
  * Positive if greater

> 🔍 Comparable is useful when your class has **one obvious way to sort**.

---

## 🔶 Comparator – Custom Ordering

> 🧑‍🏫 "You’re a teacher who can grade students by name, marks, or height—your choice!"

* Implemented in a **separate class**.
* You can create **many different ways** to compare the same object.

### Example:

```java
class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName()); // Sort by name
    }
}
```

---

## 🔍 Key Differences

| Feature            | Comparable                       | Comparator                              |
| ------------------ | -------------------------------- | --------------------------------------- |
| Purpose            | Defines natural/default ordering | Allows custom sorting                   |
| Method             | `compareTo()`                    | `compare()`                             |
| Where it's used    | Implemented in the class         | Implemented in separate class or lambda |
| Flexibility        | Only one way to sort             | Multiple ways to sort                   |
| Class Modification | Yes                              | No                                      |

---

## 🧪 When to Use What?

| Scenario                                | Use          |
| --------------------------------------- | ------------ |
| You want a **default sort** order       | `Comparable` |
| You want **custom sort logic**          | `Comparator` |
| You need to sort by **multiple fields** | `Comparator` |
| You **don’t control the source class**  | `Comparator` |

---

## 💡 Bonus: Sort with Lambdas

Instead of writing a full comparator class, use lambda expressions:

```java
Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
```

---

## 🧠 Summary

* ✅ **Generics** = Write once, use for any type.
* ✅ **Comparable** = Default sorting, inside class.
* ✅ **Comparator** = Flexible sorting, external logic.
* ✅ **No primitive types** in generics; use wrappers.
* ✅ Use letters like `T`, `K`, `V`, `E` for type placeholders.

---

## ❓ What Are Wildcards in Generics?

Wildcards (`?`) mean:

👉 **“I don’t know the exact type, but I know its range.”**

They make generic code more flexible and reusable, especially when working with collections.

---

## 🧩 Types of Wildcards

### 1️⃣ Unbounded Wildcard (`?`)

```java
List<?> list;
```

**Meaning:**
- Accepts a list of any type  
- Elements can be read as `Object`  
- ❌ Cannot add elements (except `null`)  

**Use case:** Read‑only access

---

### 2️⃣ Upper‑Bounded Wildcard (`? extends T`)

```java
List<? extends Number> list;
```

**Meaning:**
- Accepts `Number` or any subclass  
- Safe to read  
- ❌ Not safe to add elements  

👉 **Rule:** `extends = read‑only`

---

### 3️⃣ Lower‑Bounded Wildcard (`? super T`)

```java
List<? super Integer> list;
```

**Meaning:**
- Accepts `Integer` or its parent classes  
- Safe to add `Integer` values  
- Reading elements returns `Object`  

👉 **Rule:** `super = write‑only`

---

## 🧠 One‑Line Memory Trick (PECS)

**PECS Principle:**
- **Producer → Extends**
- **Consumer → Super**

---

🏁 Once you master generics and wildcards, you’ll write safer, cleaner, and smarter Java code ☕
