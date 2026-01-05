# ☕ Java Core Fundamentals 

This document is a **simplified, code-friendly README** that explains core Java concepts related to **Math, precision handling, dates & time, instants, time zones, and internationalization**.  
The topics are arranged in a **logical learning flow** and explained in **plain English**.

---

## 1️⃣ Math & Random Numbers

### `java.lang.Math`
Think of `Math` as Java’s **built-in calculator**.

Common uses:
- `Math.abs()`, `Math.sqrt()`, `Math.pow()`
- `Math.max()` / `Math.min()`
- `Math.random()`

```java
int random = (int) (Math.random() * 26) + 65;
```

📌 Internally, `Math.random()` uses **one shared `Random` instance**.

---

## 2️⃣ Floating-Point Basics (Precision vs Scale)

### Precision
- Total number of digits (left + right of decimal)

### Scale
- Number of digits **after** the decimal point

| Number | Precision | Scale |
|------|-----------|-------|
| 15.456 | 5 | 3 |
| 8 | 1 | 0 |
| .123 | 3 | 3 |

---

## 3️⃣ BigDecimal – Accurate Decimal Math

Floating-point types (`double`, `float`) are **not precise** for money or calculations.

### Why `BigDecimal`?
- Stores numbers using:
  - **Unscaled value** (`BigInteger`)
  - **Scale** (decimal position)

```java
BigDecimal price = new BigDecimal("15.456");
```

✅ Used for **currency, finance, and precision-critical math**

---

## 4️⃣ Modern Date & Time (`java.time`)

Java 8+ introduced **immutable, thread-safe date/time APIs**.

### Core Classes
- `LocalDate` → date only
- `LocalTime` → time only
- `LocalDateTime` → date + time
- `Instant` → timestamp (UTC)
- `ZonedDateTime` / `OffsetDateTime` → time zones

---

## 5️⃣ Creating Date & Time Objects

```java
LocalDate today = LocalDate.now();
LocalDate date = LocalDate.of(2024, 5, 10);
LocalDate parsed = LocalDate.parse("2024-05-10");
```

⛔ All objects are **immutable**  
✔ Always assign the result of `plus()`, `minus()`, `with()`

---

## 6️⃣ Temporal Concepts (Advanced but Important)

### TemporalField vs TemporalUnit
- **TemporalField** → part of date/time  
  (`DAY_OF_MONTH`, `HOUR_OF_DAY`)
- **TemporalUnit** → amount of time  
  (`DAYS`, `MONTHS`, `HOURS`)

```java
date.get(ChronoField.DAY_OF_MONTH);
date.plus(5, ChronoUnit.DAYS);
```

---

## 7️⃣ Instants, Periods & Durations

### Instant
- A **point in time**
- Stored as seconds + nanoseconds from **Epoch**

📌 Epoch = `1970-01-01T00:00:00Z`

```java
Instant now = Instant.now();
```

### Period
- Date-based time (years, months, days)

### Duration
- Time-based (hours, minutes, seconds)

---

## 8️⃣ Measuring Time in Java

### `System.currentTimeMillis()`
- Milliseconds since epoch
- Good for timestamps

### `System.nanoTime()`
- High-precision stopwatch
- ❌ Not for real-world time
- ✔ Used for measuring elapsed time

---

## 9️⃣ Time Zones & UTC

- UTC replaced GMT for precision
- Java uses **IANA Time Zone Database**

```java
ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));
```

---

## 🔟 Formatting Dates

```java
DateTimeFormatter formatter =
    DateTimeFormatter.ofPattern("dd MMM yyyy");

String formatted = LocalDate.now().format(formatter);
```

Supports:
- Localization
- Predefined styles (`FULL`, `LONG`, `MEDIUM`, `SHORT`)

---

## 1️⃣1️⃣ Localization & Internationalization

### Locale
Defines:
- Language
- Country/region
- Script/variant

```java
Locale us = Locale.US;
Locale fr = Locale.FRANCE;
```

Java supports:
- Dates
- Numbers
- Currency
- Text (with resources)

---

## 1️⃣2️⃣ ResourceBundle (I18n)

Used for **language-specific messages**.

### Properties File Example
```
TextMessages.properties
TextMessages_es.properties
```

```properties
hello=Hello
```

```java
ResourceBundle bundle =
    ResourceBundle.getBundle("TextMessages", locale);

bundle.getString("hello");
```

✔ Same keys  
✔ Different languages

---

## 1️⃣3️⃣ ResourceBundle Resolution

Java selects the **best match** based on:
- Language
- Country
- Variant

📘 Official rules:
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ResourceBundle.html

---

## 1️⃣4️⃣ Legacy APIs (Avoid in New Code)

❌ `Date`, `Calendar`, `SimpleDateFormat`  
✔ Use `java.time` instead (immutable & thread-safe)

---

## 🎯 Final Takeaways

- Use `BigDecimal` for precision math
- Prefer `java.time` over legacy APIs
- Use `Instant` for timestamps
- Understand `Period` vs `Duration`
- Use `Locale` + `ResourceBundle` for I18n

---

☕ Master these fundamentals and you’ll write **cleaner, safer, production-ready Java code**
