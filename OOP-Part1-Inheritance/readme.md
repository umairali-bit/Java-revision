# OOP Part 1 — Inheritance in Java (Ordered Guide + Examples + Interview Qs)

> This README is a **flow-based** guide to **Inheritance** in Java, with practical examples and common interview questions.

---

## 1) What is Inheritance?

**Inheritance** lets a class (**child / subclass**) acquire fields and methods from another class (**parent / superclass**).

### Why it matters
- **Code reuse** (share common logic in a parent class)
- **Extensibility** (specialize behavior in subclasses)
- **Polymorphism** (treat child objects as parent types)

### “Is-A” relationship
Inheritance models an **is-a** relationship:

- `Car` **is a** `Vehicle`
- `Dog` **is an** `Animal`

---

## 2) Basic Syntax (`extends`)

```java
class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void childOnly() {
        System.out.println("Child specific");
    }
}

public class Demo {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();      // inherited
        c.childOnly();  // child method
    }
}
```

---

## 3) Types of Inheritance in Java (Classes)

Java supports these **with classes**:

### 3.1 Single Inheritance
One parent → one child

```java
class A {}
class B extends A {}
```

### 3.2 Multilevel Inheritance
A → B → C

```java
class A {}
class B extends A {}
class C extends B {}
```

### 3.3 Hierarchical Inheritance
One parent → multiple children

```java
class A {}
class B extends A {}
class C extends A {}
```

> ⚠️ Java does **not** support **multiple inheritance with classes** (a class cannot extend two classes).  
> ✅ Multiple inheritance is supported via **interfaces**.

---

## 4) What Gets Inherited? (Fields & Methods)

### Inherited
✅ `public` and `protected` members  
✅ package-private members (only if subclass is in same package)

### Not inherited
❌ `private` members (they exist, but not directly accessible)  
❌ constructors (constructors are **not inherited**, but they **do run** via chaining)

---

## 5) The `super` Keyword (Very Important)

### 5.1 Access parent members
```java
class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void printBoth() {
        System.out.println(name);       // Child
        System.out.println(super.name); // Parent
    }
}
```

### 5.2 Call parent method
```java
class Parent {
    void work() { System.out.println("Parent work"); }
}

class Child extends Parent {
    @Override
    void work() {
        super.work();
        System.out.println("Child work");
    }
}
```

---

## 6) Constructor Chaining in Inheritance (`super()`)

### Key rule
When a child object is created:
1. Parent constructor runs first
2. Then child constructor runs

```java
class Parent {
    Parent() {
        System.out.println("Parent ctor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child ctor");
    }
}

public class Demo {
    public static void main(String[] args) {
        new Child();
    }
}
```

Output:
```
Parent ctor
Child ctor
```

### Calling a parameterized parent constructor
```java
class Parent {
    Parent(String msg) {
        System.out.println(msg);
    }
}

class Child extends Parent {
    Child() {
        super("Hello from Parent");
    }
}
```

> If you don’t write `super(...)`, Java inserts `super()` automatically (no-arg) — **only if it exists**.

---

## 7) Method Overriding (Runtime Polymorphism)

A subclass can **override** a parent method to provide a new implementation.

### Rules (must know)
- Same method name + same parameters
- Return type: same or covariant (subtype)
- Access cannot be more restrictive (e.g., `public` → `protected` is NOT allowed)
- `@Override` is recommended

```java
class Parent {
    void speak() { System.out.println("Parent speaks"); }
}

class Child extends Parent {
    @Override
    void speak() { System.out.println("Child speaks"); }
}
```

---

## 8) Overloading vs Overriding (Interview Favorite)

| Feature | Overloading | Overriding |
|--------|-------------|------------|
| Happens in | Same class (or subclass) | Subclass |
| Parameters | Must change | Must be same |
| Binding | Compile-time | Runtime |
| Polymorphism | Compile-time | Runtime |

---

## 9) Upcasting & Downcasting

### Upcasting (Safe)
Treat child as parent.

```java
Parent p = new Child(); // upcasting
```

### Downcasting (Needs caution)
```java
Parent p = new Child();
Child c = (Child) p; // ok

Parent p2 = new Parent();
// Child c2 = (Child) p2; // ClassCastException at runtime
```

Use `instanceof` to be safe:
```java
if (p2 instanceof Child) {
    Child c2 = (Child) p2;
}
```

---

## 10) `final`, `static`, `private` with Inheritance

### `final` method
Cannot be overridden.
```java
class Parent {
    final void secure() {}
}
```

### `final` class
Cannot be extended.
```java
final class Utility {}
```

### `static` methods
Are **not overridden**, they are **hidden**.
```java
class Parent {
    static void show() { System.out.println("Parent"); }
}
class Child extends Parent {
    static void show() { System.out.println("Child"); }
}
```

### `private` methods
Not inherited in the polymorphic sense (cannot be overridden).

---

## 11) Inheritance vs Composition (Design Question)

### Prefer composition when:
- You want flexible behavior
- You don’t want tight coupling to parent implementation
- Relationship is more like **has-a**

Example: `Car has an Engine` (composition), not `Car is an Engine`.

---

## 12) Common Pitfalls

- Using inheritance just for code reuse (composition may be better)
- Forgetting to call `super(...)` for required parent constructors
- Confusing `static` method hiding with overriding
- Breaking Liskov Substitution Principle (child must be usable as parent)

---

## 13) Mini “Write Code” Practice

### A) Print constructor order
Write Parent/Child constructors and observe output.

### B) Override + call parent
Override a method and call `super.method()`.

### C) Polymorphism demo
Store multiple child objects in a `List<Parent>` and call overridden methods.

---


---


---

## 14) 20 Famous Inheritance Interview Questions (With Answers)

### 1) What is inheritance in Java?
Inheritance is an OOP mechanism where a **child class acquires properties and behavior (fields and methods) of a parent class** using the `extends` keyword.  
It promotes **code reuse**, **extensibility**, and **polymorphism**.

---

### 2) What is the difference between **is-a** and **has-a**?
- **Is-a** → Inheritance (Dog *is an* Animal)
- **Has-a** → Composition (Car *has an* Engine)

Use inheritance for specialization, composition for flexibility.

---

### 3) Which members are inherited and which are not?
**Inherited:**
- `public`, `protected`
- package-private (same package)

**Not inherited:**
- `private` members  
- constructors (but they execute via chaining)

---

### 4) Why doesn’t Java support multiple inheritance with classes?
To avoid the **Diamond Problem**, where ambiguity occurs if two parent classes define the same method.  
Java solves this using **interfaces** instead.

---

### 5) What is `super` used for?
- Access parent class fields and methods
- Call parent constructors

```java
super.method();
super();
```

---

### 6) Are constructors inherited?
❌ No.  
Constructors are **not inherited**, but **parent constructors always run first** via constructor chaining.

---

### 7) What is constructor chaining? Why is parent constructor called first?
Constructor chaining is calling one constructor from another using `this()` or `super()`.  
Parent constructors run first to ensure the **base state is fully initialized before child state**.

---

### 8) What is method overriding?
When a child class provides a **specific implementation of a parent method** with the same signature.  
This enables **runtime polymorphism**.

---

### 9) Overloading vs overriding?

| Aspect | Overloading | Overriding |
|------|-------------|------------|
| Parameters | Different | Same |
| Binding | Compile-time | Runtime |
| Inheritance | Not required | Required |

---

### 10) What is runtime polymorphism?
Method calls are resolved **at runtime** based on the **actual object type**, not the reference type.

```java
Parent p = new Child();
p.method(); // Child version executes
```

---

### 11) What is upcasting and why is it useful?
Treating a child object as a parent reference.

```java
Parent p = new Child();
```

Useful for **polymorphism**, **loose coupling**, and **API design**.

---

### 12) What is downcasting and when can it fail?
Casting a parent reference back to a child.

```java
Child c = (Child) p;
```

Fails with `ClassCastException` if the object is not actually a child.

---

### 13) Can you override a `static` method?
❌ No.  
Static methods are **hidden**, not overridden. Method selection depends on reference type.

---

### 14) Can you override a `final` method?
❌ No.  
Final methods are explicitly blocked from being overridden.

---

### 15) Can you extend a `final` class?
❌ No.  
Final classes cannot be inherited.

---

### 16) Can you override a `private` method?
❌ No.  
Private methods are not visible to subclasses.

---

### 17) What is the `Object` class and why is it important?
`Object` is the **root class of all Java classes**.  
It provides fundamental methods like `toString()`, `equals()`, `hashCode()`, and `clone()`.

---

### 18) What is method hiding?
When a child class defines a **static method** with the same signature as a parent static method.  
Resolution happens at **compile time**.

---

### 19) When should you prefer composition over inheritance?
Prefer composition when:
- You want loose coupling
- Behavior can change
- Relationship is **has-a**, not **is-a**

---

### 20) What is Liskov Substitution Principle (LSP)?
A child class must be **fully substitutable** for its parent without breaking behavior.  
Violations occur when child classes weaken guarantees or throw unexpected exceptions.

---
