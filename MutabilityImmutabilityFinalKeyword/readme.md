# Mutability, Immutability & `final` in Java — Deep Dive (Interview-Focused)

This README covers **core Java design concepts** that are heavily tested in interviews:
- Mutability vs Immutability
- `final` keyword (variables, methods, classes)
- Constructors (deep dive)
- Shallow vs Deep Copy
- Unmodifiable vs Immutable collections
- Records and record constructors
- Code safety and design best practices

Structured from **basics → internals → real-world design → interviews**.

---

## 1) Mutability vs Immutability

### What is Mutability?
An object is **mutable** if its state **can be changed after creation**.

```java
class Person {
    String name;
}
```

### What is Immutability?
An object is **immutable** if its state **cannot be changed once created**.

```java
final class Person {
    private final String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

### Benefits of Immutability
- Thread-safe by design
- Easier to reason about
- Safer for caching and sharing
- Prevents accidental modification

---

## 2) The `final` Keyword — Deep Dive

### `final` Variables
```java
final int x = 10;
```
- Cannot be reassigned
- Reference cannot change (object may still be mutable)

```java
final List<String> list = new ArrayList<>();
list.add("A"); // allowed
// list = new ArrayList<>(); ❌
```

### `final` Methods
- Cannot be overridden
- Used for security and predictable behavior

```java
class Parent {
    final void show() {}
}
```

### `final` Classes
- Cannot be extended
- Common for immutable classes

```java
final class Constants {}
```

### Interview One-Liner
> `final` prevents reassignment, not mutability.

---

## 3) Constructors — Deep Dive

### Purpose of Constructors
- Initialize object state
- Enforce invariants
- Prepare immutable objects

### Types
- Default constructor
- Parameterized constructor
- Private constructor (Singleton / Utility classes)

```java
class User {
    private final String name;

    User(String name) {
        this.name = name;
    }
}
```

### Constructor Chaining
```java
class A {
    A() {
        this(10);
    }
    A(int x) {}
}
```

---

## 4) Shallow Copy vs Deep Copy

### Shallow Copy
Copies references, not objects.

```java
class Address {
    String city;
}

class Person {
    Address address;
}
```

### Deep Copy
Creates independent copies.

```java
class Person {
    Address address;

    Person(Address address) {
        this.address = new Address();
        this.address.city = address.city;
    }
}
```

### Interview Rule
> Shallow copy shares state, deep copy isolates state.

---

## 5) Unmodifiable vs Immutable Collections

### Unmodifiable Collections
- Wrapper over mutable collection
- Changes through original reference are reflected

```java
List<String> list = new ArrayList<>();
List<String> unmod = Collections.unmodifiableList(list);

list.add("A"); // visible in unmod
// unmod.add("B"); ❌
```

### Immutable Collections (Java 9+)
- Truly immutable
- No backing collection

```java
List<String> list = List.of("A", "B");
```

### Key Difference
| Unmodifiable | Immutable |
|-------------|-----------|
| Backed by source | Independent |
| Can change indirectly | Cannot change |
| Runtime wrapper | Built-in |

---

## 6) Records & Record Constructors (Java 16+)

### What is a Record?
A concise syntax for **immutable data carriers**.

```java
record User(String name, int age) {}
```

### Record Constructor
```java
record User(String name, int age) {
    public User {
        if (age < 0) throw new IllegalArgumentException();
    }
}
```

### Why Records?
- Immutable by default
- Less boilerplate
- Safer design

---

## 7) Enhancing Code Security with Immutability

### Why Security Improves
- No state tampering
- Safe sharing between threads
- Prevents external modification

### Defensive Copying
```java
class Secure {
    private final List<String> data;

    Secure(List<String> data) {
        this.data = List.copyOf(data);
    }
}
```

---

## 8) Static Methods and `final`

### Can Static Methods Be Final?
✅ Yes (but redundant)

```java
final static void util() {}
```

### Key Insight
- Static methods cannot be overridden anyway
- `final` adds semantic clarity

---

## 9) Famous Interview Questions

### Q1) Is String immutable?
✅ Yes — for security, caching, and performance.

---

### Q2) Does `final` make an object immutable?
❌ No — it prevents reassignment only.

---

### Q3) Difference between unmodifiable and immutable collections?
Unmodifiable = wrapper, Immutable = truly immutable.

---

### Q4) Why defensive copies?
To protect internal state from modification.

---

### Q5) Are records better than classes?
For immutable data → Yes.

---

## 10) Interview One-Liners

- Immutability improves thread safety
- `final` prevents reassignment, not mutation
- Shallow copy shares state
- Deep copy isolates state
- Records are immutable data carriers

---

## Quick Summary

- Prefer immutability for safety
- Use `final` wisely
- Understand copy semantics
- Know difference between immutable and unmodifiable
- Records simplify immutable design

---

## Interview Tip

If you can explain:
- Shallow vs deep copy
- `final` keyword behavior
- Immutable collections vs wrappers
- Records and constructors

You can clear **most Java design interview questions confidently**.
