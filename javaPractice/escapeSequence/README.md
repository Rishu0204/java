
# Java Escape Sequences

In Java, **escape sequences** are used to represent certain special characters within string literals. These sequences begin with a backslash (`\`) followed by a specific character that has a particular meaning in the string.

Escape sequences are essential when you want to:

- Include special characters like double quotes (`"`), backslashes (`\`), or newlines within a string.
- Format output such as adding tabs or line breaks.

---

## 🔹 Examples of Escape Sequences in Java

Here is a Java program demonstrating various escape sequences:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello \"World\"");      // Includes double quotes inside the string
        System.out.println("c:\\Windows\\..");      // Includes backslashes in the file path
        System.out.println("\nc:\\Windows\\..");    // Adds a new line before the text
        System.out.println("\tc:\\Windows\\..");    // Adds a tab space before the text
    }
}
````

### 🔍 Output:

```
Hello "World"
c:\Windows\..

	c:\Windows\..
```

---

## 🔹 Explanation of Escape Sequences Used

| Escape Sequence | Description                    | Example             | Output Example             |
| --------------- | ------------------------------ | ------------------- | -------------------------- |
| `\"`            | Inserts double quotation marks | `"Hello \"World\""` | `Hello "World"`            |
| `\\`            | Inserts a backslash            | `"c:\\Windows\\.."` | `c:\Windows\..`            |
| `\n`            | Inserts a newline              | `"\nHello"`         | (prints on a new line)     |
| `\t`            | Inserts a tab space            | `"\tHello"`         | (tab space before `Hello`) |

---

## 🔹 Other Common Escape Sequences in Java

| Escape Sequence | Description                                   | Output Example               |
| --------------- | --------------------------------------------- | ---------------------------- |
| `\'`            | Inserts a single quote                        | `'It\'s fine'` → `It's fine` |
| `\b`            | Backspace (deletes the character before)      | `"abc\b"` → `ab`             |
| `\r`            | Carriage return                               | `"Hello\rWorld"` → `World`   |
| `\f`            | Form feed (advances the printer to next page) | Rarely used                  |
| `\uXXXX`        | Unicode character                             | `\u0041` → `A`               |

---

## ✅ Summary Table

| Escape Sequence | Description             |
| --------------- | ----------------------- |
| `\"`            | Double quote            |
| `\'`            | Single quote            |
| `\\`            | Backslash               |
| `\n`            | New line                |
| `\t`            | Tab                     |
| `\b`            | Backspace               |
| `\r`            | Carriage return         |
| `\f`            | Form feed               |
| `\uXXXX`        | Unicode character (hex) |

---

## 📌 Conclusion

Escape sequences in Java are a powerful way to manage special formatting and characters inside strings. They are especially useful in file paths, dialogues, and formatted outputs. Mastering them helps in writing cleaner and more precise code.


---