# Java Arrays — Complete Guide & Interview Prep

Java arrays are one of the **most fundamental data structures** and are heavily tested in **interviews**, especially for **basics, memory, and reference behavior**.

This guide covers:
- Definitions & basics  
- One‑dimensional and multi‑dimensional arrays  
- Nested arrays  
- Value vs reference types  
- Varargs  
- `java.util.Arrays` utility class  
- Famous interview questions  

---

## 1) What is an Array in Java?

An **array** is a **fixed-size, indexed data structure** used to store **multiple values of the same type**.

### Key Characteristics
- Fixed size (cannot grow or shrink)
- Zero-based indexing
- Stores elements contiguously in memory
- Can store **primitive types** or **object references**

```java
int[] numbers = new int[5];
```

---

## 2) Array Basics

### Declaration
```java
int[] a;
int b[];
```

### Initialization
```java
int[] nums = {1, 2, 3};
int[] nums2 = new int[3];
```

### Access
```java
System.out.println(nums[0]); // 1
```

### Length
```java
int size = nums.length;
```

⚠️ `length` is a **property**, not a method.

---

## 3) One-Dimensional Arrays

```java
String[] names = {"Umair", "Ali", "Ahmed"};

for (String name : names) {
    System.out.println(name);
}
```

---

## 4) Multi-Dimensional Arrays

A **multi-dimensional array** is an array of arrays.

```java
int[][] matrix = new int[2][3];
```

### Initialization
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

### Traversal
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
}
```

---

## 5) Jagged / Nested Arrays

Nested arrays allow **rows of different lengths**.

```java
int[][] jagged = {
    {1, 2},
    {3, 4, 5},
    {6}
};
```

### Important
- Each row is a **separate array**
- Very common interview topic

---

## 6) Arrays as Reference Types vs Value Types

### Primitive Arrays (Value Elements)
```java
int[] a = {1, 2, 3};
int[] b = a;

b[0] = 99;
System.out.println(a[0]); // 99
```

➡️ Arrays themselves are **reference types**, even if they store primitives.

### Object Arrays (Reference Elements)
```java
String[] arr1 = {"A", "B"};
String[] arr2 = arr1;

arr2[1] = "Z";
System.out.println(arr1[1]); // Z
```

### Interview Rule
> Arrays are reference types. Assigning one array to another copies the **reference**, not the data.

---

## 7) Copying Arrays (Important)

### Shallow Copy
```java
int[] copy = original;
```

### Using clone()
```java
int[] copy = original.clone();
```

### Using System.arraycopy()
```java
System.arraycopy(src, 0, dest, 0, src.length);
```

---

## 8) Varargs (Variable Arguments)

Varargs allow passing **zero or more arguments** to a method.

```java
void printNumbers(int... nums) {
    for (int n : nums) {
        System.out.println(n);
    }
}
```

### Rules
- Varargs are treated as arrays internally
- Must be the **last parameter**
- Only **one varargs** parameter allowed

```java
void test(String name, int... values) {}
```

---

## 9) java.util.Arrays Utility Class

The `Arrays` class provides **static helper methods**.

### Common Methods

```java
int[] arr = {3, 1, 2};

Arrays.sort(arr);
Arrays.toString(arr);
Arrays.binarySearch(arr, 2);
Arrays.equals(arr1, arr2);
Arrays.copyOf(arr, 5);
```

### Deep Operations (Multi-D Arrays)

```java
Arrays.deepToString(matrix);
Arrays.deepEquals(arr1, arr2);
```

---

## 10) Common Array Exceptions

### ArrayIndexOutOfBoundsException
```java
int[] arr = new int[3];
arr[5] = 10;
```

### NullPointerException
```java
int[] arr = null;
arr[0] = 1;
```

---

## 11) Famous Array Interview Questions

### Q1) Difference between array and ArrayList?
| Array | ArrayList |
|-----|-----------|
| Fixed size | Dynamic size |
| Faster | Slightly slower |
| Can store primitives | Stores objects only |

---

### Q2) Why arrays are faster than ArrayList?
- No resizing
- No boxing/unboxing
- Direct memory access

---

### Q3) Can arrays store objects?
✅ Yes

```java
Object[] objs = new Object[3];
```

---

### Q4) What is a jagged array?
An array where each row has **different lengths**.

---

### Q5) What is default value of array elements?
| Type | Default |
|----|---------|
| int | 0 |
| boolean | false |
| object | null |

---

### Q6) Can array size be changed?
❌ No  
You must create a new array.

---

### Q7) Difference between length and size()?
- `length` → arrays
- `size()` → collections

---

### Q8) How to reverse an array?
```java
int[] arr = {1, 2, 3};
for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

---

### Q9) How are arrays stored in memory?
- Stored contiguously
- Multi-dimensional arrays store **references to rows**

---

## 12) Interview One-Liners

- Arrays are **reference types**
- Arrays have **fixed size**
- `length` is a property, not a method
- Multi-dimensional arrays are **arrays of arrays**
- Varargs are **syntactic sugar over arrays**

---

## Quick Summary

- Arrays are fast, fixed-size, index-based structures
- Support primitives and objects
- Multi-dimensional arrays are not truly contiguous
- `java.util.Arrays` is heavily tested in interviews
- Understanding reference behavior is critical

---

## Interview Tip

If you can confidently explain:
- Reference vs value behavior
- Jagged arrays
- Varargs
- Arrays vs collections

You can clear **most Java array interview questions easily**.
