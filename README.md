# 📓 Daily Journal Processor — Java StringBuilder & StringBuffer

## 🎯 Overview

In this project, you will learn how to manipulate strings efficiently using:
- `StringBuilder` — high-performance, single-threaded mutable string class.
- `StringBuffer` — thread-safe mutable string class using internal synchronization.

We answer three core questions:
### 🧠 What?
Both are mutable alternatives to `String`, allowing in-place modifications like `append()`, `insert()`, `delete()`, etc.

### 🤔 Why?
- `String` is immutable. Modifications create new objects, leading to performance issues.
- `StringBuilder` is fast for single-threaded environments.
- `StringBuffer` is safe for multi-threaded environments.

### 🔧 How?
By using the methods from these classes such as:
- `.append()`
- `.reverse()`
- `.insert()`
- `.delete()`
- `.toString()`

---

## 🛠️ Project Description

### 💡 Theme: **Daily Journal Processor**

Imagine an app that lets users log daily journal entries. This system should:
1. Append a **timestamp** to their entry
2. Reverse the content (for a fun "mirror mode")
3. Convert the content to **UPPERCASE**
4. Track how many edits have been made

---

## 📁 Project Structure

```

daily-journal-processor/
├── pom.xml
└── src/
├── main/java/com/example/journal/
│   ├── JournalEntry.java
│   ├── JournalProcessor.java
│   └── JournalDemo.java
└── test/java/com/example/journal/
└── JournalProcessorTest.java

````

---

## 📦 Technologies Used

- Java 8+
- Maven
- JUnit 5
- StringBuilder / StringBuffer

---

## ✅ Features Implemented

| Feature                | Implementation     | Class              |
|------------------------|--------------------|---------------------|
| Add Timestamp          | `StringBuilder`    | `JournalProcessor`  |
| Reverse Content        | `StringBuffer`     | `JournalProcessor`  |
| Convert to Uppercase   | `StringBuilder`    | `JournalProcessor`  |
| Track Edit Count       | Counter field      | `JournalEntry`      |

---

## 🧪 Testing

JUnit 5 tests are provided for:
- Timestamp appending
- Content reversal
- Uppercasing
- Edit counter integrity

Each test reuses the same setup using `@BeforeEach`.

---

## 📽️ Demo Output

Run `JournalDemo.java` and observe:
```text
Original Entry: It was a productive day.
After Timestamp: It was a productive day. [2025-05-13T10:22:33.123]
After Reversal: ]321.33:22:01T3102-50-51[ .yad evitcudorp a saw tI
After Uppercase: ]321.33:22:01T3102-50-51[ .YAD EVITCUDORP A SAW TI
Total Edits: 3
````

---

## 📚 References

* [Baeldung: StringBuilder vs StringBuffer](https://www.baeldung.com/java-string-builder-string-buffer)
* [GeeksForGeeks Comparison](https://www.geeksforgeeks.org/stringbuffer-vs-stringbuilder/)
* [Oracle Docs - StringBuilder](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html)
* [Oracle Docs - StringBuffer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuffer.html)

---
### Notes

✅ Practice real-world string manipulation
✅ Learn the trade-offs between performance and safety
✅ Build confidence working with mutable string types

You're building apps like a real backend dev now — keep going! 🚀

