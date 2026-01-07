# Java Core Collections & Language Concepts — Interview Guide

This README explains **core Java data structures and language features** that are **frequently tested in interviews**.
It is structured from **basics → collections → internals → performance**, with examples and interview questions.

---

## 1) ArrayList in Java

### What is an ArrayList?
`ArrayList` is a **resizable array implementation** of the `List` interface.

### Key Characteristics
- Maintains insertion order
- Allows duplicates
- Allows random access (`get(index)`)
- Not synchronized

```java
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
```

### Internal Working
- Backed by a **dynamic array**
- Default capacity = `10`
- Grows by **~50%** when full

---

## 2) ArrayList vs Array

| Feature | Array | ArrayList |
|------|------|-----------|
| Size | Fixed | Dynamic |
| Primitives | Supported | Not supported |
| Performance | Faster | Slightly slower |
| API Support | Limited | Rich API |
| Type Safety | Weak | Strong (Generics) |

### Interview One-Liner
> Use arrays for fixed-size, performance-critical tasks; use ArrayList for flexibility.

---

## 3) Autoboxing & Unboxing

### What is Autoboxing?
Automatic conversion between **primitive types** and their **wrapper classes**.

```java
Integer x = 10; // autoboxing
int y = x;      // unboxing
```

### Why It Matters
- Required for collections
- Adds performance overhead
- Can cause `NullPointerException`

```java
Integer i = null;
int x = i; // NPE
```

---

## 4) Enums in Java

### What is an Enum?
An `enum` is a **special class** used to define **constant values**.

```java
enum Status {
    ACTIVE, INACTIVE, BLOCKED
}
```

### Features
- Type-safe
- Can have fields, methods, constructors
- Singleton by design

```java
enum Day {
    MONDAY, TUESDAY;
}
```

---

## 5) LinkedList in Java

### What is LinkedList?
`LinkedList` is a **doubly linked list** implementation of:
- `List`
- `Deque`
- `Queue`

```java
LinkedList<String> list = new LinkedList<>();
list.add("A");
list.addFirst("B");
```

### Characteristics
- No random access
- Faster insert/delete
- More memory overhead

---

## 6) ArrayList vs LinkedList

| Feature | ArrayList | LinkedList |
|------|-----------|------------|
| Data Structure | Dynamic array | Doubly linked list |
| Access | Fast | Slow |
| Insert/Delete | Slow (middle) | Fast |
| Memory | Less | More |

---

## 7) Iterator in Java

### What is an Iterator?
Used to **traverse collections** safely.

```java
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

### Why Iterator?
- Avoids `ConcurrentModificationException`
- Supports safe removal

```java
it.remove();
```

---

## 8) Memory Considerations

### ArrayList Memory
- Stores elements in contiguous memory
- Resizing creates new array

### LinkedList Memory
- Each node stores:
  - Data
  - Previous reference
  - Next reference

### Interview Insight
> LinkedList uses more memory due to node references.

---

## 9) Big-O Notation (Time Complexity)

### ArrayList
| Operation | Complexity |
|--------|-----------|
| get | O(1) |
| add (end) | O(1) amortized |
| add (middle) | O(n) |
| remove | O(n) |

### LinkedList
| Operation | Complexity |
|--------|-----------|
| get | O(n) |
| add/remove (ends) | O(1) |
| contains | O(n) |

---

## 10) Famous Interview Questions

### Q1) Why is ArrayList faster for access?
Because it uses **index-based access**.

---

### Q2) Why does LinkedList consume more memory?
Because each node stores **two references** (prev & next).

---

### Q3) Why collections cannot store primitives?
They require **objects**, hence autoboxing.

---

### Q4) Difference between Iterator and for-each?
- Iterator allows removal
- for-each does not

---

### Q5) Why enums are preferred over constants?
- Type safety
- Readability
- Compile-time checks

---

### Q6) What causes ConcurrentModificationException?
Modifying a collection **while iterating** (without iterator).

---

### Q7) When does ArrayList resize?
When current size exceeds capacity.

---

### Q8) Is ArrayList thread-safe?
❌ No. Use `Collections.synchronizedList()` or `CopyOnWriteArrayList`.

---

### Q9) Can enums have constructors?
✅ Yes (implicitly private).

---

### Q10) Which is better for stack/queue?
`ArrayDeque` is preferred over LinkedList.

---

## 11) Interview One-Liners

- ArrayList is backed by a dynamic array
- LinkedList uses a doubly linked list
- Autoboxing converts primitives to objects
- Enums are type-safe constants
- Big-O helps choose the right data structure

---

## Quick Summary

- Use ArrayList for fast access
- Use LinkedList for frequent insert/delete
- Be careful with autoboxing
- Prefer enums over constants
- Always think in terms of Big-O

---

## Interview Tip

If you can explain:
- Internal working
- Memory impact
- Time complexity

You can clear **most Java collections interviews confidently**.
