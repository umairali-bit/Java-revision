# Nested Classes in Java — Complete Guide with Examples & Interview Questions

Java allows a class to contain **other types** such as classes, interfaces, enums, and records inside its body.  
These are known as **nested classes (or nested types)**.

Nested classes are mainly used to:
- Group logically related code
- Improve encapsulation
- Increase readability and maintainability

---

## Types of Nested Classes in Java

Java provides **four types of nested classes**:

1. Static Nested Class  
2. Inner (Non‑Static) Class  
3. Local Class  
4. Anonymous Class  

---

## 1) Static Nested Class

### Definition
A **static nested class** is a class declared with the `static` keyword inside another class.

- Accessed using the **outer class name**
- Does **not require** an instance of the outer class
- Can access **private static members** of the outer class

### Example
```java
class Outer {

    private static String message = "Hello";

    static class StaticNested {
        void show() {
            System.out.println(message);
        }
    }
}

Outer.StaticNested obj = new Outer.StaticNested();
obj.show();
```

### Key Points
- Similar to static fields/methods
- Cannot access non‑static members directly
- Better performance than inner classes

---

## 2) Inner Class (Non‑Static Nested Class)

### Definition
An **inner class** is a non‑static class declared inside another class.

- Requires an **instance of the outer class**
- Can access **all members** (including private instance members)
- Can have all access modifiers

### Example
```java
class Outer {

    private String name = "Umair";

    class Inner {
        void display() {
            System.out.println(name);
        }
    }
}

Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();
inner.display();
```

### Key Points
- Tightly coupled with outer class instance
- Used when inner class logically belongs to outer class

---

## 3) Local Class

### Definition
A **local class** is defined **inside a method body**.

- Scope limited to the method
- Cannot have access modifiers
- Can access:
  - Instance members of outer class
  - Local variables that are **final or effectively final**

### Example
```java
class Outer {

    void process() {
        int x = 10; // effectively final

        class LocalClass {
            void print() {
                System.out.println(x);
            }
        }

        LocalClass obj = new LocalClass();
        obj.print();
    }
}
```

### Key Points
- Exists only during method execution
- Useful for helper logic inside a method

---

## 4) Anonymous Class

### Definition
An **anonymous class** is:
- A class **without a name**
- Declared and instantiated in **one statement**
- Always created as part of an expression

Anonymous classes either:
- Extend a class, or
- Implement an interface

### Example (Interface)
```java
Comparator<String> comp = new Comparator<>() {
    @Override
    public int compare(String a, String b) {
        return a.length() - b.length();
    }
};
```

### Example (Class)
```java
class Employee {
    void work() {
        System.out.println("Working");
    }
}

Employee e = new Employee() {
    @Override
    void work() {
        System.out.println("Anonymous Employee");
    }
};
```

### Key Points
- `{}` indicates class body
- Must end with a semicolon
- Mostly replaced by **lambda expressions** (Java 8+)

---

## Anonymous Class vs Lambda Expression

| Anonymous Class | Lambda |
|-----------------|--------|
| Verbose | Concise |
| Can extend classes | Only interfaces |
| Has its own scope | Shares enclosing scope |
| Used pre‑Java 8 | Preferred post‑Java 8 |

---

## Access Rules Summary

| Nested Type | Access Outer Members | Requires Outer Instance |
|------------|---------------------|-------------------------|
| Static Nested | Static only | ❌ |
| Inner | Static + Instance | ✅ |
| Local | Static + Instance + final locals | ✅ |
| Anonymous | Same as local class | ✅ |

---

## 10 Famous Interview Questions on Nested Classes

### 1) Why use nested classes?
To logically group code and improve encapsulation.

### 2) Can a static nested class access non‑static members?
❌ No, without an instance.

### 3) Why inner classes need an outer instance?
Because they are tied to the outer object state.

### 4) Can local classes have access modifiers?
❌ No.

### 5) Why local variables must be effectively final?
To prevent inconsistent state during execution.

### 6) Are anonymous classes subclasses?
✅ Yes, they either extend a class or implement an interface.

### 7) Can anonymous classes have constructors?
❌ No, but they can use instance initializer blocks.

### 8) Are anonymous classes reusable?
❌ No, they are one‑time use.

### 9) Why are lambdas preferred over anonymous classes?
Cleaner syntax and better readability.

### 10) Can nested classes be private?
✅ Yes (except local and anonymous).

---

## Interview One‑Liners

- Static nested classes behave like static members
- Inner classes need an outer instance
- Local classes are method‑scoped
- Anonymous classes are unnamed and one‑time use
- Lambdas replaced most anonymous classes

---

## Quick Summary

- Java supports four nested class types
- Each type has different access rules
- Anonymous classes are expressions, not declarations
- Nested classes improve structure and encapsulation

---

## Interview Tip

If you can clearly explain:
- When to use static vs inner classes
- Anonymous class vs lambda
- Access rules and scope

You can confidently answer **most nested‑class interview questions**.
