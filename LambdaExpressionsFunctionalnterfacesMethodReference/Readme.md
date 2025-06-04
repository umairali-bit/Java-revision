### 🧠 What is a Lambda Expression?

Imagine you're giving someone instructions like “turn off the lights.” You don’t write a full manual—you just say it. Lambda expressions are the same: **short, anonymous blocks of code that represent behavior**.

> 💡 Think of a lambda as a sticky note with a small task you hand to Java: "When this happens, do this!"

```java
// Traditional way
Runnable r1 = new Runnable() {
    public void run() {
        System.out.println("Running!");
    }
};

// Lambda version
Runnable r2 = () -> System.out.println("Running!");
```

---

### 📘 What is a Functional Interface?

A **Functional Interface** is an interface with **only one abstract method**. This is what lambda expressions can target and implement.

> ✨ Analogy: Think of a functional interface as a job description with one main task. A lambda is the candidate who just promises to do that one task.

```java
@FunctionalInterface
interface Printer {
    void print(String message);
}
```

**Why it matters**:

* Allows concise behavior definition
* Makes code flexible and reusable
* Enables clean, readable APIs

**Common Functional Interfaces**:

* `Runnable` – no parameters, no return
* `Callable<V>` – no parameters, returns a value
* Custom interfaces like `Printer`, `Calculator`, etc.

---

### ✨ Lambda Syntax

```java
(parameters) -> expression
(parameters) -> { statements }
```

**Examples:**

```java
(String s) -> System.out.println(s)
(a, b) -> a + b
() -> System.out.println("Hi")
```

---

## 🔍 Core Functional Interfaces Explained

These are part of `java.util.function` and are used often in lambda expressions.

### 1. **Consumer**

* **Method**: `void accept(T t)`
* **Use**: Perform an action on the given input
* **Analogy**: Like a printer. You give it something (e.g., a string), and it "uses" it (prints it).

```java
Consumer<String> printer = s -> System.out.println("You said: " + s);
printer.accept("Hello!");
```

**BiConsumer\<T, U>**: Takes two inputs.

```java
BiConsumer<Double, Double> printCoords =
    (lat, lng) -> System.out.printf("Coords: %.2f, %.2f%n", lat, lng);
```

---

### 2. **Supplier**

* **Method**: `T get()`
* **Use**: Supply or produce a value
* **Analogy**: Like a vending machine. You ask, and it gives something back.

```java
Supplier<Double> randomValue = () -> Math.random();
System.out.println(randomValue.get());
```

---

### 3. **Function\<T, R>**

* **Method**: `R apply(T t)`
* **Use**: Transform a value into another
* **Analogy**: Like a translator. Input something in English, get it back in Spanish.

```java
Function<String, Integer> lengthFunc = s -> s.length();
System.out.println(lengthFunc.apply("Java")); // 4
```

**BiFunction\<T, U, R>**:

```java
BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
System.out.println(adder.apply(2, 3)); // 5
```

---

### 4. **Predicate**

* **Method**: `boolean test(T t)`
* **Use**: Test a condition
* **Analogy**: Like a filter. You ask: "Does this meet the condition?"

```java
Predicate<String> isHello = s -> s.equalsIgnoreCase("hello");
System.out.println(isHello.test("Hello")); // true
```

**BiPredicate\<T, U>**:

```java
BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
```

---

## 🔀 Real-World Use with Collections

```java
List<String> names = List.of("Alice", "Bob", "Charlie");

names.forEach(name -> System.out.println(name));
names.removeIf(name -> name.startsWith("A"));
names.replaceAll(name -> name.toUpperCase());
```

---

### 📂 Arrays.setAll()

```java
String[] items = new String[5];
Arrays.setAll(items, i -> "Item #" + (i + 1));
System.out.println(Arrays.toString(items));
```

---

## 🧰 Method References

| Type                         | Example                     | Meaning                           |
| ---------------------------- | --------------------------- | --------------------------------- |
| Static method                | `ClassName::staticMethod`   | Call a static method              |
| Specific object’s method     | `object::instanceMethod`    | Bound to a specific object        |
| Any object’s instance method | `ClassName::instanceMethod` | Applies to an object passed later |
| Constructor                  | `ClassName::new`            | Calls a constructor               |

**Examples:**

```java
// Static
Consumer<String> c = System.out::println;

// Unbound instance method
Function<String, String> f = String::toUpperCase;

// Constructor
Supplier<List<String>> listCreator = ArrayList::new;
```

---

## 🧮 Function Composition

### Function Chaining

```java
Function<String, String> greet = s -> "Hi " + s;
Function<String, String> excited = s -> s + "!!!";

Function<String, String> combo = greet.andThen(excited);
System.out.println(combo.apply("Umair")); // Hi Umair!!!
```

### Predicate Logic

```java
Predicate<String> startsWithA = s -> s.startsWith("A");
Predicate<String> endsWithZ = s -> s.endsWith("Z");

Predicate<String> complex = startsWithA.and(endsWithZ);
```

### Consumer Chaining

```java
Consumer<String> greet = s -> System.out.print("Hello, ");
Consumer<String> name = System.out::println;

Consumer<String> sayHi = greet.andThen(name);
sayHi.accept("Ali"); // Hello, Ali
```

---

## 🪯 Sorting with Comparator

### Basic Sorting

```java
Comparator<String> byLength = Comparator.comparing(String::length);
List<String> list = new ArrayList<>(List.of("Apple", "Kiwi", "Banana"));
list.sort(byLength);
```

### Additional Comparator Helpers

* `reversed()` – reverse order
* `thenComparing()` – chain comparators

```java
Comparator<String> byLengthDesc = byLength.reversed();
Comparator<String> byLengthThenAlpha = byLength.thenComparing(Comparator.naturalOrder());
```

### Convenience Methods

* `List.sort(Comparator)` – sort in place
* `Stream.sorted(Comparator)` – returns a new sorted stream

```java
List<String> sorted = list.stream()
    .sorted(Comparator.comparing(String::length))
    .collect(Collectors.toList());
```

### Bounded vs Unbounded Generics (Extra Concept)

* **Bounded**: Restrict the types that can be used

```java
public <T extends Number> void print(T value) {
    System.out.println(value);
}
```

> 📦 Analogy: A bounded generic is like a toolbox that only accepts screwdrivers (not hammers or wrenches).

* **Unbounded**: Accepts any type

```java
public <T> void print(T value) {
    System.out.println(value);
}
```

> 📦 Analogy: An unbounded generic is like an open basket—you can throw anything inside.

---

## ✅ Summary

* ✅ Lambda = Short block of behavior
* ✅ Functional Interface = One abstract method
* ✅ Common Interfaces: Consumer, Function, Predicate, Supplier
* ✅ Method references simplify lambdas
* ✅ Lambdas power collection APIs, event handling, async programming
* ✅ Comparator helpers and functional chaining add power to sorting and filtering
* ✅ Bounded generics = specific type families; Unbounded = any type

---

> 💡 Learning lambdas is like learning shorthand: write less, do more. Once you get used to it, your Java code becomes much more elegant and powerful!
