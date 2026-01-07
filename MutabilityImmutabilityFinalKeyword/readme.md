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

## 4) Shallow Copy vs Deep Copy (Clear Explanation + Examples)

Copying objects becomes tricky when your object contains **references** (like other objects, lists, maps, arrays).

### Shallow Copy (Copies References)
A **shallow copy** creates a new top-level object, but it **reuses the same referenced objects** inside it.

✅ Changes to the top-level object are separate  
❌ Changes to nested/reference objects are shared (because both copies point to the same nested object)

#### Example
```java
class Address {
    String city;
    Address(String city) { this.city = city; }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy constructor
    Person(Person other) {
        this.name = other.name;
        this.address = other.address; // same reference!
    }
}

Address addr = new Address("NYC");
Person p1 = new Person("Umair", addr);
Person p2 = new Person(p1); // shallow copy

p2.address.city = "DC";
System.out.println(p1.address.city); // DC (shared reference!)
```

### Deep Copy (Copies Referenced Objects Too)
A **deep copy** creates a new top-level object **and** new copies of all referenced objects inside it.

✅ No shared nested state  
✅ Safe for immutability and security

#### Example
```java
class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy constructor
    Person(Person other) {
        this.name = other.name;
        this.address = new Address(other.address.city); // new object
    }
}

Address addr = new Address("NYC");
Person p1 = new Person("Umair", addr);
Person p2 = new Person(p1); // deep copy

p2.address.city = "DC";
System.out.println(p1.address.city); // NYC (independent)
```

### When Shallow Copy Is “OK”
Shallow copy is fine when:
- Referenced objects are **immutable** (e.g., `String`, `Integer`, `LocalDate`)
- You want shared read-only state

### Interview One-Liner
> Shallow copy duplicates the outer object but shares inner references; deep copy duplicates both the outer object and its nested objects.

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

---

## 7.5) How to Make Your Class Immutable (Unmodifiable) — Step-by-Step

In interviews, “make the class unmodifiable” usually means: **make the class immutable** (its state can’t change after construction).

### Step 1 — Make the class `final`
Prevents subclasses from adding mutability by overriding methods.

```java
public final class Employee { }
```

### Step 2 — Make fields `private final`
- `private` blocks external access
- `final` ensures fields are assigned once

```java
private final String name;
private final int age;
```

### Step 3 — No setters
Don’t expose any mutator methods like `setName()`.

### Step 4 — Initialize everything in the constructor (validate invariants)
```java
public Employee(String name, int age) {
    if (age < 0) throw new IllegalArgumentException("age must be >= 0");
    this.name = name;
    this.age = age;
}
```

### Step 5 — Defensive copy mutable inputs (arrays, lists, maps, custom objects)
If you accept a mutable object in the constructor, **copy it** so callers can’t modify your internal state later.

```java
public final class Team {
    private final List<String> members;

    public Team(List<String> members) {
        this.members = List.copyOf(members); // immutable snapshot
    }
}
```

### Step 6 — Return defensive copies (or unmodifiable views) from getters
Never return internal mutable references directly.

```java
public List<String> getMembers() {
    return members; // safe because List.copyOf created an immutable list
}
```

If you store a mutable list internally (not recommended), return an unmodifiable view:
```java
public List<String> getMembers() {
    return Collections.unmodifiableList(members);
}
```

### Step 7 — Be careful with arrays
Arrays are mutable, so always copy on the way in and out.

```java
public final class SecureKey {
    private final byte[] key;

    public SecureKey(byte[] key) {
        this.key = key.clone();          // defensive copy in
    }

    public byte[] getKey() {
        return key.clone();              // defensive copy out
    }
}
```

### Step 8 — Prefer immutable types inside your class
Use immutable types wherever possible:
- `String`, wrapper classes
- `LocalDate/LocalDateTime`
- `List.of(...)`, `Map.of(...)`, `Set.of(...)`
- `record` for data carriers

### Interview One-Liner
> To make a class immutable: make it `final`, make fields `private final`, remove setters, validate in constructors, and defensively copy mutable inputs/outputs.



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


---

## Why Do We Need Constructor Chaining in Java?

### Interview One-Liner
> Constructor chaining ensures that all constructors reuse common initialization logic, guaranteeing that an object is fully, consistently, and safely initialized.

---

### What Is Constructor Chaining?

Constructor chaining means **one constructor calls another constructor** to avoid duplication and ensure proper initialization.

Types:
- **Same class chaining** → `this(...)`
- **Parent class chaining** → `super(...)`

---

### Problem Without Constructor Chaining

```java
class User {
    String name;
    int age;

    User() {
        name = "Unknown";
        age = 0;
    }

    User(String name) {
        this.name = name;
        age = 0; // duplicated logic
    }
}
```

Problems:
- Code duplication
- Inconsistent initialization
- Harder maintenance

---

### Solution Using Constructor Chaining

```java
class User {
    String name;
    int age;

    User() {
        this("Unknown", 0);
    }

    User(String name) {
        this(name, 0);
    }

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Benefits:
- Single source of truth
- Safer object creation
- Cleaner design

---

### Constructor Chaining with Inheritance

```java
class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog");
    }
}
```

Execution order:
1. Parent constructor
2. Child constructor

---

### Rules (Very Important)

- `this()` or `super()` must be the **first statement**
- Cannot call both
- If neither is called, Java inserts `super()`

---

### Why JVM Enforces Constructor Chaining

- Prevents partially constructed objects
- Ensures parent state exists first
- Guarantees memory safety

---

### Final Interview Summary

- Avoids duplicated initialization
- Enforces parent-before-child construction
- Critical for immutability and invariants
