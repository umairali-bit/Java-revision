# 📘 Regular Expressions in Java: Mastering Pattern Matching and Text Manipulation

Regular expressions are powerful tools for pattern matching and manipulating text. They're frequently used in Java for tasks such as input validation, data extraction, and text transformation.

---

## 🔍 What is a Regular Expression?

- A **regular expression (regex)** is a string that describes a search pattern.
- It may contain **literal characters** and **metacharacters** (symbols with special meanings).
- Regular expressions are interpreted by a regex processor (like Java’s `Pattern` class).
- Commonly used in methods like `matches()`, `replaceAll()`, `replaceFirst()`, and `split()`.

---

## 💡 Why Use Regular Expressions?

Regular expressions save time and reduce boilerplate code:
- ✅ Validate data formats (e.g., emails, phone numbers)
- 🔍 Find pattern occurrences in text
- 🔁 Replace or extract matching content
- ✂️ Split text based on a pattern

---

## 🚀 Ways to Use Regular Expressions in Java

Java provides several ways to work with regex:

### 📦 Common Classes That Accept Regex

- `String`
- `Scanner`
- `Formatter`
- `DateTimeFormatter`
- `Duration`

### 🛠️ Java Regex Utility Classes

From the `java.util.regex` package:
- `Pattern`
- `Matcher`

---

## 🧪 String Methods Using Regular Expressions

| Method                      | Return Type  | Description                                   |
|----------------------------|--------------|-----------------------------------------------|
| `matches(String regex)`    | `boolean`    | Checks if the string matches the regex        |
| `replaceAll(String regex, String replacement)` | `String` | Replaces all matches with a given string     |
| `split(String regex)`      | `String[]`   | Splits the string by the regex pattern        |
| `split(String regex, int limit)` | `String[]` | Splits the string with a limit on results    |

---

## 🔧 Components of a Regular Expression

1. **Literals** — Match exact characters (`"abc"` matches "abc")
2. **Character Classes** — Predefined or custom sets (`[a-z]`, `\d`, etc.)
3. **Quantifiers** — Control repetition (`*`, `+`, `?`, `{n}`, etc.)
4. **Boundary Matchers** — Anchor position (`^`, `$`, `\b`)
5. **Groups** — Capture sub-patterns (`(abc)`)

---

## 🔤 Character Classes

| Class        | Meaning                         |
|--------------|----------------------------------|
| `.`          | Any character (except newline)   |
| `[abc]`      | Match 'a', 'b', or 'c'           |
| `[a-z]`      | Match lowercase a to z           |
| `[^abc]`     | Not 'a', 'b', or 'c'             |
| `\d`         | A digit (0–9)                    |
| `\s`         | A whitespace character           |
| `\w`         | A word character (letter, digit, or underscore) |

📌 In square brackets (`[ ]`), metacharacters like `.` lose their special meaning.  
**Example:** `[.]` matches a literal period.

---

## 🔁 Quantifiers

| Quantifier     | Meaning                          | Example   | Matches               |
|----------------|----------------------------------|-----------|------------------------|
| `*`            | 0 or more times                  | `b*`      | "", "b", "bb", ...     |
| `+`            | 1 or more times                  | `b+`      | "b", "bb", ...         |
| `?`            | 0 or 1 time                      | `colou?r` | "color", "colour"      |
| `{n}`          | Exactly n times                  | `b{3}`    | "bbb"                  |
| `{n,}`         | At least n times                 | `b{2,}`   | "bb", "bbb", ...       |
| `{n,m}`        | Between n and m times            | `b{3,4}`  | "bbb", "bbbb"          |

---

## ⛓️ Boundary Matchers (Anchors)

| Anchor  | Meaning                      | Pattern | Notes                       |
|---------|------------------------------|---------|-----------------------------|
| `^`     | Start of a string            | `^.`    | Matches first character     |
| `$`     | End of a string              | `.$`    | Matches last character      |
| `\b`    | Word boundary                | `\b`    | Matches start/end of word   |

---

## 🧪 Examples of Regex Patterns

| Description         | Regex Pattern                                         | Example Match                        |
|---------------------|------------------------------------------------------|--------------------------------------|
| U.S. Phone Number   | `\\([0-9]{3}\\) [0-9]{3}-[0-9]{4}`                    | `(800) 123-4567`                      |
| HTML Tag Matching   | `<(\\w+)[^>]*>([^\\v</>]*)(</\\1>)*`                 | `<h1>Title</h1>`, `<br/>`, `<h2 class="red">Hello</h2>` |

---

## 📚 References

- Java `Pattern` Class API:  
  [🔗 https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html)

---

> Regular expressions are an essential skill for any Java developer. Mastering them will make your code more concise, powerful, and efficient.
