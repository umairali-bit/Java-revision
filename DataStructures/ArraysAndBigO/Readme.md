## 🚀 What is Big-O Notation?

Big-O notation tells us **how fast (or slow)** our algorithm grows as the input size increases. Think of it like **measuring how hard a task becomes when we give it more stuff to work with**.

---

## 🧠 Big-O Cheat Sheet (Best to Worst)

| Big-O        | Name         | Example Code                        | Analogy                                           |
| ------------ | ------------ | ----------------------------------- | ------------------------------------------------- |
| `O(1)`       | Constant     | Accessing an array element by index | Picking a specific book from a shelf with labels  |
| `O(log n)`   | Logarithmic  | Binary search                       | Halving a phone book each time to find a name     |
| `O(n)`       | Linear       | Loop through an array               | Checking every locker to find your item           |
| `O(n log n)` | Linearithmic | Merge sort, Quick sort (avg case)   | Sorting exam papers in piles and then combining   |
| `O(n²)`      | Quadratic    | Nested loops, bubble sort           | Comparing every student with every other student  |
| `O(2ⁿ)`      | Exponential  | Recursive Fibonacci                 | Each choice doubles the number of problems        |
| `O(n!)`      | Factorial    | Brute force permutations            | Trying every possible seat arrangement at a table |

---

## 💡 Big-O in Plain Language

If a loop runs once for every item, it's `O(n)`
If it runs for every pair of items, it's `O(n²)`
If it cuts the data in half each time, it's `O(log n)`

> "Ignore constants and small details. Big-O focuses on **growth**."

---

## 📦 Arrays in Java

### What is an Array?

An array is like a **row of mailboxes**. Each mailbox holds one item, and you know exactly where to find each item using its **index**.

```java
int[] numbers = new int[7];
numbers[0] = 20;
numbers[1] = 35;
numbers[2] = -15;
...
```

### 🧰 Array Memory

Arrays are stored as a **block in memory**. Each slot is the same size.

* `int` = 4 bytes
* Array of 7 ints = 7 × 4 = 28 bytes

### 📏 Why Fixed Size?

Because the memory block is continuous, and Java allocates all at once. You can’t insert new mailboxes without tearing it down.

---

## 📬 Memory Address Math (with Analogy)

> "Imagine array starts at address `12` and each item is 4 bytes."

```text
Element at index 0: 12 + 0×4 = 12
Element at index 1: 12 + 1×4 = 16
Element at index 2: 12 + 2×4 = 20
...
```

This is why accessing any element by index is **O(1)** — Java knows **exactly where to go**.

---

## 🔧 Access vs Search in Arrays

| Operation    | Code             | Big-O  | Notes                                 |
| ------------ | ---------------- | ------ | ------------------------------------- |
| Access index | `arr[3]`         | `O(1)` | Direct memory access                  |
| Search value | Loop and compare | `O(n)` | Worst case: last element or not found |

---

## 📚 Array of Strings

```java
String[] names = new String[3];
names[0] = "Alice";
names[1] = "Bob";
```

You're actually storing **references (pointers)** to String objects, not the strings themselves. Each reference takes the same space.

---

## 🛋 Collections in Java and Big-O

### 🛠️ List (like `ArrayList`)

| Operation     | Big-O  | Notes             |
| ------------- | ------ | ----------------- |
| Add (end)     | `O(1)` | Amortized         |
| Insert/remove | `O(n)` | Shifting required |
| Access        | `O(1)` | Like arrays       |
| Search        | `O(n)` | Linear scan       |

### 🧱 Stack (LIFO)

```java
Stack<String> stack = new Stack<>();
stack.push("A");
stack.pop();
```

| Operation | Big-O  | Notes            |
| --------- | ------ | ---------------- |
| Push/Pop  | `O(1)` | Top element only |

**Analogy**: Stack of plates — take from top, add to top.

---

### 🧹 Queue (FIFO)

```java
Queue<String> queue = new LinkedList<>();
queue.add("A");
queue.remove();
```

| Operation  | Big-O  | Notes         |
| ---------- | ------ | ------------- |
| Add/Remove | `O(1)` | Head and tail |

**Analogy**: Line at a coffee shop — first in, first out.

---

### 🧺 Set / HashSet

| Operation  | Big-O  | Notes                |
| ---------- | ------ | -------------------- |
| Add/Remove | `O(1)` | On average           |
| Contains   | `O(1)` | Constant-time lookup |

**Analogy**: Magic basket that won’t let duplicates in.

---

### 📃 Map / HashMap

| Operation | Big-O  | Notes                  |
| --------- | ------ | ---------------------- |
| Put/Get   | `O(1)` | Key-value pair lookups |

**Analogy**: Dictionary — look up a word, get the meaning fast.

---

### 🏛 TreeMap (Red-Black Tree)

| Operation      | Big-O      | Notes                      |
| -------------- | ---------- | -------------------------- |
| Put/Get/Remove | `O(log n)` | Maintains sorted key order |

**Analogy**: Library catalog that stays alphabetized automatically.

---

### ★ Summary Table

| Structure | Add        | Remove     | Access | Search     | Notes            |
| --------- | ---------- | ---------- | ------ | ---------- | ---------------- |
| Array     | `O(1)`     | `O(n)`     | `O(1)` | `O(n)`     | Fixed size       |
| ArrayList | `O(1)`     | `O(n)`     | `O(1)` | `O(n)`     | Resizeable array |
| Stack     | `O(1)`     | `O(1)`     | `O(n)` | `O(n)`     | LIFO             |
| Queue     | `O(1)`     | `O(1)`     | `O(n)` | `O(n)`     | FIFO             |
| HashSet   | `O(1)`     | `O(1)`     | N/A    | `O(1)`     | No duplicates    |
| HashMap   | `O(1)`     | `O(1)`     | N/A    | `O(1)`     | Key → value      |
| TreeMap   | `O(log n)` | `O(log n)` | N/A    | `O(log n)` | Sorted keys      |

---

Let me know if you want this exported to a PDF, extended with code challenges, or with visual diagrams!
