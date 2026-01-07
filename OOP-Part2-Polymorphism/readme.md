# Object-Oriented Programming (OOP) — Core Pillars in Java

This README provides a **clear, ordered, interview-focused explanation** of the four core pillars of OOP:
- Encapsulation
- Abstraction
- Inheritance & Composition (design perspective)
- Polymorphism

Each section includes **definitions, examples, and famous interview questions with answers**.

---

## 1) Encapsulation

### What is Encapsulation?
Encapsulation is the practice of **bundling data and methods together** and **restricting direct access** to the data.

> Focus: **Data protection**

### How it is achieved
- `private` fields
- `public` methods (controlled access)

### Example
```java
class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

### Why Encapsulation Matters
- Prevents invalid state
- Improves maintainability
- Enhances security

### Interview Q&A
**Q: Is encapsulation only about getters and setters?**  
A: No. It is about **controlling access**, not just exposing fields.

---

## 2) Abstraction

### What is Abstraction?
Abstraction hides **implementation details** and exposes **only behavior**.

> Focus: **WHAT** an object does

### How it is achieved
- Interfaces
- Abstract classes

### Example (Interface)
```java
interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paying via UPI");
    }
}
```

### Why Abstraction Matters
- Reduces complexity
- Enables loose coupling
- Makes systems extensible

### Interview Q&A
**Q: Difference between abstraction and encapsulation?**  
A: Abstraction hides implementation, encapsulation hides data.

---

## 3) Composition (Design over Inheritance)

### What is Composition?
Composition means **building a class using other classes** instead of extending them.

> Focus: **HOW** behavior is built

### Relationship
- **has-a** relationship

### Example
```java
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private final Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car driving");
    }
}
```

### Why Composition Is Preferred
- Flexible design
- Avoids tight coupling
- Behavior can change at runtime

### Interview Q&A
**Q: Why prefer composition over inheritance?**  
A: Composition avoids rigid class hierarchies and improves flexibility.

---

## 4) Polymorphism

### What is Polymorphism?
Polymorphism allows the **same method call** to behave differently based on the **object type**.

> Focus: **One interface, many implementations**

### Types
- Compile-time (method overloading)
- Runtime (method overriding)

### Example (Runtime Polymorphism)
```java
class Animal {
    void speak() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Bark");
    }
}

Animal a = new Dog();
a.speak(); // Bark
```

### Why Polymorphism Matters
- Flexible code
- Easy extensibility
- Cleaner APIs

### Interview Q&A
**Q: What enables runtime polymorphism?**  
A: Method overriding + inheritance.

---

## Abstraction vs Composition (Common Interview Trap)

| Aspect | Abstraction | Composition |
|------|------------|-------------|
| Focus | What | How |
| Purpose | Hide implementation | Reuse behavior |
| Tool | Interface / abstract class | Object references |
| Relationship | Contract | has-a |

**Interview One-Liner:**  
> Abstraction defines the contract; composition wires the behavior.

---

## 10 Famous OOP Interview Questions (With Answers)

1) **Which pillar is most important?**  
All are important, but encapsulation is often the foundation.

2) **Can Java support multiple inheritance?**  
With classes ❌, with interfaces ✅.

3) **Is composition an OOP pillar?**  
It is a **design principle**, often preferred over inheritance.

4) **Does polymorphism require inheritance?**  
Runtime polymorphism does; compile-time does not.

5) **Can abstraction exist without encapsulation?**  
Yes, but good design uses both.

6) **Can you achieve polymorphism without interfaces?**  
Yes, via inheritance and method overriding.

7) **Why are interfaces heavily used in frameworks?**  
For loose coupling and multiple implementations.

8) **Is data hiding the same as abstraction?**  
No. Data hiding is part of encapsulation.

9) **Why is composition more flexible than inheritance?**  
Because behavior can be changed without modifying class hierarchy.

10) **Real-world OOP example?**  
Car (composition), Engine (component), Payment interface (abstraction).

---

## Quick Interview Summary

- Encapsulation → protects data  
- Abstraction → hides implementation  
- Composition → builds behavior  
- Polymorphism → dynamic behavior  

---

## Interview Tip

If you can clearly explain:
- Abstraction vs composition
- Encapsulation vs data hiding
- Runtime polymorphism

You can confidently clear **most OOP interview rounds**.
