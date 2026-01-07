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

# Java Lambda Expressions — Top Interview Questions & Coding Problems

Lambda expressions were introduced in **Java 8** to support **functional programming** and enable **clean, concise code**, especially when working with **functional interfaces** and **streams**.

This README focuses on **most asked lambda interview questions**, including **theory + coding questions**, in a clear learning flow.

---

## 1) What is a Lambda Expression in Java?

A **lambda expression** is an anonymous function that:
- Has **no name**
- Has **parameters**
- Has a **body**
- Can be passed as an argument

### Syntax
```java
(parameters) -> expression
(parameters) -> { statements; }
```

Example:
```java
(x, y) -> x + y
```

---

## 2) Why Were Lambda Expressions Introduced?

- Reduce boilerplate code
- Enable functional programming
- Improve readability
- Work seamlessly with Streams and APIs

---

## 3) What is a Functional Interface?

A **functional interface** has **exactly one abstract method**.

Examples:
- `Runnable`
- `Callable`
- `Comparator`
- `Predicate`
- `Function`
- `Consumer`
- `Supplier`

```java
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
```

---

## 4) Write a Lambda to Implement a Functional Interface

```java
Calculator calc = (a, b) -> a + b;
System.out.println(calc.add(2, 3)); // 5
```

---

## 5) Lambda vs Anonymous Class

| Lambda | Anonymous Class |
|------|-----------------|
| Concise | Verbose |
| No `this` shadowing | Has its own `this` |
| Functional interfaces only | Any interface/class |

---

## 6) Can Lambda Access Local Variables?

✅ Yes, but only **effectively final** variables.

```java
int x = 10;
Runnable r = () -> System.out.println(x);
```

❌ Not allowed:
```java
x++; // compilation error
```

---

## 7) Famous Coding Question — Sort a List Using Lambda

```java
List<String> names = List.of("Umair", "Ali", "Ahmed");

names.stream()
     .sorted((a, b) -> a.compareTo(b))
     .forEach(System.out::println);
```

---

## 8) Write a Lambda Using Comparator

```java
Comparator<Integer> comp = (a, b) -> b - a;
System.out.println(comp.compare(10, 5)); // positive
```

---

## 9) Lambda with forEach()

```java
List<Integer> nums = List.of(1, 2, 3);

nums.forEach(n -> System.out.println(n));
```

---

## 10) Lambda with Predicate (Filter Even Numbers)

```java
Predicate<Integer> isEven = n -> n % 2 == 0;

List<Integer> evens = List.of(1,2,3,4,5).stream()
    .filter(isEven)
    .toList();
```

---

## 11) Lambda with Function (Transform Data)

```java
Function<String, Integer> lengthFn = s -> s.length();
System.out.println(lengthFn.apply("Java")); // 4
```

---

## 12) Lambda with Consumer

```java
Consumer<String> printer = s -> System.out.println(s);
printer.accept("Hello Lambda");
```

---

## 13) Lambda with Supplier

```java
Supplier<Double> random = () -> Math.random();
System.out.println(random.get());
```

---

## 14) Lambda vs Method Reference

```java
// Lambda
nums.forEach(n -> System.out.println(n));

// Method Reference
nums.forEach(System.out::println);
```

---

## 15) Can Lambda Throw Checked Exceptions?

❌ Not directly.

Workarounds:
- Handle inside lambda
- Wrap in runtime exception

---

## 16) Lambda Scope and `this` Keyword

- `this` refers to **enclosing class**
- Lambda does not create a new scope

```java
Runnable r = () -> System.out.println(this);
```

---

## 17) Can Lambda Be Generic?

✅ Yes.

```java
Function<Integer, Integer> square = x -> x * x;
```

---

## 18) Lambda vs Streams — Common Confusion

- Lambda → **behavior**
- Stream → **data processing pipeline**

They often work **together**, not as replacements.

---

## 19) Common Interview Traps

- Lambdas work only with **functional interfaces**
- Variables must be **effectively final**
- Lambdas cannot have state like classes

---

## 20) One-Line Interview Answers

- Lambda is an anonymous function
- Reduces boilerplate code
- Used with functional interfaces
- Improves readability
- Enables functional programming

---

## Quick Interview Summary

- Lambdas simplify behavior passing
- Used heavily with Streams
- Understand Predicate, Function, Consumer, Supplier
- Know limitations (checked exceptions, state)

---

## Interview Tip

If you can:
- Write lambdas for common functional interfaces
- Explain lambda vs anonymous class
- Use lambdas in sorting and filtering

You can clear **most Java Lambda interview rounds confidently**.


> 💡 Learning lambdas is like learning shorthand: write less, do more. Once you get used to it, your Java code becomes much more elegant and powerful!
> 



