# Introduction to Java — Core Concepts & Interview Guide

This README provides a **structured introduction to Java**, covering **basic syntax, control flow, methods, variables, and OOP fundamentals**.  
It is designed for **beginners** and also serves as a **quick interview revision guide**.

---

## 1) What is Java?

Java is a **high-level, object-oriented, platform-independent programming language**.

### Key Features
- Platform independent (Write Once, Run Anywhere)
- Object-Oriented
- Strongly typed
- Automatic memory management (Garbage Collection)
- Rich standard library

---

## 2) Java Program Structure

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

### Explanation
- `class` → blueprint
- `main` → entry point
- `public static void main(String[] args)` → JVM-required signature

---

## 3) Variables in Java

### Local Variables
- Declared inside a method or block
- Must be initialized before use
- Scope limited to the block

```java
void test() {
    int x = 10; // local variable
}
```

### Scope
- Variables exist **only within their declared block**
- Cannot be accessed outside the scope

---

## 4) Keywords and Expressions

### Keywords
Keywords are **reserved words** with predefined meaning.

Examples:
`public`, `static`, `class`, `void`, `if`, `else`, `switch`, `return`, `new`

❌ Cannot be used as variable names.

### Expressions
An expression is a **combination of variables, values, and operators**.

```java
int sum = a + b;
```

---

## 5) if-else Statement

Used for **decision making**.

```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

## 6) switch Statement

Used when comparing a variable against **multiple constant values**.

```java
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid");
}
```

### Notes
- `break` prevents fall-through
- Java 7+ supports `String` in switch

---

## 7) Loops in Java

### for Loop
Used when number of iterations is known.

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### while Loop
Condition checked **before execution**.

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### do-while Loop
Executes **at least once**.

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

## 8) Methods in Java

A method is a **block of code** that performs a task.

```java
int add(int a, int b) {
    return a + b;
}
```

---

## 9) Method Overloading

Multiple methods with **same name but different parameters**.

```java
int add(int a, int b) {
    return a + b;
}

double add(double a, double b) {
    return a + b;
}
```

### Rules
- Method name same
- Parameter list must differ
- Return type alone is not sufficient

---

## 10) Method Overriding

A subclass provides a **specific implementation** of a parent method.

```java
class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child");
    }
}
```

### Rules
- Same method signature
- Happens at runtime (Runtime Polymorphism)
- Access level cannot be reduced

---

## 11) Overloading vs Overriding

| Feature | Overloading | Overriding |
|------|------------|------------|
| Occurs | Compile-time | Runtime |
| Inheritance | Not required | Required |
| Method name | Same | Same |
| Parameters | Different | Same |

---

## 12) Famous Java Interview Questions

### Q1) Why is Java platform-independent?
Because Java code is compiled into **bytecode**, which runs on the JVM.

---

### Q2) Difference between == and equals()?
- `==` compares references
- `equals()` compares content

---

### Q3) What is the scope of a local variable?
Limited to the **block or method** in which it is declared.

---

### Q4) Can we overload main()?
✅ Yes, but JVM always calls the standard signature.

---

### Q5) Can we override static methods?
❌ No. Static methods are **hidden**, not overridden.

---

### Q6) Difference between while and do-while?
- while → condition checked first
- do-while → executes at least once

---

### Q7) Why is Java strongly typed?
Every variable must have a **declared type**, reducing runtime errors.

---

### Q8) What happens if break is missing in switch?
Execution **falls through** to the next case.

---

## 13) Interview One-Liners

- Java is **platform-independent**, not machine-independent
- Local variables have **no default values**
- Overloading is **compile-time polymorphism**
- Overriding is **runtime polymorphism**
- `do-while` executes at least once

---

## Quick Summary

- Java is object-oriented and strongly typed
- Control flow uses if-else, switch, and loops
- Methods support overloading and overriding
- Understanding scope and flow is critical for interviews

---

## Interview Tip

If you can clearly explain:
- Loops vs conditions
- Overloading vs overriding
- Scope of variables

You can clear **most Java beginner to mid-level interviews** confidently.
