# Java Collections — Practical Guide (Internals + Concurrency)

Java Collections are a set of **interfaces and classes** used to **store, organize, and manipulate groups of objects** efficiently.

At a high level, Java provides two main families:

1. **Collection (interface)** → stores individual elements  
   - List, Set, Queue, Deque
2. **Map (interface)** → stores **key → value** pairs  
   - HashMap, LinkedHashMap, TreeMap, etc.

---

## 1) Java Collection Framework — Big Picture

### Core Interfaces
- **Collection<E>**
  - Common operations: `add`, `remove`, `contains`, `size`, `isEmpty`, `iterator`, `clear`
- **List<E>** → ordered, index-based, allows duplicates
- **Set<E>** → unique elements only
- **Queue<E>** → typically FIFO
- **Deque<E>** → double-ended queue (stack + queue)

> ⚠️ `Map` is **not** a subtype of `Collection`

---

## 2) List — Ordered Collection (Duplicates Allowed)

### Guarantees
- Maintains **insertion order**
- Allows **duplicates**
- Supports **index-based access**

### Implementations

#### ArrayList
- Backed by a **dynamic array**
- Fast random access (`O(1)`)
- Slower insert/remove in the middle (shifting)

#### LinkedList
- Backed by a **doubly linked list**
- Fast insert/remove at ends
- Slower random access (`O(n)`)

#### Vector (Legacy)
- Synchronized version of ArrayList
- Rarely used today

#### Stack (Legacy)
- Extends Vector
- Prefer **Deque / ArrayDeque**

---

## 3) Set — Unique Elements (No Duplicates)

### Guarantees
- No duplicates
- No index-based access

### Implementations

#### HashSet
- Backed internally by a **HashMap**
- No ordering guarantee
- Fast lookups (`O(1)` average)

#### LinkedHashSet
- Maintains insertion order
- Slight overhead vs HashSet

#### TreeSet
- Sorted set (Red-Black Tree)
- Requires `Comparable` or `Comparator`

### Set Subtypes

#### SortedSet
- Sorted elements
- Methods: `first`, `last`, `headSet`, `tailSet`, `subSet`

#### NavigableSet
- Advanced navigation
- Methods: `lower`, `floor`, `ceiling`, `higher`
- `descendingSet`, `pollFirst`, `pollLast`

---

## 4) Queue & Deque

### Queue (FIFO)
- Insert: `add`, `offer`
- Remove: `remove`, `poll`
- Peek: `element`, `peek`

> `offer / poll / peek` are safer (no exceptions)

#### Implementations
- **PriorityQueue** → priority-based (not FIFO)
- **LinkedList** → works as Queue/Deque, often slower than ArrayDeque

### Deque (Double-Ended Queue)
- Acts as **stack + queue**
- Best choice: **ArrayDeque**
- Useful methods: `addFirst`, `addLast`, `removeFirst`, `removeLast`, `push`, `pop`

---

## 5) Map — Key → Value Collection

### Characteristics
- Keys are **unique**
- Values can repeat
- Core methods: `put`, `get`, `remove`, `containsKey`, `containsValue`

### Implementations

#### HashMap
- Fast average `O(1)` lookup
- No ordering
- Allows **one null key** and multiple null values

#### LinkedHashMap
- Preserves insertion or access order
- Commonly used for **LRU cache** patterns

#### TreeMap
- Sorted keys
- Supports range queries

#### Hashtable (Legacy)
- Synchronized
- Replaced by **ConcurrentHashMap**

---

## 6) Map Views (keySet, values, entrySet)

A `Map` provides three views:

- **keySet()**
  - Returns `Set<K>`
  - Contains all keys
- **values()**
  - Returns `Collection<V>`
  - Can contain duplicates
- **entrySet()**
  - Returns `Set<Map.Entry<K,V>>`
  - Best for iteration

✅ All views are **backed by the map**  
(Changes in the view affect the map and vice versa)

---

## 7) Collection vs Collections (CLEAR DIFFERENCE)

### Collection (Interface)
- **Type**: Interface  
- **Package**: `java.util`  
- **Purpose**: Represents a group of elements  
- **Extended by**: `List`, `Set`, `Queue`  
- **Defines**: Core operations like `add`, `remove`, `iterator`

```java
Collection<String> collection = new ArrayList<>();
collection.add("A");
collection.add("B");
```

## Collections (Utility Class)

### Key Details
- **Type**: Class  
- **Package**: `java.util`  
- **Purpose**: Provides static helper methods  
- **Contains**: Only static methods  
- **Used for**:
  - Sorting
  - Reversing
  - Searching
  - Synchronization
  - Creating unmodifiable wrappers

### Example
```java
List<Integer> nums = new ArrayList<>(List.of(3, 1, 2));
Collections.sort(nums);
Collections.reverse(nums);
```

## 8) How HashMap Works Internally

A `HashMap<K, V>` is implemented using:

- An internal **array (table)**
- Each index holds a **bucket**
- Buckets store **entries (nodes)**

### put(key, value) Flow
1. Compute hash using `key.hashCode()`
2. Convert hash to array index
3. If bucket is empty → insert entry
4. If bucket is not empty:
   - Compare keys using `equals()`
   - Update value if key exists
   - Else handle collision
5. Resize when size exceeds `capacity × loadFactor`  
   (default load factor = `0.75`)

### Collision Handling
- Initially uses a **linked list**
- Converts to a **Red-Black Tree** if the bucket grows large

### Why `equals()` & `hashCode()` Matter
- `hashCode()` → bucket selection
- `equals()` → key comparison within bucket

---

## 9) How HashSet Works Internally

A `HashSet<E>` is implemented on top of a `HashMap<E, Object>`.

### Internal Mechanism
- Element is stored as the **key**
- Value is a constant **dummy object**

### add(element) Flow
1. Calls `map.put(element, DUMMY_VALUE)`
2. If key already exists → no insertion

✅ This is why **HashSet automatically prevents duplicates**.

---

## 10) ConcurrentHashMap (Thread-Safe Map)

### Why ConcurrentHashMap?
- Designed for **multi-threaded environments**
- Better performance than `Hashtable`
- Allows concurrent reads and writes
- Does **not allow null keys or null values**

### Example
```java
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("hits", 0);

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.compute("hits", (k, v) -> v + 1);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final hits = " + map.get("hits")); // 2000
    }
}
```
---

## equals() and hashCode() — Very Important Concept

### Why Are They Important?
- Used by **HashMap**, **HashSet**, **ConcurrentHashMap**
- Ensure **correct key lookup** and **duplicate prevention**

---

### How Hash-Based Collections Work
1. `hashCode()` determines the **bucket**
2. `equals()` determines **object equality inside the bucket**

---

### Contract Rules (Must Know)
1. If `a.equals(b)` is `true` → `a.hashCode() == b.hashCode()` **must be true**
2. Same hashCode does **not** guarantee equality
3. Violating this contract breaks HashMap/HashSet behavior

---

## Quick Decision Table

| Requirement            | Best Choice                  |
|------------------------|------------------------------|
| Fast lookup            | HashMap / HashSet            |
| Ordered elements       | ArrayList / LinkedHashSet    |
| Sorted data            | TreeMap / TreeSet            |
| Thread-safe map        | ConcurrentHashMap            |
| Stack / Queue          | ArrayDeque                   |
| No duplicates          | Set                          |
| Index-based access     | ArrayList                    |

---

## 11) Mini Examples

### List
```java
List<String> list = new ArrayList<>();
list.add("Umair");
list.add("Ali");
list.add("Umair");
```

### Set
```java
Set<String> set = new HashSet<>();
set.add("A");
set.add("A"); // ignored

```
### Map
```java
Map<String, Integer> scores = new HashMap<>();
scores.put("Math", 95);
scores.put("CS", 99);

for (Map.Entry<String, Integer> e : scores.entrySet()) {
    System.out.println(e.getKey() + " = " + e.getValue());
}
```

### Summary

1. Collection → interface for element-based structures

2. Collections → utility class with static helper methods

3. HashMap → array + buckets + hashing + collision handling

4. HashSet → built on top of HashMap

5. ConcurrentHashMap → thread-safe, high-performance map

---

## Most Asked Java Collections Interview Questions (with Short Answers)

---

### 1) What is the Java Collections Framework?
The Java Collections Framework is a unified architecture of **interfaces, implementations, and algorithms** used to store and manipulate groups of objects efficiently.

---

### 2) What is the difference between Collection and Collections?
- **Collection** is an **interface** that represents a group of objects.
- **Collections** is a **utility class** that provides static helper methods (sort, reverse, etc.).

> **One-liner**:  
> Collection defines *what a collection is*, Collections defines *what you can do with a collection*.

---

### 3) Difference between List, Set, and Map?
- **List**: Ordered, allows duplicates, index-based access  
- **Set**: No duplicates, no index access  
- **Map**: Key–value pairs, keys must be unique

---

### 4) Difference between ArrayList and LinkedList?
| Feature | ArrayList | LinkedList |
|------|----------|-----------|
| Data Structure | Dynamic array | Doubly linked list |
| Access | Fast (`O(1)`) | Slow (`O(n)`) |
| Insert/Delete | Slow in middle | Fast at ends |
| Memory | Less overhead | More overhead |

---

### 5) Difference between HashSet and TreeSet?
- **HashSet**: Unordered, faster (`O(1)` average)
- **TreeSet**: Sorted, slower (`O(log n)`), uses Red-Black Tree

---

### 6) How does HashMap work internally?
- Uses an **array + buckets**
- Hash is calculated using `hashCode()`
- Collisions handled using **linked list → Red-Black Tree**
- Resizes when size exceeds `capacity × loadFactor`

---

### 7) Why are equals() and hashCode() important?
- `hashCode()` decides the bucket
- `equals()` decides key equality inside the bucket
- Incorrect implementation leads to duplicates or missing keys

---

### 8) Difference between HashMap and Hashtable?
| HashMap | Hashtable |
|------|----------|
| Not synchronized | Synchronized |
| Allows one null key | No null keys |
| Faster | Slower |
| Modern | Legacy |

---

### 9) Difference between HashMap and ConcurrentHashMap?
- **HashMap** is not thread-safe
- **ConcurrentHashMap** allows concurrent reads and writes
- ConcurrentHashMap uses fine-grained locking
- ConcurrentHashMap does **not allow null keys/values**

---

### 10) How does ConcurrentHashMap achieve thread safety?
- Uses **CAS (Compare-And-Swap)** and internal synchronization
- Locks only required portions instead of the whole map
- Allows high concurrency

---

### 11) Difference between fail-fast and fail-safe iterators?
- **Fail-fast**: Throws `ConcurrentModificationException`
  - Examples: ArrayList, HashMap
- **Fail-safe**: Works on a copy, no exception
  - Examples: ConcurrentHashMap, CopyOnWriteArrayList

---

### 12) What is a backed collection?
A backed collection shares the same underlying data structure.

Examples:
- `map.keySet()`
- `map.values()`
- `map.entrySet()`
- `list.subList()`

Changes in one reflect in the other.

---

### 13) Difference between Comparable and Comparator?
- **Comparable**: Natural ordering (`compareTo`)
- **Comparator**: Custom ordering (`compare`)

---

### 14) What is load factor in HashMap?
- Controls resize threshold
- Default value = `0.75`
- Higher value → fewer resizes, more collisions
- Lower value → more resizes, fewer collisions

---

### 15) Why Map does not extend Collection?
Because Map stores **key–value pairs**, not individual elements, and does not fit Collection semantics like `add(E)`.

---

### 16) Difference between Iterator and ListIterator?
- **Iterator**: Forward traversal only
- **ListIterator**: Forward + backward traversal, index access

---

### 17) What is PriorityQueue?
A queue where elements are processed based on **priority**, not insertion order.

---

### 18) What is the best way to iterate over a Map?
Using `entrySet()` because it gives direct access to both key and value and is more efficient.

---

### 19) Why is ArrayDeque preferred over Stack?
- Stack is legacy and synchronized
- ArrayDeque is faster and more flexible
- Recommended for stack and queue operations

---

### 20) Can HashMap store duplicate keys?
No. If a duplicate key is inserted, the **value is replaced**.

---

## Interview Tip

Most Java collection interview questions revolve around:
- **Internal working**
- **Time complexity**
- **Thread safety**
- **equals() & hashCode()**
- **Choosing the right collection**









