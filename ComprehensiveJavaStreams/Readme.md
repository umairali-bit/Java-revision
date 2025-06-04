## 🌊 What is a Stream in Java?

Java Streams are like a **conveyor belt**—they move data from one operation to another without storing it.

> 💡 **Analogy**: Think of a stream as a sushi conveyor belt. You don't grab all the sushi at once (like with a list), you pick what you need as it flows by.

Java defines a stream as:

> "A sequence of elements supporting sequential and parallel aggregate operations."

In simpler terms:

* A stream lets you **process data** (like filter, map, sort) in a clean and **pipeline-like** way.
* It’s **declarative**: You say *what* you want, not *how*.

---

## 📚 Streams vs Collections

| Feature     | Collection                | Stream                                     |
| ----------- | ------------------------- | ------------------------------------------ |
| Stores data | ✅ Yes                     | ❌ No (computes on demand)                  |
| Operations  | Direct access to elements | Sequence of steps for processing           |
| Modifiable  | Yes                       | No                                         |
| Reusable    | Yes                       | No (once used, must create a new stream)   |
| Lazy?       | ❌ Eager                   | ✅ Yes (delays execution until terminal op) |

---

## 🧠 Why Use Streams?

* ✨ **Cleaner code**: Functional, less boilerplate
* 🧱 **Chaining**: Create processing pipelines
* ⚡ **Performance**: Parallel streams make large data handling faster
* 🧪 **Readable**: Like SQL for your data

---

## 🔁 Stream Lifecycle: Source → Intermediate → Terminal

### 1. 📥 **Source**

Where your data comes from (usually a collection, array, or file).

```java
List<String> names = List.of("Alice", "Bob", "Charlie");
Stream<String> stream = names.stream();
```

### 2. 🔧 **Intermediate Operations**

Transform or filter data. **Lazy** – they don’t do anything until a terminal operation is called.

| Method       | Description                      | Example                        |
| ------------ | -------------------------------- | ------------------------------ |
| `filter()`   | Keep elements matching condition | `.filter(s -> s.length() > 3)` |
| `map()`      | Transform elements               | `.map(String::toUpperCase)`    |
| `flatMap()`  | Flatten nested data structures   | `.flatMap(List::stream)`       |
| `sorted()`   | Sort elements                    | `.sorted()`                    |
| `distinct()` | Remove duplicates                | `.distinct()`                  |
| `limit(n)`   | Only keep the first `n` items    | `.limit(5)`                    |
| `skip(n)`    | Skip the first `n` items         | `.skip(3)`                     |
| `peek()`     | Perform action for debugging     | `.peek(System.out::println)`   |
| `mapToInt()` | Convert to IntStream             | `.mapToInt(String::length)`    |

### 3. 📦 **Terminal Operations**

Trigger the actual processing.

| Method        | Description                            | Example                             |
| ------------- | -------------------------------------- | ----------------------------------- |
| `collect()`   | Gather into list/set/etc               | `.collect(Collectors.toList())`     |
| `forEach()`   | Perform action on each element         | `.forEach(System.out::println)`     |
| `reduce()`    | Reduce elements to a single result     | `.reduce("", String::concat)`       |
| `count()`     | Count number of elements               | `.count()`                          |
| `anyMatch()`  | Check if any element matches condition | `.anyMatch(s -> s.startsWith("A"))` |
| `allMatch()`  | Check if all elements match condition  | `.allMatch(s -> s.length() > 1)`    |
| `noneMatch()` | Check if no element matches condition  | `.noneMatch(String::isEmpty)`       |
| `findFirst()` | Find the first matching element        | `.findFirst()`                      |
| `findAny()`   | Find any matching element              | `.findAny()`                        |

> ⚠️ You can only call one terminal operation per stream.

---

## 🧪 Stream Examples

### Filtering and Mapping

```java
List<String> names = List.of("Ali", "Alex", "Bob", "Umair");

List<String> result = names.stream()
    .filter(name -> name.startsWith("A"))
    .map(String::toUpperCase)
    .collect(Collectors.toList());

System.out.println(result); // [ALI, ALEX]
```

### Summing Integer List with reduce()

```java
List<Integer> numbers = List.of(1, 2, 3, 4);
int sum = numbers.stream().reduce(0, Integer::sum);
System.out.println(sum); // 10
```

---

## 📚 Special Streams for Primitives

Java provides special streams for performance:

| Type     | Stream Type    |
| -------- | -------------- |
| `int`    | `IntStream`    |
| `long`   | `LongStream`   |
| `double` | `DoubleStream` |

```java
IntStream.range(1, 5).forEach(System.out::print); // 1234
```

---

## 🔄 flatMap vs map – What's the Difference?

> 👉 `map()` is like putting each value into its own box. You get boxes inside boxes.
> 👉 `flatMap()` is like opening all the boxes and putting everything in one.

```java
List<List<String>> nested = List.of(
    List.of("A", "B"),
    List.of("C", "D")
);

List<String> flat = nested.stream()
    .flatMap(Collection::stream)
    .collect(Collectors.toList());

System.out.println(flat); // [A, B, C, D]
```

---

## 🌟 collect() – Turning Streams into Collections

```java
List<String> collected = names.stream()
    .filter(s -> s.length() > 3)
    .collect(Collectors.toList());
```

Common `Collectors`:

| Collector          | Purpose                              |
| ------------------ | ------------------------------------ |
| `toList()`         | Collect into List                    |
| `toSet()`          | Collect into Set                     |
| `joining()`        | Combine elements into a string       |
| `groupingBy()`     | Group by a property                  |
| `counting()`       | Count elements                       |
| `summarizingInt()` | Stats (count, sum, avg, etc) for int |

---

## 🧵 Parallel Streams

Use `.parallelStream()` to split work across CPU cores:

```java
list.parallelStream()
    .map(String::toUpperCase)
    .forEach(System.out::println);
```

> ⚠️ Use with care! Only for **large datasets** and **stateless operations**.

---

## ✅ Summary

* ✅ Streams **process** data, not store it
* ✅ Operations are **lazy** until a **terminal** one runs
* ✅ `map`, `filter`, `flatMap`, `collect`, `reduce` are your best friends
* ✅ Use `.stream()` for sequential, `.parallelStream()` for performance

> 💡 Streams help you write concise, readable, and modern Java code – like writing clean SQL queries for objects!
